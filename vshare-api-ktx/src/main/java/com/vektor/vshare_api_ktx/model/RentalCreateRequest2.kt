package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class RentalCreateRequest2 : Serializable {

    @SerializedName("deliveryLocation")
    var deliveryLocation : DeliveryAddressModel2? = null;

    @SerializedName("customerLocation")
    var customerLocation : DeliveryAddressModel? = null

    @SerializedName("paymentMethodId")
    var paymentMethodId : Int? = null

    @SerializedName("vehicleId")
    var vehicleId : Int? = null

    @SerializedName("couponCode")
    var couponCode : String? = null

  @SerializedName("zoneType")
    var zoneType : String? = null

    @SerializedName("rentalType")
    var rentalType : RentalType? = null

    @SerializedName("note")
    var orderNote : String? = null

    @SerializedName("durationInSeconds")
    var durationInSeconds : Int? = null

    @SerializedName("distanceInMeters")
    var distanceInMeters : Int? = null

    @SerializedName("corporateReason")
    var corporateReason : String? = null

    @SerializedName("priceModelId")
    var priceModelId : Int? = null

    @SerializedName("organizationId")
    var organizationId : Int? = null

    @SerializedName("parkId")
    var parkId: Int? = null

    @SerializedName("vehicleCatalogId")
    var vehicleCatalogId: Int? = null

    @SerializedName("numberOfDays")
    var numberOfDays : Int? = null

    @SerializedName("packageOfferExtensionId")
    var packageOfferExtensionId : Long? = null

}