package com.vektor.vshare_api_ktx.service

import com.vektor.vshare_api_ktx.model.BaseResponse
import com.vektor.vshare_api_ktx.model.NotificationResponse
import io.reactivex.Observable
import retrofit2.http.*

interface NotificationService {

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @GET("/{app_name}/rest/customer/event/list")
    fun getNotification(@Query("lang") language: String): Observable<List<NotificationResponse>>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @GET("/{app_name}/rest/customer/event/readMessage")
    fun readNotification(@Query("eventIds") ids: List<Int>, @Query("lang") language: String): Observable<BaseResponse>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @DELETE("/{app_name}/rest/customer/event/{eventLogId}")
    fun deleteNotification(@Path("eventLogId") id: Int): Observable<List<NotificationResponse>>


}