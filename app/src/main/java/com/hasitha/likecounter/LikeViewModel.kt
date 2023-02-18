package com.hasitha.likecounter

import androidx.lifecycle.ViewModel

class LikeViewModel: ViewModel() {
    //var likeCounter: Int = 0;
    var likeCounter = 0;

    fun performLike(){
        this.likeCounter++
    }
}