package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class DistanceModel2 : Serializable{

    @SerializedName("distanceInMeters")
    var distanceInMeters: Int? = null

    @SerializedName("durationInSeconds")
    var durationInSeconds: Int? = null

    @SerializedName("durationText")
    var durationText: String? = null

}