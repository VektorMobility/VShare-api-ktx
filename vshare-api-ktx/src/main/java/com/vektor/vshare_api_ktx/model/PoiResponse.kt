package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import com.vektor.vshare_api_ktx.model.BaseResponse
import java.io.Serializable

class PoiResponse: BaseResponse(), Serializable {

    @SerializedName("identity")
    var identity: String? = null
    @SerializedName("latitude")
    var latitude: Double? = null
    @SerializedName("longitude")
    var longitude: Double? = null
    @SerializedName("name")
    var name: String? = null
    @SerializedName("address")
    var address: String? = null
}