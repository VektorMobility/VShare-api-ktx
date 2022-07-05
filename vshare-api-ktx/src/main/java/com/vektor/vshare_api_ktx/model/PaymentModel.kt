package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class PaymentModel: Serializable {

    @SerializedName("id")
    var id: Int = 0

    @SerializedName("time")
    var time: String? = null

    @SerializedName("currency")
    var currency: String? = null

    @SerializedName("amount")
    var amount: Double? = null
}