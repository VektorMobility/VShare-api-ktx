package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class FaqListResponse: Serializable {

    @SerializedName("category")
    var category: String? = null

    @SerializedName("questions")
    var questions: List<FaqQuestionModel>? = null
}