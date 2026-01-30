package com.fuck.learn.data.bean


import com.google.gson.annotations.SerializedName

data class HotRankExtraBean(
    @SerializedName("data")
    val `data`: Data? = null,
    @SerializedName("extra")
    val extra: Extra? = null,
    @SerializedName("status_code")
    val statusCode: Int? = null
) {
    data class Data(
        @SerializedName("ranks")
        val ranks: List<Rank?>? = null,
        @SerializedName("anchor_info")
        val anchorInfo: AnchorInfo? = null,
        @SerializedName("top_left_text")
        val topLeftText: String? = null,
        @SerializedName("rules_url_v2")
        val rulesUrlV2: String? = null,
        @SerializedName("delta_time")
        val deltaTime: Int? = null,
        @SerializedName("top_right_text")
        val topRightText: String? = null,
        @SerializedName("is_fansclub_member")
        val isFansclubMember: Boolean? = null,
        @SerializedName("gift_id")
        val giftId: Int? = null,
        @SerializedName("top_middle_text")
        val topMiddleText: String? = null,
        @SerializedName("tabs")
        val tabs: List<Tab?>? = null
    ) {
        data class Rank(
            @SerializedName("user")
            val user: User? = null,
            @SerializedName("score")
            val score: Int? = null,
            @SerializedName("rank")
            val rank: Int? = null,
            @SerializedName("contributor_text")
            val contributorText: String? = null,
            @SerializedName("fansclub_name")
            val fansclubName: String? = null,
            @SerializedName("gap_description")
            val gapDescription: String? = null,
            @SerializedName("button_text")
            val buttonText: String? = null,
            @SerializedName("is_reach_limit")
            val isReachLimit: Boolean? = null,
            @SerializedName("status")
            val status: Int? = null,
            @SerializedName("foot_desc")
            val footDesc: String? = null,
            @SerializedName("rank_name")
            val rankName: String? = null,
            @SerializedName("score_desc")
            val scoreDesc: String? = null
        ) {
            data class User(
                @SerializedName("id")
                val id: Long? = null,
                @SerializedName("short_id")
                val shortId: Int? = null,
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
                @SerializedName("own_room")
                val ownRoom: OwnRoom? = null,
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
                val badgeImageListV2: List<BadgeImageV2?>? = null,
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
                @SerializedName("j_accredit_info")
                val jAccreditInfo: JAccreditInfo? = null,
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
                )

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

                data class OwnRoom(
                    @SerializedName("room_ids")
                    val roomIds: List<Long?>? = null,
                    @SerializedName("room_ids_str")
                    val roomIdsStr: List<String?>? = null,
                    @SerializedName("room_ids_display")
                    val roomIdsDisplay: List<Any?>? = null
                )

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
            }
        }

        data class AnchorInfo(
            @SerializedName("user")
            val user: User? = null,
            @SerializedName("score")
            val score: Int? = null,
            @SerializedName("rank")
            val rank: Int? = null,
            @SerializedName("contributor_text")
            val contributorText: String? = null,
            @SerializedName("fansclub_name")
            val fansclubName: String? = null,
            @SerializedName("gap_description")
            val gapDescription: String? = null,
            @SerializedName("button_text")
            val buttonText: String? = null,
            @SerializedName("is_reach_limit")
            val isReachLimit: Boolean? = null,
            @SerializedName("status")
            val status: Int? = null,
            @SerializedName("foot_desc")
            val footDesc: String? = null,
            @SerializedName("rank_name")
            val rankName: String? = null,
            @SerializedName("score_desc")
            val scoreDesc: String? = null
        ) {
            data class User(
                @SerializedName("id")
                val id: Int? = null,
                @SerializedName("short_id")
                val shortId: Int? = null,
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
                @SerializedName("follow_info")
                val followInfo: FollowInfo? = null,
                @SerializedName("pay_grade")
                val payGrade: PayGrade? = null,
                @SerializedName("fans_club")
                val fansClub: FansClub? = null,
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
                val badgeImageListV2: List<BadgeImageV2?>? = null,
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
                @SerializedName("j_accredit_info")
                val jAccreditInfo: JAccreditInfo? = null,
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
                )

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
            }
        }

        data class Tab(
            @SerializedName("name")
            val name: String? = null,
            @SerializedName("rank_type")
            val rankType: Int? = null,
            @SerializedName("sub_tabs")
            val subTabs: List<Any?>? = null,
            @SerializedName("tabs")
            val tabs: List<Any?>? = null,
            @SerializedName("atmosphere_image")
            val atmosphereImage: AtmosphereImage? = null,
            @SerializedName("top_text")
            val topText: TopText? = null
        ) {
            data class AtmosphereImage(
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

            data class TopText(
                @SerializedName("finish_text")
                val finishText: String? = null,
                @SerializedName("reward_text")
                val rewardText: String? = null,
                @SerializedName("strategy_text")
                val strategyText: String? = null,
                @SerializedName("rules_text")
                val rulesText: String? = null
            )
        }
    }

    data class Extra(
        @SerializedName("now")
        val now: Long? = null
    )
}