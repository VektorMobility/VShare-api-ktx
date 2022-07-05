package com.vektor.vshare_api_ktx.service

import com.vektor.vshare_api_ktx.model.BaseResponse
import com.vektor.vshare_api_ktx.model.Offer
import com.vektor.vshare_api_ktx.model.OfferBuyRequest
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface OfferService {

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    //@GET("/{app_name}/rest/price/offers")
    @GET("/{app_name}/public/offers")
    fun getOfferList(): Observable<List<Offer>>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @POST("/{app_name}/rest/customer/buy-offer-3d")
    fun buyOffer(@Body offerBuyRequest: OfferBuyRequest): Observable<BaseResponse>

}