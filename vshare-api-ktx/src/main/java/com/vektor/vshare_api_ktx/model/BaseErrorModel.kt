package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

open class BaseErrorModel: Serializable {

    @SerializedName("error")
    var error: Error? = null

    inner class Error {
        @SerializedName("desc")
        var desc: String? = null

        @SerializedName("code")
        var code: String? = null

        @SerializedName("errorId")
        var errorId: Int? = null

        @SerializedName("message")
        var message: String? = null
    }
}
