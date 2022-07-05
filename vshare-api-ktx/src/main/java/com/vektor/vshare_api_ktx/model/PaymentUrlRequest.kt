package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class PaymentUrlRequest : Serializable {

    @SerializedName("rentalId")
    var rentalId: Long? = 0

    @SerializedName("paymentMethodId")
    var paymentMethodId: Int? = 0

}