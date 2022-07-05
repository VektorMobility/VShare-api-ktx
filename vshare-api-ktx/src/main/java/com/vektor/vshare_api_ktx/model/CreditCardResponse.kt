package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import com.vektor.vshare_api_ktx.model.BaseResponse
import java.io.Serializable

class CreditCardResponse : BaseResponse(), Serializable {

    @SerializedName("id")
    var id: Int = 0

    @SerializedName("userId")
    var userId: Int = 0

    @SerializedName("name")
    var name: String? = null

    @SerializedName("description")
    var description: String? = null

    @SerializedName("providerReference")
    var providerReference: String? = null

    @SerializedName("isActive")
    var isActive: Boolean? = null

    @SerializedName("paymentMethodType")
    var paymentMethodType: String? = null

    @SerializedName("approvedInfoIsCorrect")
    var approvedInfoIsCorrect: Boolean = false

    @SerializedName("is3DValidated")
    var is3DValidated: Boolean = false
}