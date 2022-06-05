package com.example.roomapp.repository

import androidx.lifecycle.LiveData
import com.example.roomapp.data.DataDao
import com.example.roomapp.model.User

class UserRepository(private val dataDao: DataDao) {
    val readAllData: LiveData<List<User>> = dataDao.readAllData()

    suspend fun addUser(user: User){
        dataDao.addUser(user)
    }
}