package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ErrorLogRequest: Serializable {

    @SerializedName("url")
    var url : String? = null

    @SerializedName("body")
    var body : String? = null

    @SerializedName("response")
    var response : String? = null
}