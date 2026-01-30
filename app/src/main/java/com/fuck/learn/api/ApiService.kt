package com.fuck.learn.api

import com.fuck.learn.data.bean.FansClubInfoBean
import com.fuck.learn.data.bean.LiveInfoBean
import com.fuck.learn.data.bean.LiveRoomIdInfoBean
import com.fuck.learn.data.bean.LiveWebRidsInfoBean
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.http.Url

interface ApiService {

    @GET
    suspend fun getUrlContent(@Url url: String): Response<ResponseBody>

    @GET("https://live.douyin.com/webcast/user/profile/")
    suspend fun getFansClubInfo(
        @Header("Cookie") cookie: String?,
        @Query("aid") aid: String = "6383",
        @Query("device_platform") device_platform: String = "web",
        @Query("sec_target_uid") sec_target_uid: String,
        @Query("sec_anchor_id") sec_anchor_id: String
    ): FansClubInfoBean

    @GET("https://www.douyin.com/user/{sec_uid}")
    suspend fun getDouyinUserProfile(
        @Header("Cookie") cookie: String?,
        @Path("sec_uid") sec_uid: String
    ): Response<ResponseBody>

    @GET("https://live.douyin.com/webcast/web/get_web_rids/")
    suspend fun getLiveWebRidsInfo(@Query("anchor_ids") anchor_ids: String): LiveWebRidsInfoBean

    @GET("https://live.douyin.com/webcast/room/web/enter/")
    suspend fun getLiveRoomIdInfo(
        @Header("Cookie") cookie: String?,
        @Query("aid") aid: String = "6383",
        @Query("app_name") app_name: String = "douyin_web",
        @Query("live_id") live_id: String = "1",
        @Query("device_platform") device_platform: String = "web",
        @Query("language") language: String = "zh-CN",
        @Query("browser_language") browser_language: String = "zh-CN",
        @Query("browser_platform") browser_platform: String = "Win32",
        @Query("browser_name") browser_name: String = "Chrome",
        @Query("browser_version") browser_version: String = "125.0.0.0",
        @Query("web_rid") web_rid: String
    ): LiveRoomIdInfoBean

    @GET("https://webcast.amemv.com/webcast/room/reflow/info/")
    suspend fun getLiveInfo(
        @Query("live_id") live_id: String = "1",
        @Query("app_id") app_id: String = "6383",
        @Query("room_id") room_id: String
    ): LiveInfoBean
}
