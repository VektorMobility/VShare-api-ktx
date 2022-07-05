package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ServiceAreaZonesDataResponse :Serializable, BaseResponse() {

    @SerializedName("zone")
    var zone: ServiceAreaZonesModel? = null

    @SerializedName("serviceAreas")
     val serviceAreas: List<ServiceAreaModel>? = null

    @SerializedName("forbiddenAreas")
    var forbiddenAreas: List<ServiceAreaModel>? = null

    @SerializedName("isOpen")
     val isOpen: Boolean? = null

    @SerializedName("showPopup")
     val showPopup: Boolean? = null

    @SerializedName("workingHours")
     val workingHours: String? = null

    @SerializedName("availableVehicles")
    var availableVehicles: Int? = null

    @SerializedName("availableRewardVehicles")
    var availableRewardVehicles: Int? = null

    @SerializedName("distance")
     val distance: DistanceModel2? = null

    @SerializedName("cheapestPriceModelId")
     val cheapestPriceModelId: Int? = null

    @SerializedName("cheapestDailyPriceModelId")
     val cheapestDailyPriceModelId: Int? = null

    @SerializedName("priceItem")
    var priceItem : PriceItemModel2? = null

    @SerializedName("dailyPriceItem")
    var dailyPriceItem : PriceItemModel2? = null

}
