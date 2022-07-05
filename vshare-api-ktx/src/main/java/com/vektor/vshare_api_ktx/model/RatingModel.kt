package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName

data class RatingModel (
    @SerializedName("rentalId")
    var rentalId: Long = 0,
    @SerializedName("description")
    var description: String? = null,
    @SerializedName("rating")
    var rating: String? = null,
    @SerializedName("type")
    var type: String? = null
)