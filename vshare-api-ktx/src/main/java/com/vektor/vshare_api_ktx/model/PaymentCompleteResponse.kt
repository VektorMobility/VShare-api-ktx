package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import com.vektor.vshare_api_ktx.model.PaymentCompleteModel
import java.io.Serializable

class PaymentCompleteResponse : Serializable {

    @SerializedName("result")
    val result: String? = null

    @SerializedName("data")
    val data: PaymentCompleteModel? = null

}
