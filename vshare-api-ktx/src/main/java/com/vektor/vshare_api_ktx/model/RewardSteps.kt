package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class RewardSteps : Serializable, BaseResponse() {

    @SerializedName("title")
    var title: String? = null

    @SerializedName("explanation")
    var explanation: String? = null

    @SerializedName("iconInfo")
    var iconInfo: IconInfo? = null

    inner class IconInfo: Serializable {
        @SerializedName("icon")
        val icon: String? = null
        @SerializedName("iconType")
        val iconType: RewardIconType? = null
    }

}
