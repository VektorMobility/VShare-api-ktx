package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class PriceItemModel2 : Serializable, Comparable<PriceItemModel2>{

    @SerializedName("id")
    var id: Int? = null

    @SerializedName("priceModel")
    var priceModel: PriceModel2? = null

    @SerializedName("priceInfoTitle")
    var priceInfoTitle: String? = null

    @SerializedName("priceModelItems")
    var priceModelItems: List<PriceModelItem2>? = null

    @SerializedName("vehicleCardItems")
    var vehicleCardItems: List<VehicleCardItemModel2>? = null

    var nearestCarDuration : String? = null

    var nearestCarDistance : Int? = null

    //override fun compareTo(other: PriceItemModel2): Int = this.priceModel?.hourlyCost?.compareTo(other.priceModel?.hourlyCost ?: 0.0) ?: 0

    override fun compareTo(other: PriceItemModel2): Int {

        if (nearestCarDistance != null && other?.nearestCarDistance != null && priceModel?.hourlyCost != null && other?.priceModel?.hourlyCost != null){
            if(nearestCarDistance!! > other?.nearestCarDistance!! || (nearestCarDistance!! == other?.nearestCarDistance!! && priceModel?.hourlyCost!! > other?.priceModel?.hourlyCost!!)){
                return 1
            }else{
                return -1
            }
        }
        return 1
    }

}


