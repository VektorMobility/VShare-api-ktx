package com.vektor.vshare_api_ktx.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

class RegisterResponse: Serializable {

    @SerializedName("result")
    var result: String? = null

    @SerializedName("error")
    var error: ErrorModel? = null

    @SerializedName("sessionToken")
    var sessionToken: String? = null

    @SerializedName("otpToken")
    var otpToken: String? = null

    @SerializedName("data")
    var data: Data? = null

    inner class Data: Serializable {
        @SerializedName("validUntil")
        var validUntil: String? = null
        @SerializedName("username")
        var username: String? = null
        @SerializedName("email")
        var email: String? = null
        @SerializedName("name")
        var name: String? = null
        @SerializedName("surname")
        var surname: String? = null
        @SerializedName("applicationName")
        var applicationName: String? = null
        @SerializedName("token")
        var token: String? = null
        @SerializedName("accountId")
        var accountId: Int? = null
        @SerializedName("scopes")
        var scopes: List<Any>? = null
        @SerializedName("mobile")
        var mobile: String? = null
        @SerializedName("fullName")
        var fullName: String? = null
    }
}
