package com.example.app_brasilian_birds_assement_fundamentalsofcomputing

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TestViewModel: ViewModel() {
    var number = 2000000

    val currentNumber: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }

    val currentBoolean: MutableLiveData<Boolean> by lazy {
        MutableLiveData<Boolean>()
    }
}