package com.example.emply

import retrofit2.Call
import retrofit2.http.GET

interface ApplicationAPI {
    @GET("/jobs")
    fun getApplications(): Call<List<ApplicationClass>>
}