package com.example.restaurantview.data.retrofit

import com.example.restaurantview.data.response.PostReviewResponse
import com.example.restaurantview.data.response.RestaurantResponse
import retrofit2.Call
import retrofit2.http.*

interface ApiService {
    @GET("detail/{id}")
    fun getRestaurant(
        @Path("id") id: String
    ): Call<RestaurantResponse>

    @FormUrlEncoded
    @Headers("Authorization: token 12345")
    @POST("review")
    fun postReview(
        @Field("id") Id: String,
        @Field("name") name: String,
        @Field("review") review: String
    ) : Call<PostReviewResponse>
}