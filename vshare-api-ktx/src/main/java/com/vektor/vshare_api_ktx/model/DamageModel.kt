package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class DamageModel: Serializable {

    @SerializedName("id")
    var id: Long = 0

    @SerializedName("enumId")
    var enumId: Long = 0

    @SerializedName("region")
    var regionModel: String? = null

    var region: String?
        get() = regionModel
        set(value) {
            regionModel = value
        }

    var region2: DamageRegion?
        get() {
        return regionModel?.let { DamageRegion.valueOf(it) } ?: DamageRegion.undefined
    }
        set(value) {
            regionModel = value?.name
        }

    @SerializedName("fileIds")
    var fileids: List<Int>? = null

    @SerializedName("fileUuids")
    var fileUuids: MutableList<String>? = null

    @SerializedName("description")
    var description: String? = null

    @SerializedName("explanation")
    var explanation: String? = null

    @SerializedName("recordedAt")
    var recordedAt: String? = null

    @SerializedName("recordedBy")
    var recordedBy: String? = null

    @SerializedName("isCustomerSatisfied")
    var isCustomerSatisfied: Boolean? = null

}

enum class DamageRegion {
    TOP,
    FRONT,
    LEFT,
    RIGHT,
    REAR,
    INTERIOR,
    DEFAULT,
    FRONT_INTERIOR,
    REAR_INTERIOR,
    undefined
}