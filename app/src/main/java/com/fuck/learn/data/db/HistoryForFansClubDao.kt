package com.fuck.learn.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface HistoryForFansClubDao {
    @Query("SELECT * FROM history_for_fan_club ORDER BY rowid DESC")
    fun getHistory(): Flow<List<HistoryForFansClub>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(history: HistoryForFansClub)

    @Query("DELETE FROM history_for_fan_club WHERE url = :url")
    suspend fun delete(url: String)
}
