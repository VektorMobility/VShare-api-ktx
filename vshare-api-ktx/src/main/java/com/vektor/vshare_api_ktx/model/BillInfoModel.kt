package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class BillInfoModel : Serializable {

    @SerializedName("hourCost")
    private val hourCost: Double? = null

    @SerializedName("dayCost")
    private val dayCost: Double? = null

    @SerializedName("minutes")
    var minutes: Long? = null

    @SerializedName("currency")
    var currency: String? = null

    @SerializedName("startingCost")
    var startingCost: Double? = null

    @SerializedName("startingDiscount")
    var startingDiscount: Double? = null

    @SerializedName("hourlyCost")
    var hourlyCost: Double? = null

    @SerializedName("total")
    var total: Double? = null

    @SerializedName("finalCost")
    var finalCost: Double? = null

    @SerializedName("durationPackageCost")
    var durationPackageCost: Double? = null

    @SerializedName("discountRatio")
    var discountRatio: Double? = null

    @SerializedName("fuelConsumption")
    var fuelConsumption: Double? = null

    @SerializedName("km")
    var km: Double? = null

    @SerializedName("kmExceededCost")
    var kmExceededCost: Double? = null

    @SerializedName("kmPackageCost")
    var kmPackageCost: Double? = null

    @SerializedName("remainingAmount")
    var remainingAmount: Double? = null

    @SerializedName("remainingFreeMinute")
    var remainingFreeMinute: Double? = null

    @SerializedName("paidAmount")
    var paidAmount: Double? = null

    @SerializedName("timeCost")
    var timeCost: Double? = null

    @SerializedName("kmLimit")
    var kmLimit: Double? = null

    @SerializedName("billedHours")
    var billedHours: Double? = null

    @SerializedName("billedDays")
    var billedDays: Int? = null

    @SerializedName("provisionBackingHours")
    var provisionBackingHours: Double? = null

    @SerializedName("provisionUsedAmount")
    var provisionUsedAmount: Double? = null

    @SerializedName("firstHourCost")
    var firstHourCost: Double? = null

    @SerializedName("kmPackageLimit")
    var kmPackageLimit: Int? = null

    @SerializedName("isKmExceeded")
    var isKmExceeded: Boolean? = null

    @SerializedName("kmExceededCostAmount")
    var kmExceededCostAmount: Double? = null

}