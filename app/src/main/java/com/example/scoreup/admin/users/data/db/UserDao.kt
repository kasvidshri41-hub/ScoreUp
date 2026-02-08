package com.example.scoreup.data.db

import androidx.room.Dao
import androidx.room.Query
import com.example.scoreup.admin.users.data.model.User

@Dao
interface UserDao {

    @Query(
        "SELECT * FROM User WHERE username=:u AND password=:p AND role=:r LIMIT 1"
    )
    suspend fun login(u: String, p: String, r: String): User?
}
