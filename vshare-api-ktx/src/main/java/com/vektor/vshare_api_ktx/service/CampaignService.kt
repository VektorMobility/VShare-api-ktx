package com.vektor.vshare_api_ktx.service

import com.vektor.vshare_api_ktx.model.CampaignResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface CampaignService {

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @GET("/{app_name}/public/benefits")
    fun getCampaignList(): Observable<List<CampaignResponse>>


    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @GET("/{app_name}/public/campaigns/{id}")
    fun getCampaignById(@Path("id") id: String, @Query("lang") language: String) : Observable<CampaignResponse>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @GET("/{app_name}/public/benefits/{id}")
    fun getCampaignDetail(@Path("id") id: String) : Observable<CampaignResponse>
}