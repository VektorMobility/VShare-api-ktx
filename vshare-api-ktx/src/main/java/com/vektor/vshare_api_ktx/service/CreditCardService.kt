package com.vektor.vshare_api_ktx.service

import com.vektor.vshare_api_ktx.model.*
import io.reactivex.Observable
import retrofit2.http.*

interface CreditCardService {

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @POST("/{app_name}/rest/customer/paymentMethod/add")
    fun addCreditCard(@Body creditCardRequest: CreditCardRequest): Observable<CreditCardResponse>

//    @POST("/garenta/rest/customer/paymentMethod/add/paycell")
//    fun addPaycellCreditCard(@Body creditCardRequest: CreditCardRequest, cb: Callback<PaycellCreditCardResponse>)

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @GET("/{app_name}/rest/customer/paymentMethod/list")
    fun getCreditCardList(): Observable<List<CreditCardResponse>>

//    @GET("/garenta/rest/customer/paymentMethod/list/v2")
//    fun getCreditCardListWitPaycell(@Query("paymentMethodType") paymentMethodType: String, cb: Callback<PaymentMethodResponse>)

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @GET("/{app_name}/rest/customer/paymentMethod/delete")
    fun deleteCreditCard(@Query("paymentMethodId") paymentMethodId: Int): Observable<BaseResponse>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @GET("/{app_name}/rest/customer/paymentMethod/preferred")
    fun getDefaultPaymentMethod(): Observable<DefaultCreditCardResponse>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @GET("/{app_name}/rest/rental/check-cancel")
    fun getCheckCancel(): Observable<CheckCancel>

}