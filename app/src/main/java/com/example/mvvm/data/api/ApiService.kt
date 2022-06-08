package com.example.mvvm.data.api

import com.example.mvvm.data.model.User
import io.reactivex.Single

interface ApiService {
    fun getUsers(): Single<List<User>>
}