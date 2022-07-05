package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Reward : Serializable{

    @SerializedName("text")
    var text: String? = null

    @SerializedName("rewardType")
    val rewardType: RewardIconType? = null

    @SerializedName("steps")
    var steps: List<RewardSteps>? = null

}