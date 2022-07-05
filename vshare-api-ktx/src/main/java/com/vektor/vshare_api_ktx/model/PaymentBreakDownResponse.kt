package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class PaymentBreakDownResponse(
    @SerializedName("billInfo")
    val billInfo: BillInfoModel?,
    @SerializedName("paymentBreakDown")
    val paymentBreakDown: PaymentBreakDownModel?,
    @SerializedName("billingItems")
    val billingItems: List<PriceItemModel>? = null
): Serializable