package com.fuck.learn.ui.activity.fans.club.info

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.fuck.learn.R
import com.fuck.learn.api.RetrofitClient
import com.fuck.learn.data.db.AppDatabase
import com.fuck.learn.data.db.StreamerForFansClub
import com.fuck.learn.data.db.StreamerGroup
import com.fuck.learn.utils.DouyinParamUtils
import com.fuck.learn.utils.DouyinUrlUtils
import com.tencent.mmkv.MMKV
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

@OptIn(ExperimentalCoroutinesApi::class)
class AddLiveStreamerViewModel(application: Application) : AndroidViewModel(application) {

    private val streamerDao = AppDatabase.getDatabase(application).streamerForFansClubDao()
    private val groupDao = AppDatabase.getDatabase(application).streamerGroupDao()

    val groups: StateFlow<List<StreamerGroup>> =
        groupDao.getAllGroups().stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    private val mmkv = MMKV.defaultMMKV()
    private val KEY_SELECTED_GROUP_ID = "add_streamer_selected_group_id"

    private val _selectedGroupId = MutableStateFlow(mmkv.decodeLong(KEY_SELECTED_GROUP_ID, 1L))
    val selectedGroupId: StateFlow<Long> = _selectedGroupId.asStateFlow()

    val streamers: StateFlow<List<StreamerForFansClub>> =
        _selectedGroupId.flatMapLatest { groupId ->
            streamerDao.getStreamersByGroup(groupId)
        }.stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    private val _addLiveStreamerUiState =
        MutableStateFlow<AddLiveStreamerUiState>(AddLiveStreamerUiState.Initial)
    val addLiveStreamerUiState: StateFlow<AddLiveStreamerUiState> =
        _addLiveStreamerUiState.asStateFlow()

    init {
        viewModelScope.launch {
            selectedGroupId.collect { id ->
                mmkv.encode(KEY_SELECTED_GROUP_ID, id)
            }
        }
    }

    fun selectGroup(groupId: Long) {
        _selectedGroupId.value = groupId
    }

    suspend fun addGroup(name: String): Boolean {
        if (groupDao.isGroupNameExists(name) > 0) return false
        val maxOrder = groups.value.maxOfOrNull { it.displayOrder } ?: 0
        val id = groupDao.insert(StreamerGroup(name = name, displayOrder = maxOrder + 1))
        _selectedGroupId.value = id
        return true
    }

    suspend fun renameGroup(groupId: Long, newName: String): Boolean {
        if (groupDao.isGroupNameExists(newName) > 0) return false
        groupDao.renameGroup(groupId, newName)
        return true
    }

    fun deleteGroup(groupId: Long) {
        viewModelScope.launch {
            groupDao.deleteGroup(groupId)
            streamerDao.deleteStreamersByGroup(groupId)

            if (_selectedGroupId.value == groupId) {
                val remaining = groups.value.filter { it.id != groupId }
                if (remaining.isNotEmpty()) {
                    _selectedGroupId.value = remaining.first().id
                }
            }
        }
    }

    suspend fun shouldShowInitialGroupDialog(): Boolean {
        return groupDao.getGroupCount() == 0
    }

    fun fetchUserProfile(input: String) {
        viewModelScope.launch {
            val context = getApplication<Application>().applicationContext
            _addLiveStreamerUiState.value = AddLiveStreamerUiState.Loading
            try {
                val secUid = DouyinUrlUtils.getSecUid(input)
                if (secUid.isNullOrEmpty()) {
                    _addLiveStreamerUiState.value =
                        AddLiveStreamerUiState.Error(context.getString(R.string.add_live_steamer_input_tip))
                    return@launch
                }
                refreshStreamer(secUid)
            } catch (e: Exception) {
                _addLiveStreamerUiState.value =
                    AddLiveStreamerUiState.Error(e.message ?: "Unknown error")
            }
        }
    }

    fun refreshStreamer(secUid: String) {
        viewModelScope.launch {
            _addLiveStreamerUiState.value = AddLiveStreamerUiState.Loading
            try {
                val maxOrder = streamers.value.maxOfOrNull { it.displayOrder } ?: 0
                val body =
                    RetrofitClient.apiService.getDouyinUserProfile(DouyinParamUtils.getCookie(),secUid).body()?.string() ?: ""

                val nicknameRegex = """\\"nickname\\":\\"(.*?)\\"""".toRegex()
                val nickname = nicknameRegex.find(body)?.groups?.get(1)?.value

                if (!nickname.isNullOrBlank()) {

                    val avatarRegex = """\\"avatar300Url\\":\\"(.*?)\\"""".toRegex()
                    val avatarUrl = avatarRegex.find(body)?.groups?.get(1)?.value

                    val streamerForFansClub = StreamerForFansClub(
                        secUid = secUid,
                        nickname = nickname,
                        avatarUrl = avatarUrl?.replace("\u002F", "/") ?: "",
                        displayOrder = maxOrder + 1,
                        groupId = _selectedGroupId.value
                    )

                    val rowId = streamerDao.insert(streamerForFansClub)
                    if (rowId > -1L) {
                        _addLiveStreamerUiState.value = AddLiveStreamerUiState.Success
                    } else {
                        _addLiveStreamerUiState.value = AddLiveStreamerUiState.Error("Add failed")
                    }
                } else {
                    _addLiveStreamerUiState.value = AddLiveStreamerUiState.Error("User does not exist")
                }
            } catch (e: Exception) {
                _addLiveStreamerUiState.value =
                    AddLiveStreamerUiState.Error(e.message ?: "Unknown error")
            }
        }
    }

    fun deleteStreamer(streamer: StreamerForFansClub) {
        viewModelScope.launch {
            streamerDao.delete(streamer)
        }
    }

    fun updateStreamerOrder(reorderedStreamerForFansClubs: List<StreamerForFansClub>) {
        viewModelScope.launch {
            val updatedStreamers = reorderedStreamerForFansClubs.mapIndexed { index, streamer ->
                streamer.copy(displayOrder = index)
            }
            streamerDao.update(updatedStreamers)
        }
    }

    fun resetAddStreamerState() {
        _addLiveStreamerUiState.value = AddLiveStreamerUiState.Initial
    }
}

sealed class AddLiveStreamerUiState {
    object Initial : AddLiveStreamerUiState()
    object Loading : AddLiveStreamerUiState()
    object Success : AddLiveStreamerUiState()
    data class Error(val message: String) : AddLiveStreamerUiState()
}
