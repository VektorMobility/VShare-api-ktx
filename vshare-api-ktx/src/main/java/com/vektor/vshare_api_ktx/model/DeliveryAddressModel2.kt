package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class DeliveryAddressModel2: Serializable {

    @SerializedName("id")
    var id : Int? = null

    @SerializedName("latitude")
    var latitude: Double = 0.toDouble()

    @SerializedName("longitude")
    var longitude: Double = 0.toDouble()

    @SerializedName("address")
    var address: String? = null

    @SerializedName("district")
    var district: String? = null

    @SerializedName("city")
    var city: String? = null

    @SerializedName("districtCode")
    var districtCode: String? = null

    @SerializedName("continent")
    var continent: String? = null

    @SerializedName("coordinatesString")
    var coordinatesString: String? = null


}