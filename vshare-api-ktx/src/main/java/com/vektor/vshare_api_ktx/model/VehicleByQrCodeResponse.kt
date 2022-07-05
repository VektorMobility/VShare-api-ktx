package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class VehicleByQrCodeResponse : Serializable{

    @SerializedName("vehicleId")
    var vehicleId : Int? = null

    @SerializedName("vehicle")
    var vehicle: VehicleModel2? = null

    @SerializedName("assignedZone")
    val assignedZone: ServiceAreaZonesModel? = null
}