package com.vektor.vshare_api_ktx.service

import com.vektor.vshare_api_ktx.model.UploadResponse2
import io.reactivex.Observable
import okhttp3.MultipartBody
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part

interface UploadImageService {

    //    @POST("/report/rest/file/upload")
    //    void uploadImage(@Body MultipartTypedOutput multipartTypedOutput, Callback<UploadResponse> cb);

    //    @Multipart
    //    @POST("/report/rest/file/uploadMany")
    //    Call<UploadResponse> uploadImages(@Header("vektor-token") String token, @Part List<MultipartBody.Part> files);


    @Multipart
    @POST("/report/rest/file/uploadMany2")
    fun uploadImages2(@Part files: List<MultipartBody.Part>): Observable<UploadResponse2>

}