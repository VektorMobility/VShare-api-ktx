package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class RentalChangeTypeResponse(
    @SerializedName("oldRentalInfo")
    val oldRentalInfo: RentalInfoModel? = null,
    @SerializedName("newRentalInfo")
    val newRentalInfo: RentalInfoModel? = null) : BaseResponse(), Serializable