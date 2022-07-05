package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class BalancesResponse: Serializable {

    @SerializedName("normalBalance")
    var normalBalance: Double? = null

    @SerializedName("bonusBalance")
    var bonusBalance: Double? = null
}