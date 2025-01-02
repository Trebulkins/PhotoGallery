package com.example.photogallery2.api

import retrofit2.Call
import retrofit2.http.GET

interface FlickrApi {
    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=вашApiКлюч" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )
    fun fetchPhotos(): Call<String>
}