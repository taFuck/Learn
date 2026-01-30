package com.fuck.learn.api.interceptor

import com.fuck.learn.utils.DouyinSignUtils
import okhttp3.Interceptor
import okhttp3.Response

class SignatureInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()
        val url = request.url
        if (url.toString().contains("https://live.douyin.com/webcast/room/web/enter/")) {
            var userAgent = request.header("User-Agent")
            if (userAgent.isNullOrBlank()) {
                userAgent = DEFAULT_USER_AGENT
            }
            val signedUrl = DouyinSignUtils.getABogusUrl(url.toString(), userAgent)
            request = request.newBuilder()
                .url(signedUrl)
                .header("User-Agent", userAgent)
                .build()
        }
        return chain.proceed(request)
    }
}
