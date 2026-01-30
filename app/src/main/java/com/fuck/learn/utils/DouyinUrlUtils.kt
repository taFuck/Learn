package com.fuck.learn.utils

import com.fuck.learn.api.RetrofitClient

object DouyinUrlUtils {

    suspend fun getSecUid(input: String): String? {
        if (input.isBlank()) return null

        val urlRegex = """(https?://\S+)""".toRegex()
        val url = urlRegex.find(input)?.value ?: ""

        var targetText = input
        if (url.isNotEmpty()) {
            targetText = url
            if (url.contains("v.douyin.com")) {
                try {
                    val response = RetrofitClient.apiService.getUrlContent(url)
                    val rawResponse = response.raw()

                    val location = rawResponse.priorResponse?.header("Location")
                    if (!location.isNullOrEmpty()) {
                        targetText = location
                    } else {
                        val finalUrl = rawResponse.request.url.toString()
                        val body = response.body()?.string() ?: ""
                        targetText = "$finalUrl|$body"
                    }
                } catch (e: Exception) {
                    return null
                }
            }
        }

        val secUidRegex = """/user/([^?&"']+)""".toRegex()
        val matchResult = secUidRegex.find(targetText)
        
        return if (matchResult != null) {
            matchResult.groups[1]?.value
        } else if (url.isEmpty()) {
            input.trim().ifBlank { null }
        } else {
            null
        }
    }
}
