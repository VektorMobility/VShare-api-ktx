package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.vektor.vshare_api_ktx.model.TransactionBonusModel
import com.vektor.vshare_api_ktx.model.TransactionNormalModel
import java.io.Serializable

data class TransactionResponse(@SerializedName("BONUS")
                               @Expose
                               val bonusList: List<TransactionBonusModel>? = null,
                               @SerializedName("NORMAL")
                               @Expose
                               val normalList: List<TransactionNormalModel>? = null) : Serializable