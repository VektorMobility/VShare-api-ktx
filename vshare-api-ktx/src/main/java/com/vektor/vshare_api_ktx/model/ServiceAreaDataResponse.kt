package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName

class ServiceAreaDataResponse : BaseResponse() {
    @SerializedName("serviceAreaRelations")
    var serviceAreaRelations: Map<String, List<String>>? = null
    @SerializedName("serviceAreas")
    var serviceAreas: List<ServiceAreaModel>? = null
    @SerializedName("forbiddenAreas")
    var forbiddenAreas: List<ServiceAreaModel>? = null
}
