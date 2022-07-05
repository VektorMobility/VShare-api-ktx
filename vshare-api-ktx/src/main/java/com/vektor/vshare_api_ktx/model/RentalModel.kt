package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class RentalModel : Serializable {

    @SerializedName("minute")
    var minute: Int = 0

    @SerializedName("id")
    var id: Long = 0

    @SerializedName("step")
    var step: String? = null

    @SerializedName("isActive")
    var isActive: Boolean = false

    @SerializedName("isFirstTime")
    var isFirstTime: Boolean = false

    @SerializedName("km")
    var km: Double = 0.0

    @SerializedName("endDate")
    var endDate: String? = null

    @SerializedName("startDate")
    var startDate: String? = null

    @SerializedName("creationTime")
    var creationTime: String? = null

    @SerializedName("locationPhotoUuid")
    var locationPhotoUuid: String? = null

    @SerializedName("locationFrontPhotoUuid")
    var locationFrontPhotoUuid: String? = null

    @SerializedName("locationLeftPhotoUuid")
    var locationLeftPhotoUuid: String? = null

    @SerializedName("locationRightPhotoUuid")
    var locationRightPhotoUuid: String? = null

    @SerializedName("locationRearPhotoUuid")
    var locationRearPhotoUuid: String? = null

    @SerializedName("locationDescription")
    var locationDescription: String? = null

    @SerializedName("rentalType")
    var rentalType: String? = null

    @SerializedName("campaignName")
    var campaignName: String? = null

    @SerializedName("billingFreezeTime")
    var billingFreezeTime: String? = null

    @SerializedName("isAccidentReported")
    var isAccidentReported: Boolean? = null

    @SerializedName("reservationDays")
    var reservationDays: Int = 0

    @SerializedName("nextRentalId")
    var nextRentalId: Long = 0

    @SerializedName("doorOpenDate")
    var doorOpenDate: String? = null


    @SerializedName("expertiseEndDate")
    var expertiseEndDate: String? = null


}
