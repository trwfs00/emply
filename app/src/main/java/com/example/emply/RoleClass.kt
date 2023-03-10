package com.example.emply

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class RoleClass(
    @Expose
    @SerializedName("username") val username: String,

    @Expose
    @SerializedName("password") val password: String,

    @Expose
    @SerializedName("role") val role: Int
)
