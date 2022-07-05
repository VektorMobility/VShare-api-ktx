package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class CampaignResponse : Serializable {

    @SerializedName("id")
    var id: Int? = null

    @SerializedName("name")
    val name: String? = null

    @SerializedName("type")
    val type: String? = null

    @SerializedName("title")
    val title: String? = null

    @SerializedName("description")
    val description: String? = null

    @SerializedName("imageUrl")
    val imageUrl: String? = null

    @SerializedName("linkType")
    val linkType: String? = null

    @SerializedName("campaignCode")
    val campaignCode: String? = null

}