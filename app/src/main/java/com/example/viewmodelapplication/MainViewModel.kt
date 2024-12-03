package com.example.viewmodelapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var count = 0

    var livecount = MutableLiveData<Int>(0)

    val  countlive: LiveData<Int> = livecount

    fun countlogic() {
        count++
        livecount.postValue(count)
    }
}