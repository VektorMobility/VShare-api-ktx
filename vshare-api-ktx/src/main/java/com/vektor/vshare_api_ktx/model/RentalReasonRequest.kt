package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class RentalReasonRequest: Serializable {

    @SerializedName("reasonId")
    var reasonId: Long? = null

    @SerializedName("rentalId")
    var rentalId: Long? = null

    @SerializedName("freeText")
    var freeText: String? = null

    @SerializedName("imageUuids")
    var imageUuids: String? = null
}