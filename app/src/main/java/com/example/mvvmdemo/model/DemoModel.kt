package com.example.mvvmdemo.model

import android.content.Intent
import android.graphics.Color
import android.view.View
import android.widget.ImageView
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.example.mvvmdemo.BR
import com.example.mvvmdemo.HomeScreen

data class DemoModel(
    private var _name: String,
    private var _email: String,
    private var _imageUrl: String
) : BaseObservable() {

    var name: String
        @Bindable get() = _name
        set(value) {
            _name = value
            notifyPropertyChanged(BR.name)
        }
    var email: String
        @Bindable get() = _email
        set(value) {
            _email = value
            notifyPropertyChanged(BR.email)
        }

    var imageUrl: String
        @Bindable get() = _imageUrl
        set(value) {
            _imageUrl = value
//            notifyPropertyChanged(BR.imageUrl)
        }

    companion object {
        @JvmStatic
        @BindingAdapter("imagePath")
        fun loadImage(view: ImageView, imageUrl: String) {
            Glide.with(view.getContext())
                .load(imageUrl)
                .into(view)
        }
    }


    fun btnClick(view: View) {
        name = "Karan"
        email = "Karan@gmail.com"
        view.setBackgroundColor(Color.RED)

        view.context.startActivity(Intent(view.context, HomeScreen::class.java))
    }
}