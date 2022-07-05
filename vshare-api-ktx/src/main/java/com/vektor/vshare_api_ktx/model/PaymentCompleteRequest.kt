package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class PaymentCompleteRequest(

        @SerializedName("paymentMethodId")
        var paymentMethodId: Int? = 0,

        @SerializedName("merchantPaymentId")
        var merchantPaymentId: String? = null,

        @SerializedName("payment3dReason")
        var payment3dReason: String? = null

): Serializable
