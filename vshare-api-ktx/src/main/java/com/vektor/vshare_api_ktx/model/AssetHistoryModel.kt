package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class AssetHistoryModel : Serializable {

    @SerializedName("id")
    var id: Long = 0

    @SerializedName("eventTimestamp")
    var eventtimestamp: Long = 0

    @SerializedName("assetIdentity")
    var assetIdentity: String? = null

    @SerializedName("identity")
    var identity: String? = null

    @SerializedName("speed")
    var speed: Int = 0

    @SerializedName("direction")
    var direction: Int = 0

    @SerializedName("address")
    var address: String? = null

    @SerializedName("longitude")
    var longitude: Double = 0.toDouble()

    @SerializedName("latitude")
    var latitude: Double = 0.toDouble()

    @SerializedName("anumericAttribute2")
    var anumericattribute2: String? = null

}