package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class PayDebtBalanceRequest(
    @SerializedName("paymentMethodId")
    var paymentMethodId: Int,
    @SerializedName("test")
    var test: Boolean) : Serializable
