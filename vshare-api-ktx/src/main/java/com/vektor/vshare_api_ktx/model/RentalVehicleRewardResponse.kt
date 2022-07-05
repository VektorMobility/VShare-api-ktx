package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class RentalVehicleRewardResponse : Serializable{

    @SerializedName("id")
    var id: Int? = null

    @SerializedName("vehicleRewardAmountType")
    val vehicleRewardAmountType: RewardIconType? = null

    @SerializedName("reward")
    var reward: Double? = null

    @SerializedName("rewarded")
    var rewarded: Double? = null

    @SerializedName("awardTime")
    var awardTime: String? = null

    @SerializedName("rewardedBonusCompletedHeader")
    var rewardedBonusCompletedHeader: String? = null

    @SerializedName("rewardedBonusCompletedDescription")
    var rewardedBonusCompletedDescription: String? = null

    @SerializedName("rewardedBonusToolTip")
    var rewardedBonusToolTip: String? = null

    @SerializedName("rewardStatus")
    var rewardStatus: String? = null

    @SerializedName("vehicleReward")
    var vehicleReward: Reward? = null

}