package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class DailyPaymentModel : Serializable {

    @SerializedName("bonusAccountAmount")
    var bonusAccountAmount: Double? = null

    @SerializedName("normalAccountAmount")
    var normalAccountAmount: Double? = null

    @SerializedName("creditCardAmount")
    var creditCardAmount: Double? = null


}



