package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class VehicleAndDistanceModel2 : Serializable, Comparable<VehicleAndDistanceModel2> {

    @SerializedName("vehicle")
    var vehicle: VehicleModel2? = null

    @SerializedName("distance")
    var distance: DistanceModel2? = null

    @SerializedName("reward")
    var reward: Reward? = null

    @SerializedName("catalogItem")
    var catalogItem : CatalogItemModel2? = null

    @SerializedName("priceItem")
    var priceItem : PriceItemModel2? = null

    @SerializedName("dailyPriceItem")
    var dailyPriceItem : PriceItemModel2? = null




    override fun compareTo(other: VehicleAndDistanceModel2): Int = this.distance?.distanceInMeters?.compareTo(other.distance?.distanceInMeters?:0)?:0


}