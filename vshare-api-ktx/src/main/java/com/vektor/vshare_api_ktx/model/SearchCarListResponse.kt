package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import com.vektor.vshare_api_ktx.model.CarDetailModel
import com.vektor.vshare_api_ktx.model.DeliveryAddressModel
import java.io.Serializable

class SearchCarListResponse: Serializable {

    @SerializedName("searchLocation")
    var searchLocation: DeliveryAddressModel? = null
    @SerializedName("rentalVehicleInfoList")
    var rentalVehicleInfoList: List<CarDetailModel>? = null
    @SerializedName("inValetServiceHours")
    var inValetServiceHours: Boolean? = null
}