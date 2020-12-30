package com.example.android4a.data.local.models

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface DatabaseDao {
    @Query("SELECT * FROM UserLocal")
    fun getAll(): List<UserLocal>

    @Query("SELECT * FROM UserLocal WHERE email LIKE :email LIMIT 1" )
    fun findByName(email: String): UserLocal

    @Insert
    fun insert(user: UserLocal)

    @Delete
    fun delete(user: UserLocal)
}