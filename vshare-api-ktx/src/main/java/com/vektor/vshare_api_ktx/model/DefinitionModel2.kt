package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class DefinitionModel2 : Serializable{

    @SerializedName("cacheVersion")
    var cacheVersion: String? = null

    @SerializedName("priceItems")
    var priceItems: List<PriceItemModel2>? = null

    @SerializedName("catalogItems")
    var catalogItems: List<CatalogItemModel2>? = null
}