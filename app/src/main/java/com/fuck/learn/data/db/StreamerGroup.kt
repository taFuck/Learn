package com.fuck.learn.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "streamer_group")
data class StreamerGroup(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val name: String,
    val displayOrder: Int
)
