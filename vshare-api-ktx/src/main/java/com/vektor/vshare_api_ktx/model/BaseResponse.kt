package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

open class BaseResponse: Serializable {

    @SerializedName("result")
    var result: String? = null

    @SerializedName("error")
    var error: Error? = null

    @SerializedName("_error")
    var error2: Error? = null

    @SerializedName("response")
    var response: String? = null

    @SerializedName("rentalInfo")
    var rentalInfo: RentalInfoModel? = null

    @SerializedName("data")
    var data: Map<String, String>? = null

    inner class Error {
        @SerializedName("desc")
        var desc: String? = null

        @SerializedName("code")
        var code: String? = null

        @SerializedName("errorId")
        var errorId: String? = null

        @SerializedName("message")
        var message: String? = null

    }
}
