package com.fuck.learn.data.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface StreamerForFansClubDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(streamerForFansClub: StreamerForFansClub): Long

    @Delete
    suspend fun delete(streamerForFansClub: StreamerForFansClub)

    @Update
    suspend fun update(streamerForFansClubs: List<StreamerForFansClub>)

    @Query("SELECT * FROM streamer_for_fan_club WHERE secUid = :secUid")
    suspend fun getStreamer(secUid: String): StreamerForFansClub?

    @Query("SELECT * FROM streamer_for_fan_club ORDER BY displayOrder ASC")
    fun getAllStreamers(): Flow<List<StreamerForFansClub>>

    @Query("SELECT secUid FROM streamer_for_fan_club ORDER BY displayOrder ASC")
    fun getAllSecUids(): Flow<List<String>>
}
