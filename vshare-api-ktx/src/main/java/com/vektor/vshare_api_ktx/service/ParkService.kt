package com.vektor.vshare_api_ktx.service

import com.vektor.vshare_api_ktx.model.CarDetailModel
import com.vektor.vshare_api_ktx.model.IsparkResponse
import com.vektor.vshare_api_ktx.model.Park
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface ParkService {

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @GET("/{app_name}/public/parks")
    fun getParkList(): Observable<List<Park>>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @GET("/{app_name}/public/poi/ispark")
    fun getIsparkList(@Query("cacheVersion") cacheVersion: String?) : Observable<IsparkResponse>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @GET("/{app_name}/public/park/catalog/list")
    fun getCarCatalogList(@Query("parkId") parkId: Int, @Query("lang") language: String): Observable<List<CarDetailModel>>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @GET("/{app_name}/public/parks/{parkId}")
    fun getPark(@Path("parkId") parkId: Int): Observable<Park>
}
