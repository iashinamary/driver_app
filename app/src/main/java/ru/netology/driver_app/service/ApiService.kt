package ru.netology.driver_app.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import ru.netology.driver_app.BuildConfig

private const val BASE_URL = "${BuildConfig.BASE_URL}/api/slow/"

private val retrofit = Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

class ApiService {
}