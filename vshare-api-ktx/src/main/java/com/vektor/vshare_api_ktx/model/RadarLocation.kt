package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class RadarLocation: Serializable {

    @SerializedName("id")
    var id: Long? = null

    @SerializedName("latitude")
    var latitude: Double? = null

    @SerializedName("longitude")
    var longitude: Double? = null

    @SerializedName("address")
    var address: String? = null

    @SerializedName("district")
    var district: String? = null

    @SerializedName("city")
    var city: String? = null

    @SerializedName("coordinatesString")
    var coordinatesString: String? = null

}