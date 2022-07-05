package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class UserInfoModel(@SerializedName("id")
                         var id: Long? = null,

                         @SerializedName("sapId")
                         var sapId: String? = null,

                         @SerializedName("fullName")
                         var fullName: String? = null,

                         @SerializedName("surname")
                         var surname: String? = null,

                         @SerializedName("name")
                         var name: String? = null,

                         @SerializedName("mobile")
                         var mobile: String? = null,

                         @SerializedName("email")
                         var email: String? = null,

                         @SerializedName("birthdate")
                         var birthdate: String? = null,

                         @SerializedName("tckn")
                         var tckn: String? = null,

                         @SerializedName("driverLicenceIssueDate")
                         var driverLicenceIssueDate: String? = null,

                         @SerializedName("profileImageUuid")
                         var profileImageUuid: String? = null,

                         @SerializedName("driverLicenceImageUuid")
                         var driverLicenceImageUuid: String? = null,

                         @SerializedName("driverLicenceImageUuid2")
                         var driverLicenceImageUuid2: String? = null,

                         @SerializedName("passportImageUuid")
                         var passportImageUuid: String? = null,

                         @SerializedName("signedAggrement")
                         var signedAgreement: Boolean? = null,

                         @SerializedName("canStartRental")
                         var canStartRental: Boolean? = null,

                         @SerializedName("passportNumber")
                         var passportNumber: String? = null,

                         @SerializedName("nationality")
                         var nationality: String? = null,

                         @SerializedName("countryEntryDate")
                         var countryEntryDate: String? = null,

                         @SerializedName("preferredLanguage")
                         var preferredLanguage: String? = null,

                         @SerializedName("mobileCountryCode")
                         var mobileCountryCode: String? = null,

                         @SerializedName("corporateOrganizationId")
                        var corporateOrganizationId: Int? = null,

                         @SerializedName("firstRentalDate")
                         var firstRentalDate: String? = null,

                         @SerializedName("firstDailyRentalDate")
                         var firstDailyRentalDate: String? = null,

                         @SerializedName("application")
                         var application: String? = null,

                         @SerializedName("emailVerified")
                        var emailVerified: Boolean? = null,

                         @SerializedName("registrationStep")
                         var registrationStep: String? = null

)