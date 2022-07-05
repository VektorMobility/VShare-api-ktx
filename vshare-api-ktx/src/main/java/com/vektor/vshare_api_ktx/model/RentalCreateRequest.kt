package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class RentalCreateRequest: Serializable {

    @SerializedName("deliveryLocation")
    var deliveryLocation: DeliveryAddressModel? = null

    @SerializedName("customerLocation")
    var customerLocation: DeliveryAddressModel? = null

    @SerializedName("paymentMethodId")
    var paymentMethodId: Int? = null

    @SerializedName("vehicleId")
    var vehicleId: Int? = null

    @SerializedName("vehicleCatalogId")
    var vehicleCatalogId: Long? = null

    @SerializedName("parkId")
    var parkId: Long? = null

    @SerializedName("couponCode")
    var couponCode: String? = null

    @SerializedName("rentalType")
    var rentalType: RentalType? = null

    @SerializedName("note")
    var orderNote: String? = null

    @SerializedName("durationInSeconds")
    var durationInSeconds: Int? = null

    @SerializedName("distanceInMeters")
    var distanceInMeters: Int? = null

    @SerializedName("corporateReason")
    var corporateReason: String? = null

    @SerializedName("organizationId")
    var organizationId: Int? = null

}