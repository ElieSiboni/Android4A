package com.example.android4a.data.local.models

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(
    UserLocal::class
), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun databaseDao(): DatabaseDao
}