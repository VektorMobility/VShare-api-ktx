package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ServiceAreaZonesModel :Serializable, BaseResponse() {
    @SerializedName("id")
     val id: Int? = null
    @SerializedName("application")
     val application: String? = null
    @SerializedName("type")
     val type: String? = null
    @SerializedName("name")
     val name: String? = null
    @SerializedName("isActive")
     val isActive: Boolean? = null
    @SerializedName("selfservicePriceCatalogId")
     val selfservicePriceCatalogId: Int? = null
    @SerializedName("dailyPriceCatalogId")
     val dailyPriceCatalogId: Int? = null
    @SerializedName("serviceAreaNames")
     val serviceAreaNames: String? = null
    @SerializedName("iconLocation")
    var iconLocation: IconLocation? = null
    @SerializedName("workingHoursStart")
     val workingHoursStart: Int? = null
    @SerializedName("workingHoursEnd")
     val workingHoursEnd: Int? = null
    @SerializedName("serviceAreaRelations")
    var serviceAreaRelations: Map<String, List<String>>? = null

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
