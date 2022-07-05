package com.vektor.vshare_api_ktx.service

import com.vektor.vshare_api_ktx.model.ZonesTypesInfoModel
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query
import java.util.*

interface ConstantsService {

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @GET("/{app_name}/public/mobileParameters")
    fun getMobileParameters(@Query("lang") language: String): Observable<HashMap<String, Any>>


  @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
  @GET("/{app_name}/public/zoneTypes")
  fun getZonesTypes(): Observable<List<ZonesTypesInfoModel>>

}