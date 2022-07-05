package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import com.vektor.vshare_api_ktx.model.RejectAction
import java.io.Serializable

data class UserDocumentInfo(
    @SerializedName("drivingLicenseStatus")
        var drivingLicenseStatus: String? = null,
    @SerializedName("drivingLicenseRejectReason")
        var drivingLicenseRejectReason: String? = null,
    @SerializedName("identityStatus")
        var identityStatus: String? = null,
    @SerializedName("identityRejectReason")
        var identityRejectReason: String? = null,
    @SerializedName("passportStatus")
        var passportStatus: String? = null,
    @SerializedName("passportRejectReason")
        var passportRejectReason: String? = null,
    @SerializedName("digitalAgreementStatus")
        var digitalAgreementStatus: String? = null,
    @SerializedName("digitalAgreementRejectReason")
        var digitalAgreementRejectReason: String? = null,
    @SerializedName("selfieStatus")
        var selfieStatus: String? = null,
    @SerializedName("selfieRejectReason")
        var selfieRejectReason: String? = null,
    @SerializedName("anyDocumentPending")
        var anyDocumentPending: Boolean? = null,
    @SerializedName("selfieRejectAction")
        var selfieRejectAction: List<RejectAction>? = null,
    @SerializedName("drivingLicenseRejectAction")
        var drivingLicenseRejectAction: List<RejectAction>? = null
) : Serializable