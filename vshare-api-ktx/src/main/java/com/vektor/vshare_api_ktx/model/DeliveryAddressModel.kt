package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class DeliveryAddressModel: Serializable {

    @SerializedName("longitude")
    var longitude: Double = 0.toDouble()

    @SerializedName("latitude")
    var latitude: Double = 0.toDouble()

    @SerializedName("address")
    var address: String? = null

    @SerializedName("minutes")
    var minutes: Long? = null

    @SerializedName("direction")
    var direction: Int? = null

    @SerializedName("eta")
    var eta: String? = null

    @SerializedName("outOfServiceArea")
    var outOfServiceArea: Boolean? = null
}
