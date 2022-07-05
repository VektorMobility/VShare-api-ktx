package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class FaqQuestionModel : Serializable {

    @SerializedName("question")
    var question: String? = null

    @SerializedName("answer")
    var answer: String? = null
}