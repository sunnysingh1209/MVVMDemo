package com.example.mvvmdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.mvvmdemo.databinding.ActivityMainBinding
import com.example.mvvmdemo.model.DemoModel
import com.facebook.drawee.backends.pipeline.Fresco

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Fresco.initialize(this)
        setContentView(R.layout.activity_main)

        var demoModel = DemoModel(
            "Sunny",
            "Sunny@gmail.com",
            "https://www.simplifiedcoding.net//demos//marvel//ironman.jpg"
        )

        var binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.demo = demoModel

    }
}
