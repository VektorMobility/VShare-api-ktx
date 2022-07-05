package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName

data class MultiRatingRequest(
    @SerializedName("ratings")
    var ratings: List<RatingModel>? = null
)