package com.example.emply

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class LoginUserClass (
    @Expose
    @SerializedName("success") val success: Int,

    @Expose
    @SerializedName("userid") val userid: Int,

    @Expose
    @SerializedName("username") val username: String,

    @Expose
    @SerializedName("role") val role: Int) {}