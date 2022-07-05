package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class BuyKmPackageRequest: Serializable {

    @SerializedName("packageOfferExtensionId")
    var packageOfferExtensionId : Long? = null

    @SerializedName("paymentMethodId")
    var paymentMethodId : Int? = null
}