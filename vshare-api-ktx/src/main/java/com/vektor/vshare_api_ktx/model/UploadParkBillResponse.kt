package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class UploadParkBillResponse: Serializable {

    @SerializedName("rentalId")
    var rentalId: Long? = null

    @SerializedName("comment")
    var comment: String = String()

    @SerializedName("invoicePhotoUuid")
    var invoicePhotoUuid: MutableList<String> = mutableListOf()


}