package com.fuck.learn.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "history_for_fan_club")
data class HistoryForFansClub(
    @PrimaryKey
    val url: String,
    val nickname: String
)
