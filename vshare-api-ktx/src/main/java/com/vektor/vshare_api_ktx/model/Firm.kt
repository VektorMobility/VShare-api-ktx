package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Firm(@SerializedName("id")
                @Expose
                val id: Int?,
                @SerializedName("name")
                @Expose
                val name: String?
) : Serializable