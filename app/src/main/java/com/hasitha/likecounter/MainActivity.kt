package com.hasitha.likecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels

class MainActivity : AppCompatActivity() {

    val viewModelLike: LikeViewModel by viewModels()
    val viewModelDislike: DislikeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewLikeCount: TextView = findViewById(R.id.textViewLikeCount)
        val likeButton: Button = findViewById(R.id.buttonLike)

        val textViewDislikeCount: TextView = findViewById(R.id.textViewDislikeCount)
        val dislikeButton: Button = findViewById(R.id.buttonDislike)

        likeButton.setOnClickListener{
            viewModelLike.performLike()
            textViewLikeCount.text = viewModelLike.likeCounter.toString()
        }

        dislikeButton.setOnClickListener{
            viewModelDislike.performDislike()
            textViewDislikeCount.text = viewModelDislike.dislikeCounter.toString()
        }
    }

}