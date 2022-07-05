package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class PoiChargingStationsResponse: BaseResponse(), Serializable {

    @SerializedName("cacheVersion")
    var cacheVersion: String? = null

        @SerializedName("pois")
        var pois: List<PoiResponse>? = null
}