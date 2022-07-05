package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class DailyPaymentRequest: Serializable {

    @SerializedName("priceModelId")
    var priceModelId : Int? = null

    @SerializedName("numberOfDays")
    var numberOfDays : Int? = null

    @SerializedName("packageOfferExtensionId")
    var packageOfferExtensionId : Long? = null

    @SerializedName("rentalType")
    var rentalType : String? = null
}