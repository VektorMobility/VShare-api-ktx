package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import com.vektor.vshare_api_ktx.model.DeliveryAddressModel2
import com.vektor.vshare_api_ktx.model.ZoneType
import java.io.Serializable

class VehicleModel2 : Serializable{

    @SerializedName("id")
    var id: Int? = null

    @SerializedName("relatedVehicleId")
    var relatedVehicleId: Int? = null

    @SerializedName("catalogId")
    var catalogId: Int? = null

    @SerializedName("priceModelId")
    var priceModelId: Int? = null

    @SerializedName("dailyPriceModelId")
    var dailyPriceModelId: Int? = null

    @SerializedName("status")
    var status: String? = null

    @SerializedName("plate")
    var plate: String? = null

    @SerializedName("fuelLevelLt")
    var fuelLevelLt: Double? = null

    @SerializedName("fuelLevel")
    var fuelLevel: Double? = null

    @SerializedName("rangeInKm")
    var rangeInKm: Double? = null

    @SerializedName("location")
    var location: DeliveryAddressModel2? = null

    @SerializedName("assignedZoneId")
    var assignedZoneId: Int? = null

    @SerializedName("zoneType")
    val zoneType: ZoneType? = null



}