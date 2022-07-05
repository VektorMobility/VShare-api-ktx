package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Offer: Serializable {

    @SerializedName("id")
    var id: Int? = null

    @SerializedName("type")
    var type: String? = null

    @SerializedName("application")
    var application: String? = null

    @SerializedName("price")
    var price: Double? = null

    @SerializedName("benefit")
    var benefit: Double? = null

    @SerializedName("name")
    var name: String? = null

    @SerializedName("description")
    var description: String? = null

    @SerializedName("imageUrl")
    var imageUrl: String? = null

}