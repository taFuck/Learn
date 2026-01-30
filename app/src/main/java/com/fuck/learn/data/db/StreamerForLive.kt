package com.fuck.learn.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "streamer_for_live")
data class StreamerForLive(
    @PrimaryKey
    val uid: String,
    val secUid: String,
    val nickname: String,
    val avatarUrl: String,
    val webRids: String,
    val displayOrder: Int
)
