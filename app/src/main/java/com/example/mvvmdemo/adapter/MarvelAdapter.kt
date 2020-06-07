package com.example.mvvmdemo.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmdemo.R
import com.example.mvvmdemo.databinding.MarvelAdapterBinding
import com.example.mvvmdemo.model.Hero

class MarvelAdapter(var heroList: List<Hero>) : RecyclerView.Adapter<MarvelAdapter.MyView>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyView {

        val layoutInflater = LayoutInflater.from(parent.context)
        val categoryBinding: MarvelAdapterBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.marvel_adapter, parent, false)

        return MyView(categoryBinding)
    }

    override fun getItemCount(): Int {
        return heroList.size
    }

    override fun onBindViewHolder(holder: MyView, position: Int) {
        holder.marvelAdapterBinding.hero = heroList.get(position)
        holder.marvelAdapterBinding.executePendingBindings()
    }

    inner class MyView(var marvelAdapterBinding: MarvelAdapterBinding) :
        RecyclerView.ViewHolder(marvelAdapterBinding.root)
}