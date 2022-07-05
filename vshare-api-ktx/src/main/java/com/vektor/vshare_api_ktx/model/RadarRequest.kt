package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName

class RadarRequest {

    @SerializedName("startTime")
    var startTime: String? = null

    @SerializedName("validTimeInMin")
    var validTimeInMin: Int? = null

    @SerializedName("radius")
    var radius: Int? = null

    @SerializedName("latitude")
    var latitude: Double? = null

    @SerializedName("longitude")
    var longitude: Double? = null

}