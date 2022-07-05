package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class PaymentBreakDownModel(
    @SerializedName("bonusAccountAmount")
    val bonusAccountAmount: Double?,
    @SerializedName("normalAccountAmount")
    val normalAccountAmount: Double?,
    @SerializedName("creditCardAmount")
    val creditCardAmount: Double?
): Serializable