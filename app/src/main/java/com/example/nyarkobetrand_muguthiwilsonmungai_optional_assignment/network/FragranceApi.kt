package com.example.nyarkobetrand_muguthiwilsonmungai_optional_assignment.network

import com.example.nyarkobetrand_muguthiwilsonmungai_optional_assignment.model.FragrancesResponse
import retrofit2.http.GET

interface FragranceApi
{
    @GET("category/fragrances")

    suspend fun getFragrances(): FragrancesResponse

}