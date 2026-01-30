package com.fuck.learn.data.bean


import com.google.gson.annotations.SerializedName


data class LiveInfoExtraBean(
    @SerializedName("code")
    val code: Int? = null,
    @SerializedName("data")
    val `data`: Data? = null,
    @SerializedName("extra")
    val extra: Extra? = null,
    @SerializedName("status_code")
    val statusCode: Int? = null
) {
    data class Data(
        @SerializedName("data")
        val `data`: Data? = null
    ) {
        data class Data(
            @SerializedName("data")
            val `data`: List<Data?>? = null
        ) {
            data class Data(
                @SerializedName("room_view_stats")
                val roomViewStats: RoomViewStats? = null
            ) {
                data class RoomViewStats(
                    @SerializedName("display_value")
                    val displayValue: Int? = null
                )
            }
        }
    }

    data class Extra(
        @SerializedName("now")
        val now: Int? = null,
        @SerializedName("req_now")
        val reqNow: Long? = null,
        @SerializedName("resp_now")
        val respNow: Long? = null
    )
}