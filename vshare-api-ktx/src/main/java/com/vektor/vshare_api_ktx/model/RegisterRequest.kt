package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class RegisterRequest: Serializable {

    @SerializedName("sub")
    public var sub: String? = null

    @SerializedName("accessToken")
    var accessToken: String? = null

    @SerializedName("birthDate")
    var birthDate: String? = null

    @SerializedName("passportNumber")
    var passportNumber: String? = null

    @SerializedName("nationality")
    var nationality: String? = null

    @SerializedName("countryEntryDate")
    var countryEntryDate: String? = null

    @SerializedName("preferredLanguage")
    var preferredLanguage: String? = null

    @SerializedName("parkId")
    var parkId: Int? = null

    @SerializedName("addressLine")
    var addressLine: String? = null

    @SerializedName("district")
    var district: String? = null

    @SerializedName("city")
    var city: String? = null

    @SerializedName("addressType")
    var addressType: String? = null


}