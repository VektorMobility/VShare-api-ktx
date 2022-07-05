package com.vektor.vshare_api_ktx.service

import com.vektor.vshare_api_ktx.model.VersionResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface VersionService {

    @Headers(
        "Content-Type: application/json",
        "Accept: application/json"
    )
    @GET("/report/app/mobile/version")
    fun checkVersion(@Query("appName") appName: String, @Query("platform") platform: String): Observable<VersionResponse>

    @Headers(
            "Content-Type: application/json",
            "Accept: application/json"
    )
    @GET("/report/app/mobile/version/v2")
    fun checkVersions(@Query("appName") appName: String, @Query("platform") platform: String): Observable<VersionResponse>
}