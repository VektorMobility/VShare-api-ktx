package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class PriceModel: Serializable {

    @SerializedName("kmExceededCost")
    var kmExceededCost: Double? = null

    @SerializedName("startingCost")
    var startingCost: Double? = null

    @SerializedName("startingDiscount")
    var startingDiscount: Double? = null

    @SerializedName("hourlyCost")
    var hourlyCost: Double? = null

    @SerializedName("provisionCost")
    var provisionCost: Double? = null

    @SerializedName("firstHourDiscount")
    var firstHourDiscount: Double? = null

    @SerializedName("kmPerHourLimit")
    var kmPerHourLimit: Double? = null

    @SerializedName("kmPerDayLimit")
    var kmPerDayLimit: Double? = null

    @SerializedName("kmPerRentalLimit")
    var kmPerRentalLimit: Double? = null

    @SerializedName("dailyCost")
    var dailyCost: Double? = null

    @SerializedName("name")
    var name: String? = null

    @SerializedName("currency")
    var currency: String? = null

    @SerializedName("id")
    var id: Long? = null

    @SerializedName("convertToDailyThreshold")
    var convertToDailyThreshold: Int? = null

    @SerializedName("nightlyCost")
    var nightlyCost: Double? = null

    @SerializedName("weekendCost")
    var weekendCost: Double? = null

    @SerializedName("shiftStart")
    var shiftStart: Int? = null

    @SerializedName("shiftEnd")
    var shiftEnd: Int? = null


}