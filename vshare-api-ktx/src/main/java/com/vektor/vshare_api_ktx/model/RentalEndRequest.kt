package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class RentalEndRequest: Serializable {

    @SerializedName("rentalId")
    var rentalId: Long = 0

    @SerializedName("uncheckedItemList")
    var uncheckedItemList: List<Long>? = null

    @SerializedName("checkedItemList")
    var checkedItemList: List<Long>? = null

    @SerializedName("endLocationPhotoUuid")
    var endLocationPhotoUuid: String? = null

    @SerializedName("endLocationLeftPhotoUuid")
    var endLocationLeftPhotoUuid: String? = null

    @SerializedName("endLocationFrontPhotoUuid")
    var endLocationFrontPhotoUuid: String? = null

    @SerializedName("endLocationRightPhotoUuid")
    var endLocationRightPhotoUuid: String? = null

    @SerializedName("endLocationRearPhotoUuid")
    var endLocationRearPhotoUuid: String? = null

    @SerializedName("endLocationDescription")
    var endLocationDescription: String? = null

    @SerializedName("cancelReasons")
    var cancelReasons: List<RentalReasonRequest>? = null
}