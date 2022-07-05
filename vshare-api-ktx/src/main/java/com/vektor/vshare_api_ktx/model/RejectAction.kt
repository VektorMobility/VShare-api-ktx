package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class RejectAction(
        @SerializedName("actionDescription")
        var actionDescription: String? = null,
        @SerializedName("actionType")
        var actionType: String? = null
) : Serializable