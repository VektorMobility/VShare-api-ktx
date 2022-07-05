package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class TripModel : Serializable {

    @SerializedName("brakeCount")
    var brakeCount: Long? = null
    @SerializedName("corneringExCount")
    var corneringExCount: Long? = null
    @SerializedName("accExCount")
    var accExCount: Long? = null
    @SerializedName("speedExCount")
    var speedExCount: Long? = null
    @SerializedName("idling")
    var idling: Long? = null
    @SerializedName("duration")
    var duration: Long? = null
}