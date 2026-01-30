package com.fuck.learn.data.bean


import com.google.gson.annotations.SerializedName

data class UserInfoShareBean(
    @SerializedName("code")
    val code: Int? = null,
    @SerializedName("reason")
    val reason: String? = null,
    @SerializedName("message")
    val message: String? = null,
    @SerializedName("now")
    val now: Int? = null,
    @SerializedName("data")
    val `data`: String? = null
)