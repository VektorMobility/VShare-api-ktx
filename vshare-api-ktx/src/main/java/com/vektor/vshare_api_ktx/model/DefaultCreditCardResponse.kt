package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import com.vektor.vshare_api_ktx.model.CreditCardResponse
import java.io.Serializable

class DefaultCreditCardResponse: Serializable {

    @SerializedName("data")
    var defaultCreditCard: CreditCardResponse? = null

}