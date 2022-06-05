package com.example.roomapp.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.roomapp.model.User

@Dao
interface DataDao {

    @Insert
    suspend fun addUser(user: User)

    @Query("SELECT * FROM data_table ORDER BY Date ASC")
    fun readAllData(): LiveData<List<User>>
}