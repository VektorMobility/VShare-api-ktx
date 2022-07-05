package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class DocumentResponse: Serializable {

    @SerializedName("uuid")
    var uuid: String? = null

    @SerializedName("documentType")
    var documentType: String? = null

    @SerializedName("documentStatus")
    var documentStatus: String? = null

    @SerializedName("ownerAccountId")
    var ownerAccountId: Long? = null

    @SerializedName("referenceId")
    var referenceId: Long? = null

    @SerializedName("photoUuid1")
    var photoUuid1: String? = null

    @SerializedName("photoUuid2")
    var photoUuid2: String? = null

    @SerializedName("documentNumber")
    var documentNumber: String? = null

    @SerializedName("issueDate")
    var issueDate: String? = null

    @SerializedName("issuedBy")
    var issuedBy: String? = null

}