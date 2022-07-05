package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.util.*

class CustomerStatusModel : Serializable {

    @SerializedName("status")
    var status: String? = null

    @SerializedName("user")
    var user: UserInfoModel? = null

    @SerializedName("rental")
    var rental: RentalModel? = null

    @SerializedName("vehicle")
    var vehicle: CarDetailModel.Vehicle? = null

    @SerializedName("deliveryAddress")
    var deliveryAddress: DeliveryAddressModel? = null

    @SerializedName("paymentMethod")
    var paymentMethod: CreditCardResponse? = null

    @SerializedName("events")
    var events: ArrayList<EventModel>? = null

    @SerializedName("provision")
    var provision: PaymentModel? = null

    @SerializedName("priceModel")
    var priceModel: PriceModel? = null

    @SerializedName("radarRequest")
    var radarResponse: RadarResponse? = null

    @SerializedName("userDocumentInfo")
    var userDocumentInfo: UserDocumentInfo? = null

    @SerializedName("rentalPark")
    var rentalPark: Park? = null

    @SerializedName("preferredPark")
    var preferredPark: Park? = null

    @SerializedName("paymentRequired")
    var paymentRequired: Boolean? = null

    @SerializedName("upgradeAgreement")
    var upgradeAgreement: Boolean? = null

    @SerializedName("upgradeAgreementText")
    var upgradeAgreementText: String? = null

    @SerializedName("upgradeAgreementTitle")
    var upgradeAgreementTitle: String? = null

    @SerializedName("balance")
    var balance: Double? = null

    @SerializedName("disableDocumentUpload")
    var disableDocumentUpload: Boolean? = null
}

internal enum class UserStatus {
    AVAILABLE, ACTIVE
}