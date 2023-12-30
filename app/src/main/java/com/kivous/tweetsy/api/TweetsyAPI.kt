package com.kivous.tweetsy.api

import com.kivous.tweetsy.models.TweetListItem
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface TweetsyAPI {

    @GET("/v3/b/658ec501dc746540188a5ff9?meta=false")
    suspend fun getTweets(@Header("x-JSON-Path") category: String): Response<List<TweetListItem>>

    @GET("/v3/b/658ec501dc746540188a5ff9?meta=false")
    @Headers("x-JSON-Path:tweets..category")
    suspend fun getCategories(): Response<List<String>>
}