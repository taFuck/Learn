package com.fuck.learn.ui.activity.fans.club.info

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.fuck.learn.R
import com.fuck.learn.api.RetrofitClient
import com.fuck.learn.data.db.AppDatabase
import com.fuck.learn.data.db.HistoryForFansClub
import com.fuck.learn.data.db.StreamerForFansClub
import com.fuck.learn.utils.DouyinParamUtils
import com.fuck.learn.utils.DouyinUrlUtils
import com.fuck.learn.utils.LogUtils
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

data class UiUserInfoItem(
    val nickname: String? = null,
    val avatarUrl: String? = null,
    val skinUrl: String? = null,
    val level: String? = null,
    val ip: String? = null,
    val mystery: Int? = null,
    val consumeMin: Int? = null,
    val consumeMax: Int? = null,
    val account: String? = null,
    val following: Int? = null,
    val follower: Int? = null
)

data class UiFansClubItem(
    val nickname: String?,
    val avatarUrl: String?,
    val level: String?,
    val levelUrl: String? = null,
    val clubName: String? = "",
    val state: Int?,
    val vip: String?,
    val vipUrl: String? = null,
    val star: String?
)

class QueryFansClubInfoViewModel(application: Application) : AndroidViewModel(application) {

    private val db = AppDatabase.getDatabase(application)
    private val streamerDao = db.streamerForFansClubDao()
    private val historyDao = db.historyForFansClubDao()

    val streamers: StateFlow<List<StreamerForFansClub>> =
        streamerDao.getAllStreamers().stateIn(viewModelScope, SharingStarted.Lazily, emptyList())
    val history: StateFlow<List<HistoryForFansClub>> =
        historyDao.getHistory().stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    private val _secUid = MutableStateFlow("")
    val secUid = _secUid.asStateFlow()

    private val _uiFansClubItems = MutableStateFlow<List<UiFansClubItem>>(emptyList())
    val uiFansClubItems: StateFlow<List<UiFansClubItem>> = _uiFansClubItems.asStateFlow()

    private val _uiUserInfoItems = MutableStateFlow(UiUserInfoItem())

    val uiUserInfoItems: StateFlow<UiUserInfoItem> = _uiUserInfoItems.asStateFlow()

    private val _isQuerying = MutableStateFlow(false)
    val isQuerying = _isQuerying.asStateFlow()

    private val _isFirst = MutableStateFlow(true)
    val isFirst = _isFirst.asStateFlow()

    private var queryJob: Job? = null

    private val _fansClubUiState = MutableStateFlow<FansClubUiState>(FansClubUiState.Initial)
    val fansClubUiState: StateFlow<FansClubUiState> = _fansClubUiState.asStateFlow()

    init {
//        viewModelScope.launch {
//            history.collect()
//        }
        viewModelScope.launch {
            streamers.collect()
        }
    }

    fun onSecUidChange(newSecUid: String) {
        _secUid.value = newSecUid
    }

