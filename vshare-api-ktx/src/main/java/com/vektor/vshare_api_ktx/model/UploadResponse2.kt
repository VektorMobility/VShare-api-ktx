package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class UploadResponse2: Serializable {

    @SerializedName("response")
    var response: ResponseBean? = null

    @SerializedName("error")
    var error: String? = null

    inner class ResponseBean: Serializable {
        @SerializedName("fileUuid")
        var fileUuid: String? = null

        @SerializedName("fileUuids")
        var fileUuids: ArrayList<String>? = null
    }

}