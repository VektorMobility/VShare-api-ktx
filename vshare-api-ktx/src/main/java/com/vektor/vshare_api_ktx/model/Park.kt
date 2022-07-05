package com.vektor.vshare_api_ktx.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.vektor.vshare_api_ktx.model.DeliveryAddressModel
import java.io.Serializable

data class Park(@SerializedName("id")
                @Expose
                var id: Int,
                @SerializedName("name")
                @Expose
                var name: String,
                @SerializedName("address")
                @Expose
                var address: String? = null,
                @SerializedName("vehicleAvailableCount")
                @Expose
                var vehicleAvailableCount: Int? = null,
                @SerializedName("vehicleCount")
                @Expose
                var vehicleCount: Int? = null,
                @SerializedName("city")
                @Expose
                var city: String? = null,
                @SerializedName("district")
                @Expose
                var district: String? = null,
                @SerializedName("latitude")
                @Expose
                var latitude: Double? = null,
                @SerializedName("workingHours")
                @Expose
                var workingHours: String? = null,
                @SerializedName("longitude")
                @Expose
                var longitude: Double?,
                @SerializedName("location")
                var location: DeliveryAddressModel? = null
) : Serializable