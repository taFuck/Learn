package com.fuck.learn.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

@Database(entities = [StreamerForLive::class, StreamerForFansClub::class, HistoryForFansClub::class, StreamerGroup::class], version = 7, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun streamerForLiveDao(): StreamerForLiveDao
    abstract fun streamerForFansClubDao(): StreamerForFansClubDao
    abstract fun historyForFansClubDao(): HistoryForFansClubDao
    abstract fun streamerGroupDao(): StreamerGroupDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "streamer_database"
                )
                .addMigrations(MIGRATION_1_2, MIGRATION_2_3, MIGRATION_3_4, MIGRATION_4_5, MIGRATION_5_6, MIGRATION_6_7)
                .build()
                INSTANCE = instance
                instance
            }
        }

        private val MIGRATION_1_2 = object : Migration(1, 2) {
            override fun migrate(db: SupportSQLiteDatabase) {
                db.execSQL("ALTER TABLE streamers ADD COLUMN displayOrder INTEGER NOT NULL DEFAULT 0")
            }
        }

        private val MIGRATION_2_3 = object : Migration(2, 3) {
            override fun migrate(db: SupportSQLiteDatabase) {
                db.execSQL("CREATE TABLE IF NOT EXISTS `history` (`nickname` TEXT NOT NULL, `url` TEXT NOT NULL, PRIMARY KEY(`url`))")
            }
        }

        private val MIGRATION_3_4 = object : Migration(3, 4) {
            override fun migrate(db: SupportSQLiteDatabase) {
                db.execSQL("ALTER TABLE streamers RENAME TO streamer_for_fan_club")
            }
        }

        private val MIGRATION_4_5 = object : Migration(4, 5) {
            override fun migrate(db: SupportSQLiteDatabase) {
                db.execSQL("ALTER TABLE history RENAME TO history_for_fan_club")
            }
        }

        private val MIGRATION_5_6 = object : Migration(5, 6) {
            override fun migrate(db: SupportSQLiteDatabase) {
                db.execSQL("CREATE TABLE IF NOT EXISTS `streamer_for_live` (`uid` TEXT NOT NULL, `secUid` TEXT NOT NULL, `nickname` TEXT NOT NULL, `avatarUrl` TEXT NOT NULL, `webRids` TEXT NOT NULL, `displayOrder` INTEGER NOT NULL, PRIMARY KEY(`uid`))")
            }
        }

        private val MIGRATION_6_7 = object : Migration(6, 7) {
            override fun migrate(db: SupportSQLiteDatabase) {

                db.execSQL("CREATE TABLE IF NOT EXISTS `streamer_group` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `displayOrder` INTEGER NOT NULL)")

                val cursor = db.query("SELECT COUNT(*) FROM streamer_for_fan_club")
                cursor.moveToFirst()
                val count = cursor.getInt(0)
                cursor.close()
                if (count > 0) {
                    db.execSQL("INSERT INTO `streamer_group` (`name`, `displayOrder`) VALUES ('List1', 0)")
                }

                db.execSQL("ALTER TABLE streamer_for_fan_club ADD COLUMN groupId INTEGER NOT NULL DEFAULT 1")
            }
        }
    }
}
