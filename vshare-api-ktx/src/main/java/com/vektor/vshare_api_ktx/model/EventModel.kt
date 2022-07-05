package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class EventModel: Serializable {

    @SerializedName("id")
    var id: Int = 0

    @SerializedName("ownerId")
    var ownerId: Int = 0

    @SerializedName("userId")
    var userId: Int = 0

    @SerializedName("userMessage")
    var userMessage: String? = null

    @SerializedName("creationTime")
    var creationTime: String? = null

    @SerializedName("messageReadTime")
    var messageReadTime: String? = null

    @SerializedName("isMessageRead")
    var isMessageRead: Boolean? = null

    @SerializedName("category")
    var category: String? = null

    @SerializedName("name")
    var name: String? = null

    @SerializedName("messageType")
    var messageType: String? = null

}