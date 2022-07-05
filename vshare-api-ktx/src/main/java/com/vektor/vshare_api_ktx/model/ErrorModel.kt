package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ErrorModel: Serializable {
    @SerializedName("code")
    var code: String? = null

    @SerializedName("message")
    var message: String? = null
}
