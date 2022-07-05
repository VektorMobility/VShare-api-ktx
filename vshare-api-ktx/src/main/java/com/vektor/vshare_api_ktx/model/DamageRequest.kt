package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import com.vektor.vshare_api_ktx.model.DamageModel
import java.io.Serializable

class DamageRequest: Serializable {

    @SerializedName("rentalId")
    var rentalId: Long = 0

    @SerializedName("damage")
    var damage: DamageModel? = null

    @SerializedName("damages")
    var damages: List<DamageModel?>? = null

}