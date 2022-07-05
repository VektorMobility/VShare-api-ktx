package com.vektor.vshare_api_ktx.service

import com.vektor.vshare_api_ktx.model.*
import io.reactivex.Observable
import org.json.JSONObject
import retrofit2.http.*

interface CarService {

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @GET("/{app_name}/public/vehicle/search")
    fun getCarList(@Query("latitude") latitude: Double, @Query("longitude") longitude: Double, @Query("mobileId") mobileId: String, @Query("lang") language: String): Observable<SearchCarListResponse>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @GET("/{app_name}/public/vehicle/search/selfService")
    fun getCarListWithSelfService(@Query("latitude") latitude: Double, @Query("longitude") longitude: Double, @Query("mobileId") mobileId: String, @Query("lang") language: String): Observable<SearchCarListResponse>

    @Headers(
        "Content-Type: application/json",
        "Accept: application/json"
    )
    @GET("/{app_name}/public/v2/vehicle/search/selfService")
    fun getCarListWithSelfService2(@Query("latitude") latitude: Double, @Query("longitude") longitude: Double, @Query("mobileId") mobileId: String, @Query("cacheVersion") cacheVersion: Long): Observable<SearchCarListResponse2>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @GET("/{app_name}/public/v4/vehicle/search/selfService")
    fun getCarListWithSelfService4(@Query("latitude") latitude: Double, @Query("longitude") longitude: Double, @Query("mobileId") mobileId: String, @Query("cacheVersion") cacheVersion: Long): Observable<SearchCarListResponse2>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @GET("/{app_name}/public/catalog/list")
    fun getCarCatalogList(@Query("lang") language: String): Observable<List<CarDetailModel>>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @GET("/{app_name}/rest/vehicle/damages")
    fun getCarDamageList(@Query("vehicleId") vehicleId: Long): Observable<List<DamageModel>>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @POST("/{app_name}/rest/rental/addDamage")
    fun addCarDamages(@Body damageRequest: DamageRequest): Observable<JSONObject>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @POST("/{app_name}/rest/rental/accidentPhotos")
    fun addAccidentPhotos(@Body accidentPhotosRequest: AccidentPhotosRequest): Observable<BaseResponse>


    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @POST("/{app_name}/rest/rental/addProblem")
    fun addProblem(@Body uploadReportProblemResponse: UploadReportProblemResponse): Observable<BaseResponse>

    @Headers(
        "Content-Type: application/json",
        "Accept: application/json"
    )
    @POST("/{app_name}/rest/rental/ispark-invoice")
    fun ParkBillUpload(@Body uploadParkBillResponse: UploadParkBillResponse): Observable<BaseResponse>


    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @POST("/{app_name}/rest/price/dailyBreakDown")
    fun postPayment(@Body dailyPaymentRequest: DailyPaymentRequest): Observable<DailyPaymentModel>


    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @POST("/{app_name}/rest/rental/extendDailyRental/3d")
    fun extendRental(@Body request: ExtendRentalRequest): Observable<BaseResponse>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @GET("/{app_name}/public/serviceAreaData")
    fun getServiceAreaDataResponse(@Query("lang") language: String = "tr"): Observable<ServiceAreaDataResponse>

    @Headers(
        "Content-Type: application/json",
        "Accept: application/json"
    )
    @GET("/{app_name}/rest/zones/availableZonesForRentalEnd/{id}")
    fun getZoaneServiceAreaDataResponse(@Path("id") path: String): Observable<List<ServiceAreaZonesDataResponse>>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @GET("/{app_name}/rest/zones/search/{path}")
    fun getServiceAreaZoneDataResponse(@Path("path") path: String, @Query("latitude") latitude: Double, @Query("longitude") longitude: Double): Observable<List<ServiceAreaZonesDataResponse>>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @GET("/{app_name}/rest/zones/{path}/availableVehicles/v2")
    fun getZoneCarListResponse(@Path("path") path: String): Observable<List<VehicleAndDistanceModel2>>


    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @GET("/{app_name}/public/parks")
    fun getParkResponse(): Observable<List<Park>>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @GET("/{app_name}/public/v2/catalog/list")
    fun getCarCategoryList(@Query("rentalType") rentalType: String, @Query("lang") lang: String = "TR", @Query("cacheVersion") cacheVersion: Int = 0): Observable<DefinitionsData>

    @GET("/{app_name}/rest/vehicle/vehicleByQrCode")
    fun getVehicleByQrCode(@Query("chassis") chassis: String) : Observable<VehicleByQrCodeResponse>

    @GET("/{app_name}/rest/rental/end/preCheck")
    fun preCheck(): Observable<BaseResponse>

    @POST("/{app_name}/public/log/error/add")
    fun sendErrorLog(@Body request: ErrorLogRequest): Observable<BaseResponse>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @POST("/{app_name}/public/log/logUnregisteredUser")
    fun sendLocationLog(@Body request: LocationLogRequest): Observable<BaseResponse>
}