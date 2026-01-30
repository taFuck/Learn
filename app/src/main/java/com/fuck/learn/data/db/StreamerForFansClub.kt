package com.fuck.learn.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "streamer_for_fan_club")
data class StreamerForFansClub(
    @PrimaryKey
    val secUid: String,
    val nickname: String,
    val avatarUrl: String,
    val displayOrder: Int
)
