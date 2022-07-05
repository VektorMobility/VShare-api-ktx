package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class CheckCancel: Serializable {

    @SerializedName("result")
    var result: String? = null

    @SerializedName("data")
    var data: CancelResponse? = null

    inner class CancelResponse  {
        @SerializedName("userId")
        public val userId: Int? = null
        @SerializedName("canDoFreeCancel")
        public val canDoFreeCancel: Boolean? = null

        @SerializedName("cancelNotFreeReason")
        public val cancelNotFreeReason: String? = null

        @SerializedName("remainingMinutesToDoFreeCancel")

        public val remainingMinutesToDoFreeCancel: Double? = null
    }

}
