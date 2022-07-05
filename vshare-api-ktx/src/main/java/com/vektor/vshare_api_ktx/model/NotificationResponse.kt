package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class NotificationResponse: Serializable {

    @SerializedName("id")
    var id: Int? = null

    @SerializedName("ownerId")
    var ownerId: Int? = null

    @SerializedName("userId")
    var userId: Int? = null

    @SerializedName("creationTime")
    var creationTime: String? = null

    @SerializedName("userMessage")
    var userMessage: String? = null

    @SerializedName("messageReadTime")
    var messageReadTime: String? = null

    @SerializedName("isMessageRead")
    var isMessageRead: Boolean? = null

    @SerializedName("category")
    var category: String? = null

    @SerializedName("name")
    var name: String? = null

    var isExpanded: Boolean = false
}