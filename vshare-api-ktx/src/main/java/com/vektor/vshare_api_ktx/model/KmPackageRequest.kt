package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class KmPackageRequest: Serializable {

    @SerializedName("rentalType")
    var rentalType: String? = null

    @SerializedName("priceName")
    var priceName: String? = null

    @SerializedName("priceCatalogId")
    var priceCatalogId: Int? = null

    @SerializedName("priceModelId")
    var priceModelId: Int? = null

}