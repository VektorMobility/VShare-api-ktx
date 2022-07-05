package com.vektor.vshare_api_ktx.service

import com.vektor.vshare_api_ktx.model.FaqListResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface FaqService {

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @GET("/{app_name}/public/faq")
    fun getFaqList(@Query("lang") language: String): Observable<List<FaqListResponse>>
}
