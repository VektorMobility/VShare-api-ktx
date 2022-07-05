package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import com.vektor.vshare_api_ktx.model.DefinitionModel2

data class DefinitionsData(
        @SerializedName("definitions")
        var definitions: DefinitionModel2? = null
)