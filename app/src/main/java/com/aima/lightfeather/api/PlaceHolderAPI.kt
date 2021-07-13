package com.aima.lightfeather.api


import com.aima.lightfeather.models.User
import retrofit2.Call
import retrofit2.http.GET

interface PlaceHolderAPI {

    @GET("users")

        fun getUsers(): Call<List<User>>
}