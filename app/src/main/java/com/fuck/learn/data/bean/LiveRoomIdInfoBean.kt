package com.fuck.learn.data.bean


import com.google.gson.annotations.SerializedName


data class LiveRoomIdInfoBean(
    @SerializedName("data")
    val `data`: Data? = null,
    @SerializedName("extra")
    val extra: Extra? = null,
    @SerializedName("status_code")
    val statusCode: Int? = null
) {
    data class Data(
        @SerializedName("data")
        val `data`: List<Data?>? = null,
        @SerializedName("enter_room_id")
        val enterRoomId: String? = null,
        @SerializedName("user")
        val user: User? = null,
        @SerializedName("qrcode_url")
        val qrcodeUrl: String? = null,
        @SerializedName("enter_mode")
        val enterMode: Int? = null,
        @SerializedName("room_status")
        val roomStatus: Int? = null,
        @SerializedName("partition_road_map")
        val partitionRoadMap: PartitionRoadMap? = null,
        @SerializedName("similar_rooms")
        val similarRooms: List<SimilarRoom?>? = null,
        @SerializedName("shark_decision_conf")
        val sharkDecisionConf: String? = null,
        @SerializedName("auth_cert_info")
        val authCertInfo: String? = null,
        @SerializedName("prompts")
        val prompts: String? = null
    ) {
        data class Data(
            @SerializedName("id_str")
            val idStr: String? = null,
            @SerializedName("status")
            val status: Int? = null,
            @SerializedName("status_str")
            val statusStr: String? = null,
            @SerializedName("title")
            val title: String? = null,
            @SerializedName("user_count_str")
            val userCountStr: String? = null,
            @SerializedName("mosaic_status")
            val mosaicStatus: Int? = null,
            @SerializedName("mosaic_status_str")
            val mosaicStatusStr: String? = null,
            @SerializedName("admin_user_ids")
            val adminUserIds: List<Any?>? = null,
            @SerializedName("admin_user_ids_str")
            val adminUserIdsStr: List<Any?>? = null,
            @SerializedName("live_room_mode")
            val liveRoomMode: Int? = null,
            @SerializedName("has_commerce_goods")
            val hasCommerceGoods: Boolean? = null,
            @SerializedName("linker_map")
            val linkerMap: LinkerMap? = null,
            @SerializedName("AnchorABMap")
            val anchorABMap: AnchorABMap? = null,
            @SerializedName("like_count")
            val likeCount: Int? = null,
            @SerializedName("owner_user_id_str")
            val ownerUserIdStr: String? = null,
            @SerializedName("gift_msg_style")
            val giftMsgStyle: Int? = null,
            @SerializedName("fansclub_msg_style")
            val fansclubMsgStyle: Int? = null,
            @SerializedName("follow_msg_style")
            val followMsgStyle: Int? = null,
            @SerializedName("share_msg_style")
            val shareMsgStyle: Int? = null,
            @SerializedName("admin_user_open_ids")
            val adminUserOpenIds: List<Any?>? = null,
            @SerializedName("admin_user_open_ids_str")
            val adminUserOpenIdsStr: List<Any?>? = null,
            @SerializedName("owner_open_id_str")
            val ownerOpenIdStr: String? = null
        ) {
            class LinkerMap

            class AnchorABMap
        }

        data class User(
            @SerializedName("id_str")
            val idStr: String? = null,
            @SerializedName("sec_uid")
            val secUid: String? = null,
            @SerializedName("nickname")
            val nickname: String? = null,
            @SerializedName("avatar_thumb")
            val avatarThumb: AvatarThumb? = null,
            @SerializedName("follow_info")
            val followInfo: FollowInfo? = null,
            @SerializedName("foreign_user")
            val foreignUser: Int? = null,
            @SerializedName("open_id_str")
            val openIdStr: String? = null
        ) {
            data class AvatarThumb(
                @SerializedName("url_list")
                val urlList: List<String?>? = null
            )

            data class FollowInfo(
                @SerializedName("follow_status")
                val followStatus: Int? = null,
                @SerializedName("follow_status_str")
                val followStatusStr: String? = null
            )
        }

        data class PartitionRoadMap(
            @SerializedName("partition")
            val partition: Partition? = null,
            @SerializedName("sub_partition")
            val subPartition: SubPartition? = null
        ) {
            data class Partition(
                @SerializedName("id_str")
                val idStr: String? = null,
                @SerializedName("type")
                val type: Int? = null,
                @SerializedName("title")
                val title: String? = null
            )

            data class SubPartition(
                @SerializedName("partition")
                val partition: Partition? = null
            ) {
                data class Partition(
                    @SerializedName("id_str")
                    val idStr: String? = null,
                    @SerializedName("type")
                    val type: Int? = null,
                    @SerializedName("title")
                    val title: String? = null
                )
            }
        }

        data class SimilarRoom(
            @SerializedName("room")
            val room: Room? = null,
            @SerializedName("tag_name")
            val tagName: String? = null,
            @SerializedName("uniq_id")
            val uniqId: String? = null,
            @SerializedName("web_rid")
            val webRid: String? = null,
            @SerializedName("is_recommend")
            val isRecommend: Int? = null,
            @SerializedName("title_type")
            val titleType: Int? = null,
            @SerializedName("cover_type")
            val coverType: Int? = null
        ) {
            data class Room(
                @SerializedName("id_str")
                val idStr: String? = null,
                @SerializedName("status")
                val status: Int? = null,
                @SerializedName("status_str")
                val statusStr: String? = null,
                @SerializedName("title")
                val title: String? = null,
                @SerializedName("user_count_str")
                val userCountStr: String? = null,
                @SerializedName("cover")
                val cover: Cover? = null,
                @SerializedName("stream_url")
                val streamUrl: StreamUrl? = null,
                @SerializedName("mosaic_status")
                val mosaicStatus: Int? = null,
                @SerializedName("mosaic_status_str")
                val mosaicStatusStr: String? = null,
                @SerializedName("admin_user_ids")
                val adminUserIds: List<Any?>? = null,
                @SerializedName("admin_user_ids_str")
                val adminUserIdsStr: List<Any?>? = null,
                @SerializedName("owner")
                val owner: Owner? = null,
                @SerializedName("live_room_mode")
                val liveRoomMode: Int? = null,
                @SerializedName("stats")
                val stats: Stats? = null,
                @SerializedName("has_commerce_goods")
                val hasCommerceGoods: Boolean? = null,
                @SerializedName("linker_map")
                val linkerMap: LinkerMap? = null,
                @SerializedName("linker_detail")
                val linkerDetail: LinkerDetail? = null,
                @SerializedName("room_view_stats")
                val roomViewStats: RoomViewStats? = null,
                @SerializedName("ecom_data")
                val ecomData: EcomData? = null,
                @SerializedName("AnchorABMap")
                val anchorABMap: AnchorABMap? = null,
                @SerializedName("like_count")
                val likeCount: Int? = null,
                @SerializedName("owner_user_id_str")
                val ownerUserIdStr: String? = null,
                @SerializedName("paid_live_data")
                val paidLiveData: PaidLiveData? = null,
                @SerializedName("game_data")
                val gameData: GameData? = null,
                @SerializedName("gift_msg_style")
                val giftMsgStyle: Int? = null,
                @SerializedName("fansclub_msg_style")
                val fansclubMsgStyle: Int? = null,
                @SerializedName("follow_msg_style")
                val followMsgStyle: Int? = null,
                @SerializedName("share_msg_style")
                val shareMsgStyle: Int? = null,
                @SerializedName("others")
                val others: Others? = null,
                @SerializedName("admin_user_open_ids")
                val adminUserOpenIds: List<Any?>? = null,
                @SerializedName("admin_user_open_ids_str")
                val adminUserOpenIdsStr: List<Any?>? = null,
                @SerializedName("owner_open_id_str")
                val ownerOpenIdStr: String? = null
            ) {
                data class Cover(
                    @SerializedName("url_list")
                    val urlList: List<String?>? = null
                )

                data class StreamUrl(
                    @SerializedName("flv_pull_url")
                    val flvPullUrl: FlvPullUrl? = null,
                    @SerializedName("default_resolution")
                    val defaultResolution: String? = null,
                    @SerializedName("hls_pull_url_map")
                    val hlsPullUrlMap: HlsPullUrlMap? = null,
                    @SerializedName("hls_pull_url")
                    val hlsPullUrl: String? = null,
                    @SerializedName("stream_orientation")
                    val streamOrientation: Int? = null,
                    @SerializedName("live_core_sdk_data")
                    val liveCoreSdkData: LiveCoreSdkData? = null,
                    @SerializedName("extra")
                    val extra: Extra? = null,
                    @SerializedName("pull_datas")
                    val pullDatas: PullDatas? = null
                ) {
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

                    data class LiveCoreSdkData(
                        @SerializedName("pull_data")
                        val pullData: PullData? = null
                    ) {
                        data class PullData(
                            @SerializedName("options")
                            val options: Options? = null,
                            @SerializedName("stream_data")
                            val streamData: String? = null
                        ) {
                            data class Options(
                                @SerializedName("default_quality")
                                val defaultQuality: DefaultQuality? = null,
                                @SerializedName("qualities")
                                val qualities: List<Any?>? = null
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
                            }
                        }
                    }

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

                    class PullDatas
                }

                data class Owner(
                    @SerializedName("id_str")
                    val idStr: String? = null,
                    @SerializedName("sec_uid")
                    val secUid: String? = null,
                    @SerializedName("nickname")
                    val nickname: String? = null,
                    @SerializedName("avatar_thumb")
                    val avatarThumb: AvatarThumb? = null,
                    @SerializedName("follow_info")
                    val followInfo: FollowInfo? = null,
                    @SerializedName("subscribe")
                    val subscribe: Subscribe? = null,
                    @SerializedName("foreign_user")
                    val foreignUser: Int? = null,
                    @SerializedName("open_id_str")
                    val openIdStr: String? = null
                ) {
                    data class AvatarThumb(
                        @SerializedName("url_list")
                        val urlList: List<String?>? = null
                    )

                    data class FollowInfo(
                        @SerializedName("follow_status")
                        val followStatus: Int? = null,
                        @SerializedName("follow_status_str")
                        val followStatusStr: String? = null
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
                }

                data class Stats(
                    @SerializedName("total_user_desp")
                    val totalUserDesp: String? = null,
                    @SerializedName("like_count")
                    val likeCount: Int? = null,
                    @SerializedName("total_user_str")
                    val totalUserStr: String? = null,
                    @SerializedName("user_count_str")
                    val userCountStr: String? = null
                )

                data class LinkerMap(
                    @SerializedName("1")
                    val x1: Long? = null
                )

                data class LinkerDetail(
                    @SerializedName("linker_play_modes")
                    val linkerPlayModes: List<Any?>? = null,
                    @SerializedName("big_party_layout_config_version")
                    val bigPartyLayoutConfigVersion: Int? = null,
                    @SerializedName("accept_audience_pre_apply")
                    val acceptAudiencePreApply: Boolean? = null,
                    @SerializedName("linker_ui_layout")
                    val linkerUiLayout: Int? = null,
                    @SerializedName("enable_audience_linkmic")
                    val enableAudienceLinkmic: Int? = null,
                    @SerializedName("function_type")
                    val functionType: String? = null,
                    @SerializedName("linker_map_str")
                    val linkerMapStr: LinkerMapStr? = null,
                    @SerializedName("ktv_lyric_mode")
                    val ktvLyricMode: String? = null,
                    @SerializedName("init_source")
                    val initSource: String? = null,
                    @SerializedName("forbid_apply_from_other")
                    val forbidApplyFromOther: Boolean? = null,
                    @SerializedName("ktv_exhibit_mode")
                    val ktvExhibitMode: Int? = null,
                    @SerializedName("enlarge_guest_turn_on_source")
                    val enlargeGuestTurnOnSource: Int? = null,
                    @SerializedName("playmode_detail")
                    val playmodeDetail: PlaymodeDetail? = null,
                    @SerializedName("client_ui_info")
                    val clientUiInfo: String? = null,
                    @SerializedName("manual_open_ui")
                    val manualOpenUi: Int? = null,
                    @SerializedName("feature_list")
                    val featureList: List<Any?>? = null
                ) {
                    class LinkerMapStr

                    class PlaymodeDetail
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

                data class EcomData(
                    @SerializedName("reds_show_infos")
                    val redsShowInfos: List<Any?>? = null,
                    @SerializedName("room_cart_v2")
                    val roomCartV2: RoomCartV2? = null,
                    @SerializedName("instant_type")
                    val instantType: Int? = null,
                    @SerializedName("route_rule")
                    val routeRule: String? = null,
                    @SerializedName("shop_author_header")
                    val shopAuthorHeader: String? = null,
                    @SerializedName("intro_type")
                    val introType: Int? = null
                ) {
                    data class RoomCartV2(
                        @SerializedName("show_cart")
                        val showCart: Int? = null
                    )
                }

                data class AnchorABMap(
                    @SerializedName("ab_admin_comment_on_wall")
                    val abAdminCommentOnWall: String? = null,
                    @SerializedName("ab_friend_chat")
                    val abFriendChat: String? = null,
                    @SerializedName("admin_optimize_third")
                    val adminOptimizeThird: String? = null,
                    @SerializedName("admin_privilege_refine")
                    val adminPrivilegeRefine: String? = null,
                    @SerializedName("allow_shared_to_fans")
                    val allowSharedToFans: String? = null,
                    @SerializedName("audience_linkmic_continue")
                    val audienceLinkmicContinue: String? = null,
                    @SerializedName("audio_1v8_stage_enlarge")
                    val audio1v8StageEnlarge: String? = null,
                    @SerializedName("audio_double_enlarge_enable")
                    val audioDoubleEnlargeEnable: String? = null,
                    @SerializedName("audio_honor_rank")
                    val audioHonorRank: String? = null,
                    @SerializedName("audio_radio_v2")
                    val audioRadioV2: String? = null,
                    @SerializedName("audio_room_subtitle_opt")
                    val audioRoomSubtitleOpt: String? = null,
                    @SerializedName("battle_match_rebuild_anchor")
                    val battleMatchRebuildAnchor: String? = null,
                    @SerializedName("big_party_enable_open_camera")
                    val bigPartyEnableOpenCamera: String? = null,
                    @SerializedName("chat_intercommunicate_multi_anchor")
                    val chatIntercommunicateMultiAnchor: String? = null,
                    @SerializedName("chat_intercommunicate_pk")
                    val chatIntercommunicatePk: String? = null,
                    @SerializedName("cross_default_enlarge")
                    val crossDefaultEnlarge: String? = null,
                    @SerializedName("cross_link_support_enlarge_guest")
                    val crossLinkSupportEnlargeGuest: String? = null,
                    @SerializedName("cross_room_battle_pop_mode")
                    val crossRoomBattlePopMode: String? = null,
                    @SerializedName("double_enlarge_enable")
                    val doubleEnlargeEnable: String? = null,
                    @SerializedName("ecom_room_disable_gift")
                    val ecomRoomDisableGift: String? = null,
                    @SerializedName("enable_enter_by_sharing")
                    val enableEnterBySharing: String? = null,
                    @SerializedName("enable_link_guest_enter")
                    val enableLinkGuestEnter: String? = null,
                    @SerializedName("enter_message_tip_relation")
                    val enterMessageTipRelation: String? = null,
                    @SerializedName("enter_source_mark")
                    val enterSourceMark: String? = null,
                    @SerializedName("faction_clash")
                    val factionClash: String? = null,
                    @SerializedName("frequently_chat_ab_value")
                    val frequentlyChatAbValue: String? = null,
                    @SerializedName("friend_room_audio_tuning")
                    val friendRoomAudioTuning: String? = null,
                    @SerializedName("friend_room_support_ns_mode")
                    val friendRoomSupportNsMode: String? = null,
                    @SerializedName("friend_share_video_feature_type")
                    val friendShareVideoFeatureType: String? = null,
                    @SerializedName("game_link_entrance")
                    val gameLinkEntrance: String? = null,
                    @SerializedName("gift_comment")
                    val giftComment: String? = null,
                    @SerializedName("gift_comment_v2")
                    val giftCommentV2: String? = null,
                    @SerializedName("gift_hide_tip")
                    val giftHideTip: String? = null,
                    @SerializedName("guest_battle_crown_upgrade")
                    val guestBattleCrownUpgrade: String? = null,
                    @SerializedName("guest_battle_expand")
                    val guestBattleExpand: String? = null,
                    @SerializedName("guest_battle_score_expand")
                    val guestBattleScoreExpand: String? = null,
                    @SerializedName("guest_battle_upgrade")
                    val guestBattleUpgrade: String? = null,
                    @SerializedName("interact_acting_ab")
                    val interactActingAb: String? = null,
                    @SerializedName("interact_anchor_guide")
                    val interactAnchorGuide: String? = null,
                    @SerializedName("ktv_anchor_enable_add_all")
                    val ktvAnchorEnableAddAll: String? = null,
                    @SerializedName("ktv_auto_mute_self")
                    val ktvAutoMuteSelf: String? = null,
                    @SerializedName("ktv_challenge_minus_gift")
                    val ktvChallengeMinusGift: String? = null,
                    @SerializedName("ktv_component_new_midi")
                    val ktvComponentNewMidi: String? = null,
                    @SerializedName("ktv_enable_avatar")
                    val ktvEnableAvatar: String? = null,
                    @SerializedName("ktv_enable_open_camera")
                    val ktvEnableOpenCamera: String? = null,
                    @SerializedName("ktv_fragment_song")
                    val ktvFragmentSong: String? = null,
                    @SerializedName("ktv_grab_guide_song")
                    val ktvGrabGuideSong: String? = null,
                    @SerializedName("ktv_guide_song_switch")
                    val ktvGuideSongSwitch: String? = null,
                    @SerializedName("ktv_kick_when_linker_full")
                    val ktvKickWhenLinkerFull: String? = null,
                    @SerializedName("ktv_mc_host_show_tag")
                    val ktvMcHostShowTag: String? = null,
                    @SerializedName("ktv_new_challenge")
                    val ktvNewChallenge: String? = null,
                    @SerializedName("ktv_room_atmosphere")
                    val ktvRoomAtmosphere: String? = null,
                    @SerializedName("ktv_singing_hot_rank")
                    val ktvSingingHotRank: String? = null,
                    @SerializedName("ktv_video_stream_optimize")
                    val ktvVideoStreamOptimize: String? = null,
                    @SerializedName("ktv_want_listen_enable")
                    val ktvWantListenEnable: String? = null,
                    @SerializedName("linkmic_chorus")
                    val linkmicChorus: String? = null,
                    @SerializedName("linkmic_multi_chorus")
                    val linkmicMultiChorus: String? = null,
                    @SerializedName("linkmic_order_sing_search_fingerprint")
                    val linkmicOrderSingSearchFingerprint: String? = null,
                    @SerializedName("linkmic_order_sing_upgrade")
                    val linkmicOrderSingUpgrade: String? = null,
                    @SerializedName("linkmic_starwish")
                    val linkmicStarwish: String? = null,
                    @SerializedName("linkmic_video_equal_layout_frame_opt")
                    val linkmicVideoEqualLayoutFrameOpt: String? = null,
                    @SerializedName("live_anchor_enable_chorus")
                    val liveAnchorEnableChorus: String? = null,
                    @SerializedName("live_anchor_enable_custom_position")
                    val liveAnchorEnableCustomPosition: String? = null,
                    @SerializedName("live_anchor_hit_new_audience_linkmic")
                    val liveAnchorHitNewAudienceLinkmic: String? = null,
                    @SerializedName("live_anchor_hit_position_opt")
                    val liveAnchorHitPositionOpt: String? = null,
                    @SerializedName("live_anchor_hit_video_bid_paid")
                    val liveAnchorHitVideoBidPaid: String? = null,
                    @SerializedName("live_anchor_hit_video_teamfight")
                    val liveAnchorHitVideoTeamfight: String? = null,
                    @SerializedName("live_answer_on_wall")
                    val liveAnswerOnWall: String? = null,
                    @SerializedName("live_audience_linkmic_pre_apply_v2")
                    val liveAudienceLinkmicPreApplyV2: String? = null,
                    @SerializedName("live_audio_enable_c_position")
                    val liveAudioEnableCPosition: String? = null,
                    @SerializedName("live_backup_sei_enable")
                    val liveBackupSeiEnable: String? = null,
                    @SerializedName("live_dou_plus_enter")
                    val liveDouPlusEnter: String? = null,
                    @SerializedName("live_ktv_enable_beat")
                    val liveKtvEnableBeat: String? = null,
                    @SerializedName("live_ktv_group")
                    val liveKtvGroup: String? = null,
                    @SerializedName("live_ktv_show_singer_icon")
                    val liveKtvShowSingerIcon: String? = null,
                    @SerializedName("live_ktv_singing_challenge")
                    val liveKtvSingingChallenge: String? = null,
                    @SerializedName("live_linkmic_battle_optimize")
                    val liveLinkmicBattleOptimize: String? = null,
                    @SerializedName("live_linkmic_ktv_anchor_lyric_mode")
                    val liveLinkmicKtvAnchorLyricMode: String? = null,
                    @SerializedName("live_linkmic_order_sing_micro_opt")
                    val liveLinkmicOrderSingMicroOpt: String? = null,
                    @SerializedName("live_linkmic_order_sing_v3")
                    val liveLinkmicOrderSingV3: String? = null,
                    @SerializedName("live_pc_helper_new_layout")
                    val livePcHelperNewLayout: String? = null,
                    @SerializedName("live_room_manage_style")
                    val liveRoomManageStyle: String? = null,
                    @SerializedName("live_team_fight_flexible")
                    val liveTeamFightFlexible: String? = null,
                    @SerializedName("live_video_enable_c_position")
                    val liveVideoEnableCPosition: String? = null,
                    @SerializedName("live_video_enable_self_discipline")
                    val liveVideoEnableSelfDiscipline: String? = null,
                    @SerializedName("live_video_host_identity_enable")
                    val liveVideoHostIdentityEnable: String? = null,
                    @SerializedName("live_video_share")
                    val liveVideoShare: String? = null,
                    @SerializedName("lonely_room_enter_msg_unfold")
                    val lonelyRoomEnterMsgUnfold: String? = null,
                    @SerializedName("mark_user")
                    val markUser: String? = null,
                    @SerializedName("merge_ktv_mode_enable")
                    val mergeKtvModeEnable: String? = null,
                    @SerializedName("merge_ktv_optimize_enable")
                    val mergeKtvOptimizeEnable: String? = null,
                    @SerializedName("mic_avatar_tool")
                    val micAvatarTool: String? = null,
                    @SerializedName("multi_link_biz_access_backup_sei_config")
                    val multiLinkBizAccessBackupSeiConfig: String? = null,
                    @SerializedName("opt_audience_linkmic")
                    val optAudienceLinkmic: String? = null,
                    @SerializedName("opt_paid_link_feature_switch")
                    val optPaidLinkFeatureSwitch: String? = null,
                    @SerializedName("optran_paid_linkmic")
                    val optranPaidLinkmic: String? = null,
                    @SerializedName("order_sing_mv")
                    val orderSingMv: String? = null,
                    @SerializedName("play_mode_opt_24")
                    val playModeOpt24: String? = null,
                    @SerializedName("ps_use_new_panel")
                    val psUseNewPanel: String? = null,
                    @SerializedName("radio_prepare_apply")
                    val radioPrepareApply: String? = null,
                    @SerializedName("room_battle_mode_switch")
                    val roomBattleModeSwitch: String? = null,
                    @SerializedName("room_battle_mode_switch_audio")
                    val roomBattleModeSwitchAudio: String? = null,
                    @SerializedName("room_battle_video_audio_interconnection")
                    val roomBattleVideoAudioInterconnection: String? = null,
                    @SerializedName("room_double_like")
                    val roomDoubleLike: String? = null,
                    @SerializedName("room_secret_chat")
                    val roomSecretChat: String? = null,
                    @SerializedName("self_discipline_v2")
                    val selfDisciplineV2: String? = null,
                    @SerializedName("self_discipline_v3")
                    val selfDisciplineV3: String? = null,
                    @SerializedName("social_share_video_adjust_volume")
                    val socialShareVideoAdjustVolume: String? = null,
                    @SerializedName("support_multiple_add_price")
                    val supportMultipleAddPrice: String? = null,
                    @SerializedName("themed_competition_v2")
                    val themedCompetitionV2: String? = null,
                    @SerializedName("traffic_strategy")
                    val trafficStrategy: String? = null,
                    @SerializedName("video_equal_1v8fix_switch")
                    val videoEqual1v8fixSwitch: String? = null,
                    @SerializedName("video_ktv_challenge")
                    val videoKtvChallenge: String? = null,
                    @SerializedName("video_talk_enable_avatar")
                    val videoTalkEnableAvatar: String? = null
                )

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

                data class GameData(
                    @SerializedName("game_tag_info")
                    val gameTagInfo: GameTagInfo? = null
                ) {
                    data class GameTagInfo(
                        @SerializedName("is_game")
                        val isGame: Int? = null,
                        @SerializedName("game_tag_id")
                        val gameTagId: Int? = null,
                        @SerializedName("game_tag_name")
                        val gameTagName: String? = null
                    )
                }

                data class Others(
                    @SerializedName("web_live_port_optimization")
                    val webLivePortOptimization: WebLivePortOptimization? = null,
                    @SerializedName("lvideo_item_id")
                    val lvideoItemId: Int? = null,
                    @SerializedName("mosaic_version")
                    val mosaicVersion: Int? = null,
                    @SerializedName("web_data")
                    val webData: WebData? = null,
                    @SerializedName("metric_tracker_data_list")
                    val metricTrackerDataList: List<Any?>? = null,
                    @SerializedName("room_chat_guide_locale_city")
                    val roomChatGuideLocaleCity: String? = null,
                    @SerializedName("redirect_from")
                    val redirectFrom: Int? = null,
                    @SerializedName("panel_guidance")
                    val panelGuidance: String? = null,
                    @SerializedName("participant_activity")
                    val participantActivity: String? = null
                ) {
                    data class WebLivePortOptimization(
                        @SerializedName("strategy_config")
                        val strategyConfig: StrategyConfig? = null,
                        @SerializedName("strategy_extra")
                        val strategyExtra: String? = null
                    ) {
                        data class StrategyConfig(
                            @SerializedName("background")
                            val background: Background? = null,
                            @SerializedName("detail")
                            val detail: Detail? = null,
                            @SerializedName("tab")
                            val tab: Tab? = null
                        ) {
                            data class Background(
                                @SerializedName("strategy_type")
                                val strategyType: Int? = null,
                                @SerializedName("use_config_duration")
                                val useConfigDuration: Boolean? = null,
                                @SerializedName("pause_monitor_duration")
                                val pauseMonitorDuration: String? = null
                            )

                            data class Detail(
                                @SerializedName("strategy_type")
                                val strategyType: Int? = null,
                                @SerializedName("use_config_duration")
                                val useConfigDuration: Boolean? = null,
                                @SerializedName("pause_monitor_duration")
                                val pauseMonitorDuration: String? = null
                            )

                            data class Tab(
                                @SerializedName("strategy_type")
                                val strategyType: Int? = null,
                                @SerializedName("use_config_duration")
                                val useConfigDuration: Boolean? = null,
                                @SerializedName("pause_monitor_duration")
                                val pauseMonitorDuration: String? = null
                            )
                        }
                    }

                    data class WebData(
                        @SerializedName("additional_stream_url")
                        val additionalStreamUrl: AdditionalStreamUrl? = null
                    ) {
                        data class AdditionalStreamUrl(
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
                            @SerializedName("play")
                            val play: Play? = null,
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
                                val bytevc1Enable: Boolean? = null,
                                @SerializedName("business_name")
                                val businessName: String? = null
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
                                @SerializedName("push_data")
                                val pushData: PushData? = null,
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
                                    val hls: List<Hl?>? = null,
                                    @SerializedName("Flv")
                                    val flv: List<Flv?>? = null,
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

                                    data class Hl(
                                        @SerializedName("url")
                                        val url: String? = null,
                                        @SerializedName("quality_name")
                                        val qualityName: String? = null,
                                        @SerializedName("params")
                                        val params: String? = null
                                    )

                                    data class Flv(
                                        @SerializedName("url")
                                        val url: String? = null,
                                        @SerializedName("quality_name")
                                        val qualityName: String? = null,
                                        @SerializedName("params")
                                        val params: String? = null
                                    )
                                }

                                data class PushData(
                                    @SerializedName("resolution_params")
                                    val resolutionParams: ResolutionParams? = null,
                                    @SerializedName("push_stream_level")
                                    val pushStreamLevel: Int? = null,
                                    @SerializedName("pre_schedule")
                                    val preSchedule: Boolean? = null,
                                    @SerializedName("rtmp_push_url")
                                    val rtmpPushUrl: String? = null,
                                    @SerializedName("push_params")
                                    val pushParams: String? = null,
                                    @SerializedName("kind")
                                    val kind: Int? = null,
                                    @SerializedName("stream_id")
                                    val streamId: Int? = null,
                                    @SerializedName("stream_id_str")
                                    val streamIdStr: String? = null
                                ) {
                                    class ResolutionParams
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

                            data class Play(
                                @SerializedName("horizontal")
                                val horizontal: String? = null,
                                @SerializedName("vertical")
                                val vertical: String? = null
                            )

                            class PushDatas
                        }
                    }
                }
            }
        }
    }

    data class Extra(
        @SerializedName("now")
        val now: Long? = null
    )
}