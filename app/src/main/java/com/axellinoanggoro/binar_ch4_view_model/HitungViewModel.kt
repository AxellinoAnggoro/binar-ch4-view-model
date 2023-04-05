package com.axellinoanggoro.binar_ch4_view_model

import androidx.lifecycle.ViewModel

class HitungViewModel : ViewModel() {
    var hasil = 0
//    var hasil : MutableLiveData<Int> = MutableLiveData(0)

    fun Hitung (panjang : Int, lebar : Int, tinggi :Int){
        hasil = panjang * lebar * tinggi
    }
}