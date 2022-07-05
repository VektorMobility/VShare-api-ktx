package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class RadarResponse: Serializable {

    @SerializedName("expireTime")
    var expireTime: String? = null

    @SerializedName("radarLocation")
    var radarLocation: RadarLocation? = null

    @SerializedName("creationTime")
    var creationTime: String? = null

    @SerializedName("startTime")
    var startTime: String? = null

    @SerializedName("radius")
    var radius: Int? = null


}