package com.fuck.learn.data.bean


import com.google.gson.annotations.SerializedName
data class LiveInfoBean(
    @SerializedName("data")
    val `data`: Data? = null,
    @SerializedName("extra")
    val extra: Extra? = null,
    @SerializedName("status_code")
    val statusCode: Int? = null
) {
    data class Data(
        @SerializedName("room")
        val room: Room? = null,
        @SerializedName("user")
        val user: User? = null
    ) {
        data class Room(
            @SerializedName("id")
            val id: Long? = null,
            @SerializedName("id_str")
            val idStr: String? = null,
            @SerializedName("status")
            val status: Int? = null,
            @SerializedName("owner_user_id")
            val ownerUserId: Long? = null,
            @SerializedName("title")
            val title: String? = null,
            @SerializedName("user_count")
            val userCount: Int? = null,
            @SerializedName("create_time")
            val createTime: Int? = null,
            @SerializedName("linkmic_layout")
            val linkmicLayout: Int? = null,
            @SerializedName("finish_time")
            val finishTime: Int? = null,
            @SerializedName("extra")
            val extra: Extra? = null,
            @SerializedName("dynamic_cover_uri")
            val dynamicCoverUri: String? = null,
            @SerializedName("dynamic_cover_dict")
            val dynamicCoverDict: DynamicCoverDict? = null,
            @SerializedName("last_ping_time")
            val lastPingTime: Int? = null,
            @SerializedName("live_id")
            val liveId: Int? = null,
            @SerializedName("stream_provider")
            val streamProvider: Int? = null,
            @SerializedName("os_type")
            val osType: Int? = null,
            @SerializedName("client_version")
            val clientVersion: Int? = null,
            @SerializedName("with_linkmic")
            val withLinkmic: Boolean? = null,
            @SerializedName("enable_room_perspective")
            val enableRoomPerspective: Boolean? = null,
            @SerializedName("cover")
            val cover: Cover? = null,
            @SerializedName("share_url")
            val shareUrl: String? = null,
            @SerializedName("anchor_share_text")
            val anchorShareText: String? = null,
            @SerializedName("user_share_text")
            val userShareText: String? = null,
            @SerializedName("stream_id")
            val streamId: Long? = null,
            @SerializedName("stream_id_str")
            val streamIdStr: String? = null,
            @SerializedName("stream_url")
            val streamUrl: StreamUrl? = null,
            @SerializedName("mosaic_status")
            val mosaicStatus: Int? = null,
            @SerializedName("mosaic_tip")
            val mosaicTip: String? = null,
            @SerializedName("cell_style")
            val cellStyle: Int? = null,
            @SerializedName("luckymoney_num")
            val luckymoneyNum: Int? = null,
            @SerializedName("deco_list")
            val decoList: List<Any?>? = null,
            @SerializedName("top_fans")
            val topFans: List<Any?>? = null,
            @SerializedName("stats")
            val stats: Stats? = null,
            @SerializedName("sun_daily_icon_content")
            val sunDailyIconContent: String? = null,
            @SerializedName("distance")
            val distance: String? = null,
            @SerializedName("distance_city")
            val distanceCity: String? = null,
            @SerializedName("location")
            val location: String? = null,
            @SerializedName("real_distance")
            val realDistance: String? = null,
            @SerializedName("feed_room_label")
            val feedRoomLabel: FeedRoomLabel? = null,
            @SerializedName("common_label_list")
            val commonLabelList: String? = null,
            @SerializedName("living_room_attrs")
            val livingRoomAttrs: LivingRoomAttrs? = null,
            @SerializedName("admin_user_ids")
            val adminUserIds: List<Long?>? = null,
            @SerializedName("owner")
            val owner: Owner? = null,
            @SerializedName("private_info")
            val privateInfo: String? = null,
            @SerializedName("has_commerce_goods")
            val hasCommerceGoods: Boolean? = null,
            @SerializedName("live_type_normal")
            val liveTypeNormal: Boolean? = null,
            @SerializedName("live_type_linkmic")
            val liveTypeLinkmic: Boolean? = null,
            @SerializedName("live_type_audio")
            val liveTypeAudio: Boolean? = null,
            @SerializedName("live_type_third_party")
            val liveTypeThirdParty: Boolean? = null,
            @SerializedName("live_type_screenshot")
            val liveTypeScreenshot: Boolean? = null,
            @SerializedName("live_type_sandbox")
            val liveTypeSandbox: Boolean? = null,
            @SerializedName("live_type_official")
            val liveTypeOfficial: Boolean? = null,
            @SerializedName("group_id")
            val groupId: Int? = null,
            @SerializedName("orientation")
            val orientation: Int? = null,
            @SerializedName("category")
            val category: Int? = null,
            @SerializedName("tags")
            val tags: List<Any?>? = null,
            @SerializedName("start_time")
            val startTime: Int? = null,
            @SerializedName("popularity")
            val popularity: Int? = null,
            @SerializedName("popularity_str")
            val popularityStr: String? = null,
            @SerializedName("fcdn_appid")
            val fcdnAppid: Int? = null,
            @SerializedName("sell_goods")
            val sellGoods: Boolean? = null,
            @SerializedName("web_count")
            val webCount: Int? = null,
            @SerializedName("vertical_cover_uri")
            val verticalCoverUri: String? = null,
            @SerializedName("base_category")
            val baseCategory: Int? = null,
            @SerializedName("room_auth")
            val roomAuth: RoomAuth? = null,
            @SerializedName("room_tabs")
            val roomTabs: List<Any?>? = null,
            @SerializedName("introduction")
            val introduction: String? = null,
            @SerializedName("is_replay")
            val isReplay: Boolean? = null,
            @SerializedName("vid")
            val vid: String? = null,
            @SerializedName("group_source")
            val groupSource: Int? = null,
            @SerializedName("lottery_finish_time")
            val lotteryFinishTime: Int? = null,
            @SerializedName("layout")
            val layout: Int? = null,
            @SerializedName("wait_copy")
            val waitCopy: String? = null,
            @SerializedName("guide_button")
            val guideButton: GuideButton? = null,
            @SerializedName("preview_copy")
            val previewCopy: String? = null,
            @SerializedName("is_show_inquiry_ball")
            val isShowInquiryBall: Boolean? = null,
            @SerializedName("use_filter")
            val useFilter: Boolean? = null,
            @SerializedName("gift_msg_style")
            val giftMsgStyle: Int? = null,
            @SerializedName("distance_km")
            val distanceKm: String? = null,
            @SerializedName("finish_url")
            val finishUrl: String? = null,
            @SerializedName("is_show_user_card_switch")
            val isShowUserCardSwitch: Boolean? = null,
            @SerializedName("video_feed_tag")
            val videoFeedTag: String? = null,
            @SerializedName("forum_extra_data")
            val forumExtraData: String? = null,
            @SerializedName("fansclub_msg_style")
            val fansclubMsgStyle: Int? = null,
            @SerializedName("follow_msg_style")
            val followMsgStyle: Int? = null,
            @SerializedName("share_msg_style")
            val shareMsgStyle: Int? = null,
            @SerializedName("room_layout")
            val roomLayout: Int? = null,
            @SerializedName("short_title")
            val shortTitle: String? = null,
            @SerializedName("short_touch_area_config")
            val shortTouchAreaConfig: ShortTouchAreaConfig? = null,
            @SerializedName("book_time")
            val bookTime: Int? = null,
            @SerializedName("book_end_time")
            val bookEndTime: Int? = null,
            @SerializedName("room_audit_status")
            val roomAuditStatus: Int? = null,
            @SerializedName("live_distribution")
            val liveDistribution: List<Any?>? = null,
            @SerializedName("replay")
            val replay: Boolean? = null,
            @SerializedName("challenge_info")
            val challengeInfo: String? = null,
            @SerializedName("like_count")
            val likeCount: Int? = null,
            @SerializedName("search_id")
            val searchId: Long? = null,
            @SerializedName("anchor_scheduled_time_text")
            val anchorScheduledTimeText: String? = null,
            @SerializedName("hot_sentence_info")
            val hotSentenceInfo: String? = null,
            @SerializedName("replay_location")
            val replayLocation: Int? = null,
            @SerializedName("stream_close_time")
            val streamCloseTime: Int? = null,
            @SerializedName("content_tag")
            val contentTag: String? = null,
            @SerializedName("anchor_tab_type")
            val anchorTabType: Int? = null,
            @SerializedName("stamps")
            val stamps: String? = null,
            @SerializedName("comment_box")
            val commentBox: CommentBox? = null,
            @SerializedName("business_live")
            val businessLive: Int? = null,
            @SerializedName("with_ktv")
            val withKtv: Boolean? = null,
            @SerializedName("with_draw_something")
            val withDrawSomething: Boolean? = null,
            @SerializedName("webcast_comment_tcs")
            val webcastCommentTcs: Int? = null,
            @SerializedName("room_tag")
            val roomTag: Int? = null,
            @SerializedName("linker_map")
            val linkerMap: LinkerMap? = null,
            @SerializedName("finish_reason")
            val finishReason: Int? = null,
            @SerializedName("scroll_config")
            val scrollConfig: String? = null,
            @SerializedName("relation_tag")
            val relationTag: String? = null,
            @SerializedName("owner_device_id")
            val ownerDeviceId: Int? = null,
            @SerializedName("auto_cover")
            val autoCover: Int? = null,
            @SerializedName("app_id")
            val appId: Int? = null,
            @SerializedName("webcast_sdk_version")
            val webcastSdkVersion: Int? = null,
            @SerializedName("comment_name_mode")
            val commentNameMode: Int? = null,
            @SerializedName("room_create_ab_param")
            val roomCreateAbParam: String? = null,
            @SerializedName("pre_enter_time")
            val preEnterTime: Int? = null,
            @SerializedName("ranklist_audience_type")
            val ranklistAudienceType: Int? = null,
            @SerializedName("preview_flow_tag")
            val previewFlowTag: Int? = null,
            @SerializedName("AnchorABMap")
            val anchorABMap: AnchorABMap? = null,
            @SerializedName("linkmic_display_type")
            val linkmicDisplayType: Int? = null,
            @SerializedName("city_top_distance")
            val cityTopDistance: String? = null,
            @SerializedName("live_room_mode")
            val liveRoomMode: Int? = null,
            @SerializedName("highlight")
            val highlight: Boolean? = null,
            @SerializedName("is_official_channel_room")
            val isOfficialChannelRoom: Boolean? = null,
            @SerializedName("fans_group_admin_user_ids")
            val fansGroupAdminUserIds: List<Any?>? = null,
            @SerializedName("official_channel_uid")
            val officialChannelUid: Int? = null,
            @SerializedName("live_platform_source")
            val livePlatformSource: String? = null,
            @SerializedName("acquaintance_status")
            val acquaintanceStatus: Int? = null,
            @SerializedName("live_type_vs_live")
            val liveTypeVsLive: Boolean? = null,
            @SerializedName("live_type_vs_premiere")
            val liveTypeVsPremiere: Boolean? = null,
            @SerializedName("vs_roles")
            val vsRoles: List<Any?>? = null,
            @SerializedName("item_explicit_info")
            val itemExplicitInfo: String? = null,
            @SerializedName("sofa_layout")
            val sofaLayout: Int? = null,
            @SerializedName("is_need_check_list")
            val isNeedCheckList: Boolean? = null,
            @SerializedName("filter_words")
            val filterWords: List<Any?>? = null,
            @SerializedName("visibility_range")
            val visibilityRange: Int? = null,
            @SerializedName("game_room_type")
            val gameRoomType: Int? = null,
            @SerializedName("paid_live_data")
            val paidLiveData: PaidLiveData? = null,
            @SerializedName("title_recommend")
            val titleRecommend: Boolean? = null,
            @SerializedName("danmaku_detail")
            val danmakuDetail: Int? = null,
            @SerializedName("has_promotion_games")
            val hasPromotionGames: Int? = null,
            @SerializedName("toutiao_cover_recommend_level")
            val toutiaoCoverRecommendLevel: Int? = null,
            @SerializedName("toutiao_title_recommend_level")
            val toutiaoTitleRecommendLevel: Int? = null,
            @SerializedName("upper_right_widget_data_list")
            val upperRightWidgetDataList: List<Any?>? = null,
            @SerializedName("assist_label_list")
            val assistLabelList: List<Any?>? = null,
            @SerializedName("with_aggregate_column")
            val withAggregateColumn: Boolean? = null,
            @SerializedName("auth_city")
            val authCity: String? = null,
            @SerializedName("pack_meta")
            val packMeta: PackMeta? = null,
            @SerializedName("room_view_stats")
            val roomViewStats: RoomViewStats? = null,
            @SerializedName("redpacket_audience_auth")
            val redpacketAudienceAuth: Int? = null,
            @SerializedName("vs_main_replay_id")
            val vsMainReplayId: Int? = null,
            @SerializedName("screen_capture_sharing_title")
            val screenCaptureSharingTitle: String? = null,
            @SerializedName("sharing_music_id_list")
            val sharingMusicIdList: List<Any?>? = null,
            @SerializedName("owner_open_id")
            val ownerOpenId: String? = null,
            @SerializedName("admin_user_open_ids")
            val adminUserOpenIds: List<Any?>? = null,
            @SerializedName("fans_group_admin_user_open_ids")
            val fansGroupAdminUserOpenIds: List<Any?>? = null,
            @SerializedName("official_channel_open_id")
            val officialChannelOpenId: String? = null
        ) {
            data class Extra(
                @SerializedName("is_sandbox")
                val isSandbox: Boolean? = null,
                @SerializedName("xigua_uid")
                val xiguaUid: Int? = null,
                @SerializedName("limit_strategy")
                val limitStrategy: Int? = null,
                @SerializedName("limit_appid")
                val limitAppid: String? = null,
                @SerializedName("geo_block")
                val geoBlock: Int? = null,
                @SerializedName("vr_type")
                val vrType: Int? = null,
                @SerializedName("is_virtual_anchor")
                val isVirtualAnchor: Boolean? = null,
                @SerializedName("create_scene")
                val createScene: String? = null,
                @SerializedName("realtime_replay_enabled")
                val realtimeReplayEnabled: Boolean? = null,
                @SerializedName("realtime_playback_shift")
                val realtimePlaybackShift: Int? = null,
                @SerializedName("realtime_playback_start_shift")
                val realtimePlaybackStartShift: Int? = null,
                @SerializedName("realtime_playback_qualities")
                val realtimePlaybackQualities: List<Any?>? = null,
                @SerializedName("facial_unrecognised")
                val facialUnrecognised: Int? = null,
                @SerializedName("vs_type")
                val vsType: Int? = null,
                @SerializedName("max_audience_cnt")
                val maxAudienceCnt: Int? = null,
                @SerializedName("virtual_tool")
                val virtualTool: String? = null
            )

            class DynamicCoverDict

            data class Cover(
                @SerializedName("url_list")
                val urlList: List<String?>? = null,
                @SerializedName("uri")
                val uri: String? = null,
                @SerializedName("height")
                val height: Int? = null,
                @SerializedName("width")
                val width: Int? = null,
                @SerializedName("avg_color")
                val avgColor: String? = null,
                @SerializedName("image_type")
                val imageType: Int? = null,
                @SerializedName("open_web_url")
                val openWebUrl: String? = null,
                @SerializedName("is_animated")
                val isAnimated: Boolean? = null,
                @SerializedName("flex_setting_list")
                val flexSettingList: List<Any?>? = null,
                @SerializedName("text_setting_list")
                val textSettingList: List<Any?>? = null
            )

            data class StreamUrl(
                @SerializedName("provider")
                val provider: Int? = null,
                @SerializedName("id")
                val id: Long? = null,
                @SerializedName("id_str")
                val idStr: String? = null,
                @SerializedName("resolution_name")
                val resolutionName: ResolutionName? = null,
                @SerializedName("default_resolution")
                val defaultResolution: String? = null,
                @SerializedName("extra")
                val extra: Extra? = null,
                @SerializedName("rtmp_push_url")
                val rtmpPushUrl: String? = null,
                @SerializedName("rtmp_pull_url")
                val rtmpPullUrl: String? = null,
                @SerializedName("flv_pull_url")
                val flvPullUrl: FlvPullUrl? = null,
                @SerializedName("candidate_resolution")
                val candidateResolution: List<String?>? = null,
                @SerializedName("hls_pull_url")
                val hlsPullUrl: String? = null,
                @SerializedName("hls_pull_url_params")
                val hlsPullUrlParams: String? = null,
                @SerializedName("rtmp_pull_url_params")
                val rtmpPullUrlParams: String? = null,
                @SerializedName("flv_pull_url_params")
                val flvPullUrlParams: FlvPullUrlParams? = null,
                @SerializedName("rtmp_push_url_params")
                val rtmpPushUrlParams: String? = null,
                @SerializedName("push_urls")
                val pushUrls: List<Any?>? = null,
                @SerializedName("live_core_sdk_data")
                val liveCoreSdkData: LiveCoreSdkData? = null,
                @SerializedName("hls_pull_url_map")
                val hlsPullUrlMap: HlsPullUrlMap? = null,
                @SerializedName("complete_push_urls")
                val completePushUrls: List<Any?>? = null,
                @SerializedName("stream_control_type")
                val streamControlType: Int? = null,
                @SerializedName("stream_orientation")
                val streamOrientation: Int? = null,
                @SerializedName("push_stream_type")
                val pushStreamType: Int? = null,
                @SerializedName("pull_datas")
                val pullDatas: PullDatas? = null,
                @SerializedName("push_datas")
                val pushDatas: PushDatas? = null,
                @SerializedName("vr_type")
                val vrType: Int? = null,
                @SerializedName("multi_stream_scene")
                val multiStreamScene: Int? = null,
                @SerializedName("resolution_select_panel_resident")
                val resolutionSelectPanelResident: Int? = null
            ) {
                data class ResolutionName(
                    @SerializedName("FULL_HD1")
                    val fULLHD1: String? = null,
                    @SerializedName("HD1")
                    val hD1: String? = null,
                    @SerializedName("ORIGION")
                    val oRIGION: String? = null,
                    @SerializedName("SD1")
                    val sD1: String? = null,
                    @SerializedName("SD2")
                    val sD2: String? = null
                )

                data class Extra(
                    @SerializedName("height")
                    val height: Int? = null,
                    @SerializedName("width")
                    val width: Int? = null,
                    @SerializedName("fps")
                    val fps: Int? = null,
                    @SerializedName("max_bitrate")
                    val maxBitrate: Int? = null,
                    @SerializedName("min_bitrate")
                    val minBitrate: Int? = null,
                    @SerializedName("default_bitrate")
                    val defaultBitrate: Int? = null,
                    @SerializedName("bitrate_adapt_strategy")
                    val bitrateAdaptStrategy: Int? = null,
                    @SerializedName("anchor_interact_profile")
                    val anchorInteractProfile: Int? = null,
                    @SerializedName("audience_interact_profile")
                    val audienceInteractProfile: Int? = null,
                    @SerializedName("hardware_encode")
                    val hardwareEncode: Boolean? = null,
                    @SerializedName("video_profile")
                    val videoProfile: Int? = null,
                    @SerializedName("h265_enable")
                    val h265Enable: Boolean? = null,
                    @SerializedName("gop_sec")
                    val gopSec: Int? = null,
                    @SerializedName("bframe_enable")
                    val bframeEnable: Boolean? = null,
                    @SerializedName("roi")
                    val roi: Boolean? = null,
                    @SerializedName("sw_roi")
                    val swRoi: Boolean? = null,
                    @SerializedName("bytevc1_enable")
                    val bytevc1Enable: Boolean? = null
                )

                data class FlvPullUrl(
                    @SerializedName("FULL_HD1")
                    val fULLHD1: String? = null,
                    @SerializedName("HD1")
                    val hD1: String? = null,
                    @SerializedName("SD1")
                    val sD1: String? = null,
                    @SerializedName("SD2")
                    val sD2: String? = null
                )

                data class FlvPullUrlParams(
                    @SerializedName("FULL_HD1")
                    val fULLHD1: String? = null,
                    @SerializedName("HD1")
                    val hD1: String? = null,
                    @SerializedName("SD1")
                    val sD1: String? = null,
                    @SerializedName("SD2")
                    val sD2: String? = null
                )

                data class LiveCoreSdkData(
                    @SerializedName("pull_data")
                    val pullData: PullData? = null,
                    @SerializedName("size")
                    val size: String? = null
                ) {
                    data class PullData(
                        @SerializedName("stream_data")
                        val streamData: String? = null,
                        @SerializedName("options")
                        val options: Options? = null,
                        @SerializedName("version")
                        val version: Int? = null,
                        @SerializedName("hls_data_unencrypted")
                        val hlsDataUnencrypted: HlsDataUnencrypted? = null,
                        @SerializedName("kind")
                        val kind: Int? = null,
                        @SerializedName("Hls")
                        val hls: List<Any?>? = null,
                        @SerializedName("Flv")
                        val flv: List<Any?>? = null,
                        @SerializedName("codec")
                        val codec: String? = null,
                        @SerializedName("compensatory_data")
                        val compensatoryData: String? = null
                    ) {
                        data class Options(
                            @SerializedName("default_quality")
                            val defaultQuality: DefaultQuality? = null,
                            @SerializedName("qualities")
                            val qualities: List<Quality?>? = null,
                            @SerializedName("vpass_default")
                            val vpassDefault: Boolean? = null,
                            @SerializedName("quality_strategy")
                            val qualityStrategy: String? = null
                        ) {
                            data class DefaultQuality(
                                @SerializedName("name")
                                val name: String? = null,
                                @SerializedName("sdk_key")
                                val sdkKey: String? = null,
                                @SerializedName("v_codec")
                                val vCodec: String? = null,
                                @SerializedName("resolution")
                                val resolution: String? = null,
                                @SerializedName("level")
                                val level: Int? = null,
                                @SerializedName("v_bit_rate")
                                val vBitRate: Int? = null,
                                @SerializedName("additional_content")
                                val additionalContent: String? = null,
                                @SerializedName("fps")
                                val fps: Int? = null,
                                @SerializedName("disable")
                                val disable: Int? = null
                            )

                            data class Quality(
                                @SerializedName("name")
                                val name: String? = null,
                                @SerializedName("sdk_key")
                                val sdkKey: String? = null,
                                @SerializedName("v_codec")
                                val vCodec: String? = null,
                                @SerializedName("resolution")
                                val resolution: String? = null,
                                @SerializedName("level")
                                val level: Int? = null,
                                @SerializedName("v_bit_rate")
                                val vBitRate: Int? = null,
                                @SerializedName("additional_content")
                                val additionalContent: String? = null,
                                @SerializedName("fps")
                                val fps: Int? = null,
                                @SerializedName("disable")
                                val disable: Int? = null
                            )
                        }

                        class HlsDataUnencrypted
                    }
                }

                data class HlsPullUrlMap(
                    @SerializedName("FULL_HD1")
                    val fULLHD1: String? = null,
                    @SerializedName("HD1")
                    val hD1: String? = null,
                    @SerializedName("SD1")
                    val sD1: String? = null,
                    @SerializedName("SD2")
                    val sD2: String? = null
                )

                class PullDatas

                class PushDatas
            }

            data class Stats(
                @SerializedName("id")
                val id: Long? = null,
                @SerializedName("id_str")
                val idStr: String? = null,
                @SerializedName("fan_ticket")
                val fanTicket: Int? = null,
                @SerializedName("money")
                val money: Int? = null,
                @SerializedName("total_user")
                val totalUser: Int? = null,
                @SerializedName("gift_uv_count")
                val giftUvCount: Int? = null,
                @SerializedName("follow_count")
                val followCount: Int? = null,
                @SerializedName("user_count_composition")
                val userCountComposition: UserCountComposition? = null,
                @SerializedName("watermelon")
                val watermelon: Int? = null,
                @SerializedName("digg_count")
                val diggCount: Int? = null,
                @SerializedName("enter_count")
                val enterCount: Int? = null,
                @SerializedName("dou_plus_promotion")
                val douPlusPromotion: String? = null,
                @SerializedName("total_user_desp")
                val totalUserDesp: String? = null,
                @SerializedName("like_count")
                val likeCount: Int? = null,
                @SerializedName("total_user_str")
                val totalUserStr: String? = null,
                @SerializedName("user_count_str")
                val userCountStr: String? = null,
                @SerializedName("comment_count")
                val commentCount: Int? = null,
                @SerializedName("welfare_donation_amount")
                val welfareDonationAmount: Int? = null,
                @SerializedName("up_right_stats_str")
                val upRightStatsStr: String? = null,
                @SerializedName("up_right_stats_str_complete")
                val upRightStatsStrComplete: String? = null,
                @SerializedName("total_user_uv_preview_str")
                val totalUserUvPreviewStr: String? = null
            ) {
                data class UserCountComposition(
                    @SerializedName("city")
                    val city: Int? = null,
                    @SerializedName("video_detail")
                    val videoDetail: Int? = null,
                    @SerializedName("my_follow")
                    val myFollow: Int? = null,
                    @SerializedName("other")
                    val other: Int? = null
                )
            }

            data class FeedRoomLabel(
                @SerializedName("url_list")
                val urlList: List<String?>? = null,
                @SerializedName("uri")
                val uri: String? = null,
                @SerializedName("height")
                val height: Int? = null,
                @SerializedName("width")
                val width: Int? = null,
                @SerializedName("avg_color")
                val avgColor: String? = null,
                @SerializedName("image_type")
                val imageType: Int? = null,
                @SerializedName("open_web_url")
                val openWebUrl: String? = null,
                @SerializedName("content")
                val content: Content? = null,
                @SerializedName("is_animated")
                val isAnimated: Boolean? = null,
                @SerializedName("flex_setting_list")
                val flexSettingList: List<Any?>? = null,
                @SerializedName("text_setting_list")
                val textSettingList: List<Any?>? = null
            ) {
                data class Content(
                    @SerializedName("name")
                    val name: String? = null,
                    @SerializedName("font_color")
                    val fontColor: String? = null,
                    @SerializedName("level")
                    val level: Int? = null,
                    @SerializedName("alternative_text")
                    val alternativeText: String? = null
                )
            }

            data class LivingRoomAttrs(
                @SerializedName("room_id")
                val roomId: Long? = null,
                @SerializedName("room_id_str")
                val roomIdStr: String? = null,
                @SerializedName("silence_flag")
                val silenceFlag: Int? = null,
                @SerializedName("admin_flag")
                val adminFlag: Int? = null,
                @SerializedName("rank")
                val rank: Int? = null
            )

            data class Owner(
                @SerializedName("id")
                val id: Long? = null,
                @SerializedName("short_id")
                val shortId: Long? = null,
                @SerializedName("nickname")
                val nickname: String? = null,
                @SerializedName("gender")
                val gender: Int? = null,
                @SerializedName("signature")
                val signature: String? = null,
                @SerializedName("level")
                val level: Int? = null,
                @SerializedName("birthday")
                val birthday: Int? = null,
                @SerializedName("telephone")
                val telephone: String? = null,
                @SerializedName("avatar_thumb")
                val avatarThumb: AvatarThumb? = null,
                @SerializedName("avatar_medium")
                val avatarMedium: AvatarMedium? = null,
                @SerializedName("avatar_large")
                val avatarLarge: AvatarLarge? = null,
                @SerializedName("verified")
                val verified: Boolean? = null,
                @SerializedName("experience")
                val experience: Int? = null,
                @SerializedName("city")
                val city: String? = null,
                @SerializedName("status")
                val status: Int? = null,
                @SerializedName("create_time")
                val createTime: Int? = null,
                @SerializedName("modify_time")
                val modifyTime: Int? = null,
                @SerializedName("secret")
                val secret: Int? = null,
                @SerializedName("share_qrcode_uri")
                val shareQrcodeUri: String? = null,
                @SerializedName("income_share_percent")
                val incomeSharePercent: Int? = null,
                @SerializedName("badge_image_list")
                val badgeImageList: List<BadgeImage?>? = null,
                @SerializedName("follow_info")
                val followInfo: FollowInfo? = null,
                @SerializedName("pay_grade")
                val payGrade: PayGrade? = null,
                @SerializedName("fans_club")
                val fansClub: FansClub? = null,
                @SerializedName("border")
                val border: Border? = null,
                @SerializedName("special_id")
                val specialId: String? = null,
                @SerializedName("real_time_icons")
                val realTimeIcons: List<Any?>? = null,
                @SerializedName("new_real_time_icons")
                val newRealTimeIcons: List<Any?>? = null,
                @SerializedName("top_vip_no")
                val topVipNo: Int? = null,
                @SerializedName("user_attr")
                val userAttr: UserAttr? = null,
                @SerializedName("pay_score")
                val payScore: Int? = null,
                @SerializedName("ticket_count")
                val ticketCount: Int? = null,
                @SerializedName("link_mic_stats")
                val linkMicStats: Int? = null,
                @SerializedName("display_id")
                val displayId: String? = null,
                @SerializedName("with_commerce_permission")
                val withCommercePermission: Boolean? = null,
                @SerializedName("with_fusion_shop_entry")
                val withFusionShopEntry: Boolean? = null,
                @SerializedName("total_recharge_diamond_count")
                val totalRechargeDiamondCount: Int? = null,
                @SerializedName("verified_content")
                val verifiedContent: String? = null,
                @SerializedName("top_fans")
                val topFans: List<Any?>? = null,
                @SerializedName("sec_uid")
                val secUid: String? = null,
                @SerializedName("user_role")
                val userRole: Int? = null,
                @SerializedName("authentication_info")
                val authenticationInfo: AuthenticationInfo? = null,
                @SerializedName("authorization_info")
                val authorizationInfo: Int? = null,
                @SerializedName("adversary_authorization_info")
                val adversaryAuthorizationInfo: Int? = null,
                @SerializedName("media_badge_image_list")
                val mediaBadgeImageList: List<Any?>? = null,
                @SerializedName("adversary_user_status")
                val adversaryUserStatus: Int? = null,
                @SerializedName("commerce_webcast_config_ids")
                val commerceWebcastConfigIds: List<Any?>? = null,
                @SerializedName("badge_image_list_v2")
                val badgeImageListV2: List<BadgeImageV2?>? = null,
                @SerializedName("location_city")
                val locationCity: String? = null,
                @SerializedName("fans_group_info")
                val fansGroupInfo: FansGroupInfo? = null,
                @SerializedName("remark_name")
                val remarkName: String? = null,
                @SerializedName("mystery_man")
                val mysteryMan: Int? = null,
                @SerializedName("web_rid")
                val webRid: String? = null,
                @SerializedName("desensitized_nickname")
                val desensitizedNickname: String? = null,
                @SerializedName("j_accredit_info")
                val jAccreditInfo: JAccreditInfo? = null,
                @SerializedName("subscribe")
                val subscribe: Subscribe? = null,
                @SerializedName("is_anonymous")
                val isAnonymous: Boolean? = null,
                @SerializedName("consume_diamond_level")
                val consumeDiamondLevel: Int? = null,
                @SerializedName("webcast_uid")
                val webcastUid: String? = null,
                @SerializedName("user_dress_info")
                val userDressInfo: UserDressInfo? = null,
                @SerializedName("public_area_oper_freq")
                val publicAreaOperFreq: Int? = null,
                @SerializedName("user_canceled")
                val userCanceled: Boolean? = null,
                @SerializedName("allow_be_located")
                val allowBeLocated: Boolean? = null,
                @SerializedName("allow_find_by_contacts")
                val allowFindByContacts: Boolean? = null,
                @SerializedName("allow_others_download_video")
                val allowOthersDownloadVideo: Boolean? = null,
                @SerializedName("allow_others_download_when_sharing_video")
                val allowOthersDownloadWhenSharingVideo: Boolean? = null,
                @SerializedName("allow_share_show_profile")
                val allowShareShowProfile: Boolean? = null,
                @SerializedName("allow_show_in_gossip")
                val allowShowInGossip: Boolean? = null,
                @SerializedName("allow_show_my_action")
                val allowShowMyAction: Boolean? = null,
                @SerializedName("allow_strange_comment")
                val allowStrangeComment: Boolean? = null,
                @SerializedName("allow_unfollower_comment")
                val allowUnfollowerComment: Boolean? = null,
                @SerializedName("allow_use_linkmic")
                val allowUseLinkmic: Boolean? = null,
                @SerializedName("bg_img_url")
                val bgImgUrl: String? = null,
                @SerializedName("birthday_description")
                val birthdayDescription: String? = null,
                @SerializedName("birthday_valid")
                val birthdayValid: Boolean? = null,
                @SerializedName("block_status")
                val blockStatus: Int? = null,
                @SerializedName("comment_restrict")
                val commentRestrict: Int? = null,
                @SerializedName("constellation")
                val constellation: String? = null,
                @SerializedName("disable_ichat")
                val disableIchat: Int? = null,
                @SerializedName("enable_ichat_img")
                val enableIchatImg: Int? = null,
                @SerializedName("exp")
                val exp: Int? = null,
                @SerializedName("fan_ticket_count")
                val fanTicketCount: Int? = null,
                @SerializedName("fold_stranger_chat")
                val foldStrangerChat: Boolean? = null,
                @SerializedName("follow_status")
                val followStatus: Int? = null,
                @SerializedName("hotsoon_verified")
                val hotsoonVerified: Boolean? = null,
                @SerializedName("hotsoon_verified_reason")
                val hotsoonVerifiedReason: String? = null,
                @SerializedName("ichat_restrict_type")
                val ichatRestrictType: Int? = null,
                @SerializedName("id_str")
                val idStr: String? = null,
                @SerializedName("is_follower")
                val isFollower: Boolean? = null,
                @SerializedName("is_following")
                val isFollowing: Boolean? = null,
                @SerializedName("need_profile_guide")
                val needProfileGuide: Boolean? = null,
                @SerializedName("pay_scores")
                val payScores: Int? = null,
                @SerializedName("push_comment_status")
                val pushCommentStatus: Boolean? = null,
                @SerializedName("push_digg")
                val pushDigg: Boolean? = null,
                @SerializedName("push_follow")
                val pushFollow: Boolean? = null,
                @SerializedName("push_friend_action")
                val pushFriendAction: Boolean? = null,
                @SerializedName("push_ichat")
                val pushIchat: Boolean? = null,
                @SerializedName("push_status")
                val pushStatus: Boolean? = null,
                @SerializedName("push_video_post")
                val pushVideoPost: Boolean? = null,
                @SerializedName("push_video_recommend")
                val pushVideoRecommend: Boolean? = null,
                @SerializedName("verified_mobile")
                val verifiedMobile: Boolean? = null,
                @SerializedName("verified_reason")
                val verifiedReason: String? = null,
                @SerializedName("with_car_management_permission")
                val withCarManagementPermission: Boolean? = null,
                @SerializedName("age_range")
                val ageRange: Int? = null,
                @SerializedName("watch_duration_month")
                val watchDurationMonth: Int? = null,
                @SerializedName("foreign_user")
                val foreignUser: Int? = null,
                @SerializedName("user_open_id")
                val userOpenId: String? = null
            ) {
                data class AvatarThumb(
                    @SerializedName("url_list")
                    val urlList: List<String?>? = null,
                    @SerializedName("uri")
                    val uri: String? = null,
                    @SerializedName("height")
                    val height: Int? = null,
                    @SerializedName("width")
                    val width: Int? = null,
                    @SerializedName("avg_color")
                    val avgColor: String? = null,
                    @SerializedName("image_type")
                    val imageType: Int? = null,
                    @SerializedName("open_web_url")
                    val openWebUrl: String? = null,
                    @SerializedName("is_animated")
                    val isAnimated: Boolean? = null,
                    @SerializedName("flex_setting_list")
                    val flexSettingList: List<Any?>? = null,
                    @SerializedName("text_setting_list")
                    val textSettingList: List<Any?>? = null
                )

                data class AvatarMedium(
                    @SerializedName("url_list")
                    val urlList: List<String?>? = null,
                    @SerializedName("uri")
                    val uri: String? = null,
                    @SerializedName("height")
                    val height: Int? = null,
                    @SerializedName("width")
                    val width: Int? = null,
                    @SerializedName("avg_color")
                    val avgColor: String? = null,
                    @SerializedName("image_type")
                    val imageType: Int? = null,
                    @SerializedName("open_web_url")
                    val openWebUrl: String? = null,
                    @SerializedName("is_animated")
                    val isAnimated: Boolean? = null,
                    @SerializedName("flex_setting_list")
                    val flexSettingList: List<Any?>? = null,
                    @SerializedName("text_setting_list")
                    val textSettingList: List<Any?>? = null
                )

                data class AvatarLarge(
                    @SerializedName("url_list")
                    val urlList: List<String?>? = null,
                    @SerializedName("uri")
                    val uri: String? = null,
                    @SerializedName("height")
                    val height: Int? = null,
                    @SerializedName("width")
                    val width: Int? = null,
                    @SerializedName("avg_color")
                    val avgColor: String? = null,
                    @SerializedName("image_type")
                    val imageType: Int? = null,
                    @SerializedName("open_web_url")
                    val openWebUrl: String? = null,
                    @SerializedName("is_animated")
                    val isAnimated: Boolean? = null,
                    @SerializedName("flex_setting_list")
                    val flexSettingList: List<Any?>? = null,
                    @SerializedName("text_setting_list")
                    val textSettingList: List<Any?>? = null
                )

                data class BadgeImage(
                    @SerializedName("url_list")
                    val urlList: List<String?>? = null,
                    @SerializedName("uri")
                    val uri: String? = null,
                    @SerializedName("height")
                    val height: Int? = null,
                    @SerializedName("width")
                    val width: Int? = null,
                    @SerializedName("avg_color")
                    val avgColor: String? = null,
                    @SerializedName("image_type")
                    val imageType: Int? = null,
                    @SerializedName("open_web_url")
                    val openWebUrl: String? = null,
                    @SerializedName("content")
                    val content: Content? = null,
                    @SerializedName("is_animated")
                    val isAnimated: Boolean? = null,
                    @SerializedName("flex_setting_list")
                    val flexSettingList: List<Any?>? = null,
                    @SerializedName("text_setting_list")
                    val textSettingList: List<Any?>? = null
                ) {
                    data class Content(
                        @SerializedName("name")
                        val name: String? = null,
                        @SerializedName("font_color")
                        val fontColor: String? = null,
                        @SerializedName("level")
                        val level: Int? = null,
                        @SerializedName("alternative_text")
                        val alternativeText: String? = null
                    )
                }

                data class FollowInfo(
                    @SerializedName("following_count")
                    val followingCount: Int? = null,
                    @SerializedName("follower_count")
                    val followerCount: Int? = null,
                    @SerializedName("follow_status")
                    val followStatus: Int? = null,
                    @SerializedName("push_status")
                    val pushStatus: Int? = null,
                    @SerializedName("remark_name")
                    val remarkName: String? = null,
                    @SerializedName("follower_count_str")
                    val followerCountStr: String? = null,
                    @SerializedName("following_count_str")
                    val followingCountStr: String? = null,
                    @SerializedName("invalid_follow_status")
                    val invalidFollowStatus: Boolean? = null,
                    @SerializedName("follwer_count_display")
                    val follwerCountDisplay: String? = null
                )

                data class PayGrade(
                    @SerializedName("total_diamond_count")
                    val totalDiamondCount: Int? = null,
                    @SerializedName("name")
                    val name: String? = null,
                    @SerializedName("next_name")
                    val nextName: String? = null,
                    @SerializedName("level")
                    val level: Int? = null,
                    @SerializedName("next_diamond")
                    val nextDiamond: Int? = null,
                    @SerializedName("now_diamond")
                    val nowDiamond: Int? = null,
                    @SerializedName("this_grade_min_diamond")
                    val thisGradeMinDiamond: Int? = null,
                    @SerializedName("this_grade_max_diamond")
                    val thisGradeMaxDiamond: Int? = null,
                    @SerializedName("pay_diamond_bak")
                    val payDiamondBak: Int? = null,
                    @SerializedName("grade_describe")
                    val gradeDescribe: String? = null,
                    @SerializedName("grade_icon_list")
                    val gradeIconList: List<Any?>? = null,
                    @SerializedName("screen_chat_type")
                    val screenChatType: Int? = null,
                    @SerializedName("new_im_icon_with_level")
                    val newImIconWithLevel: NewImIconWithLevel? = null,
                    @SerializedName("new_live_icon")
                    val newLiveIcon: NewLiveIcon? = null,
                    @SerializedName("upgrade_need_consume")
                    val upgradeNeedConsume: Int? = null,
                    @SerializedName("next_privileges")
                    val nextPrivileges: String? = null,
                    @SerializedName("score")
                    val score: Int? = null,
                    @SerializedName("grade_describe_shining")
                    val gradeDescribeShining: Boolean? = null,
                    @SerializedName("in_rebirth")
                    val inRebirth: Boolean? = null,
                    @SerializedName("grade_banner")
                    val gradeBanner: String? = null
                ) {
                    data class NewImIconWithLevel(
                        @SerializedName("url_list")
                        val urlList: List<String?>? = null,
                        @SerializedName("uri")
                        val uri: String? = null,
                        @SerializedName("height")
                        val height: Int? = null,
                        @SerializedName("width")
                        val width: Int? = null,
                        @SerializedName("avg_color")
                        val avgColor: String? = null,
                        @SerializedName("image_type")
                        val imageType: Int? = null,
                        @SerializedName("open_web_url")
                        val openWebUrl: String? = null,
                        @SerializedName("is_animated")
                        val isAnimated: Boolean? = null,
                        @SerializedName("flex_setting_list")
                        val flexSettingList: List<Any?>? = null,
                        @SerializedName("text_setting_list")
                        val textSettingList: List<Any?>? = null
                    )

                    data class NewLiveIcon(
                        @SerializedName("url_list")
                        val urlList: List<Any?>? = null,
                        @SerializedName("uri")
                        val uri: String? = null,
                        @SerializedName("height")
                        val height: Int? = null,
                        @SerializedName("width")
                        val width: Int? = null,
                        @SerializedName("avg_color")
                        val avgColor: String? = null,
                        @SerializedName("image_type")
                        val imageType: Int? = null,
                        @SerializedName("open_web_url")
                        val openWebUrl: String? = null,
                        @SerializedName("is_animated")
                        val isAnimated: Boolean? = null,
                        @SerializedName("flex_setting_list")
                        val flexSettingList: List<Any?>? = null,
                        @SerializedName("text_setting_list")
                        val textSettingList: List<Any?>? = null
                    )
                }

                data class FansClub(
                    @SerializedName("data")
                    val `data`: Data? = null,
                    @SerializedName("prefer_data")
                    val preferData: PreferData? = null
                ) {
                    data class Data(
                        @SerializedName("club_name")
                        val clubName: String? = null,
                        @SerializedName("level")
                        val level: Int? = null,
                        @SerializedName("user_fans_club_status")
                        val userFansClubStatus: Int? = null,
                        @SerializedName("badge")
                        val badge: Badge? = null,
                        @SerializedName("available_gift_ids")
                        val availableGiftIds: List<Any?>? = null,
                        @SerializedName("anchor_id")
                        val anchorId: Int? = null,
                        @SerializedName("badge_type")
                        val badgeType: Int? = null,
                        @SerializedName("user_guard_status")
                        val userGuardStatus: Int? = null,
                        @SerializedName("guard_expired_time")
                        val guardExpiredTime: Int? = null,
                        @SerializedName("anchor_open_id")
                        val anchorOpenId: String? = null
                    ) {
                        data class Badge(
                            @SerializedName("icons")
                            val icons: Icons? = null,
                            @SerializedName("title")
                            val title: String? = null
                        ) {
                            data class Icons(
                                @SerializedName("0")
                                val x0: X0? = null
                            ) {
                                data class X0(
                                    @SerializedName("url_list")
                                    val urlList: List<Any?>? = null,
                                    @SerializedName("uri")
                                    val uri: String? = null,
                                    @SerializedName("height")
                                    val height: Int? = null,
                                    @SerializedName("width")
                                    val width: Int? = null,
                                    @SerializedName("avg_color")
                                    val avgColor: String? = null,
                                    @SerializedName("image_type")
                                    val imageType: Int? = null,
                                    @SerializedName("open_web_url")
                                    val openWebUrl: String? = null,
                                    @SerializedName("is_animated")
                                    val isAnimated: Boolean? = null,
                                    @SerializedName("flex_setting_list")
                                    val flexSettingList: List<Any?>? = null,
                                    @SerializedName("text_setting_list")
                                    val textSettingList: List<Any?>? = null
                                )
                            }
                        }
                    }

                    class PreferData
                }

                data class Border(
                    @SerializedName("icon")
                    val icon: Icon? = null,
                    @SerializedName("level")
                    val level: Int? = null,
                    @SerializedName("thumb_icon")
                    val thumbIcon: ThumbIcon? = null,
                    @SerializedName("dress_id")
                    val dressId: String? = null
                ) {
                    data class Icon(
                        @SerializedName("url_list")
                        val urlList: List<String?>? = null,
                        @SerializedName("uri")
                        val uri: String? = null,
                        @SerializedName("height")
                        val height: Int? = null,
                        @SerializedName("width")
                        val width: Int? = null,
                        @SerializedName("avg_color")
                        val avgColor: String? = null,
                        @SerializedName("image_type")
                        val imageType: Int? = null,
                        @SerializedName("open_web_url")
                        val openWebUrl: String? = null,
                        @SerializedName("is_animated")
                        val isAnimated: Boolean? = null,
                        @SerializedName("flex_setting_list")
                        val flexSettingList: List<Any?>? = null,
                        @SerializedName("text_setting_list")
                        val textSettingList: List<Any?>? = null
                    )

                    data class ThumbIcon(
                        @SerializedName("url_list")
                        val urlList: List<String?>? = null,
                        @SerializedName("uri")
                        val uri: String? = null,
                        @SerializedName("height")
                        val height: Int? = null,
                        @SerializedName("width")
                        val width: Int? = null,
                        @SerializedName("avg_color")
                        val avgColor: String? = null,
                        @SerializedName("image_type")
                        val imageType: Int? = null,
                        @SerializedName("open_web_url")
                        val openWebUrl: String? = null,
                        @SerializedName("is_animated")
                        val isAnimated: Boolean? = null,
                        @SerializedName("flex_setting_list")
                        val flexSettingList: List<Any?>? = null,
                        @SerializedName("text_setting_list")
                        val textSettingList: List<Any?>? = null
                    )
                }

                data class UserAttr(
                    @SerializedName("is_muted")
                    val isMuted: Boolean? = null,
                    @SerializedName("is_admin")
                    val isAdmin: Boolean? = null,
                    @SerializedName("is_super_admin")
                    val isSuperAdmin: Boolean? = null,
                    @SerializedName("admin_privileges")
                    val adminPrivileges: List<Any?>? = null
                )

                data class AuthenticationInfo(
                    @SerializedName("custom_verify")
                    val customVerify: String? = null,
                    @SerializedName("enterprise_verify_reason")
                    val enterpriseVerifyReason: String? = null,
                    @SerializedName("authentication_badge")
                    val authenticationBadge: AuthenticationBadge? = null,
                    @SerializedName("level_list")
                    val levelList: List<Int?>? = null,
                    @SerializedName("account_type_info")
                    val accountTypeInfo: AccountTypeInfo? = null,
                    @SerializedName("authentication_badge_v2")
                    val authenticationBadgeV2: AuthenticationBadgeV2? = null,
                    @SerializedName("account_cert_info")
                    val accountCertInfo: String? = null
                ) {
                    data class AuthenticationBadge(
                        @SerializedName("url_list")
                        val urlList: List<String?>? = null,
                        @SerializedName("uri")
                        val uri: String? = null,
                        @SerializedName("height")
                        val height: Int? = null,
                        @SerializedName("width")
                        val width: Int? = null,
                        @SerializedName("avg_color")
                        val avgColor: String? = null,
                        @SerializedName("image_type")
                        val imageType: Int? = null,
                        @SerializedName("open_web_url")
                        val openWebUrl: String? = null,
                        @SerializedName("is_animated")
                        val isAnimated: Boolean? = null,
                        @SerializedName("flex_setting_list")
                        val flexSettingList: List<Any?>? = null,
                        @SerializedName("text_setting_list")
                        val textSettingList: List<Any?>? = null
                    )

                    data class AccountTypeInfo(
                        @SerializedName("account_type_map")
                        val accountTypeMap: AccountTypeMap? = null
                    ) {
                        class AccountTypeMap
                    }

                    data class AuthenticationBadgeV2(
                        @SerializedName("url_list")
                        val urlList: List<String?>? = null,
                        @SerializedName("uri")
                        val uri: String? = null,
                        @SerializedName("height")
                        val height: Int? = null,
                        @SerializedName("width")
                        val width: Int? = null,
                        @SerializedName("avg_color")
                        val avgColor: String? = null,
                        @SerializedName("image_type")
                        val imageType: Int? = null,
                        @SerializedName("open_web_url")
                        val openWebUrl: String? = null,
                        @SerializedName("is_animated")
                        val isAnimated: Boolean? = null,
                        @SerializedName("flex_setting_list")
                        val flexSettingList: List<Any?>? = null,
                        @SerializedName("text_setting_list")
                        val textSettingList: List<Any?>? = null
                    )
                }

                data class BadgeImageV2(
                    @SerializedName("url_list")
                    val urlList: List<String?>? = null,
                    @SerializedName("uri")
                    val uri: String? = null,
                    @SerializedName("height")
                    val height: Int? = null,
                    @SerializedName("width")
                    val width: Int? = null,
                    @SerializedName("avg_color")
                    val avgColor: String? = null,
                    @SerializedName("image_type")
                    val imageType: Int? = null,
                    @SerializedName("open_web_url")
                    val openWebUrl: String? = null,
                    @SerializedName("content")
                    val content: Content? = null,
                    @SerializedName("is_animated")
                    val isAnimated: Boolean? = null,
                    @SerializedName("flex_setting_list")
                    val flexSettingList: List<Any?>? = null,
                    @SerializedName("text_setting_list")
                    val textSettingList: List<Any?>? = null
                ) {
                    data class Content(
                        @SerializedName("name")
                        val name: String? = null,
                        @SerializedName("font_color")
                        val fontColor: String? = null,
                        @SerializedName("level")
                        val level: Int? = null,
                        @SerializedName("alternative_text")
                        val alternativeText: String? = null
                    )
                }

                data class FansGroupInfo(
                    @SerializedName("list_fans_group_url")
                    val listFansGroupUrl: String? = null
                )

                data class JAccreditInfo(
                    @SerializedName("JAccreditBasic")
                    val jAccreditBasic: Int? = null,
                    @SerializedName("JAccreditAdvance")
                    val jAccreditAdvance: Int? = null,
                    @SerializedName("JAccreditContent")
                    val jAccreditContent: Int? = null,
                    @SerializedName("JAccreditLive")
                    val jAccreditLive: Int? = null
                )

                data class Subscribe(
                    @SerializedName("is_member")
                    val isMember: Boolean? = null,
                    @SerializedName("level")
                    val level: Int? = null,
                    @SerializedName("identity_type")
                    val identityType: Int? = null,
                    @SerializedName("buy_type")
                    val buyType: Int? = null,
                    @SerializedName("open")
                    val `open`: Int? = null
                )

                data class UserDressInfo(
                    @SerializedName("dress_wear_ids")
                    val dressWearIds: List<Any?>? = null,
                    @SerializedName("dress_own_ids")
                    val dressOwnIds: List<Any?>? = null
                )
            }

            data class RoomAuth(
                @SerializedName("Chat")
                val chat: Boolean? = null,
                @SerializedName("Danmaku")
                val danmaku: Boolean? = null,
                @SerializedName("Gift")
                val gift: Boolean? = null,
                @SerializedName("LuckMoney")
                val luckMoney: Boolean? = null,
                @SerializedName("Digg")
                val digg: Boolean? = null,
                @SerializedName("RoomContributor")
                val roomContributor: Boolean? = null,
                @SerializedName("Props")
                val props: Boolean? = null,
                @SerializedName("UserCard")
                val userCard: Boolean? = null,
                @SerializedName("POI")
                val pOI: Boolean? = null,
                @SerializedName("MoreAnchor")
                val moreAnchor: Int? = null,
                @SerializedName("Banner")
                val banner: Int? = null,
                @SerializedName("Share")
                val share: Int? = null,
                @SerializedName("UserCorner")
                val userCorner: Int? = null,
                @SerializedName("Landscape")
                val landscape: Int? = null,
                @SerializedName("LandscapeChat")
                val landscapeChat: Int? = null,
                @SerializedName("PublicScreen")
                val publicScreen: Int? = null,
                @SerializedName("GiftAnchorMt")
                val giftAnchorMt: Int? = null,
                @SerializedName("RecordScreen")
                val recordScreen: Int? = null,
                @SerializedName("DonationSticker")
                val donationSticker: Int? = null,
                @SerializedName("HourRank")
                val hourRank: Int? = null,
                @SerializedName("CommerceCard")
                val commerceCard: Int? = null,
                @SerializedName("AudioChat")
                val audioChat: Int? = null,
                @SerializedName("DanmakuDefault")
                val danmakuDefault: Int? = null,
                @SerializedName("KtvOrderSong")
                val ktvOrderSong: Int? = null,
                @SerializedName("SelectionAlbum")
                val selectionAlbum: Int? = null,
                @SerializedName("Like")
                val like: Int? = null,
                @SerializedName("MultiplierPlayback")
                val multiplierPlayback: Int? = null,
                @SerializedName("DownloadVideo")
                val downloadVideo: Int? = null,
                @SerializedName("Collect")
                val collect: Int? = null,
                @SerializedName("TimedShutdown")
                val timedShutdown: Int? = null,
                @SerializedName("Seek")
                val seek: Int? = null,
                @SerializedName("Denounce")
                val denounce: Int? = null,
                @SerializedName("Dislike")
                val dislike: Int? = null,
                @SerializedName("OnlyTa")
                val onlyTa: Int? = null,
                @SerializedName("CastScreen")
                val castScreen: Int? = null,
                @SerializedName("CommentWall")
                val commentWall: Int? = null,
                @SerializedName("BulletStyle")
                val bulletStyle: Int? = null,
                @SerializedName("ShowGamePlugin")
                val showGamePlugin: Int? = null,
                @SerializedName("VSGift")
                val vSGift: Int? = null,
                @SerializedName("VSTopic")
                val vSTopic: Int? = null,
                @SerializedName("VSRank")
                val vSRank: Int? = null,
                @SerializedName("AdminCommentWall")
                val adminCommentWall: Int? = null,
                @SerializedName("CommerceComponent")
                val commerceComponent: Int? = null,
                @SerializedName("DouPlus")
                val douPlus: Int? = null,
                @SerializedName("GamePointsPlaying")
                val gamePointsPlaying: Int? = null,
                @SerializedName("Poster")
                val poster: Int? = null,
                @SerializedName("Highlights")
                val highlights: Int? = null,
                @SerializedName("TypingCommentState")
                val typingCommentState: Int? = null,
                @SerializedName("StrokeUpDownGuide")
                val strokeUpDownGuide: Int? = null,
                @SerializedName("UpRightStatsFloatingLayer")
                val upRightStatsFloatingLayer: Int? = null,
                @SerializedName("CastScreenExplicit")
                val castScreenExplicit: Int? = null,
                @SerializedName("Selection")
                val selection: Int? = null,
                @SerializedName("IndustryService")
                val industryService: Int? = null,
                @SerializedName("VerticalRank")
                val verticalRank: Int? = null,
                @SerializedName("EnterEffects")
                val enterEffects: Int? = null,
                @SerializedName("FansClub")
                val fansClub: Int? = null,
                @SerializedName("EmojiOutside")
                val emojiOutside: Int? = null,
                @SerializedName("CanSellTicket")
                val canSellTicket: Int? = null,
                @SerializedName("DouPlusPopularityGem")
                val douPlusPopularityGem: Int? = null,
                @SerializedName("MissionCenter")
                val missionCenter: Int? = null,
                @SerializedName("ExpandScreen")
                val expandScreen: Int? = null,
                @SerializedName("FansGroup")
                val fansGroup: Int? = null,
                @SerializedName("Topic")
                val topic: Int? = null,
                @SerializedName("AnchorMission")
                val anchorMission: Int? = null,
                @SerializedName("Teleprompter")
                val teleprompter: Int? = null,
                @SerializedName("ChatDynamicSlideSpeed")
                val chatDynamicSlideSpeed: Int? = null,
                @SerializedName("SmallWindowDisplay")
                val smallWindowDisplay: Int? = null,
                @SerializedName("MessageDispatch")
                val messageDispatch: Int? = null,
                @SerializedName("RoomChannel")
                val roomChannel: Int? = null,
                @SerializedName("ChatDispatch")
                val chatDispatch: Int? = null,
                @SerializedName("LinkmicGuestLike")
                val linkmicGuestLike: Int? = null,
                @SerializedName("MediaLinkmic")
                val mediaLinkmic: Int? = null,
                @SerializedName("VideoShare")
                val videoShare: Int? = null,
                @SerializedName("ChatGuideEmoji")
                val chatGuideEmoji: Int? = null,
                @SerializedName("ChatGuideImage")
                val chatGuideImage: Int? = null,
                @SerializedName("PCPlay")
                val pCPlay: Int? = null,
                @SerializedName("PadPlay")
                val padPlay: Int? = null,
                @SerializedName("LongTouch")
                val longTouch: Int? = null,
                @SerializedName("FirstFeedHistChat")
                val firstFeedHistChat: Int? = null,
                @SerializedName("MoreHistChat")
                val moreHistChat: Int? = null,
                @SerializedName("WordAssociation")
                val wordAssociation: Int? = null,
                @SerializedName("LandscapeScreenCapture")
                val landscapeScreenCapture: Int? = null,
                @SerializedName("LandscapeScreenRecording")
                val landscapeScreenRecording: Int? = null,
                @SerializedName("ScreenProjectionBarrage")
                val screenProjectionBarrage: Int? = null,
                @SerializedName("SmallWindowPlayer")
                val smallWindowPlayer: Int? = null,
                @SerializedName("ChatOperate")
                val chatOperate: Int? = null,
                @SerializedName("EcomFansClub")
                val ecomFansClub: Int? = null,
                @SerializedName("AudioChatTotext")
                val audioChatTotext: Int? = null,
                @SerializedName("CommonCard")
                val commonCard: Int? = null,
                @SerializedName("ShortTouch")
                val shortTouch: Int? = null,
                @SerializedName("HostTeamChannel")
                val hostTeamChannel: Int? = null,
                @SerializedName("LandscapeChatDynamicSlideSpeed")
                val landscapeChatDynamicSlideSpeed: Int? = null,
                @SerializedName("HostTeam")
                val hostTeam: Int? = null,
                @SerializedName("AnchorHotMessageAggregated")
                val anchorHotMessageAggregated: Int? = null,
                @SerializedName("AnchorColdMessageTiled")
                val anchorColdMessageTiled: Int? = null,
                @SerializedName("ScreenBottomInfo")
                val screenBottomInfo: Int? = null,
                @SerializedName("PreviewHotCommentSwitch")
                val previewHotCommentSwitch: Int? = null,
                @SerializedName("RoomWidget")
                val roomWidget: Int? = null,
                @SerializedName("PanelECService")
                val panelECService: Int? = null,
                @SerializedName("FixedChat")
                val fixedChat: Int? = null,
                @SerializedName("LandscapeGift")
                val landscapeGift: Int? = null,
                @SerializedName("HotChatTray")
                val hotChatTray: Int? = null,
                @SerializedName("ItemShare")
                val itemShare: Int? = null,
                @SerializedName("ShortTouchTempState")
                val shortTouchTempState: Int? = null,
                @SerializedName("StickyMessage")
                val stickyMessage: Int? = null,
                @SerializedName("ProjectionBtn")
                val projectionBtn: Int? = null,
                @SerializedName("ChatDynamicSlideSpeedAnchor")
                val chatDynamicSlideSpeedAnchor: Int? = null,
                @SerializedName("PosterCache")
                val posterCache: Int? = null,
                @SerializedName("MediaHistoryMessage")
                val mediaHistoryMessage: Int? = null,
                @SerializedName("ToolbarBubble")
                val toolbarBubble: Int? = null,
                @SerializedName("ImHeatValue")
                val imHeatValue: Int? = null,
                @SerializedName("InteractiveComponent")
                val interactiveComponent: Int? = null,
                @SerializedName("ChatReply")
                val chatReply: Int? = null,
                @SerializedName("ChatMention")
                val chatMention: Int? = null,
                @SerializedName("FrequentlyChat")
                val frequentlyChat: Int? = null,
                @SerializedName("StreamAdaptation")
                val streamAdaptation: Int? = null,
                @SerializedName("VideoAmplificationType")
                val videoAmplificationType: Int? = null,
                @SerializedName("FeaturedPublicScreen")
                val featuredPublicScreen: Int? = null,
                @SerializedName("LandscapeScreenShare")
                val landscapeScreenShare: Int? = null,
                @SerializedName("VerticalScreenShare")
                val verticalScreenShare: Int? = null,
                @SerializedName("AnchorAudioChat")
                val anchorAudioChat: Int? = null,
                @SerializedName("PreviewChatExpose")
                val previewChatExpose: Int? = null,
                @SerializedName("FusionEmoji")
                val fusionEmoji: Int? = null,
                @SerializedName("MyLiveEntrance")
                val myLiveEntrance: Int? = null,
                @SerializedName("ChatIdentity")
                val chatIdentity: Int? = null,
                @SerializedName("MarkUser")
                val markUser: Int? = null,
                @SerializedName("LongPressOption")
                val longPressOption: Int? = null,
                @SerializedName("ClearEntranceOption")
                val clearEntranceOption: Int? = null,
                @SerializedName("PlayerRankList")
                val playerRankList: Int? = null,
                @SerializedName("AIClone")
                val aIClone: Int? = null,
                @SerializedName("GiftVote")
                val giftVote: Int? = null,
                @SerializedName("TextGift")
                val textGift: Int? = null,
                @SerializedName("FansClubLetter")
                val fansClubLetter: Int? = null,
                @SerializedName("FansClubBlessing")
                val fansClubBlessing: Int? = null,
                @SerializedName("FansClubNotice")
                val fansClubNotice: Int? = null,
                @SerializedName("FansClubDeclaration")
                val fansClubDeclaration: Int? = null,
                @SerializedName("MessageGift")
                val messageGift: Int? = null,
                @SerializedName("EnhancedTouch")
                val enhancedTouch: Int? = null,
                @SerializedName("ChatMentionV2")
                val chatMentionV2: Int? = null,
                @SerializedName("RoomChatOperatePanel")
                val roomChatOperatePanel: Int? = null,
                @SerializedName("RoomChatLikeDisplay")
                val roomChatLikeDisplay: Int? = null,
                @SerializedName("RoomSecretChat")
                val roomSecretChat: Int? = null,
                @SerializedName("RoomAnchorFansChannel")
                val roomAnchorFansChannel: Int? = null,
                @SerializedName("RoomPinHighlight")
                val roomPinHighlight: Int? = null,
                @SerializedName("HighlightAreaContainer")
                val highlightAreaContainer: Int? = null,
                @SerializedName("LowPcuGuideChatData")
                val lowPcuGuideChatData: Int? = null,
                @SerializedName("PreviewDanMaKu")
                val previewDanMaKu: Int? = null,
                @SerializedName("WorldSquare")
                val worldSquare: Int? = null,
                @SerializedName("VsCommentBar")
                val vsCommentBar: Int? = null,
                @SerializedName("VsWelcomeDanmaku")
                val vsWelcomeDanmaku: Int? = null,
                @SerializedName("VsFansClub")
                val vsFansClub: Int? = null,
                @SerializedName("VsExtensionEnableFollow")
                val vsExtensionEnableFollow: Int? = null,
                @SerializedName("VsDouPlus")
                val vsDouPlus: Int? = null,
                @SerializedName("QuizGamePointsPlaying")
                val quizGamePointsPlaying: Int? = null,
                @SerializedName("UgcVSReplayDelete")
                val ugcVSReplayDelete: Int? = null,
                @SerializedName("UgcVsReplayVisibility")
                val ugcVsReplayVisibility: Int? = null,
                @SerializedName("InteractionGift")
                val interactionGift: Int? = null,
                @SerializedName("SubscribeCardPackage")
                val subscribeCardPackage: Int? = null,
                @SerializedName("ShowQualification")
                val showQualification: Int? = null,
                @SerializedName("UseHostInfo")
                val useHostInfo: Int? = null,
                @SerializedName("CountType")
                val countType: Int? = null
            )

            data class GuideButton(
                @SerializedName("url_list")
                val urlList: List<String?>? = null,
                @SerializedName("uri")
                val uri: String? = null,
                @SerializedName("height")
                val height: Int? = null,
                @SerializedName("width")
                val width: Int? = null,
                @SerializedName("avg_color")
                val avgColor: String? = null,
                @SerializedName("image_type")
                val imageType: Int? = null,
                @SerializedName("open_web_url")
                val openWebUrl: String? = null,
                @SerializedName("is_animated")
                val isAnimated: Boolean? = null,
                @SerializedName("flex_setting_list")
                val flexSettingList: List<Any?>? = null,
                @SerializedName("text_setting_list")
                val textSettingList: List<Any?>? = null
            )

            data class ShortTouchAreaConfig(
                @SerializedName("elements")
                val elements: Elements? = null,
                @SerializedName("forbidden_types_map")
                val forbiddenTypesMap: ForbiddenTypesMap? = null,
                @SerializedName("temp_state_condition_map")
                val tempStateConditionMap: TempStateConditionMap? = null,
                @SerializedName("temp_state_strategy")
                val tempStateStrategy: TempStateStrategy? = null,
                @SerializedName("strategy_feat_whitelist")
                val strategyFeatWhitelist: List<String?>? = null,
                @SerializedName("temp_state_global_condition")
                val tempStateGlobalCondition: TempStateGlobalCondition? = null,
                @SerializedName("big_card_display_strategy")
                val bigCardDisplayStrategy: BigCardDisplayStrategy? = null
            ) {
                data class Elements(
                    @SerializedName("1")
                    val x1: X1? = null,
                    @SerializedName("2")
                    val x2: X2? = null,
                    @SerializedName("3")
                    val x3: X3? = null,
                    @SerializedName("4")
                    val x4: X4? = null,
                    @SerializedName("5")
                    val x5: X5? = null,
                    @SerializedName("6")
                    val x6: X6? = null,
                    @SerializedName("7")
                    val x7: X7? = null,
                    @SerializedName("8")
                    val x8: X8? = null,
                    @SerializedName("9")
                    val x9: X9? = null,
                    @SerializedName("10")
                    val x10: X10? = null,
                    @SerializedName("12")
                    val x12: X12? = null,
                    @SerializedName("22")
                    val x22: X22? = null,
                    @SerializedName("27")
                    val x27: X27? = null,
                    @SerializedName("30")
                    val x30: X30? = null
                ) {
                    data class X1(
                        @SerializedName("type")
                        val type: Int? = null,
                        @SerializedName("priority")
                        val priority: Int? = null
                    )

                    data class X2(
                        @SerializedName("type")
                        val type: Int? = null,
                        @SerializedName("priority")
                        val priority: Int? = null
                    )

                    data class X3(
                        @SerializedName("type")
                        val type: Int? = null,
                        @SerializedName("priority")
                        val priority: Int? = null
                    )

                    data class X4(
                        @SerializedName("type")
                        val type: Int? = null,
                        @SerializedName("priority")
                        val priority: Int? = null
                    )

                    data class X5(
                        @SerializedName("type")
                        val type: Int? = null,
                        @SerializedName("priority")
                        val priority: Int? = null
                    )

                    data class X6(
                        @SerializedName("type")
                        val type: Int? = null,
                        @SerializedName("priority")
                        val priority: Int? = null
                    )

                    data class X7(
                        @SerializedName("type")
                        val type: Int? = null,
                        @SerializedName("priority")
                        val priority: Int? = null
                    )

                    data class X8(
                        @SerializedName("type")
                        val type: Int? = null,
                        @SerializedName("priority")
                        val priority: Int? = null
                    )

                    data class X9(
                        @SerializedName("type")
                        val type: Int? = null,
                        @SerializedName("priority")
                        val priority: Int? = null
                    )

                    data class X10(
                        @SerializedName("type")
                        val type: Int? = null,
                        @SerializedName("priority")
                        val priority: Int? = null
                    )

                    data class X12(
                        @SerializedName("type")
                        val type: Int? = null,
                        @SerializedName("priority")
                        val priority: Int? = null
                    )

                    data class X22(
                        @SerializedName("type")
                        val type: Int? = null,
                        @SerializedName("priority")
                        val priority: Int? = null
                    )

                    data class X27(
                        @SerializedName("type")
                        val type: Int? = null,
                        @SerializedName("priority")
                        val priority: Int? = null
                    )

                    data class X30(
                        @SerializedName("type")
                        val type: Int? = null,
                        @SerializedName("priority")
                        val priority: Int? = null
                    )
                }

                class ForbiddenTypesMap

                data class TempStateConditionMap(
                    @SerializedName("1")
                    val x1: X1? = null,
                    @SerializedName("2")
                    val x2: X2? = null,
                    @SerializedName("3")
                    val x3: X3? = null,
                    @SerializedName("4")
                    val x4: X4? = null,
                    @SerializedName("5")
                    val x5: X5? = null,
                    @SerializedName("6")
                    val x6: X6? = null,
                    @SerializedName("7")
                    val x7: X7? = null
                ) {
                    data class X1(
                        @SerializedName("type")
                        val type: Type? = null,
                        @SerializedName("minimum_gap")
                        val minimumGap: Int? = null
                    ) {
                        data class Type(
                            @SerializedName("strategy_type")
                            val strategyType: Int? = null,
                            @SerializedName("priority")
                            val priority: Int? = null
                        )
                    }

                    data class X2(
                        @SerializedName("type")
                        val type: Type? = null,
                        @SerializedName("minimum_gap")
                        val minimumGap: Int? = null
                    ) {
                        data class Type(
                            @SerializedName("strategy_type")
                            val strategyType: Int? = null,
                            @SerializedName("priority")
                            val priority: Int? = null
                        )
                    }

                    data class X3(
                        @SerializedName("type")
                        val type: Type? = null,
                        @SerializedName("minimum_gap")
                        val minimumGap: Int? = null
                    ) {
                        data class Type(
                            @SerializedName("strategy_type")
                            val strategyType: Int? = null,
                            @SerializedName("priority")
                            val priority: Int? = null
                        )
                    }

                    data class X4(
                        @SerializedName("type")
                        val type: Type? = null,
                        @SerializedName("minimum_gap")
                        val minimumGap: Int? = null
                    ) {
                        data class Type(
                            @SerializedName("strategy_type")
                            val strategyType: Int? = null,
                            @SerializedName("priority")
                            val priority: Int? = null
                        )
                    }

                    data class X5(
                        @SerializedName("type")
                        val type: Type? = null,
                        @SerializedName("minimum_gap")
                        val minimumGap: Int? = null
                    ) {
                        data class Type(
                            @SerializedName("strategy_type")
                            val strategyType: Int? = null,
                            @SerializedName("priority")
                            val priority: Int? = null
                        )
                    }

                    data class X6(
                        @SerializedName("type")
                        val type: Type? = null,
                        @SerializedName("minimum_gap")
                        val minimumGap: Int? = null
                    ) {
                        data class Type(
                            @SerializedName("strategy_type")
                            val strategyType: Int? = null,
                            @SerializedName("priority")
                            val priority: Int? = null
                        )
                    }

                    data class X7(
                        @SerializedName("type")
                        val type: Type? = null,
                        @SerializedName("minimum_gap")
                        val minimumGap: Int? = null
                    ) {
                        data class Type(
                            @SerializedName("strategy_type")
                            val strategyType: Int? = null,
                            @SerializedName("priority")
                            val priority: Int? = null
                        )
                    }
                }

                data class TempStateStrategy(
                    @SerializedName("4")
                    val x4: X4? = null,
                    @SerializedName("7")
                    val x7: X7? = null,
                    @SerializedName("8")
                    val x8: X8? = null,
                    @SerializedName("97")
                    val x97: X97? = null,
                    @SerializedName("136")
                    val x136: X136? = null,
                    @SerializedName("141")
                    val x141: X141? = null,
                    @SerializedName("149")
                    val x149: X149? = null,
                    @SerializedName("152")
                    val x152: X152? = null,
                    @SerializedName("153")
                    val x153: X153? = null,
                    @SerializedName("159")
                    val x159: X159? = null,
                    @SerializedName("161")
                    val x161: X161? = null,
                    @SerializedName("210")
                    val x210: X210? = null,
                    @SerializedName("211")
                    val x211: X211? = null,
                    @SerializedName("217")
                    val x217: X217? = null,
                    @SerializedName("222")
                    val x222: X222? = null,
                    @SerializedName("306")
                    val x306: X306? = null,
                    @SerializedName("307")
                    val x307: X307? = null,
                    @SerializedName("308")
                    val x308: X308? = null,
                    @SerializedName("311")
                    val x311: X311? = null,
                    @SerializedName("312")
                    val x312: X312? = null,
                    @SerializedName("313")
                    val x313: X313? = null
                ) {
                    data class X4(
                        @SerializedName("short_touch_type")
                        val shortTouchType: Int? = null,
                        @SerializedName("strategy_map")
                        val strategyMap: StrategyMap? = null
                    ) {
                        data class StrategyMap(
                            @SerializedName("1")
                            val x1: X1? = null,
                            @SerializedName("2")
                            val x2: X2? = null,
                            @SerializedName("3")
                            val x3: X3? = null,
                            @SerializedName("6")
                            val x6: X6? = null,
                            @SerializedName("7")
                            val x7: X7? = null
                        ) {
                            data class X1(
                                @SerializedName("type")
                                val type: Type? = null,
                                @SerializedName("duration")
                                val duration: Int? = null,
                                @SerializedName("strategy_method")
                                val strategyMethod: String? = null
                            ) {
                                data class Type(
                                    @SerializedName("strategy_type")
                                    val strategyType: Int? = null,
                                    @SerializedName("priority")
                                    val priority: Int? = null
                                )
                            }

                            data class X2(
                                @SerializedName("type")
                                val type: Type? = null,
                                @SerializedName("duration")
                                val duration: Int? = null,
                                @SerializedName("strategy_method")
                                val strategyMethod: String? = null
                            ) {
                                data class Type(
                                    @SerializedName("strategy_type")
                                    val strategyType: Int? = null,
                                    @SerializedName("priority")
                                    val priority: Int? = null
                                )
                            }

                            data class X3(
                                @SerializedName("type")
                                val type: Type? = null,
                                @SerializedName("duration")
                                val duration: Int? = null,
                                @SerializedName("strategy_method")
                                val strategyMethod: String? = null
                            ) {
                                data class Type(
                                    @SerializedName("strategy_type")
                                    val strategyType: Int? = null,
                                    @SerializedName("priority")
                                    val priority: Int? = null
                                )
                            }

                            data class X6(
                                @SerializedName("type")
                                val type: Type? = null,
                                @SerializedName("duration")
                                val duration: Int? = null,
                                @SerializedName("strategy_method")
                                val strategyMethod: String? = null
                            ) {
                                data class Type(
                                    @SerializedName("strategy_type")
                                    val strategyType: Int? = null,
                                    @SerializedName("priority")
                                    val priority: Int? = null
                                )
                            }

                            data class X7(
                                @SerializedName("type")
                                val type: Type? = null,
                                @SerializedName("duration")
                                val duration: Int? = null,
                                @SerializedName("strategy_method")
                                val strategyMethod: String? = null
                            ) {
                                data class Type(
                                    @SerializedName("strategy_type")
                                    val strategyType: Int? = null,
                                    @SerializedName("priority")
                                    val priority: Int? = null
                                )
                            }
                        }
                    }

                    data class X7(
                        @SerializedName("short_touch_type")
                        val shortTouchType: Int? = null,
                        @SerializedName("strategy_map")
                        val strategyMap: StrategyMap? = null
                    ) {
                        data class StrategyMap(
                            @SerializedName("1")
                            val x1: X1? = null,
                            @SerializedName("2")
                            val x2: X2? = null,
                            @SerializedName("3")
                            val x3: X3? = null,
                            @SerializedName("4")
                            val x4: X4? = null,
                            @SerializedName("5")
                            val x5: X5? = null,
                            @SerializedName("6")
                            val x6: X6? = null
                        ) {
                            data class X1(
                                @SerializedName("type")
                                val type: Type? = null,
                                @SerializedName("duration")
                                val duration: Int? = null,
                                @SerializedName("strategy_method")
                                val strategyMethod: String? = null
                            ) {
                                data class Type(
                                    @SerializedName("strategy_type")
                                    val strategyType: Int? = null,
                                    @SerializedName("priority")
                                    val priority: Int? = null
                                )
                            }

                            data class X2(
                                @SerializedName("type")
                                val type: Type? = null,
                                @SerializedName("duration")
                                val duration: Int? = null,
                                @SerializedName("strategy_method")
                                val strategyMethod: String? = null
                            ) {
                                data class Type(
                                    @SerializedName("strategy_type")
                                    val strategyType: Int? = null,
                                    @SerializedName("priority")
                                    val priority: Int? = null
                                )
                            }

                            data class X3(
                                @SerializedName("type")
                                val type: Type? = null,
                                @SerializedName("duration")
                                val duration: Int? = null,
                                @SerializedName("strategy_method")
                                val strategyMethod: String? = null
                            ) {
                                data class Type(
                                    @SerializedName("strategy_type")
                                    val strategyType: Int? = null,
                                    @SerializedName("priority")
                                    val priority: Int? = null
                                )
                            }

                            data class X4(
                                @SerializedName("type")
                                val type: Type? = null,
                                @SerializedName("duration")
                                val duration: Int? = null,
                                @SerializedName("strategy_method")
                                val strategyMethod: String? = null
                            ) {
                                data class Type(
                                    @SerializedName("strategy_type")
                                    val strategyType: Int? = null,
                                    @SerializedName("priority")
                                    val priority: Int? = null
                                )
                            }

                            data class X5(
                                @SerializedName("type")
                                val type: Type? = null,
                                @SerializedName("duration")
                                val duration: Int? = null,
                                @SerializedName("strategy_method")
                                val strategyMethod: String? = null
                            ) {
                                data class Type(
                                    @SerializedName("strategy_type")
                                    val strategyType: Int? = null,
                                    @SerializedName("priority")
                                    val priority: Int? = null
                                )
                            }

                            data class X6(
                                @SerializedName("type")
                                val type: Type? = null,
                                @SerializedName("duration")
                                val duration: Int? = null,
                                @SerializedName("strategy_method")
                                val strategyMethod: String? = null
                            ) {
                                data class Type(
                                    @SerializedName("strategy_type")
                                    val strategyType: Int? = null,
                                    @SerializedName("priority")
                                    val priority: Int? = null
                                )
                            }
                        }
                    }

                    data class X8(
                        @SerializedName("short_touch_type")
                        val shortTouchType: Int? = null,
                        @SerializedName("strategy_map")
                        val strategyMap: StrategyMap? = null
                    ) {
                        data class StrategyMap(
                            @SerializedName("1")
                            val x1: X1? = null,
                            @SerializedName("2")
                            val x2: X2? = null
                        ) {
                            data class X1(
                                @SerializedName("type")
                                val type: Type? = null,
                                @SerializedName("duration")
                                val duration: Int? = null,
                                @SerializedName("strategy_method")
                                val strategyMethod: String? = null
                            ) {
                                data class Type(
                                    @SerializedName("strategy_type")
                                    val strategyType: Int? = null,
                                    @SerializedName("priority")
                                    val priority: Int? = null
                                )
                            }

                            data class X2(
                                @SerializedName("type")
                                val type: Type? = null,
                                @SerializedName("duration")
                                val duration: Int? = null,
                                @SerializedName("strategy_method")
                                val strategyMethod: String? = null
                            ) {
                                data class Type(
                                    @SerializedName("strategy_type")
                                    val strategyType: Int? = null,
                                    @SerializedName("priority")
                                    val priority: Int? = null
                                )
                            }
                        }
                    }

                    data class X97(
                        @SerializedName("short_touch_type")
                        val shortTouchType: Int? = null,
                        @SerializedName("strategy_map")
                        val strategyMap: StrategyMap? = null
                    ) {
                        data class StrategyMap(
                            @SerializedName("1")
                            val x1: X1? = null,
                            @SerializedName("2")
                            val x2: X2? = null,
                            @SerializedName("3")
                            val x3: X3? = null,
                            @SerializedName("5")
                            val x5: X5? = null,
                            @SerializedName("6")
                            val x6: X6? = null,
                            @SerializedName("7")
                            val x7: X7? = null
                        ) {
                            data class X1(
                                @SerializedName("type")
                                val type: Type? = null,
                                @SerializedName("duration")
                                val duration: Int? = null,
                                @SerializedName("strategy_method")
                                val strategyMethod: String? = null
                            ) {
                                data class Type(
                                    @SerializedName("strategy_type")
                                    val strategyType: Int? = null,
                                    @SerializedName("priority")
                                    val priority: Int? = null
                                )
                            }

                            data class X2(
                                @SerializedName("type")
                                val type: Type? = null,
                                @SerializedName("duration")
                                val duration: Int? = null,
                                @SerializedName("strategy_method")
                                val strategyMethod: String? = null
                            ) {
                                data class Type(
                                    @SerializedName("strategy_type")
                                    val strategyType: Int? = null,
                                    @SerializedName("priority")
                                    val priority: Int? = null
                                )
                            }

                            data class X3(
                                @SerializedName("type")
                                val type: Type? = null,
                                @SerializedName("duration")
                                val duration: Int? = null,
                                @SerializedName("strategy_method")
                                val strategyMethod: String? = null
                            ) {
                                data class Type(
                                    @SerializedName("strategy_type")
                                    val strategyType: Int? = null,
                                    @SerializedName("priority")
                                    val priority: Int? = null
                                )
                            }

                            data class X5(
                                @SerializedName("type")
                                val type: Type? = null,
                                @SerializedName("duration")
                                val duration: Int? = null,
                                @SerializedName("strategy_method")
                                val strategyMethod: String? = null
                            ) {
                                data class Type(
                                    @SerializedName("strategy_type")
                                    val strategyType: Int? = null,
                                    @SerializedName("priority")
                                    val priority: Int? = null
                                )
                            }

                            data class X6(
                                @SerializedName("type")
                                val type: Type? = null,
                                @SerializedName("duration")
                                val duration: Int? = null,
                                @SerializedName("strategy_method")
                                val strategyMethod: String? = null
                            ) {
                                data class Type(
                                    @SerializedName("strategy_type")
                                    val strategyType: Int? = null,
                                    @SerializedName("priority")
                                    val priority: Int? = null
                                )
                            }

                            data class X7(
                                @SerializedName("type")
                                val type: Type? = null,
                                @SerializedName("duration")
                                val duration: Int? = null,
                                @SerializedName("strategy_method")
                                val strategyMethod: String? = null
                            ) {
                                data class Type(
                                    @SerializedName("strategy_type")
                                    val strategyType: Int? = null,
                                    @SerializedName("priority")
                                    val priority: Int? = null
                                )
                            }
                        }
                    }

                    data class X136(
                        @SerializedName("short_touch_type")
                        val shortTouchType: Int? = null,
                        @SerializedName("strategy_map")
                        val strategyMap: StrategyMap? = null
                    ) {
                        data class StrategyMap(
                            @SerializedName("1")
                            val x1: X1? = null,
                            @SerializedName("2")
                            val x2: X2? = null
                        ) {
                            data class X1(
                                @SerializedName("type")
                                val type: Type? = null,
                                @SerializedName("duration")
                                val duration: Int? = null,
                                @SerializedName("strategy_method")
                                val strategyMethod: String? = null
                            ) {
                                data class Type(
                                    @SerializedName("strategy_type")
                                    val strategyType: Int? = null,
                                    @SerializedName("priority")
                                    val priority: Int? = null
                                )
                            }

                            data class X2(
                                @SerializedName("type")
                                val type: Type? = null,
                                @SerializedName("duration")
                                val duration: Int? = null,
                                @SerializedName("strategy_method")
                                val strategyMethod: String? = null
                            ) {
                                data class Type(
                                    @SerializedName("strategy_type")
                                    val strategyType: Int? = null,
                                    @SerializedName("priority")
                                    val priority: Int? = null
                                )
                            }
                        }
                    }

                    data class X141(
                        @SerializedName("short_touch_type")
                        val shortTouchType: Int? = null,
                        @SerializedName("strategy_map")
                        val strategyMap: StrategyMap? = null
                    ) {
                        data class StrategyMap(
                            @SerializedName("1")
                            val x1: X1? = null,
                            @SerializedName("2")
                            val x2: X2? = null,
                            @SerializedName("3")
                            val x3: X3? = null
                        ) {
                            data class X1(
                                @SerializedName("type")
                                val type: Type? = null,
                                @SerializedName("duration")
                                val duration: Int? = null,
                                @SerializedName("strategy_method")
                                val strategyMethod: String? = null
                            ) {
                                data class Type(
                                    @SerializedName("strategy_type")
                                    val strategyType: Int? = null,
                                    @SerializedName("priority")
                                    val priority: Int? = null
                                )
                            }

                            data class X2(
                                @SerializedName("type")
                                val type: Type? = null,
                                @SerializedName("duration")
                                val duration: Int? = null,
                                @SerializedName("strategy_method")
                                val strategyMethod: String? = null
                            ) {
                                data class Type(
                                    @SerializedName("strategy_type")
                                    val strategyType: Int? = null,
                                    @SerializedName("priority")
                                    val priority: Int? = null
                                )
                            }

                            data class X3(
                                @SerializedName("type")
                                val type: Type? = null,
                                @SerializedName("duration")
                                val duration: Int? = null,
                                @SerializedName("strategy_method")
                                val strategyMethod: String? = null
                            ) {
                                data class Type(
                                    @SerializedName("strategy_type")
                                    val strategyType: Int? = null,
                                    @SerializedName("priority")
                                    val priority: Int? = null
                                )
                            }
                        }
                    }

                    data class X149(
                        @SerializedName("short_touch_type")
                        val shortTouchType: Int? = null,
                        @SerializedName("strategy_map")
                        val strategyMap: StrategyMap? = null
                    ) {
                        data class StrategyMap(
                            @SerializedName("1")
                            val x1: X1? = null,
                            @SerializedName("2")
                            val x2: X2? = null
                        ) {
                            data class X1(
                                @SerializedName("type")
                                val type: Type? = null,
                                @SerializedName("duration")
                                val duration: Int? = null,
                                @SerializedName("strategy_method")
                                val strategyMethod: String? = null
                            ) {
                                data class Type(
                                    @SerializedName("strategy_type")
                                    val strategyType: Int? = null,
                                    @SerializedName("priority")
                                    val priority: Int? = null
                                )
                            }

                            data class X2(
                                @SerializedName("type")
                                val type: Type? = null,
                                @SerializedName("duration")
                                val duration: Int? = null,
                                @SerializedName("strategy_method")
                                val strategyMethod: String? = null
                            ) {
                                data class Type(
                                    @SerializedName("strategy_type")
                                    val strategyType: Int? = null,
                                    @SerializedName("priority")
                                    val priority: Int? = null
                                )
                            }
                        }
                    }

                    data class X152(
                        @SerializedName("short_touch_type")
                        val shortTouchType: Int? = null,
                        @SerializedName("strategy_map")
                        val strategyMap: StrategyMap? = null
                    ) {
                        data class StrategyMap(
                            @SerializedName("1")
                            val x1: X1? = null,
                            @SerializedName("2")
                            val x2: X2? = null
                        ) {
                            data class X1(
                                @SerializedName("type")
                                val type: Type? = null,
                                @SerializedName("duration")
                                val duration: Int? = null,
                                @SerializedName("strategy_method")
                                val strategyMethod: String? = null
                            ) {
                                data class Type(
                                    @SerializedName("strategy_type")
                                    val strategyType: Int? = null,
                                    @SerializedName("priority")
                                    val priority: Int? = null
                                )
                            }

                            data class X2(
                                @SerializedName("type")
                                val type: Type? = null,
                                @SerializedName("duration")
                                val duration: Int? = null,
                                @SerializedName("strategy_method")
                                val strategyMethod: String? = null
                            ) {
                                data class Type(
                                    @SerializedName("strategy_type")
                                    val strategyType: Int? = null,
                                    @SerializedName("priority")
                                    val priority: Int? = null
                                )
                            }
                        }
                    }

                    data class X153(
                        @SerializedName("short_touch_type")
                        val shortTouchType: Int? = null,
                        @SerializedName("strategy_map")
                        val strategyMap: StrategyMap? = null
                    ) {
                        data class StrategyMap(
                            @SerializedName("1")
                            val x1: X1? = null,
                            @SerializedName("2")
                            val x2: X2? = null,
                            @SerializedName("4")
                            val x4: X4? = null
                        ) {
                            data class X1(
                                @SerializedName("type")
                                val type: Type? = null,
                                @SerializedName("duration")
                                val duration: Int? = null,
                                @SerializedName("strategy_method")
                                val strategyMethod: String? = null
                            ) {
                                data class Type(
                                    @SerializedName("strategy_type")
                                    val strategyType: Int? = null,
                                    @SerializedName("priority")
                                    val priority: Int? = null
                                )
                            }

                            data class X2(
                                @SerializedName("type")
                                val type: Type? = null,
                                @SerializedName("duration")
                                val duration: Int? = null,
                                @SerializedName("strategy_method")
                                val strategyMethod: String? = null
                            ) {
                                data class Type(
                                    @SerializedName("strategy_type")
                                    val strategyType: Int? = null,
                                    @SerializedName("priority")
                                    val priority: Int? = null
                                )
                            }

                            data class X4(
                                @SerializedName("type")
                                val type: Type? = null,
                                @SerializedName("duration")
                                val duration: Int? = null,
                                @SerializedName("strategy_method")
                                val strategyMethod: String? = null
                            ) {
                                data class Type(
                                    @SerializedName("strategy_type")
                                    val strategyType: Int? = null,
                                    @SerializedName("priority")
                                    val priority: Int? = null
                                )
                            }
                        }
                    }

                    data class X159(
                        @SerializedName("short_touch_type")
                        val shortTouchType: Int? = null,
                        @SerializedName("strategy_map")
                        val strategyMap: StrategyMap? = null
                    ) {
                        data class StrategyMap(
                            @SerializedName("1")
                            val x1: X1? = null
                        ) {
                            data class X1(
                                @SerializedName("type")
                                val type: Type? = null,
                                @SerializedName("duration")
                                val duration: Int? = null,
                                @SerializedName("strategy_method")
                                val strategyMethod: String? = null
                            ) {
                                data class Type(
                                    @SerializedName("strategy_type")
                                    val strategyType: Int? = null,
                                    @SerializedName("priority")
                                    val priority: Int? = null
                                )
                            }
                        }
                    }

                    data class X161(
                        @SerializedName("short_touch_type")
                        val shortTouchType: Int? = null,
                        @SerializedName("strategy_map")
                        val strategyMap: StrategyMap? = null
                    ) {
                        data class StrategyMap(
                            @SerializedName("1")
                            val x1: X1? = null,
                            @SerializedName("2")
                            val x2: X2? = null
                        ) {
                            data class X1(
                                @SerializedName("type")
                                val type: Type? = null,
                                @SerializedName("duration")
                                val duration: Int? = null,
                                @SerializedName("strategy_method")
                                val strategyMethod: String? = null
                            ) {
                                data class Type(
                                    @SerializedName("strategy_type")
                                    val strategyType: Int? = null,
                                    @SerializedName("priority")
                                    val priority: Int? = null
                                )
                            }

                            data class X2(
                                @SerializedName("type")
                                val type: Type? = null,
                                @SerializedName("duration")
                                val duration: Int? = null,
                                @SerializedName("strategy_method")
                                val strategyMethod: String? = null
                            ) {
                                data class Type(
                                    @SerializedName("strategy_type")
                                    val strategyType: Int? = null,
                                    @SerializedName("priority")
                                    val priority: Int? = null
                                )
                            }
                        }
                    }

                    data class X210(
                        @SerializedName("short_touch_type")
                        val shortTouchType: Int? = null,
                        @SerializedName("strategy_map")
                        val strategyMap: StrategyMap? = null
                    ) {
                        data class StrategyMap(
                            @SerializedName("1")
                            val x1: X1? = null
                        ) {
                            data class X1(
                                @SerializedName("type")
                                val type: Type? = null,
                                @SerializedName("duration")
                                val duration: Int? = null,
                                @SerializedName("strategy_method")
                                val strategyMethod: String? = null
                            ) {
                                data class Type(
                                    @SerializedName("strategy_type")
                                    val strategyType: Int? = null,
                                    @SerializedName("priority")
                                    val priority: Int? = null
                                )
                            }
                        }
                    }

                    data class X211(
                        @SerializedName("short_touch_type")
                        val shortTouchType: Int? = null,
                        @SerializedName("strategy_map")
                        val strategyMap: StrategyMap? = null
                    ) {
                        data class StrategyMap(
                            @SerializedName("4")
                            val x4: X4? = null
                        ) {
                            data class X4(
                                @SerializedName("type")
                                val type: Type? = null,
                                @SerializedName("duration")
                                val duration: Int? = null,
                                @SerializedName("strategy_method")
                                val strategyMethod: String? = null
                            ) {
                                data class Type(
                                    @SerializedName("strategy_type")
                                    val strategyType: Int? = null,
                                    @SerializedName("priority")
                                    val priority: Int? = null
                                )
                            }
                        }
                    }

                    data class X217(
                        @SerializedName("short_touch_type")
                        val shortTouchType: Int? = null,
                        @SerializedName("strategy_map")
                        val strategyMap: StrategyMap? = null
                    ) {
                        data class StrategyMap(
                            @SerializedName("3")
                            val x3: X3? = null
                        ) {
                            data class X3(
                                @SerializedName("type")
                                val type: Type? = null,
                                @SerializedName("duration")
                                val duration: Int? = null,
                                @SerializedName("strategy_method")
                                val strategyMethod: String? = null
                            ) {
                                data class Type(
                                    @SerializedName("strategy_type")
                                    val strategyType: Int? = null,
                                    @SerializedName("priority")
                                    val priority: Int? = null
                                )
                            }
                        }
                    }

                    data class X222(
                        @SerializedName("short_touch_type")
                        val shortTouchType: Int? = null,
                        @SerializedName("strategy_map")
                        val strategyMap: StrategyMap? = null
                    ) {
                        data class StrategyMap(
                            @SerializedName("1")
                            val x1: X1? = null
                        ) {
                            data class X1(
                                @SerializedName("type")
                                val type: Type? = null,
                                @SerializedName("duration")
                                val duration: Int? = null,
                                @SerializedName("strategy_method")
                                val strategyMethod: String? = null
                            ) {
                                data class Type(
                                    @SerializedName("strategy_type")
                                    val strategyType: Int? = null,
                                    @SerializedName("priority")
                                    val priority: Int? = null
                                )
                            }
                        }
                    }

                    data class X306(
                        @SerializedName("short_touch_type")
                        val shortTouchType: Int? = null,
                        @SerializedName("strategy_map")
                        val strategyMap: StrategyMap? = null
                    ) {
                        data class StrategyMap(
                            @SerializedName("3")
                            val x3: X3? = null
                        ) {
                            data class X3(
                                @SerializedName("type")
                                val type: Type? = null,
                                @SerializedName("duration")
                                val duration: Int? = null,
                                @SerializedName("strategy_method")
                                val strategyMethod: String? = null
                            ) {
                                data class Type(
                                    @SerializedName("strategy_type")
                                    val strategyType: Int? = null,
                                    @SerializedName("priority")
                                    val priority: Int? = null
                                )
                            }
                        }
                    }

                    data class X307(
                        @SerializedName("short_touch_type")
                        val shortTouchType: Int? = null,
                        @SerializedName("strategy_map")
                        val strategyMap: StrategyMap? = null
                    ) {
                        data class StrategyMap(
                            @SerializedName("4")
                            val x4: X4? = null
                        ) {
                            data class X4(
                                @SerializedName("type")
                                val type: Type? = null,
                                @SerializedName("duration")
                                val duration: Int? = null,
                                @SerializedName("strategy_method")
                                val strategyMethod: String? = null
                            ) {
                                data class Type(
                                    @SerializedName("strategy_type")
                                    val strategyType: Int? = null,
                                    @SerializedName("priority")
                                    val priority: Int? = null
                                )
                            }
                        }
                    }

                    data class X308(
                        @SerializedName("short_touch_type")
                        val shortTouchType: Int? = null,
                        @SerializedName("strategy_map")
                        val strategyMap: StrategyMap? = null
                    ) {
                        data class StrategyMap(
                            @SerializedName("5")
                            val x5: X5? = null
                        ) {
                            data class X5(
                                @SerializedName("type")
                                val type: Type? = null,
                                @SerializedName("duration")
                                val duration: Int? = null,
                                @SerializedName("strategy_method")
                                val strategyMethod: String? = null
                            ) {
                                data class Type(
                                    @SerializedName("strategy_type")
                                    val strategyType: Int? = null,
                                    @SerializedName("priority")
                                    val priority: Int? = null
                                )
                            }
                        }
                    }

                    data class X311(
                        @SerializedName("short_touch_type")
                        val shortTouchType: Int? = null,
                        @SerializedName("strategy_map")
                        val strategyMap: StrategyMap? = null
                    ) {
                        data class StrategyMap(
                            @SerializedName("3")
                            val x3: X3? = null
                        ) {
                            data class X3(
                                @SerializedName("type")
                                val type: Type? = null,
                                @SerializedName("duration")
                                val duration: Int? = null,
                                @SerializedName("strategy_method")
                                val strategyMethod: String? = null
                            ) {
                                data class Type(
                                    @SerializedName("strategy_type")
                                    val strategyType: Int? = null,
                                    @SerializedName("priority")
                                    val priority: Int? = null
                                )
                            }
                        }
                    }

                    data class X312(
                        @SerializedName("short_touch_type")
                        val shortTouchType: Int? = null,
                        @SerializedName("strategy_map")
                        val strategyMap: StrategyMap? = null
                    ) {
                        data class StrategyMap(
                            @SerializedName("1")
                            val x1: X1? = null
                        ) {
                            data class X1(
                                @SerializedName("type")
                                val type: Type? = null,
                                @SerializedName("duration")
                                val duration: Int? = null,
                                @SerializedName("strategy_method")
                                val strategyMethod: String? = null
                            ) {
                                data class Type(
                                    @SerializedName("strategy_type")
                                    val strategyType: Int? = null,
                                    @SerializedName("priority")
                                    val priority: Int? = null
                                )
                            }
                        }
                    }

                    data class X313(
                        @SerializedName("short_touch_type")
                        val shortTouchType: Int? = null,
                        @SerializedName("strategy_map")
                        val strategyMap: StrategyMap? = null
                    ) {
                        data class StrategyMap(
                            @SerializedName("2")
                            val x2: X2? = null
                        ) {
                            data class X2(
                                @SerializedName("type")
                                val type: Type? = null,
                                @SerializedName("duration")
                                val duration: Int? = null,
                                @SerializedName("strategy_method")
                                val strategyMethod: String? = null
                            ) {
                                data class Type(
                                    @SerializedName("strategy_type")
                                    val strategyType: Int? = null,
                                    @SerializedName("priority")
                                    val priority: Int? = null
                                )
                            }
                        }
                    }
                }

                data class TempStateGlobalCondition(
                    @SerializedName("duration_gap")
                    val durationGap: Int? = null,
                    @SerializedName("allow_count")
                    val allowCount: Int? = null,
                    @SerializedName("ignore_strategy_types")
                    val ignoreStrategyTypes: List<Int?>? = null
                )

                class BigCardDisplayStrategy
            }

            data class CommentBox(
                @SerializedName("placeholder")
                val placeholder: String? = null
            )

            class LinkerMap

            class AnchorABMap

            data class PaidLiveData(
                @SerializedName("paid_type")
                val paidType: Int? = null,
                @SerializedName("view_right")
                val viewRight: Int? = null,
                @SerializedName("duration")
                val duration: Int? = null,
                @SerializedName("delivery")
                val delivery: Int? = null,
                @SerializedName("need_delivery_notice")
                val needDeliveryNotice: Boolean? = null,
                @SerializedName("anchor_right")
                val anchorRight: Int? = null,
                @SerializedName("pay_ab_type")
                val payAbType: Int? = null,
                @SerializedName("privilege_info")
                val privilegeInfo: PrivilegeInfo? = null,
                @SerializedName("privilege_info_map")
                val privilegeInfoMap: PrivilegeInfoMap? = null,
                @SerializedName("max_preview_duration")
                val maxPreviewDuration: Int? = null
            ) {
                class PrivilegeInfo

                class PrivilegeInfoMap
            }

            data class PackMeta(
                @SerializedName("scene")
                val scene: String? = null,
                @SerializedName("env")
                val env: String? = null,
                @SerializedName("dc")
                val dc: String? = null,
                @SerializedName("trace_id")
                val traceId: String? = null,
                @SerializedName("cluster")
                val cluster: String? = null,
                @SerializedName("extras")
                val extras: Extras? = null
            ) {
                class Extras
            }

            data class RoomViewStats(
                @SerializedName("is_hidden")
                val isHidden: Boolean? = null,
                @SerializedName("display_short")
                val displayShort: String? = null,
                @SerializedName("display_middle")
                val displayMiddle: String? = null,
                @SerializedName("display_long")
                val displayLong: String? = null,
                @SerializedName("display_value")
                val displayValue: Int? = null,
                @SerializedName("display_version")
                val displayVersion: Int? = null,
                @SerializedName("incremental")
                val incremental: Boolean? = null,
                @SerializedName("display_type")
                val displayType: Int? = null,
                @SerializedName("display_short_anchor")
                val displayShortAnchor: String? = null,
                @SerializedName("display_middle_anchor")
                val displayMiddleAnchor: String? = null,
                @SerializedName("display_long_anchor")
                val displayLongAnchor: String? = null
            )
        }

        data class User(
            @SerializedName("id")
            val id: Int? = null,
            @SerializedName("short_id")
            val shortId: Long? = null,
            @SerializedName("nickname")
            val nickname: String? = null,
            @SerializedName("gender")
            val gender: Int? = null,
            @SerializedName("signature")
            val signature: String? = null,
            @SerializedName("level")
            val level: Int? = null,
            @SerializedName("birthday")
            val birthday: Int? = null,
            @SerializedName("telephone")
            val telephone: String? = null,
            @SerializedName("verified")
            val verified: Boolean? = null,
            @SerializedName("experience")
            val experience: Int? = null,
            @SerializedName("city")
            val city: String? = null,
            @SerializedName("status")
            val status: Int? = null,
            @SerializedName("create_time")
            val createTime: Int? = null,
            @SerializedName("modify_time")
            val modifyTime: Int? = null,
            @SerializedName("secret")
            val secret: Int? = null,
            @SerializedName("share_qrcode_uri")
            val shareQrcodeUri: String? = null,
            @SerializedName("income_share_percent")
            val incomeSharePercent: Int? = null,
            @SerializedName("badge_image_list")
            val badgeImageList: List<Any?>? = null,
            @SerializedName("special_id")
            val specialId: String? = null,
            @SerializedName("real_time_icons")
            val realTimeIcons: List<Any?>? = null,
            @SerializedName("new_real_time_icons")
            val newRealTimeIcons: List<Any?>? = null,
            @SerializedName("top_vip_no")
            val topVipNo: Int? = null,
            @SerializedName("pay_score")
            val payScore: Int? = null,
            @SerializedName("ticket_count")
            val ticketCount: Int? = null,
            @SerializedName("link_mic_stats")
            val linkMicStats: Int? = null,
            @SerializedName("display_id")
            val displayId: String? = null,
            @SerializedName("with_commerce_permission")
            val withCommercePermission: Boolean? = null,
            @SerializedName("with_fusion_shop_entry")
            val withFusionShopEntry: Boolean? = null,
            @SerializedName("total_recharge_diamond_count")
            val totalRechargeDiamondCount: Int? = null,
            @SerializedName("verified_content")
            val verifiedContent: String? = null,
            @SerializedName("top_fans")
            val topFans: List<Any?>? = null,
            @SerializedName("sec_uid")
            val secUid: String? = null,
            @SerializedName("user_role")
            val userRole: Int? = null,
            @SerializedName("authorization_info")
            val authorizationInfo: Int? = null,
            @SerializedName("adversary_authorization_info")
            val adversaryAuthorizationInfo: Int? = null,
            @SerializedName("media_badge_image_list")
            val mediaBadgeImageList: List<Any?>? = null,
            @SerializedName("adversary_user_status")
            val adversaryUserStatus: Int? = null,
            @SerializedName("commerce_webcast_config_ids")
            val commerceWebcastConfigIds: List<Any?>? = null,
            @SerializedName("badge_image_list_v2")
            val badgeImageListV2: List<Any?>? = null,
            @SerializedName("location_city")
            val locationCity: String? = null,
            @SerializedName("remark_name")
            val remarkName: String? = null,
            @SerializedName("mystery_man")
            val mysteryMan: Int? = null,
            @SerializedName("web_rid")
            val webRid: String? = null,
            @SerializedName("desensitized_nickname")
            val desensitizedNickname: String? = null,
            @SerializedName("is_anonymous")
            val isAnonymous: Boolean? = null,
            @SerializedName("consume_diamond_level")
            val consumeDiamondLevel: Int? = null,
            @SerializedName("webcast_uid")
            val webcastUid: String? = null,
            @SerializedName("public_area_oper_freq")
            val publicAreaOperFreq: Int? = null,
            @SerializedName("user_canceled")
            val userCanceled: Boolean? = null,
            @SerializedName("allow_be_located")
            val allowBeLocated: Boolean? = null,
            @SerializedName("allow_find_by_contacts")
            val allowFindByContacts: Boolean? = null,
            @SerializedName("allow_others_download_video")
            val allowOthersDownloadVideo: Boolean? = null,
            @SerializedName("allow_others_download_when_sharing_video")
            val allowOthersDownloadWhenSharingVideo: Boolean? = null,
            @SerializedName("allow_share_show_profile")
            val allowShareShowProfile: Boolean? = null,
            @SerializedName("allow_show_in_gossip")
            val allowShowInGossip: Boolean? = null,
            @SerializedName("allow_show_my_action")
            val allowShowMyAction: Boolean? = null,
            @SerializedName("allow_strange_comment")
            val allowStrangeComment: Boolean? = null,
            @SerializedName("allow_unfollower_comment")
            val allowUnfollowerComment: Boolean? = null,
            @SerializedName("allow_use_linkmic")
            val allowUseLinkmic: Boolean? = null,
            @SerializedName("bg_img_url")
            val bgImgUrl: String? = null,
            @SerializedName("birthday_description")
            val birthdayDescription: String? = null,
            @SerializedName("birthday_valid")
            val birthdayValid: Boolean? = null,
            @SerializedName("block_status")
            val blockStatus: Int? = null,
            @SerializedName("comment_restrict")
            val commentRestrict: Int? = null,
            @SerializedName("constellation")
            val constellation: String? = null,
            @SerializedName("disable_ichat")
            val disableIchat: Int? = null,
            @SerializedName("enable_ichat_img")
            val enableIchatImg: Int? = null,
            @SerializedName("exp")
            val exp: Int? = null,
            @SerializedName("fan_ticket_count")
            val fanTicketCount: Int? = null,
            @SerializedName("fold_stranger_chat")
            val foldStrangerChat: Boolean? = null,
            @SerializedName("follow_status")
            val followStatus: Int? = null,
            @SerializedName("hotsoon_verified")
            val hotsoonVerified: Boolean? = null,
            @SerializedName("hotsoon_verified_reason")
            val hotsoonVerifiedReason: String? = null,
            @SerializedName("ichat_restrict_type")
            val ichatRestrictType: Int? = null,
            @SerializedName("id_str")
            val idStr: String? = null,
            @SerializedName("is_follower")
            val isFollower: Boolean? = null,
            @SerializedName("is_following")
            val isFollowing: Boolean? = null,
            @SerializedName("need_profile_guide")
            val needProfileGuide: Boolean? = null,
            @SerializedName("pay_scores")
            val payScores: Int? = null,
            @SerializedName("push_comment_status")
            val pushCommentStatus: Boolean? = null,
            @SerializedName("push_digg")
            val pushDigg: Boolean? = null,
            @SerializedName("push_follow")
            val pushFollow: Boolean? = null,
            @SerializedName("push_friend_action")
            val pushFriendAction: Boolean? = null,
            @SerializedName("push_ichat")
            val pushIchat: Boolean? = null,
            @SerializedName("push_status")
            val pushStatus: Boolean? = null,
            @SerializedName("push_video_post")
            val pushVideoPost: Boolean? = null,
            @SerializedName("push_video_recommend")
            val pushVideoRecommend: Boolean? = null,
            @SerializedName("verified_mobile")
            val verifiedMobile: Boolean? = null,
            @SerializedName("verified_reason")
            val verifiedReason: String? = null,
            @SerializedName("with_car_management_permission")
            val withCarManagementPermission: Boolean? = null,
            @SerializedName("age_range")
            val ageRange: Int? = null,
            @SerializedName("watch_duration_month")
            val watchDurationMonth: Int? = null,
            @SerializedName("foreign_user")
            val foreignUser: Int? = null,
            @SerializedName("user_open_id")
            val userOpenId: String? = null
        )
    }

    data class Extra(
        @SerializedName("now")
        val now: Long? = null
    )
}