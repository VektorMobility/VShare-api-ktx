package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import com.vektor.vshare_api_ktx.model.BaseResponse
import com.vektor.vshare_api_ktx.model.LocationResponse
import java.io.Serializable

class ServiceAreaModel : Serializable, BaseResponse() {
    @SerializedName("name")
    var name: String? = null
    @SerializedName("identity")
    var identity: String? = null
    @SerializedName("locationList")
    var locationList: List<LocationResponse>? = null
    @SerializedName("polygonArray")
    private val polygonArray: List<List<Double>>? = null

}
