package com.example.mvvmdemo.repository

import com.example.mvvmdemo.model.Hero
import com.example.mvvmdemo.network.MarvelApi
import retrofit2.Response

class MarvelRepository {
    suspend fun getMovies(): Response<List<Hero>> {
/*        var responseList = MutableLiveData<List<Hero>>()

        MarvelApi().getMovies().enqueue(object : Callback<List<Hero>> {
            override fun onFailure(call: Call<List<Hero>>, t: Throwable) {

            }

            override fun onResponse(call: Call<List<Hero>>, response: Response<List<Hero>>) {
                var res = response.body()
                responseList.value = res
            }

        })

     return responseList*/
        return MarvelApi().getMovies()
    }
}