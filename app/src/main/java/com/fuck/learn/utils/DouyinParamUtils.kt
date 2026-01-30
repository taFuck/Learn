package com.fuck.learn.utils

import android.annotation.SuppressLint
import android.content.Context
import android.os.Handler
import android.os.Looper
import android.webkit.CookieManager
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import com.fuck.learn.api.interceptor.DEFAULT_USER_AGENT
import com.tencent.mmkv.MMKV

object DouyinParamUtils {
    private const val KEY_TTWID = "douyin_ttwid"
    private const val KEY_AC_NONCE = "douyin_ac_nonce"
    private const val KEY_AC_SIGNATURE = "douyin_ac_signature"
    private const val KEY_LAST_REFRESH_TIME = "douyin_last_refresh_time"
    private const val REFRESH_INTERVAL = 30L * 24 * 60 * 60 * 1000 // 30 days in ms
    private const val TIMEOUT_MS = 20000L // 20 seconds timeout

    private val mmkv by lazy { MMKV.defaultMMKV() }

    var ttWid: String?
        get() = mmkv.decodeString(KEY_TTWID)
        private set(value) { mmkv.encode(KEY_TTWID, value) }

    var acNonce: String?
        get() = mmkv.decodeString(KEY_AC_NONCE)
        private set(value) { mmkv.encode(KEY_AC_NONCE, value) }

    var acSignature: String?
        get() = mmkv.decodeString(KEY_AC_SIGNATURE)
        private set(value) { mmkv.encode(KEY_AC_SIGNATURE, value) }

    private var lastRefreshTime: Long
        get() = mmkv.decodeLong(KEY_LAST_REFRESH_TIME, 0L)
        set(value) { mmkv.encode(KEY_LAST_REFRESH_TIME, value) }

    fun getCookie(): String? {
        val tw = ttWid
        val an = acNonce
        val asig = acSignature
        
        return if (!tw.isNullOrBlank() && !an.isNullOrBlank() && !asig.isNullOrBlank()) {
            "ttwid=$tw; __ac_nonce=$an; __ac_signature=$asig"
        } else {
            null
        }
    }

    fun isNeedRefresh(): Boolean {
        if (getCookie() == null) return true
        val currentTime = System.currentTimeMillis()
        return (currentTime - lastRefreshTime) > REFRESH_INTERVAL
    }

    fun clearStoredParams() {
        mmkv.removeValuesForKeys(arrayOf(KEY_TTWID, KEY_AC_NONCE, KEY_AC_SIGNATURE, KEY_LAST_REFRESH_TIME))
    }

    /**
     * Refreshes cookies using a hidden WebView.
     */
    @SuppressLint("SetJavaScriptEnabled")
    fun refreshCookies(context: Context, force: Boolean = false, callback: ((Boolean) -> Unit)? = null) {
        if (!force && !isNeedRefresh()) {
            callback?.invoke(true)
            return
        }

        if (force) {
            clearStoredParams()
        }

        val mainHandler = Handler(Looper.getMainLooper())
        mainHandler.post {
            try {
                val cookieManager = CookieManager.getInstance()
                if (force) {
                    cookieManager.removeAllCookies(null)
                    cookieManager.flush()
                }

                val webView = WebView(context)
                var isDone = false

                // Timeout task
                val timeoutRunnable = Runnable {
                    if (!isDone) {
                        isDone = true
                        webView.stopLoading()
                        webView.destroy()
                        callback?.invoke(false)
                    }
                }
                mainHandler.postDelayed(timeoutRunnable, TIMEOUT_MS)

                val settings = webView.settings
                settings.javaScriptEnabled = true
                settings.domStorageEnabled = true
                settings.userAgentString = DEFAULT_USER_AGENT
                
                if (force) {
                    settings.cacheMode = WebSettings.LOAD_NO_CACHE
                    webView.clearCache(true)
                }

                webView.webViewClient = object : WebViewClient() {
                    override fun onPageFinished(view: WebView?, url: String?) {
                        super.onPageFinished(view, url)
                        if (isDone) return

                        val cookies = cookieManager.getCookie(url)
                        if (cookies != null) {
                            val cookieMap = cookies.split(";").associate {
                                val pair = it.split("=")
                                val key = pair.getOrNull(0)?.trim() ?: ""
                                val value = pair.getOrNull(1)?.trim() ?: ""
                                key to value
                            }

                            val newTtWid = cookieMap["ttwid"]
                            val newAcNonce = cookieMap["__ac_nonce"]
                            val newAcSignature = cookieMap["__ac_signature"]

                            if (!newTtWid.isNullOrBlank() && !newAcNonce.isNullOrBlank() && !newAcSignature.isNullOrBlank()) {
                                isDone = true
                                mainHandler.removeCallbacks(timeoutRunnable)

                                ttWid = newTtWid
                                acNonce = newAcNonce
                                acSignature = newAcSignature
                                lastRefreshTime = System.currentTimeMillis()
                                
                                callback?.invoke(true)
                                webView.destroy()
                            }
                        }
                    }
                }
                webView.loadUrl("https://www.douyin.com")
            } catch (e: Exception) {
                LogUtils.e("Failed to refresh cookies: ${e.message}")
                callback?.invoke(false)
            }
        }
    }
}
