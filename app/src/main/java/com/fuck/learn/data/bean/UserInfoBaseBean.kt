package com.fuck.learn.data.bean


import com.google.gson.annotations.SerializedName

data class UserInfoBaseBean(
    @SerializedName("code")
    val code: Int? = null,
    @SerializedName("result")
    val result: Result? = null,
    @SerializedName("msg")
    val msg: String? = null,
    @SerializedName("type")
    val type: String? = null
) {
    data class Result(
        @SerializedName("code")
        val code: Int? = null,
        @SerializedName("body")
        val body: String? = null,
        @SerializedName("headers")
        val headers: Headers? = null,
        @SerializedName("cookies")
        val cookies: Cookies? = null
    ) {
        data class Headers(
            @SerializedName("X-Webcast-Gateway-Mini")
            val xWebcastGatewayMini: String? = null,
            @SerializedName("Tt_stable")
            val ttStable: String? = null,
            @SerializedName("Server")
            val server: String? = null,
            @SerializedName("Server-Timing")
            val serverTiming: String? = null,
            @SerializedName("Connection")
            val connection: String? = null,
            @SerializedName("EagleId")
            val eagleId: String? = null,
            @SerializedName("X-Tt-Logid")
            val xTtLogid: String? = null,
            @SerializedName("Date")
            val date: String? = null,
            @SerializedName("Via")
            val via: String? = null,
            @SerializedName("x-tt-trace-host")
            val xTtTraceHost: String? = null,
            @SerializedName("x-tt-trace-id")
            val xTtTraceId: String? = null,
            @SerializedName("Strict-Transport-Security")
            val strictTransportSecurity: String? = null,
            @SerializedName("Timing-Allow-Origin")
            val timingAllowOrigin: String? = null,
            @SerializedName("X-Janus-Info")
            val xJanusInfo: String? = null,
            @SerializedName("Webcast-Ntp-T3")
            val webcastNtpT3: String? = null,
            @SerializedName("Vary")
            val vary: String? = null,
            @SerializedName("server-timing")
            val serverOtherTiming: String? = null,
            @SerializedName("x-tt-trace-tag")
            val xTtTraceTag: String? = null,
            @SerializedName("Content-Length")
            val contentLength: String? = null,
            @SerializedName("Webcast-Ntp-T2")
            val webcastNtpT2: String? = null,
            @SerializedName("Content-Type")
            val contentType: String? = null
        )

        class Cookies
    }
}