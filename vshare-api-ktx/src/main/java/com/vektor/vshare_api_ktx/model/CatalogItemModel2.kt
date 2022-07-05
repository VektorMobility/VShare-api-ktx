package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class CatalogItemModel2 : Serializable {

    @SerializedName("id")
    var id: Int? = null

    @SerializedName("make")
    var make: String? = null

    @SerializedName("model")
    var model: String? = null

    @SerializedName("description")
    var description: String? = null

    @SerializedName("fuelType")
    var fuelType: String? = null

    @SerializedName("transmissionType")
    var transmissionType: String? = null

    @SerializedName("bodyType")
    var bodyType: String? = null

    @SerializedName("imageName")
    var imageName: String? = null

    @SerializedName("imageUuid")
    var imageUuid: String? = null

    @SerializedName("modelYear")
    var modelYear: Int? = null

}