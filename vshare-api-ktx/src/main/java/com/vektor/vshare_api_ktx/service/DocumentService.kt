package com.vektor.vshare_api_ktx.service

import com.vektor.vshare_api_ktx.model.BaseResponse
import com.vektor.vshare_api_ktx.model.DocumentRequest
import com.vektor.vshare_api_ktx.model.DocumentResponse
import com.vektor.vshare_api_ktx.model.RegisterAgreementRequest
import io.reactivex.Observable
import okhttp3.ResponseBody
import retrofit2.http.*

interface DocumentService {

    @POST("/umng/rest/documents")
    fun addDocument(@Body request: DocumentRequest): Observable<DocumentResponse>

    @GET
    fun downloadFileWithDynamicUrlSync(@Url fileUrl: String): Observable<ResponseBody>

    @POST("/{app_name}/public/document/eula")
    fun downloadEulaDocument(@Body registerAgreementRequest: RegisterAgreementRequest): Observable<ResponseBody>

    @POST("/{app_name}/public/document/preliminary")
    fun downloadPreliminaryDocument(@Body registerAgreementRequest: RegisterAgreementRequest): Observable<ResponseBody>

    @GET("/{app_name}/rest/customer/document/eula")
    fun downloadEulaDocument(): Observable<ResponseBody>

    @GET("/{app_name}/rest/customer/document/preliminary")
    fun downloadPreliminaryDocument(): Observable<ResponseBody>

    @POST("/{app_name}/rest/customer/document/eula")
    fun sendEulaDocument(@Query("email") email: String): Observable<BaseResponse>

    @POST("/{app_name}/rest/customer/document/preliminary")
    fun sendPreliminaryDocument(): Observable<BaseResponse>

}
