package com.example.emply

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

interface UserAPI {

    @GET("login/{username}/{password}")
    fun userLogin(
        @Path("username") username: String,
        @Path("password") password: String
    ): Call<LoginUserClass>

    companion object
    {
        fun create():UserAPI {
            val userClient : UserAPI = Retrofit.Builder()
                .baseUrl("http://10.0.2.2:3000/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(UserAPI::class.java)
            return userClient
        }
    }
}