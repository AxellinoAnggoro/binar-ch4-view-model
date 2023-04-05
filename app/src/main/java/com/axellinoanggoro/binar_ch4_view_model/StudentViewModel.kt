package com.axellinoanggoro.binar_ch4_view_model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StudentViewModel :ViewModel() {
    val list = arrayListOf(
        DataStudent("Andika", "24616724", R.drawable.ic_android),
        DataStudent("Titi", "64634634", R.drawable.ic_android),
        DataStudent("Dwika", "536436436", R.drawable.ic_android),
        DataStudent("Rois", "454345435",  R.drawable.ic_android),
        DataStudent("Wiwit", "3252664",  R.drawable.ic_android)
    )

    val studentList : MutableLiveData<List<DataStudent>> = MutableLiveData()

    fun getStudentList(){
        var stu = list
        studentList.value = stu
    }
}