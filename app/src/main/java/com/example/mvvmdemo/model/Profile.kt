package com.example.mvvmdemo.model

import com.google.gson.annotations.SerializedName

data class Profile(
    @SerializedName("age")
    val age: Int = 0,
    @SerializedName("distance")
    val distance: Int = 0,
    @SerializedName("id")
    val id: Int = 0,
    @SerializedName("name")
    val name: String = "",
    @SerializedName("profile_pic")
    val profile_pic: String = ""
)