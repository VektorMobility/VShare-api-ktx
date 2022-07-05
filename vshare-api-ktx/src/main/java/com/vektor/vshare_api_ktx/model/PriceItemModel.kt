package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class PriceItemModel : Serializable {

    @SerializedName("modelId")
    var modelId: Int? = null

    @SerializedName("explanation")
    var explanation: String? = null

    @SerializedName("originalCost")
    var originalCost: Double? = null

    @SerializedName("finalCost")
    var finalCost: Double? = null

    @SerializedName("unitCode")
    var unitCode: String? = null

    @SerializedName("infoTitle")
    var infoTitle: String? = null

    @SerializedName("infoDetail")
    var infoDetail: String? = null

    @SerializedName("groupHeadingText")
    var groupHeadingText: String? = null

    @SerializedName("isEditable")
    var isEditable: Boolean? = null


    @SerializedName("tooltip")
    var tooltip: String? = null

    @SerializedName("uiGroupId")
    var uiGroupId: Int? = null

    @SerializedName("costDetail")
    var costDetail: String? = null
}