package com.hafizcode.livedatawithapi

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.Call

interface ApiService {
    @GET("detail/{id}")
    fun getRestaurant(
        @Path("id") id: String
    ): Call<RestaurantResponse>
}