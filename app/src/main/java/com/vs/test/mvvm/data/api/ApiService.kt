package com.vs.test.mvvm.data.api

import com.vs.test.mvvm.data.model.User
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getUsers(): Response<List<User>>
}