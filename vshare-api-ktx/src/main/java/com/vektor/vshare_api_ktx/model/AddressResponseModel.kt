package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName

data class AddressResponseModel(

        @SerializedName("addressLine")
        var addressLine: String? = null,

        @SerializedName("district")
        var district: String? = null,

        @SerializedName("city")
        var city: String? = null,

        @SerializedName("addressType")
        var addressType: String? = null

)