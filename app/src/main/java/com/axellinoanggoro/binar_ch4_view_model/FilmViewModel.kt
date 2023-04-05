package com.axellinoanggoro.binar_ch4_view_model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FilmViewModel : ViewModel() {
    val list = arrayListOf(
        DataFilm("The Batman", "March 2, 2022", R.drawable.ic_android),
        DataFilm("Minions: The Rise of Gru", "June 29, 2022", R.drawable.ic_android),
        DataFilm("The Adam Project", "February 28, 2022", R.drawable.ic_android),
        DataFilm("Interceptor", "May 26, 2022",  R.drawable.ic_android),
        DataFilm("Ivanna", "July 14, 2022",  R.drawable.ic_android)
    )

    val filmList : MutableLiveData<List<DataFilm>> = MutableLiveData()

    fun getFilmList(){
        var film = list
        filmList.value = film
    }

}