package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.util.*

class RentalInfoModel: Serializable {

    @SerializedName("userInfo")
    var userInfo: UserInfoModel? = null

    @SerializedName("rental")
    var rental: RentalModel? = null

    @SerializedName("vehicle")
    var vehicle: CarDetailModel.Vehicle? = null

    @SerializedName("deliveryAddress")
    var deliveryAddress: DeliveryAddressModel? = null

    @SerializedName("provision")
    var provision: PaymentModel? = null

    @SerializedName("payments")
    var payments: ArrayList<PaymentModel>? = null

    @SerializedName("events")
    var events: ArrayList<EventModel>? = null

    @SerializedName("billInfo")
    var billInfo: BillInfoModel? = null

    @SerializedName("priceModel")
    var priceModel: PriceModel? = null

    @SerializedName("tripData")
    var tripData: List<TripModel>? = null

    @SerializedName("paymentMethod")
    var paymentMethod: CreditCardResponse? = null

    @SerializedName("billingItems")
    var billingItems: List<PriceItemModel>? = null

    @SerializedName("firm")
    var firm: Firm? = null

    @SerializedName("park")
    var park: Park? = null

    @SerializedName("rentalPackages")
    var rentalPackages: List<KmPackageResponse>? = null

    @SerializedName("zone")
    var zone: RentalZone? = null

    @SerializedName("rentalVehicleRewardResponse")
    var rentalVehicleRewardResponse: RentalVehicleRewardResponse? = null


}