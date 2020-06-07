package com.example.mvvmdemo

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("image")
fun loadImage(view: ImageView, url: String) {
//    view.setImageURI(url)
    Glide.with(view.context).load(url).into(view)
}