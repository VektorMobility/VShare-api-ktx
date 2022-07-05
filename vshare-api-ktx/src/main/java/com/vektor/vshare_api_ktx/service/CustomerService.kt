package com.vektor.vshare_api_ktx.service

import com.vektor.vshare_api_ktx.model.*
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface CustomerService {

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @POST("/{app_name}/rest/customer/updateProfile")
    fun updateProfile(@Body customerUpdateRequest: CustomerUpdateRequest): Observable<BaseResponse>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @POST("/{app_name}/rest/customer/address")
    fun updateAddress(@Body registerRequest: ArrayList<RegisterRequest>): Observable<List<AddressResponseModel>>

    @Headers(
        "Content-Type: application/json",
        "Accept: application/json"
    )
    @GET("/{app_name}/rest/customer/status")
    fun getStatus(): Observable<CustomerStatusModel>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @POST("/{app_name}/rest/customer/upgradeAgreementDocument")
    fun upgradeAgreementDocument() : Observable<BaseResponse>

    @Headers(
        "Content-Type: application/json",
        "Accept: application/json"
    )
    @GET("/{app_name}/rest/customer/balances")
    fun getBalances(): Observable<BalancesResponse>

    @Headers(
        "Content-Type: application/json",
        "Accept: application/json"
    )
    @GET("/{app_name}/rest/customer/transactions")
    fun getTransactions(): Observable<TransactionResponse>

    @POST("/{app_name}/rest/customer/radar/addRequest")
    fun setUpRadar(@Body radarRequest: RadarRequest) : Observable<RadarResponse>

    @GET("/{app_name}/rest/customer/radar/cancelRequest")
    fun deleteRadar() : Observable<BaseResponse>

    @GET("/{app_name}/rest/customer/event/count")
    fun getNotificationCount(): Observable<NotificationCountResponse>

    @GET("/{app_name}/rest/customer/email/confirmation/notification")
    fun getConfirmationEmail(): Observable<BaseResponse>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @GET("/{app_name}/public/benefits")
    fun getCampaignListForCustomer(): Observable<List<CampaignResponse>>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )

    @GET("/{app_name}/rest/customer/address/list")
    fun getCustomerAddresses(): Observable<List<AddressResponseModel>>


    @POST("/{app_name}/rest/customer/registration/address")
    fun registerAddress(@Body registerRequest: ArrayList<RegisterRequest>): Observable<RegisterResponse>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @POST("/{app_name}/rest/customer/registration/email")
    fun registerEmail(@Body registerRequest: RegisterRequest): Observable<RegisterResponse>


    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @POST("/{app_name}/rest/customer/registration/permission")
    fun registerPermission(@Body registerRequest: RegisterAggreementRequest): Observable<RegisterResponse>

}