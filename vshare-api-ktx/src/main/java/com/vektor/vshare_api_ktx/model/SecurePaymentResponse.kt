package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import com.vektor.vshare_api_ktx.model.PaymentUrlResponse
import java.io.Serializable

class SecurePaymentResponse : Serializable {

    @SerializedName("result")
    val result: String? = null

    @SerializedName("data")
    val data: PaymentUrlResponse? = null
}