    fun executeQuery() {
        queryJob?.cancel()
        _uiFansClubItems.value = emptyList()
        _uiUserInfoItems.value = UiUserInfoItem()
        _isFirst.value = true
        queryJob = viewModelScope.launch {
            _isQuerying.value = true
            _fansClubUiState.value = FansClubUiState.Loading
            val context = getApplication<Application>().applicationContext
            try {
                val secUid = DouyinUrlUtils.getSecUid(_secUid.value)
                if (secUid.isNullOrEmpty()) {
                    _fansClubUiState.value =
                        FansClubUiState.Error(context.getString(R.string.add_live_steamer_input_tip))
                    return@launch
                }
                val userProfileResponse = RetrofitClient.apiService.getDouyinUserProfile(
                    DouyinParamUtils.getCookie(), secUid
                )
                val body = userProfileResponse.body()?.string() ?: ""

                val nicknameRegex = """\\"nickname\\":\\"(.*?)\\"""".toRegex()
                val imgRegex = """\\"avatar300Url\\":\\"(.*?)\\"""".toRegex()
                val ipRegex = """\\"ipLocation\\":\\"IP属地：(.*?)\\"""".toRegex()
                val nickname = nicknameRegex.find(body)?.groups?.get(1)?.value
                if (nickname.isNullOrBlank()) {
                    _fansClubUiState.value = FansClubUiState.Error("User does not exist")
                    return@launch
                }
                val img = imgRegex.find(body)?.groups?.get(1)?.value
                val ip = ipRegex.find(body)?.groups?.get(1)?.value

                val resultList = mutableListOf<UiFansClubItem>()
                streamers.value.forEach {
                    val response = RetrofitClient.apiService.getFansClubInfo(
                        cookie = DouyinParamUtils.getCookie(),
                        sec_anchor_id = it.secUid,
                        sec_target_uid = secUid
                    )

                    var mystery: Int
                    var finalName: String
                    if (_isFirst.value) {
                        if (nickname == response.data?.userProfile?.baseInfo?.nickname) {
                            mystery = 0
                            finalName = nickname
                        } else {
                            mystery = 1
                            finalName =
                                "$nickname（${response.data?.userProfile?.baseInfo?.nickname}）"
                        }

                        addToHistory(
                            HistoryForFansClub(
                                nickname = finalName, url = "https://www.douyin.com/user/${secUid}"
                            )
                        )

                        val userInfo = UiUserInfoItem(
                            nickname = finalName,
                            avatarUrl = img,
                            skinUrl = response.data?.userProfile?.profileSkin?.skin?.avatarBorder?.urlList?.getOrNull(
                                0
                            ),
                            level = response.extra?.bizExtra?.clickedRebirthLevel?.toIntOrNull()
                                ?.let { level ->
                                    if (level == -1) {
                                        response.data?.userData?.payGrade?.level.toString()
                                    } else {
                                        "$level (${response.extra.bizExtra.clickedPrivilegeLevel} Lv.Rebirth)"
                                    }
                                },
                            consumeMin = response.data?.userData?.payGrade?.thisGradeMinDiamond,
                            consumeMax = response.data?.userData?.payGrade?.thisGradeMaxDiamond,
                            ip = ip,
                            mystery = mystery,
                            account = response.data?.userProfile?.baseInfo?.displayId,
                            following = response.data?.userProfile?.followInfo?.followingCount,
                            follower = response.data?.userProfile?.followInfo?.followerCount
                        )
                        _uiUserInfoItems.value = userInfo
                        _isFirst.value = false
                    }

                    val newItem = UiFansClubItem(
                        nickname = it.nickname,
                        avatarUrl = it.avatarUrl,
                        level = if (response.data?.userData?.fansClub?.data?.level == 0) "-"
                        else response.data?.userData?.fansClub?.data?.level.toString(),
                        levelUrl = response.data?.userProfile?.openArea?.businessAreaV3?.topElementList?.getOrNull(
                            0
                        )?.honorWallContent?.honorWallBottomDisplay?.pieces?.getOrNull(0)?.imageValue?.image?.urlList?.getOrNull(
                            0
                        ),
                        clubName = response.data?.userData?.fansClub?.data?.clubName,
                        state = response.data?.userData?.fansClub?.data?.userFansClubStatus,
                        star = if (response.data?.userData?.fansClub?.data?.clubName?.isEmpty() == true) "×" else "√",
                        vip = response.data?.userProfile?.openArea?.businessAreaV3?.topElementList?.getOrNull(
                            1
                        )?.honorWallContent?.honorWallTopDisplay?.pieces?.getOrNull(1)?.stringValue?.stringValue
                            ?: "-",
                        vipUrl = response.data?.userProfile?.openArea?.businessAreaV3?.topElementList?.getOrNull(
                            1
                        )?.honorWallContent?.honorWallBottomDisplay?.pieces?.getOrNull(0)?.imageValue?.image?.urlList?.getOrNull(
                            0
                        )
                    )
                    resultList.add(newItem)
                    _uiFansClubItems.value = resultList.toList()
                }
                _fansClubUiState.value = FansClubUiState.Success
            } catch (e: Exception) {
                LogUtils.e("${context.getString(R.string.error)} ${e.localizedMessage}")
                _fansClubUiState.value = FansClubUiState.Error(e.message.toString())
            } finally {
                _isQuerying.value = false
            }
        }
    }

    private fun addToHistory(history: HistoryForFansClub) {
        viewModelScope.launch {
            historyDao.insert(history)
        }
    }

    fun onDeleteHistory(history: HistoryForFansClub) {
        viewModelScope.launch {
            historyDao.delete(history.url)
        }
    }

    fun stopQuery() {
        queryJob?.cancel()
        _isQuerying.value = false
    }

    override fun onCleared() {
        super.onCleared()
        queryJob?.cancel()
    }
}

sealed class FansClubUiState {
    object Initial : FansClubUiState()
    object Loading : FansClubUiState()
    object Success : FansClubUiState()
    data class Error(val message: String) : FansClubUiState()
}
