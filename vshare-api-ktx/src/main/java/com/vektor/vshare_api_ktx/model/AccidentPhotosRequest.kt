package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class AccidentPhotosRequest : Serializable {

    @SerializedName("otherPartyDrivingLicencePhotos")
    var otherPartyDrivingLicencePhotos: MutableList<String> = mutableListOf()

    @SerializedName("accidentReportPhotos")
    var accidentReportPhotos: MutableList<String> = mutableListOf()

    @SerializedName("accidentPhotos")
    var accidentPhotos: MutableList<String> = mutableListOf()

    @SerializedName("trafficPolicyLicencePhotos")
    var trafficPolicyLicencePhotos: MutableList<String> = mutableListOf()

    @SerializedName("vehicleLicencePhotos")
    var vehicleLicencePhotos: MutableList<String> = mutableListOf()

    @SerializedName("accidentDescription")
    var accidentDescription: String = String()

    @SerializedName("accidentType")
    var accidentType: String = MULTI_SIDE_ACCIDENT

    @SerializedName("isInjured")
    var isInjured: Boolean? = null

    companion object {
        const val SINGLE_SIDE_ACCIDENT = "SINGLE_SIDE_ACCIDENT"
        const val MULTI_SIDE_ACCIDENT = "MULTI_SIDE_ACCIDENT"
    }
}