package com.fuck.learn.utils

import android.content.Context
import android.net.Uri
import com.fuck.learn.api.interceptor.DEFAULT_USER_AGENT
import org.mozilla.javascript.Scriptable
import org.mozilla.javascript.ScriptableObject
import java.security.SecureRandom
import org.mozilla.javascript.Context as RhinoContext

object DouyinSignUtils {
    private lateinit var applicationContext: Context

    fun init(context: Context) {
        applicationContext = context.applicationContext
    }

    private fun loadJsFromAssets(fileName: String): String {
        if (!::applicationContext.isInitialized) {
            throw IllegalStateException("DouyinSignUtils must be initialized. Call init() in your Application class.")
        }
        return applicationContext.assets.open(fileName).bufferedReader().use { it.readText() }
    }

    /**
     * Generates a random string of a given length.
     */
    @JvmStatic
    fun generateMsToken(length: Int): String {
        val characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"
        val random = SecureRandom()
        return List(length) { characters[random.nextInt(characters.length)] }.joinToString("")
    }

    /**
     * Generates the a_bogus parameter for a given URL.
     */
    @JvmStatic
    fun getABogusUrl(url: String, userAgent: String = DEFAULT_USER_AGENT): String {
        val msToken = generateMsToken(107)

        val urlWithToken = "$url&msToken=$msToken"
        // Dart: var params = ('$url&msToken=$msToken').split('?')[1];
        val splitParts = urlWithToken.split("?")
        val params = if (splitParts.size > 1) splitParts[1] else ""
        // Dart: var query = params.contains("?") ? params.split("?")[1] : params;
        val query = if (params.contains("?")) params.split("?")[1] else params

        var aBogus = ""
        val rhino = RhinoContext.enter()

        rhino.isInterpretedMode = true
        try {
            val scope: Scriptable = rhino.initStandardObjects()

            val kABogus = loadJsFromAssets("getABogus.js")

            rhino.evaluateString(scope, kABogus, "kABogus", 1, null)

            val jsFunctionCall = "getABogus('$query', '$userAgent')"

            val result = rhino.evaluateString(scope, jsFunctionCall, "GetABogusCall", 1, null)
            aBogus = RhinoContext.toString(result)
        } catch (e: Exception) {
            e.printStackTrace()
        } finally {
            RhinoContext.exit()
        }
        return "$url&msToken=${Uri.encode(msToken)}&a_bogus=${Uri.encode(aBogus)}"
    }

    fun getAcSignature(nonce: String, url: String, ua: String): String? {
        val rhino = RhinoContext.enter()
        try {
            rhino.isInterpretedMode = true

            val scope: Scriptable = rhino.initStandardObjects()

            ScriptableObject.putProperty(scope, "global", scope)

            ScriptableObject.putProperty(scope, "window", scope)

            val acSignature = loadJsFromAssets("getAcSignature.js")

            rhino.evaluateString(scope, acSignature, "acSignature", 1, null)

            val jsFunctionCall = "ac_signature('$nonce')"

            val result = rhino.evaluateString(scope, jsFunctionCall, "getAcSignatureCall", 1, null)

            return RhinoContext.toString(result)
        } catch (e: Exception) {
            e.printStackTrace()
            return null
        } finally {
            RhinoContext.exit()
        }
    }
}