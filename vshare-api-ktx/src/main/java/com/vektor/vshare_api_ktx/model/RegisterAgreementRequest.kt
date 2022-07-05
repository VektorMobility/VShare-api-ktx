package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName

data class RegisterAgreementRequest(
    @SerializedName("customerName")
    val customerName: String? = null,
    @SerializedName("mobile")
    val mobile: String? = null,
    @SerializedName("email")
    val email: String? = null,
    @SerializedName("address")
    val address: String? = null,
    @SerializedName("city")
    val city: String? = null,
    @SerializedName("district")
    val district: String? = null,
    @SerializedName("workAddress")
    val workAddress: String? = null,
    @SerializedName("workAddressCity")
    val workAddressCity: String? = null,
    @SerializedName("workAddressDistrict")
    val workAddressDistrict: String? = null
)