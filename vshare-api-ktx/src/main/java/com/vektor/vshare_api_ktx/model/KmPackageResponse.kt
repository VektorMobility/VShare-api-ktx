package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class KmPackageResponse: Serializable {

    @SerializedName("packageOfferExtensionId")
    var packageOfferExtensionId: Long? = null

    @SerializedName("packageOfferName")
    var packageOfferName: String? = null

    @SerializedName("packageOfferType")
    var packageOfferType: String? = null

    @SerializedName("packageOfferPrice")
    var packageOfferPrice: Double? = null

    @SerializedName("packageOfferValue")
    var packageOfferValue: Double? = null

    var isSelected : Boolean = false

}