package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class NotificationCountResponse: Serializable {

    @SerializedName("result")
    var result: String? = null

    @SerializedName("data")
    var data: Int? = null
}