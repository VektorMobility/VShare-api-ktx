package com.vektor.vshare_api_ktx.service

import com.vektor.vshare_api_ktx.model.PoiChargingStationsResponse
import com.vektor.vshare_api_ktx.model.PoiRequest
import com.vektor.vshare_api_ktx.model.PoiResponse
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface PoiService {

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json")
    @POST("/{app_name}/public/poi/inRadius")
    fun getPoiList(@Body poiRequest: PoiRequest): Observable<List<PoiResponse>>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json")
    @GET("/{app_name}/public/poi/charging-stations")
    fun getChargingStations(): Observable<PoiChargingStationsResponse>
}