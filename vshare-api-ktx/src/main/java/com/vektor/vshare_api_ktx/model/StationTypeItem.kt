package com.vektor.vshare_api_ktx.model

import androidx.annotation.DrawableRes
import com.vektor.vshare_api_ktx.model.ZoneType

data class StationTypeItem (
    @DrawableRes
        var icon: Int = -1,
    var text: String? = null,
    var zoneType: ZoneType? = null,
    var isSelected: Boolean = false,
    var isInterConnected: Boolean = false,
    var index: Int? = 0
)