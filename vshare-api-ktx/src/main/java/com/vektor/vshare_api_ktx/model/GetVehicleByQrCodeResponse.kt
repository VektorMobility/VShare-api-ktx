package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class GetVehicleByQrCodeResponse : Serializable {

    @SerializedName("vehicleId")
    var vehicleId : Int? = null
}