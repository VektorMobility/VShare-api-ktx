package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable


class CarDetailModel : BaseErrorModel(), Serializable {

    @SerializedName("id")
    var id: Long = 0

    @SerializedName("vehicle")
    var vehicle: Vehicle? = null

    @SerializedName("priceModel")
    var priceModel: PriceModel? = null

    @SerializedName("distance")
    var distance: Distance? = null

    @SerializedName("priceInfoTitle")
    var priceInfoTitle: String? = null

    @SerializedName("priceModelItems")
    var priceModelItems: List<PriceItemModel>? = null

    @SerializedName("vehicleCardItems")
    var vehicleCardItems: List<PriceItemModel>? = null

    @SerializedName("availableCount")
    var availableCount: Int? = null

    inner class Vehicle: Serializable {
        @SerializedName("id")
        var id: Int? = null

        @SerializedName("plate")
        var plate: String? = null

        @SerializedName("make")
        var make: String? = null

        @SerializedName("model")
        var model: String? = null

        @SerializedName("description")
        var description: String? = null

        @SerializedName("fuelType")
        var fuelType: String? = null

        @SerializedName("transmissionType")
        var transmissionType: String? = null

        @SerializedName("bodyType")
        var bodyType: String? = null

        @SerializedName("color")
        var color: String? = null

        @SerializedName("status")
        var status: String? = null

        @SerializedName("modelYear")
        var modelYear: Int? = null

        @SerializedName("odometer")
        var odometer: Double? = null

        @SerializedName("fuelLevel")
        var fuelLevel: Double? = null

        @SerializedName("chassisNumber")
        var chassisNumber: String? = null

        @SerializedName("location")
        var vehicleLocation: DeliveryAddressModel? = null

        @SerializedName("imageName")
        var imageName: String? = null

        @SerializedName("catalogId")
        var catalogId: Int? = null
    }

    inner class Distance: Serializable {

        @SerializedName("distanceInMeters")
        var distanceInMeters: Int? = null

        @SerializedName("durationInSeconds")
        var durationInSeconds: Int? = null

        @SerializedName("durationText")
        var durationText: String? = null
    }
}