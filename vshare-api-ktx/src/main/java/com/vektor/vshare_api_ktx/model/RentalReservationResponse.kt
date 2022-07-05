package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class RentalReservationResponse : Serializable {
    @SerializedName("replacementVehicleId")
    var replacementVehicleId : Int? = null
    @SerializedName("priceModelId")
    var priceModelId : Int? = null
}