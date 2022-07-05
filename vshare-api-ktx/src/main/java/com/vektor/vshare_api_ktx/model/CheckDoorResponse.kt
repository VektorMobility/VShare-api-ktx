package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import com.vektor.vshare_api_ktx.model.BaseResponse
import java.io.Serializable

class CheckDoorResponse: BaseResponse(), Serializable {

    @SerializedName("status")
    var status: String? = null
}
