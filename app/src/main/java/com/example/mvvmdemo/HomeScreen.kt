package com.example.mvvmdemo

import android.os.Bundle
import android.widget.StackView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mvvmdemo.adapter.MarvelAdapter
import com.example.mvvmdemo.viewmodel.MarvelViewModel
import kotlinx.android.synthetic.main.activity_home_screen.*

class HomeScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

        var marvelViewModel = ViewModelProviders.of(this).get(MarvelViewModel::class.java)
        marvelViewModel.getData().observe(this, Observer {
            marvelRecView.layoutManager = LinearLayoutManager(this@HomeScreen)
            marvelRecView.adapter = MarvelAdapter(it)
        })
        

    }
}
