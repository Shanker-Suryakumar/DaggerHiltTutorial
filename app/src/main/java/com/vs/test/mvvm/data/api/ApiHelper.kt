package com.vs.test.mvvm.data.api

import com.vs.test.mvvm.data.model.User
import retrofit2.Response

interface ApiHelper {
    suspend fun getUsers(): Response<List<User>>
}