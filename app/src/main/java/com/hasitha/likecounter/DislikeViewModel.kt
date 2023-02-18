package com.hasitha.likecounter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DislikeViewModel: ViewModel() {

    private var _dislikeCount = MutableLiveData<Int>(0)
    val dislikeCount: LiveData<Int>
        get() = _dislikeCount

    fun performDislike(){
        _dislikeCount.value = _dislikeCount.value !! + 1
    }
}