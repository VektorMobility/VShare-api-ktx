package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import com.vektor.vshare_api_ktx.model.BaseResponse
import com.vektor.vshare_api_ktx.model.ZoneType
import java.io.Serializable

class ZonesTypesInfoModel :Serializable, BaseResponse() {

    @SerializedName("isActive")
     val isActive: Boolean? = null

    @SerializedName("isInterconnected")
     val isInterconnected: Boolean? = null

    @SerializedName("application")
     val application: String? = null

    @SerializedName("name")
     val name: ZoneType? = null

    @SerializedName("displayName")
     val displayName: String? = null


    @SerializedName("order")
     val order: Int? = null


}
