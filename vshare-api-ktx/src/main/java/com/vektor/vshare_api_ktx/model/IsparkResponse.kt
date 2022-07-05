package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName

data class IsparkResponse(
        @SerializedName("cacheVersion") var cacheVersion: String? = null,
        @SerializedName("pois") var isparkList: List<PoiResponse>? = null
)