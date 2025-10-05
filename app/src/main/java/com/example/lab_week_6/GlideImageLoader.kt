package com.example.lab_week_6

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide

class GlideImageLoader(private val context: Context) : ImageLoader {
    override fun loadImage(imageUrl: String, imageView: ImageView) {
        Glide.with(context)
            .load(imageUrl)     // ambil gambar dari url
            .centerCrop()       // crop gambar biar proporsional
            .into(imageView)    // taruh ke imageView
    }
}