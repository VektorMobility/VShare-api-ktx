package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.vektor.vshare_api_ktx.model.ExtraParametersModel
import java.io.Serializable

class RentalReasonResponse: Serializable {

    @SerializedName("id")
    var id: Long? = null

    @SerializedName("text")
    var text: String? = null

    @SerializedName("isFreeText")
    var isFreeText: Boolean? = null

    @SerializedName("extraParameters")
    var extraParameters: ExtraParametersModel? = null

    @Expose(serialize = false, deserialize = false)
    var isChecked: Boolean? = null

    @SerializedName("freeText")
    var freeText: String? = null

    @Expose
    var imageUuids: ArrayList<String> = ArrayList()
}