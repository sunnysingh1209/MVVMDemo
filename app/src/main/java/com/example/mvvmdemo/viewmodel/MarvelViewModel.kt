package com.example.mvvmdemo.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvmdemo.model.Hero
import com.example.mvvmdemo.repository.MarvelRepository
import com.example.mvvmdemo.util.Coroutines

class MarvelViewModel : ViewModel() {

    fun getData(): LiveData<List<Hero>> {
        var mutableHeroList = MutableLiveData<List<Hero>>()

        Coroutines.main {
            var data = MarvelRepository().getMovies()
            if (data.isSuccessful) {
                mutableHeroList.value = data.body()
            }
        }

        return mutableHeroList
    }

}