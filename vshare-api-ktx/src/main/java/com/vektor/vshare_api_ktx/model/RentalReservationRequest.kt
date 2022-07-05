package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class RentalReservationRequest : Serializable{

    @SerializedName("vehicleId")
    var vehicleId : Int? = null;

    @SerializedName("rentalType")
    var rentalType : RentalType? = null

}