package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable


class RentalZone : Serializable {

    @SerializedName("id")
     val id: Int? = null

    @SerializedName("type")
     val type: String? = null

    @SerializedName("name")
     val name: String? = null

    @SerializedName("iconLocation")
     val iconLocation: IconLocation? = null



    inner class IconLocation: Serializable {
        @SerializedName("id")
        val id: Int? = null
        @SerializedName("latitude")
        val latitude: Double? = null
        @SerializedName("longitude")
        val longitude: Double? = null
        @SerializedName("address")
        val address: String? = null
    }
}
