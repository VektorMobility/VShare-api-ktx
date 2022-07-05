package com.vektor.vshare_api_ktx.service

import com.vektor.vshare_api_ktx.model.*
import io.reactivex.Observable
import retrofit2.http.*

interface RentalService {

    //region: Active Rental Methods
    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @POST("/{app_name}/rest/rental/create")
    fun createRental(@Body rentalCreateRequest: RentalCreateRequest2): Observable<RentalInfoModel>

    @POST("/{app_name}/rest/rental/reservation")
    fun reserveRental(@Body rentalReservationRequest: RentalReservationRequest): Observable<RentalReservationResponse>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @POST("/{app_name}/rest/rental/start")
    fun startRental(@Body body: String): Observable<RentalInfoModel>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @POST("/{app_name}/rest/rental/end")
    fun finishRental(@Body rentalFinishRequest: RentalEndRequest): Observable<RentalInfoModel>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @POST("/{app_name}/rest/rental/end/preCheckAndFreeze")
    fun freezeRental(): Observable<Int>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @GET("/{app_name}/rest/rental/end/preCheckVehicleReward")
    fun preCheckVehicleReward(): Observable<BaseResponse>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @GET("/{app_name}/rest/rental/end/remainingFreezeTime")
    fun getRemainingFreezeTime(): Observable<Int>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @POST("/{app_name}/rest/rental/end/unfreeze")
    fun unFreezeRental(): Observable<BaseResponse>

    @Headers(
        "Content-Type: application/json",
        "Accept: application/json"
    )
    @POST("/{app_name}/rest/rental/changeType")
    fun changeType(@Body request: RentalCreateRequest): Observable<RentalChangeTypeResponse>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @POST("/{app_name}/rest/rental/vehicleLocation")
    fun getVehicleLocation(@Body rentalVehicleLocationRequest: RentalVehicleLocationRequest): Observable<DeliveryAddressModel>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @GET("/{app_name}/rest/rental/checkDoor")
    fun checkDoorStatus(@Query("rentalId") rentalId: Long): Observable<CheckDoorResponse>


    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @GET("/{app_name}/rest/rental/cancelReasons")
    fun getRentalCancelReasons(@Query("rentalId") rentalId: Long): Observable<List<RentalReasonResponse>>

    @GET("/{app_name}/rest/rental/damageReasons/v2")
    fun getRentalDamageReasons(@Query("rentalId") rentalId: Long): Observable<List<RentalReasonResponse>>

    @GET("/{app_name}/rest/rental/internalDamageReasons")
    fun getRentalInternalDamageReasons(@Query("rentalId") rentalId: Long): Observable<List<RentalReasonResponse>>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @POST("/{app_name}/rest/rental/rentalEndChecklist")
    fun getRentalEndQuestionList(@Body rentalQuestionRequest: RentalQuestionRequest): Observable<List<RentalQuestionsResponse>>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @POST("/{app_name}/rest/rental/rentalPackages")
    fun getRentalPackages(@Body rentalPackageRequest: KmPackageRequest): Observable<List<KmPackageResponse>>


    @Headers(
        "Content-Type: application/json",
        "Accept: application/json"
    )
    @GET("/{app_name}/rest/vehicle/{id}/info")
    fun getVehicleInfo(@Path("id") id: Int?) : Observable<VehicleInfoModel>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @POST("/{app_name}/rest/rental/buyPackage/3d")
    fun buyRentalPackage(@Body rentalPackageRequest: BuyKmPackageRequest): Observable<BaseResponse>


    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @POST("/{app_name}/rest/rental/rentalStartChecklist")
    fun getRentalStartQuestionList(@Body rentalQuestionRequest: RentalQuestionRequest): Observable<List<RentalQuestionsResponse>>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @POST("/{app_name}/rest/rental/firstRentalChecklist")
    fun getFirstRentalQuestionList(@Body rentalQuestionRequest: RentalQuestionRequest): Observable<List<RentalQuestionsResponse>>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @GET("/{app_name}/rest/activeRental")
    fun getActiveRental(): Observable<RentalInfoModel>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @POST("/{app_name}/rest/rental/payDebt")
    fun getPayDebt(@Body payDebtRequest: PayDebtRequest): Observable<RentalInfoModel>

    //endregion

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @GET("/{app_name}/rest/rental/list")
    fun getRentalList(): Observable<List<RentalInfoModel>>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @GET("/{app_name}/rest/rental/detail")
    fun getRentalDetail(@Query("rentalId") rentalId: Long): Observable<RentalInfoModel>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @GET("/{app_name}/rest/rental/trips")
    fun getRentalTrips(@Query("rentalId") rentalId: Long): Observable<List<TripModel>>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @GET("/{app_name}/rest/rental/assetHistory")
    fun getRentalAssetHistory(@Query("rentalId") rentalId: Long): Observable<List<AssetHistoryModel>>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @GET("/{app_name}/rest/rental/billInfo")
    fun getRentalBillInfo(@Query("rentalId") rentalId: Long): Observable<BillInfoModel>

    @Headers(
        "Content-Type: application/json",
        "Accept: application/json"
    )
    @GET("/{app_name}/rest/rental/billInfoForCancelation")
    fun getRentalBillInfoForCancellation(@Query("rentalId") rentalId: Long): Observable<BillInfoModel>

    @Headers(
        "Content-Type: application/json",
        "Accept: application/json"
    )
    @GET("/{app_name}/rest/rental/paymentBreakDown")
    fun getPaymentBreakDown(): Observable<PaymentBreakDownResponse>

    @Headers(
        "Content-Type: application/json",
        "Accept: application/json"
    )
    @POST("/{app_name}/rest/rental/multiRate")
    fun sendMultiRating(@Body request: MultiRatingRequest): Observable<BaseResponse>

    @POST("/{app_name}/rest/customer/pay-debt")
    fun payDebtBalance(@Body request: PayDebtBalanceRequest): Observable<BaseResponse>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @GET("/{app_name}/rest/price/promotion/validate")
    fun checkCouponCode(@Query("code") code: String, @Query("vehicleId") vehicleId: Int, @Query("rentalType") rentalType: String?,@Query("zoneType") zoneType: String?): Observable<CouponCodeResponseModel>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @POST("/{app_name}/rest/payments/check-3d-payment")
    fun check3dPayment(@Body request: PaymentCompleteRequest): Observable<PaymentCompleteResponse>


    @POST("/{app_name}/rest/rental/start-rental-payment/pay3d")
    fun getPaymentUrl(@Body request: PaymentUrlRequest): Observable<SecurePaymentResponse>

}