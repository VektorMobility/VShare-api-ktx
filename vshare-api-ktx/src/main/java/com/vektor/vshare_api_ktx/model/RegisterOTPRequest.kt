package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class RegisterOTPRequest : Serializable {
    @SerializedName("providerType")
    var providerType: String? = null

    @SerializedName("scope")
    var scope: String? = null

    @SerializedName("application")
    var application: String? = null

    @SerializedName("action")
    var action: String? = null

    @SerializedName("otp")
    var otp: String? = null

    @SerializedName("otpToken")
    var otpToken: String? = null
}

