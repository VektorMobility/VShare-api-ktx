package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class PaymentCompleteModel : Serializable {

    @SerializedName("isPaymentDone")
    val isPaymentDone: Boolean? = null

    @SerializedName("payment3dReason")
    val payment3dReason: String? = null

    @SerializedName("isPaymentResponseCame")
    val isPaymentResponseCame: Boolean? = null

}