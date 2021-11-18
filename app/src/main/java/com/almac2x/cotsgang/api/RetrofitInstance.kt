package com.almac2x.cotsgang.api

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

private const val BASE_URL :String = "https://jsonplaceholder.typicode.com/" // base url goes here TEMP ONLY!!!!!
object RetrofitInstance {

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create()) // creates Moshi as our data converter
            .build()
    }

    val api: ProjectAPI by lazy { // since the above is private. We created this so we can create a public instance
        retrofit.create(ProjectAPI::class.java)
    }
}