package com.hasitha.likecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.hasitha.likecounter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val viewModelLike: LikeViewModel by viewModels()
    val viewModelDislike: DislikeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.likeVM = viewModelLike
        binding.lifecycleOwner = this
        binding.buttonLike.setOnClickListener{
            viewModelLike.performLike()
        }

        val likeObserver = Observer<Int>{
            newValue -> binding.textViewLikeCount.text = newValue.toString()
        }
        viewModelLike.likeCount.observe(this, likeObserver)


        binding.dislikeVM = viewModelDislike
        binding.buttonDislike.setOnClickListener {
            viewModelDislike.performDislike()
        }

        val dislikeObserver = Observer<Int>{
                newValue -> binding.textViewDislikeCount.text = newValue.toString()
        }
        viewModelDislike.dislikeCount.observe(this, dislikeObserver)
    }

}