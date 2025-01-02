package com.example.photogallery2.api

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

interface FlickrApi {
    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=bcc6c14eee5ff1f6d4eeb5101c16a9d3" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )
    fun fetchPhotos(): Call<FlickrResponse>

    @GET fun fetchUrlBytes(@Url url: String): Call<ResponseBody>
}