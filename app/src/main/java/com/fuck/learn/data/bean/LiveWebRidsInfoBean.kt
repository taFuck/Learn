package com.fuck.learn.data.bean


import com.google.gson.annotations.SerializedName

data class LiveWebRidsInfoBean(
    @SerializedName("data")
    val `data`: Data? = null,
    @SerializedName("extra")
    val extra: Extra? = null,
    @SerializedName("status_code")
    val statusCode: Int? = null
) {
    data class Data(
        @SerializedName("anchor_web_rids")
        val anchorWebRids: Map<String, String>? = null
    )

    data class Extra(
        @SerializedName("now")
        val now: Long? = null
    )
}