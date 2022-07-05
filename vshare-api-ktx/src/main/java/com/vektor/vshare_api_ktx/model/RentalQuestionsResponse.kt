package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class RentalQuestionsResponse: Serializable {

    @SerializedName("id")
    var id: Long = 0
    @SerializedName("question")
    var question: String = ""
    @SerializedName("popupText")
    var popupText: String? = null

    @SerializedName("isMandatory")
    var isMandatory: Boolean? = null

    @Expose(serialize = false, deserialize = false)
    var isChecked: Boolean? = null
}