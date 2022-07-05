package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class VehicleCardItemModel2 : Serializable {

    @SerializedName("explanation")
    var explanation: String? = null

    @SerializedName("originalCost")
    var originalCost: Double? = null

    @SerializedName("finalCost")
    var finalCost: Double? = null

    @SerializedName("unitCode")
    var unitCode: String? = null

}