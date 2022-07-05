package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class PoiRequest: Serializable {

    @SerializedName("latitude")
    var latitude: Double? = null
    @SerializedName("longitude")
    var longitude: Double? = null
    @SerializedName("type")
    var type: String? = null
}