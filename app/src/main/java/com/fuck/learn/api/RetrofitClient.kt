package com.fuck.learn.api

import com.fuck.learn.api.interceptor.CommonHeaderInterceptor
import com.fuck.learn.api.interceptor.SignatureInterceptor
import com.fuck.learn.utils.LogUtils
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private const val BASE_URL = "https://live.douyin.com/"

    private val okHttpClient: OkHttpClient by lazy {
        val loggingInterceptor = HttpLoggingInterceptor {
                message -> LogUtils.d(message)
        }.apply {
            level = HttpLoggingInterceptor.Level.BODY
        }

        OkHttpClient.Builder()
//            .addInterceptor(loggingInterceptor)
            .addInterceptor(CommonHeaderInterceptor()) // Add common header interceptor
            .addInterceptor(SignatureInterceptor())
            .build()
    }

    fun <T> create(baseUrl: String, service: Class<T>): T {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(service)
    }

    val apiService: ApiService by lazy {
        create(BASE_URL, ApiService::class.java)
    }
}
