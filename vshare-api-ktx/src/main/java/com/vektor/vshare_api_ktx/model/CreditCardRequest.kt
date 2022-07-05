package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class CreditCardRequest: Serializable {

    @SerializedName("cardPan")
    var cardPan: String? = null

    @SerializedName("expireMonth")
    var expireMonth: Int? = null

    @SerializedName("expireYear")
    var expireYear: Int? = null

    @SerializedName("nameOnCard")
    var nameOnCard: String? = null

    @SerializedName("cardName")
    var cardName: String? = null

    @SerializedName("cvc")
    var cvc: String? = null

    @SerializedName("paymentMethodId")
    var paymentMethodId: Int? = null

    @SerializedName("approvedInfoIsCorrect")
    var approvedInfoIsCorrect: Boolean? = null
}