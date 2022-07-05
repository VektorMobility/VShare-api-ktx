package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class VersionResponse: Serializable {

    @SerializedName("response")
    var response: Response? = null
    @SerializedName("error")
    var error: String? = null

    class Response: Serializable {
        @SerializedName("version")
        var version: String? = null

        @SerializedName("forceVersion")
        var forceVersion: String? = null

        @SerializedName("latestVersion")
        var latestVersion: String? = null
    }
}