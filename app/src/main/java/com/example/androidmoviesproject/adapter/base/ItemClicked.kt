package com.example.androidmoviesproject.adapter.base

import android.widget.ImageView
import com.example.androidmoviesproject.data.model.ModelMovie

/**
 * When Item of RecycleView Clicked
 * */
interface ItemClicked {
    fun onClick(value: ModelMovie?, imageView: ImageView?)
}