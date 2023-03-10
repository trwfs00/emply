package com.example.emply

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface RoleAPI {
    @GET("allrole")
    fun retrieveRole(): Call<List<RoleClass>>

    @FormUrlEncoded
    @POST("register")
    fun insertRole(
        @Field("username") username: String,
        @Field("password") password: String,
        @Field("role") role: Int
    ): Call<RoleClass>
}