package com.example.weatherapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainNewModel : ViewModel() {

    val liveDataCurrent = MutableLiveData<String>()
    val liveDataList = MutableLiveData<List<String>>()




}