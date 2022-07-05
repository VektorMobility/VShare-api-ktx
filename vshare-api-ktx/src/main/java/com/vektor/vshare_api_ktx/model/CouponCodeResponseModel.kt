package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class CouponCodeResponseModel (
        @SerializedName("response")
        val response: CouponCodeResponse
): Serializable

data class CouponCodeResponse(
        @SerializedName("discountRatio")
        val discountRatio: Double,
        @SerializedName("isValid")
        val isValid: Boolean,
        @SerializedName("errorMessage")
        val errorMessage: String?,
        @SerializedName("campaignDescription")
        val campaignDescription: String?,
        @SerializedName("campaignText")
        val campaignText: String?
): Serializable