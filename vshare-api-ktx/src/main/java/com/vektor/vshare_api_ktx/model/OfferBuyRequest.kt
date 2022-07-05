package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class OfferBuyRequest: Serializable {

    @SerializedName("paymentMethodId")
    var paymentMethodId: Int? = null

    @SerializedName("offerId")
    var offerId: Int? = null
}