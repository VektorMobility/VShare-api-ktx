package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class DocumentRequest: Serializable {
    /*
     *   documentType : DRIVING_LICENSE, IDENTITY, PASSPORT, DIGITAL_AGREEMENT
     *   referenceID: dokümanın ilişkili olduğu obje id'si. bu senaryo için bu da account id olacak
     * */
    @SerializedName("documentType")
    var documentType: String? = null

    @SerializedName("referenceId")
    var referenceId: Long? = null

    @SerializedName("photoUuid1")
    var photoUuid1: String? = null

    @SerializedName("photoUuid2")
    var photoUuid2: String? = null

    @SerializedName("photoUuid3")
    var photoUuid3: String? = null

    @SerializedName("videoUuid1")
    var videoUuid1: String? = null

    @SerializedName("documentNumber")
    var documentNumber: String? = null

    @SerializedName("identityNumber")
    var identityNumber: String? = null

    @SerializedName("issueDate")
    var issueDate: String? = null

    @SerializedName("validUntil")
    var validUntil: String? = null

    @SerializedName("issuedBy")
    var issuedBy: String? = null

    @SerializedName("version")
    var version: Int? = null

}