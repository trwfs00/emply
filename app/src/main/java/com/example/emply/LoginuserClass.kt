package com.example.emply

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class LoginuserClass(
    @Expose
    @SerializedName("success") val success: Int,

    @Expose
    @SerializedName("userid") val userid: Int,

    @Expose
    @SerializedName("userrole") val userrole: Int,

    @Expose
    @SerializedName("username") val username: String,

    @Expose
    @SerializedName("password") val password: String,
) {}
