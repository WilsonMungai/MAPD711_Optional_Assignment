package com.example.nyarkobetrand_muguthiwilsonmungai_optional_assignment.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object FragranceService
{
    private val retrofitBuilder = Retrofit
        .Builder()
        .baseUrl("https://dummyjson.com/products/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val retrofit = retrofitBuilder.create(FragranceApi::class.java)
}