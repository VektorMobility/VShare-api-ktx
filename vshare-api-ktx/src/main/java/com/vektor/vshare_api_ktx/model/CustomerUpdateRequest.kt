package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class CustomerUpdateRequest: Serializable {

    @SerializedName("email")
    var email: String? = null

    @SerializedName("profileImageUuid")
    var profileImageUuid: String? = null
}