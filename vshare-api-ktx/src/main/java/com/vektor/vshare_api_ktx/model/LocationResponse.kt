package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class LocationResponse : Serializable{
    @SerializedName("address")
    var address: String? = null
    @SerializedName("latitude")
    var latitude: Double? = null
    @SerializedName("longitude")
    var longitude: Double? = null
}
