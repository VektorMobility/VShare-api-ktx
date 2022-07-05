package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class MernisRequest (
    @SerializedName("identityNumber")
    val identityNumber: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("surname")
    val surname: String,
    @SerializedName("birthDay")
    val birthDay: String,
    @SerializedName("birthMonth")
    val birthMonth: String,
    @SerializedName("birthYear")
    val birthYear: String
): Serializable
