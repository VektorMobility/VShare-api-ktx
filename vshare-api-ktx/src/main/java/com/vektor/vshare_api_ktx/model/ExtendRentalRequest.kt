package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ExtendRentalRequest: Serializable {

    @SerializedName("paymentMethodId")
    var paymentMethodId : Int? = null

    @SerializedName("numberOfDays")
    var numberOfDays : Int? = null

}