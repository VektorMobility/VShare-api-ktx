package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class PayDebtRequest: Serializable {

    @SerializedName("rentalId")
    var rentalId: Long? = null

    @SerializedName("paymentMethodId")
    var paymentMethodId: Int? = null

}
