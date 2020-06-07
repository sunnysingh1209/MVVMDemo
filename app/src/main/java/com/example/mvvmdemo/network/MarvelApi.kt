package com.example.mvvmdemo.network

import com.example.mvvmdemo.model.Hero
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface MarvelApi {

    @GET("marvel")
    suspend fun getMovies(): Response<List<Hero>>

    companion object {
        operator fun invoke(): MarvelApi {
            val interceptor = HttpLoggingInterceptor()
            interceptor.level = HttpLoggingInterceptor.Level.BODY
            val client = OkHttpClient.Builder().addInterceptor(interceptor).build()
            return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(client)
                .baseUrl("https://simplifiedcoding.net/demos/") //movies
                .build()
                .create(MarvelApi::class.java)
        }
    }
}