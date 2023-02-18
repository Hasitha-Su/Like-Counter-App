package com.hasitha.likecounter

import androidx.lifecycle.ViewModel

class DislikeViewModel: ViewModel() {

    var dislikeCounter = 0;

    fun performDislike(){
        this.dislikeCounter++
    }
}