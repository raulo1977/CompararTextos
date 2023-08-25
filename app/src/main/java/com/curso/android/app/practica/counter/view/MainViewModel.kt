package com.curso.android.app.practica.counter.view

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    val text1 = MutableLiveData<String>()
    val text2 = MutableLiveData<String>()
    val comparisonResult = MutableLiveData<String>()

    fun onCompareButtonClick() {

      compareStrings(text1.value.toString(), text2.value.toString())


    }

    fun compareStrings(texto1: String, texto2: String) {

        if (texto1 == texto2) {
            comparisonResult.value = "Las cadenas son iguales"
        } else {
            comparisonResult.value = "Las cadenas son diferentes"
        }
    }
}
