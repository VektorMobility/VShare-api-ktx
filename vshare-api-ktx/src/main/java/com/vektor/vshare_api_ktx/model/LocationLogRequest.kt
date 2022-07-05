package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class LocationLogRequest: Serializable {

    @SerializedName("latitude")
    var latitude : Double? = null

    @SerializedName("longitude")
    var longitude : Double? = null

    @SerializedName("deviceId")
    var deviceId : String? = null

    @SerializedName("uniqueAppId")
    var uniqueAppId : String? = null
}