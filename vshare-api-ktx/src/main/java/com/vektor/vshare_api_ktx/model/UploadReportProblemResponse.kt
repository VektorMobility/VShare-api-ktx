package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class UploadReportProblemResponse: Serializable {

    @SerializedName("rentalId")
    var rentalId: Long? = null
    @SerializedName("problem")
    var problem: ProblemData? = null

    inner class ProblemData: Serializable {
        @SerializedName("description")
        var description: String = String()

        @SerializedName("fileUuids")
        var fileUuids: MutableList<String> = mutableListOf()
    }

}