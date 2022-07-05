package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class SearchCarListResponse2 : Serializable{

    @SerializedName("searchLocation")
    var searchLocation: DeliveryAddressModel2? = null

    @SerializedName("vehicles")
    var vehicles: List<VehicleAndDistanceModel2>? = null

    @SerializedName("recommendVehicle")
    var recommendVehicle: VehicleAndDistanceModel2? = null

    @SerializedName("definitions")
    var definitions: DefinitionModel2? = null

}