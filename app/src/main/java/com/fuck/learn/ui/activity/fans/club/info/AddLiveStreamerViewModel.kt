package com.fuck.learn.ui.activity.fans.club.info

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.fuck.learn.R
import com.fuck.learn.api.RetrofitClient
import com.fuck.learn.data.db.AppDatabase
import com.fuck.learn.data.db.StreamerForFansClub
import com.fuck.learn.utils.DouyinParamUtils
import com.fuck.learn.utils.DouyinUrlUtils
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class AddLiveStreamerViewModel(application: Application) : AndroidViewModel(application) {

    private val streamerDao = AppDatabase.getDatabase(application).streamerForFansClubDao()

    val streamers: StateFlow<List<StreamerForFansClub>> =
        streamerDao.getAllStreamers().stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    private val _addLiveStreamerUiState =
        MutableStateFlow<AddLiveStreamerUiState>(AddLiveStreamerUiState.Initial)
    val addLiveStreamerUiState: StateFlow<AddLiveStreamerUiState> =
        _addLiveStreamerUiState.asStateFlow()

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
                        displayOrder = maxOrder + 1
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
//            Log.e("SJ", "updateStreamerOrder")
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
