package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import com.vektor.vshare_api_ktx.model.DeliveryAddressModel2
import java.io.Serializable

class VehicleInfoModel : Serializable{

    @SerializedName("vehicleId")
    var vehicleId: Int? = null

    @SerializedName("lastLocationPhotoUuid")
    var lastLocationPhotoUuid: String? = null

    @SerializedName("lastLocationRightPhotoUuid")
    var lastLocationRightPhotoUuid: String? = null

    @SerializedName("lastLocationLeftPhotoUuid")
    var lastLocationLeftPhotoUuid: String? = null

    @SerializedName("lastLocationFrontPhotoUuid")
    var lastLocationFrontPhotoUuid: String? = null

    @SerializedName("lastLocationRearPhotoUuid")
    var lastLocationRearPhotoUuid: String? = null

    @SerializedName("lastLocationDescription")
    var lastLocationDescription: String? = null

    @SerializedName("plate")
    var plate: String? = null

    @SerializedName("address")
    var address: DeliveryAddressModel2? = null
}