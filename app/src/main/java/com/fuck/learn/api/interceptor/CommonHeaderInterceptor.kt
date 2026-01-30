package com.fuck.learn.api.interceptor

import okhttp3.Interceptor
import okhttp3.Response

const val DEFAULT_USER_AGENT =
    "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/116.0.5845.97 Safari/537.36 Core/1.116.567.400 QQBrowser/19.7.6764.400"

class CommonHeaderInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request().newBuilder()
            .header("User-Agent", DEFAULT_USER_AGENT)
            .build()
        return chain.proceed(request)
    }
}
