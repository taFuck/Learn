package com.fuck.learn.data.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface StreamerForLiveDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(streamer: StreamerForLive): Long

    @Update
    suspend fun update(streamer: List<StreamerForLive>)

    @Delete
    suspend fun delete(streamer: StreamerForLive)

    @Query("SELECT * FROM streamer_for_live WHERE uid = :uid")
    suspend fun getStreamer(uid: String): StreamerForLive?

    @Query("SELECT * FROM streamer_for_live ORDER BY displayOrder ASC")
    fun getAllStreamers(): Flow<List<StreamerForLive>>

    @Query("SELECT * FROM streamer_for_live WHERE webRids != '' ORDER BY displayOrder ASC")
    fun getStreamersWithWebRids(): Flow<List<StreamerForLive>>
}
