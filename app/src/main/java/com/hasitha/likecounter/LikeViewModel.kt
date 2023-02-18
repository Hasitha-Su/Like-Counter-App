package com.hasitha.likecounter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LikeViewModel: ViewModel() {
    //var likeCounter: Int = 0;
    //var likeCounter = 0;
    private var _likeCount = MutableLiveData<Int>(0)
    val likeCount: LiveData<Int>
        get() = _likeCount

    fun performLike(){
        //likeCounter++
        _likeCount.value = _likeCount.value !! + 1
    }
}