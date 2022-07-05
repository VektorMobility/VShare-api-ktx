package com.vektor.vshare_api_ktx.service

import com.vektor.vshare_api_ktx.model.BaseResponse
import com.vektor.vshare_api_ktx.model.MernisRequest
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Query

interface MernisService {

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @POST("/{app_name}/public/mernis/check")
    fun checkMernis(@Body mernisRequest: MernisRequest, @Query("lang") language: String): Observable<BaseResponse>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @POST("/{app_name}/public/mernis/validation")
    fun checkMernis2(@Body mernisRequest: MernisRequest, @Query("lang") language: String): Observable<BaseResponse>

}
