package com.deegolabs.myrecipeapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

private val retrofit = Retrofit.Builder().baseUrl("https://www.themealdb.com/api/json/v1/1/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()    // Kotlin 객체로 변형

val recipeService = retrofit.create(ApiService::class.java) // 사용될 수 있도록 유출시키는 변수

interface ApiService {
    @GET("categories.php")
    // 비동기 예약어 suspend: 함수가 완료될 떄까지 인터페이스의 응답성을 유지하면서 백그라운드에서 이를 처리한다.
    suspend fun getCategories(): CategoriesResponse
}