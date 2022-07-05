package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ExtraParametersModel: Serializable {

    @SerializedName("minPhotoCount")
    var minPhotoCount: Int? = null

    @SerializedName("maxPhotoCount")
    var maxPhotoCount: Int? = null

    @SerializedName("isPhotoRequired")
    var isPhotoRequired: Boolean? = null

    @SerializedName("freeTextRequired")
    var freeTextRequired: Boolean? = null

    @SerializedName("photoOrTextRequired")
    var photoOrTextRequired: Boolean? = null

    @SerializedName("isPhotoOptional")
    var isPhotoOptional: Boolean? = null

    @SerializedName("description")
    var description: String? = null

    @SerializedName("type")
    var type: String? = null

   @SerializedName("placeHolder")
    var placeHolder: String? = null

    @SerializedName("tooltip")
    var tooltip: String? = null
}