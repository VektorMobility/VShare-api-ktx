package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class TransactionBonusModel(@SerializedName("bankAccountId")
                                 @Expose
                                 val bankAccountId: Int? = null,
                                 @SerializedName("customerName")
                                 @Expose
                                 val customerName: String? = null,
                                 @SerializedName("balance")
                                 @Expose
                                 val balance: Double? = null,
                                 @SerializedName("accountType")
                                 @Expose
                                 val accountType: String? = null,
                                 @SerializedName("transactionTime")
                                 @Expose
                                 val transactionTime: String? = null,
                                 @SerializedName("amount")
                                 @Expose
                                 val amount: Double? = null,
                                 @SerializedName("referenceId")
                                 @Expose
                                 val referenceId: Int? = null,
                                 @SerializedName("description")
                                 @Expose
                                 val description: String? = null,
                                 @SerializedName("createdByFullName")
                                 @Expose
                                 val createdByFullName: String? = null,
                                 @SerializedName("createdByAccountId")
                                 @Expose
                                 val createdByAccountId: Int? = null) : Serializable