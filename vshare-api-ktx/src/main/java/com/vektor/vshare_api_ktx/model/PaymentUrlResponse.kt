package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class PaymentUrlResponse : Serializable {

    @SerializedName("paymentUrl")
    val paymentUrl: String? = null

    @SerializedName("merchantPaymentId")
    val merchantPaymentId: String? = null

    @SerializedName("paymentId")
    val paymentId: Long? = null
}