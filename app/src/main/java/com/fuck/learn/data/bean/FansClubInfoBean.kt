package com.fuck.learn.data.bean


import com.google.gson.annotations.SerializedName
data class FansClubInfoBean(
    @SerializedName("data")
    val `data`: Data? = null,
    @SerializedName("extra")
    val extra: Extra? = null,
    @SerializedName("status_code")
    val statusCode: Int? = null
) {
    data class Data(
        @SerializedName("user_profile")
        val userProfile: UserProfile? = null,
        @SerializedName("user_data")
        val userData: UserData? = null
    ) {
        data class UserProfile(
            @SerializedName("base_info")
            val baseInfo: BaseInfo? = null,
            @SerializedName("follow_info")
            val followInfo: FollowInfo? = null,
            @SerializedName("fans_club")
            val fansClub: FansClub? = null,
            @SerializedName("action_config")
            val actionConfig: List<Any?>? = null,
            @SerializedName("grade")
            val grade: Grade? = null,
            @SerializedName("admin_info")
            val adminInfo: AdminInfo? = null,
            @SerializedName("activity_badges")
            val activityBadges: ActivityBadges? = null,
            @SerializedName("profile_skin")
            val profileSkin: ProfileSkin? = null,
            @SerializedName("auth_info")
            val authInfo: AuthInfo? = null,
            @SerializedName("is_muted")
            val isMuted: Boolean? = null,
            @SerializedName("authorization_info")
            val authorizationInfo: Int? = null,
            @SerializedName("adversary_authorization_info")
            val adversaryAuthorizationInfo: Int? = null,
            @SerializedName("fans_group_info")
            val fansGroupInfo: FansGroupInfo? = null,
            @SerializedName("gift_exhibition_home_stats")
            val giftExhibitionHomeStats: GiftExhibitionHomeStats? = null,
            @SerializedName("honor_wall_ui")
            val honorWallUi: HonorWallUi? = null,
            @SerializedName("action_configs")
            val actionConfigs: ActionConfigs? = null,
            @SerializedName("shop_entrance")
            val shopEntrance: ShopEntrance? = null,
            @SerializedName("action_info")
            val actionInfo: ActionInfo? = null,
            @SerializedName("subscribe_info")
            val subscribeInfo: SubscribeInfo? = null,
            @SerializedName("j_accredit_info")
            val jAccreditInfo: JAccreditInfo? = null,
            @SerializedName("profile_style_params")
            val profileStyleParams: ProfileStyleParams? = null,
            @SerializedName("consumer_centre_info")
            val consumerCentreInfo: ConsumerCentreInfo? = null,
            @SerializedName("dress_suit_info")
            val dressSuitInfo: DressSuitInfo? = null,
            @SerializedName("profile_tag_content")
            val profileTagContent: List<Any?>? = null,
            @SerializedName("profile_tag_switch")
            val profileTagSwitch: Int? = null,
            @SerializedName("shop_fans_club")
            val shopFansClub: ShopFansClub? = null,
            @SerializedName("AnchorAudienceRelationInfo")
            val anchorAudienceRelationInfo: String? = null,
            @SerializedName("dress_visitor_info")
            val dressVisitorInfo: DressVisitorInfo? = null,
            @SerializedName("basic_area")
            val basicArea: BasicArea? = null,
            @SerializedName("open_area")
            val openArea: OpenArea? = null,
            @SerializedName("upper_area")
            val upperArea: UpperArea? = null,
            @SerializedName("appointment")
            val appointment: Appointment? = null
        ) {
            data class BaseInfo(
                @SerializedName("id")
                val id: Long? = null,
                @SerializedName("id_str")
                val idStr: String? = null,
                @SerializedName("sec_uid")
                val secUid: String? = null,
                @SerializedName("display_id")
                val displayId: String? = null,
                @SerializedName("nickname")
                val nickname: String? = null,
                @SerializedName("gender")
                val gender: Int? = null,
                @SerializedName("signature")
                val signature: String? = null,
                @SerializedName("avatar_thumb")
                val avatarThumb: AvatarThumb? = null,
                @SerializedName("avatar_medium")
                val avatarMedium: AvatarMedium? = null,
                @SerializedName("avatar_large")
                val avatarLarge: AvatarLarge? = null,
                @SerializedName("city")
                val city: String? = null,
                @SerializedName("secret")
                val secret: Int? = null,
                @SerializedName("remark_name")
                val remarkName: String? = null,
                @SerializedName("age")
                val age: Int? = null,
                @SerializedName("school")
                val school: String? = null,
                @SerializedName("location_city")
                val locationCity: String? = null,
                @SerializedName("mystery_man")
                val mysteryMan: Int? = null,
                @SerializedName("account_type")
                val accountType: Int? = null,
                @SerializedName("open_id")
                val openId: String? = null
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
            }

            data class FollowInfo(
                @SerializedName("following_count")
                val followingCount: Int? = null,
                @SerializedName("following_count_enable")
                val followingCountEnable: Boolean? = null,
                @SerializedName("follower_count")
                val followerCount: Int? = null,
                @SerializedName("follower_count_enable")
                val followerCountEnable: Boolean? = null,
                @SerializedName("follower_list_enable")
                val followerListEnable: Boolean? = null,
                @SerializedName("follow_status")
                val followStatus: Int? = null,
                @SerializedName("accounts")
                val accounts: List<Any?>? = null,
                @SerializedName("mutual_follow_count")
                val mutualFollowCount: Int? = null,
                @SerializedName("remark_name")
                val remarkName: String? = null,
                @SerializedName("follower_count_str")
                val followerCountStr: String? = null,
                @SerializedName("following_count_str")
                val followingCountStr: String? = null,
                @SerializedName("invalid_follow_status")
                val invalidFollowStatus: Boolean? = null
            )

            data class FansClub(
                @SerializedName("total_fans_count")
                val totalFansCount: Int? = null,
                @SerializedName("data")
                val `data`: Data? = null,
                @SerializedName("prefer_data")
                val preferData: PreferData? = null,
                @SerializedName("total_fans_count_str")
                val totalFansCountStr: String? = null,
                @SerializedName("total_fans_count_substr")
                val totalFansCountSubstr: String? = null
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
                    val anchorId: Long? = null,
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
                            @SerializedName("1")
                            val x1: X1? = null,
                            @SerializedName("4")
                            val x4: X4? = null
                        ) {
                            data class X1(
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

                            data class X4(
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
                    }
                }

                class PreferData
            }

            data class Grade(
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

            data class AdminInfo(
                @SerializedName("is_admin")
                val isAdmin: Boolean? = null
            )

            data class ActivityBadges(
                @SerializedName("badges")
                val badges: List<Any?>? = null,
                @SerializedName("open_url")
                val openUrl: String? = null
            )

            data class ProfileSkin(
                @SerializedName("skin")
                val skin: Skin? = null
            ) {
                data class Skin(
                    @SerializedName("avatar_border")
                    val avatarBorder: AvatarBorder? = null,
                    @SerializedName("follow_button_text_color")
                    val followButtonTextColor: String? = null,
                    @SerializedName("fansclub_button_text_color")
                    val fansclubButtonTextColor: String? = null,
                    @SerializedName("gray_button_text_color")
                    val grayButtonTextColor: String? = null,
                    @SerializedName("heading_text_gradient_color_top")
                    val headingTextGradientColorTop: String? = null,
                    @SerializedName("heading_text_gradient_color_bottom")
                    val headingTextGradientColorBottom: String? = null,
                    @SerializedName("body_text_color")
                    val bodyTextColor: String? = null,
                    @SerializedName("body_transparent_text_color")
                    val bodyTransparentTextColor: String? = null,
                    @SerializedName("bg_ui")
                    val bgUi: BgUi? = null,
                    @SerializedName("secondary_button_ui")
                    val secondaryButtonUi: SecondaryButtonUi? = null,
                    @SerializedName("nickname_color")
                    val nicknameColor: NicknameColor? = null,
                    @SerializedName("tag_ui")
                    val tagUi: TagUi? = null,
                    @SerializedName("follow_info_color")
                    val followInfoColor: String? = null,
                    @SerializedName("signature_color")
                    val signatureColor: String? = null,
                    @SerializedName("honor_wall_ui")
                    val honorWallUi: HonorWallUi? = null,
                    @SerializedName("avatar_border_dress_id")
                    val avatarBorderDressId: String? = null,
                    @SerializedName("main_button_ui")
                    val mainButtonUi: MainButtonUi? = null,
                    @SerializedName("panel")
                    val panel: Panel? = null,
                    @SerializedName("bg_ui_webp")
                    val bgUiWebp: BgUiWebp? = null,
                    @SerializedName("dress_id")
                    val dressId: String? = null,
                    @SerializedName("visitor_button_color")
                    val visitorButtonColor: String? = null
                ) {
                    data class AvatarBorder(
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

                    data class BgUi(
                        @SerializedName("overall_image")
                        val overallImage: OverallImage? = null,
                        @SerializedName("top_border")
                        val topBorder: TopBorder? = null,
                        @SerializedName("right_image")
                        val rightImage: RightImage? = null,
                        @SerializedName("split_line_color")
                        val splitLineColor: String? = null,
                        @SerializedName("extend_top_border")
                        val extendTopBorder: ExtendTopBorder? = null
                    ) {
                        data class OverallImage(
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

                        data class TopBorder(
                            @SerializedName("url_list")
                            val urlList: List<Any?>? = null,
                            @SerializedName("uri")
                            val uri: String? = null,
                            @SerializedName("flex_setting")
                            val flexSetting: List<Int?>? = null,
                            @SerializedName("text_setting")
                            val textSetting: List<Any?>? = null,
                            @SerializedName("top_border_height")
                            val topBorderHeight: Int? = null
                        )

                        data class RightImage(
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

                        data class ExtendTopBorder(
                            @SerializedName("overlay_pic_type")
                            val overlayPicType: Int? = null,
                            @SerializedName("overlay_webp_enter")
                            val overlayWebpEnter: OverlayWebpEnter? = null,
                            @SerializedName("overlay_webp_loop")
                            val overlayWebpLoop: OverlayWebpLoop? = null
                        ) {
                            data class OverlayWebpEnter(
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

                            data class OverlayWebpLoop(
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
                    }

                    data class SecondaryButtonUi(
                        @SerializedName("icon_color")
                        val iconColor: String? = null,
                        @SerializedName("border_color")
                        val borderColor: String? = null,
                        @SerializedName("background_color")
                        val backgroundColor: String? = null
                    )

                    data class NicknameColor(
                        @SerializedName("from")
                        val from: String? = null,
                        @SerializedName("to")
                        val to: String? = null
                    )

                    data class TagUi(
                        @SerializedName("word_color")
                        val wordColor: String? = null,
                        @SerializedName("background_color")
                        val backgroundColor: String? = null
                    )

                    data class HonorWallUi(
                        @SerializedName("title_color")
                        val titleColor: String? = null,
                        @SerializedName("content_color")
                        val contentColor: String? = null,
                        @SerializedName("bg_color")
                        val bgColor: BgColor? = null
                    ) {
                        data class BgColor(
                            @SerializedName("from")
                            val from: String? = null,
                            @SerializedName("to")
                            val to: String? = null
                        )
                    }

                    data class MainButtonUi(
                        @SerializedName("uri")
                        val uri: Uri? = null
                    ) {
                        data class Uri(
                            @SerializedName("url_list")
                            val urlList: List<String?>? = null,
                            @SerializedName("uri")
                            val uri: String? = null,
                            @SerializedName("flex_setting")
                            val flexSetting: List<Int?>? = null,
                            @SerializedName("text_setting")
                            val textSetting: List<Any?>? = null,
                            @SerializedName("top_border_height")
                            val topBorderHeight: Int? = null
                        )
                    }

                    data class Panel(
                        @SerializedName("open_interval")
                        val openInterval: Int? = null,
                        @SerializedName("close_interval")
                        val closeInterval: Int? = null,
                        @SerializedName("open_rate_curve")
                        val openRateCurve: List<Any?>? = null,
                        @SerializedName("close_rate_curve")
                        val closeRateCurve: List<Any?>? = null
                    )

                    data class BgUiWebp(
                        @SerializedName("overall_image")
                        val overallImage: OverallImage? = null
                    ) {
                        data class OverallImage(
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

            data class AuthInfo(
                @SerializedName("verify_content")
                val verifyContent: String? = null
            )

            data class FansGroupInfo(
                @SerializedName("list_fans_group_url")
                val listFansGroupUrl: String? = null
            )

            data class GiftExhibitionHomeStats(
                @SerializedName("lighted_num")
                val lightedNum: Int? = null,
                @SerializedName("unlighted_num")
                val unlightedNum: Int? = null,
                @SerializedName("exhibition_entrance_url")
                val exhibitionEntranceUrl: String? = null
            )

            data class HonorWallUi(
                @SerializedName("bgs")
                val bgs: Bgs? = null
            ) {
                data class Bgs(
                    @SerializedName("1")
                    val x1: X1? = null,
                    @SerializedName("2")
                    val x2: X2? = null,
                    @SerializedName("5")
                    val x5: X5? = null,
                    @SerializedName("7")
                    val x7: X7? = null
                ) {
                    data class X1(
                        @SerializedName("gradient_start")
                        val gradientStart: String? = null,
                        @SerializedName("gradient_end")
                        val gradientEnd: String? = null,
                        @SerializedName("icon")
                        val icon: Icon? = null
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
                    }

                    data class X2(
                        @SerializedName("gradient_start")
                        val gradientStart: String? = null,
                        @SerializedName("gradient_end")
                        val gradientEnd: String? = null,
                        @SerializedName("icon")
                        val icon: Icon? = null
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
                    }

                    data class X5(
                        @SerializedName("gradient_start")
                        val gradientStart: String? = null,
                        @SerializedName("gradient_end")
                        val gradientEnd: String? = null,
                        @SerializedName("icon")
                        val icon: Icon? = null
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
                    }

                    data class X7(
                        @SerializedName("gradient_start")
                        val gradientStart: String? = null,
                        @SerializedName("gradient_end")
                        val gradientEnd: String? = null,
                        @SerializedName("icon")
                        val icon: Icon? = null
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
                    }
                }
            }

            data class ActionConfigs(
                @SerializedName("entrances")
                val entrances: List<Any?>? = null
            )

            data class ShopEntrance(
                @SerializedName("entrance_type")
                val entranceType: Int? = null,
                @SerializedName("shop_url")
                val shopUrl: String? = null,
                @SerializedName("window_url")
                val windowUrl: String? = null
            )

            data class ActionInfo(
                @SerializedName("action_count")
                val actionCount: Int? = null
            )

            data class SubscribeInfo(
                @SerializedName("is_member")
                val isMember: Boolean? = null,
                @SerializedName("member_count")
                val memberCount: Int? = null,
                @SerializedName("url")
                val url: String? = null,
                @SerializedName("member_count_str")
                val memberCountStr: String? = null,
                @SerializedName("member_count_substr")
                val memberCountSubstr: String? = null
            )

            data class JAccreditInfo(
                @SerializedName("j_accredit_basic")
                val jAccreditBasic: Int? = null,
                @SerializedName("j_accredit_advance")
                val jAccreditAdvance: Int? = null,
                @SerializedName("j_accredit_content")
                val jAccreditContent: Int? = null,
                @SerializedName("j_accredit_live")
                val jAccreditLive: Int? = null
            )

            data class ProfileStyleParams(
                @SerializedName("profile_style")
                val profileStyle: Int? = null,
                @SerializedName("is_set")
                val isSet: Boolean? = null,
                @SerializedName("set_time")
                val setTime: Int? = null,
                @SerializedName("profile_head_height")
                val profileHeadHeight: Int? = null,
                @SerializedName("profile_style_smart_switch")
                val profileStyleSmartSwitch: Int? = null
            )

            data class ConsumerCentreInfo(
                @SerializedName("schema")
                val schema: String? = null
            )

            data class DressSuitInfo(
                @SerializedName("name")
                val name: String? = null,
                @SerializedName("schema")
                val schema: String? = null,
                @SerializedName("badge")
                val badge: Badge? = null,
                @SerializedName("suit_id")
                val suitId: String? = null,
                @SerializedName("user_suit_id")
                val userSuitId: String? = null,
                @SerializedName("scene")
                val scene: Int? = null,
                @SerializedName("extra")
                val extra: String? = null
            ) {
                data class Badge(
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
            }

            data class ShopFansClub(
                @SerializedName("total_fans_count")
                val totalFansCount: Int? = null,
                @SerializedName("data")
                val `data`: Data? = null,
                @SerializedName("prefer_data")
                val preferData: PreferData? = null,
                @SerializedName("total_fans_count_str")
                val totalFansCountStr: String? = null,
                @SerializedName("total_fans_count_substr")
                val totalFansCountSubstr: String? = null
            ) {
                data class Data(
                    @SerializedName("club_name")
                    val clubName: String? = null,
                    @SerializedName("level")
                    val level: Int? = null,
                    @SerializedName("user_fans_club_status")
                    val userFansClubStatus: Int? = null,
                    @SerializedName("available_gift_ids")
                    val availableGiftIds: List<Any?>? = null,
                    @SerializedName("anchor_id")
                    val anchorId: Int? = null,
                    @SerializedName("anchor_open_id")
                    val anchorOpenId: String? = null
                )

                class PreferData
            }

            data class DressVisitorInfo(
                @SerializedName("button_status")
                val buttonStatus: Int? = null,
                @SerializedName("achievement_type")
                val achievementType: Int? = null,
                @SerializedName("jump_schema")
                val jumpSchema: String? = null
            )

            data class BasicArea(
                @SerializedName("grade_icon")
                val gradeIcon: GradeIcon? = null,
                @SerializedName("has_owned_public_groups")
                val hasOwnedPublicGroups: Int? = null,
                @SerializedName("badge_list")
                val badgeList: List<Badge?>? = null
            ) {
                data class GradeIcon(
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

                data class Badge(
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
            }

            data class OpenArea(
                @SerializedName("business_area_version")
                val businessAreaVersion: Int? = null,
                @SerializedName("business_area_v3")
                val businessAreaV3: BusinessAreaV3? = null
            ) {
                data class BusinessAreaV3(
                    @SerializedName("top_element_list")
                    val topElementList: List<TopElement?>? = null,
                    @SerializedName("bottom_element_list")
                    val bottomElementList: List<BottomElement?>? = null,
                    @SerializedName("bottom_banner_list")
                    val bottomBannerList: List<Any?>? = null
                ) {
                    data class TopElement(
                        @SerializedName("id")
                        val id: Int? = null,
                        @SerializedName("honor_wall_content")
                        val honorWallContent: HonorWallContent? = null,
                        @SerializedName("extra_info")
                        val extraInfo: ExtraInfo? = null,
                        @SerializedName("name")
                        val name: String? = null
                    ) {
                        data class HonorWallContent(
                            @SerializedName("honor_wall_bg")
                            val honorWallBg: HonorWallBg? = null,
                            @SerializedName("honor_wall_top_display")
                            val honorWallTopDisplay: HonorWallTopDisplay? = null,
                            @SerializedName("honor_wall_bottom_display")
                            val honorWallBottomDisplay: HonorWallBottomDisplay? = null
                        ) {
                            data class HonorWallBg(
                                @SerializedName("color_start")
                                val colorStart: String? = null,
                                @SerializedName("color_end")
                                val colorEnd: String? = null,
                                @SerializedName("border_color")
                                val borderColor: String? = null
                            )

                            data class HonorWallTopDisplay(
                                @SerializedName("pieces")
                                val pieces: List<Piece?>? = null
                            ) {
                                data class Piece(
                                    @SerializedName("type")
                                    val type: Int? = null,
                                    @SerializedName("alignment")
                                    val alignment: Int? = null,
                                    @SerializedName("string_value")
                                    val stringValue: StringValue? = null
                                ) {
                                    data class StringValue(
                                        @SerializedName("format")
                                        val format: Format? = null,
                                        @SerializedName("string_value")
                                        val stringValue: String? = null
                                    ) {
                                        data class Format(
                                            @SerializedName("font_type")
                                            val fontType: Int? = null,
                                            @SerializedName("font_size")
                                            val fontSize: Int? = null,
                                            @SerializedName("font_style")
                                            val fontStyle: Int? = null,
                                            @SerializedName("font_color")
                                            val fontColor: String? = null
                                        )
                                    }
                                }
                            }

                            data class HonorWallBottomDisplay(
                                @SerializedName("pieces")
                                val pieces: List<Piece?>? = null
                            ) {
                                data class Piece(
                                    @SerializedName("type")
                                    val type: Int? = null,
                                    @SerializedName("alignment")
                                    val alignment: Int? = null,
                                    @SerializedName("image_value")
                                    val imageValue: ImageValue? = null
                                ) {
                                    data class ImageValue(
                                        @SerializedName("image")
                                        val image: Image? = null
                                    ) {
                                        data class Image(
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
                                    }
                                }
                            }
                        }

                        data class ExtraInfo(
                            @SerializedName("enable_tap")
                            val enableTap: Boolean? = null,
                            @SerializedName("scheme")
                            val scheme: String? = null,
                            @SerializedName("show_event")
                            val showEvent: String? = null,
                            @SerializedName("show_event_params")
                            val showEventParams: ShowEventParams? = null,
                            @SerializedName("click_event")
                            val clickEvent: String? = null,
                            @SerializedName("click_event_params")
                            val clickEventParams: ClickEventParams? = null,
                            @SerializedName("global_show_event_params")
                            val globalShowEventParams: GlobalShowEventParams? = null,
                            @SerializedName("global_click_event_params")
                            val globalClickEventParams: GlobalClickEventParams? = null,
                            @SerializedName("extra_message")
                            val extraMessage: String? = null,
                            @SerializedName("disappear_after_tap")
                            val disappearAfterTap: Boolean? = null
                        ) {
                            data class ShowEventParams(
                                @SerializedName("card_type")
                                val cardType: String? = null,
                                @SerializedName("show_from")
                                val showFrom: String? = null
                            )

                            data class ClickEventParams(
                                @SerializedName("card_type")
                                val cardType: String? = null
                            )

                            class GlobalShowEventParams

                            class GlobalClickEventParams
                        }
                    }

                    data class BottomElement(
                        @SerializedName("id")
                        val id: Int? = null,
                        @SerializedName("honor_wall_content")
                        val honorWallContent: HonorWallContent? = null,
                        @SerializedName("extra_info")
                        val extraInfo: ExtraInfo? = null,
                        @SerializedName("name")
                        val name: String? = null
                    ) {
                        data class HonorWallContent(
                            @SerializedName("honor_wall_bg")
                            val honorWallBg: HonorWallBg? = null,
                            @SerializedName("honor_wall_top_display")
                            val honorWallTopDisplay: HonorWallTopDisplay? = null,
                            @SerializedName("honor_wall_bottom_display")
                            val honorWallBottomDisplay: HonorWallBottomDisplay? = null
                        ) {
                            data class HonorWallBg(
                                @SerializedName("color_start")
                                val colorStart: String? = null,
                                @SerializedName("color_end")
                                val colorEnd: String? = null,
                                @SerializedName("border_color")
                                val borderColor: String? = null
                            )

                            data class HonorWallTopDisplay(
                                @SerializedName("pieces")
                                val pieces: List<Piece?>? = null
                            ) {
                                data class Piece(
                                    @SerializedName("type")
                                    val type: Int? = null,
                                    @SerializedName("alignment")
                                    val alignment: Int? = null,
                                    @SerializedName("string_value")
                                    val stringValue: StringValue? = null
                                ) {
                                    data class StringValue(
                                        @SerializedName("format")
                                        val format: Format? = null,
                                        @SerializedName("string_value")
                                        val stringValue: String? = null
                                    ) {
                                        data class Format(
                                            @SerializedName("font_type")
                                            val fontType: Int? = null,
                                            @SerializedName("font_size")
                                            val fontSize: Int? = null,
                                            @SerializedName("font_style")
                                            val fontStyle: Int? = null,
                                            @SerializedName("font_color")
                                            val fontColor: String? = null
                                        )
                                    }
                                }
                            }

                            data class HonorWallBottomDisplay(
                                @SerializedName("pieces")
                                val pieces: List<Piece?>? = null
                            ) {
                                data class Piece(
                                    @SerializedName("type")
                                    val type: Int? = null,
                                    @SerializedName("alignment")
                                    val alignment: Int? = null,
                                    @SerializedName("string_value")
                                    val stringValue: StringValue? = null,
                                    @SerializedName("image_value")
                                    val imageValue: ImageValue? = null
                                ) {
                                    data class StringValue(
                                        @SerializedName("format")
                                        val format: Format? = null,
                                        @SerializedName("string_value")
                                        val stringValue: String? = null
                                    ) {
                                        data class Format(
                                            @SerializedName("font_type")
                                            val fontType: Int? = null,
                                            @SerializedName("font_size")
                                            val fontSize: Int? = null,
                                            @SerializedName("font_style")
                                            val fontStyle: Int? = null,
                                            @SerializedName("font_color")
                                            val fontColor: String? = null
                                        )
                                    }

                                    data class ImageValue(
                                        @SerializedName("image")
                                        val image: Image? = null
                                    ) {
                                        data class Image(
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
                                    }
                                }
                            }
                        }

                        data class ExtraInfo(
                            @SerializedName("enable_tap")
                            val enableTap: Boolean? = null,
                            @SerializedName("scheme")
                            val scheme: String? = null,
                            @SerializedName("show_event")
                            val showEvent: String? = null,
                            @SerializedName("show_event_params")
                            val showEventParams: ShowEventParams? = null,
                            @SerializedName("click_event")
                            val clickEvent: String? = null,
                            @SerializedName("click_event_params")
                            val clickEventParams: ClickEventParams? = null,
                            @SerializedName("global_show_event_params")
                            val globalShowEventParams: GlobalShowEventParams? = null,
                            @SerializedName("global_click_event_params")
                            val globalClickEventParams: GlobalClickEventParams? = null,
                            @SerializedName("extra_message")
                            val extraMessage: String? = null,
                            @SerializedName("disappear_after_tap")
                            val disappearAfterTap: Boolean? = null
                        ) {
                            data class ShowEventParams(
                                @SerializedName("card_type")
                                val cardType: String? = null,
                                @SerializedName("collected_num")
                                val collectedNum: String? = null,
                                @SerializedName("is_collected")
                                val isCollected: String? = null,
                                @SerializedName("is_self")
                                val isSelf: String? = null,
                                @SerializedName("to_user_id")
                                val toUserId: String? = null,
                                @SerializedName("user_id")
                                val userId: String? = null,
                                @SerializedName("is_wear")
                                val isWear: String? = null,
                                @SerializedName("package_id")
                                val packageId: String? = null,
                                @SerializedName("package_status")
                                val packageStatus: String? = null,
                                @SerializedName("show_from")
                                val showFrom: String? = null
                            )

                            data class ClickEventParams(
                                @SerializedName("card_type")
                                val cardType: String? = null,
                                @SerializedName("collected_num")
                                val collectedNum: String? = null,
                                @SerializedName("is_collected")
                                val isCollected: String? = null,
                                @SerializedName("is_self")
                                val isSelf: String? = null,
                                @SerializedName("to_user_id")
                                val toUserId: String? = null,
                                @SerializedName("user_id")
                                val userId: String? = null,
                                @SerializedName("is_wear")
                                val isWear: String? = null,
                                @SerializedName("package_id")
                                val packageId: String? = null,
                                @SerializedName("package_status")
                                val packageStatus: String? = null
                            )

                            class GlobalShowEventParams

                            class GlobalClickEventParams
                        }
                    }
                }
            }

            class UpperArea

            data class Appointment(
                @SerializedName("push_status")
                val pushStatus: Int? = null
            )
        }

        data class UserData(
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
            @SerializedName("authorization_info")
            val authorizationInfo: Int? = null,
            @SerializedName("adversary_authorization_info")
            val adversaryAuthorizationInfo: Int? = null,
            @SerializedName("poi_info")
            val poiInfo: PoiInfo? = null,
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
                @SerializedName("buff_info")
                val buffInfo: BuffInfo? = null,
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

                data class BuffInfo(
                    @SerializedName("buff_level")
                    val buffLevel: Int? = null,
                    @SerializedName("status")
                    val status: Int? = null,
                    @SerializedName("end_time")
                    val endTime: Int? = null,
                    @SerializedName("stats_info")
                    val statsInfo: StatsInfo? = null,
                    @SerializedName("buff_badge")
                    val buffBadge: BuffBadge? = null
                ) {
                    data class StatsInfo(
                        @SerializedName("1")
                        val x1: Int? = null,
                        @SerializedName("2")
                        val x2: Int? = null,
                        @SerializedName("3")
                        val x3: Int? = null,
                        @SerializedName("4")
                        val x4: Int? = null
                    )

                    data class BuffBadge(
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
                }
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
                    val anchorId: Long? = null,
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
                            @SerializedName("2")
                            val x2: X2? = null,
                            @SerializedName("4")
                            val x4: X4? = null
                        ) {
                            data class X2(
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

                            data class X4(
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
                                val flexSettingList: List<FlexSetting?>? = null,
                                @SerializedName("text_setting_list")
                                val textSettingList: List<TextSetting?>? = null
                            ) {
                                data class FlexSetting(
                                    @SerializedName("setting_list")
                                    val settingList: List<Int?>? = null
                                )

                                data class TextSetting(
                                    @SerializedName("setting_list")
                                    val settingList: List<Int?>? = null
                                )
                            }
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

            data class PoiInfo(
                @SerializedName("is_poi_enabled")
                val isPoiEnabled: Boolean? = null,
                @SerializedName("poi_id")
                val poiId: Int? = null,
                @SerializedName("poi_name")
                val poiName: String? = null,
                @SerializedName("poi_id_str")
                val poiIdStr: String? = null,
                @SerializedName("follower_count_permission")
                val followerCountPermission: Int? = null,
                @SerializedName("white_user_permission")
                val whiteUserPermission: Int? = null
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
        }
    }

    data class Extra(
        @SerializedName("anonymous_is_silence")
        val anonymousIsSilence: Boolean? = null,
        @SerializedName("biz_extra")
        val bizExtra: BizExtra? = null,
        @SerializedName("mystery_detail_jump_schema")
        val mysteryDetailJumpSchema: String? = null,
        @SerializedName("now")
        val now: Long? = null
    ) {
        data class BizExtra(
            @SerializedName("clicked_privilege_level")
            val clickedPrivilegeLevel: String? = null,
            @SerializedName("clicked_rebirth_level")
            val clickedRebirthLevel: String? = null,
            @SerializedName("clicked_rebirth_status")
            val clickedRebirthStatus: String? = null,
            @SerializedName("privilege_level")
            val privilegeLevel: String? = null,
            @SerializedName("rebirth_level")
            val rebirthLevel: String? = null,
            @SerializedName("rebirth_play")
            val rebirthPlay: String? = null,
            @SerializedName("rebirth_status")
            val rebirthStatus: String? = null
        )
    }
}