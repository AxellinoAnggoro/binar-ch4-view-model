package com.axellinoanggoro.binar_ch4_view_model

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.axellinoanggoro.binar_ch4_view_model.databinding.ActivityUsingViewModelBinding

class UsingViewModelActivity : AppCompatActivity() {
    lateinit var btnHitung : Button
    lateinit var etPanjang : EditText
    lateinit var etLebar : EditText
    lateinit var etTinggi : EditText
    lateinit var txtHasil : TextView
    lateinit var viewModel : HitungViewModel

    lateinit var binding : ActivityUsingViewModelBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUsingViewModelBinding.inflate(layoutInflater)

        setContentView(binding.root)

        btnHitung= binding.btnHitung
        etPanjang = binding.etPanjang
        etLebar = binding.etLebar
        etTinggi = binding.etTinggi
        txtHasil = binding.txtHasil

        viewModel = ViewModelProvider(this).get(HitungViewModel::class.java)
        txtHasil.text = viewModel.hasil.toString()
//        displayResult()

        btnHitung.setOnClickListener{
            var pj = etPanjang.text.toString().toInt()
            var lb = etLebar.text.toString().toInt()
            var tg = etTinggi.text.toString().toInt()
            viewModel.Hitung(pj,lb,tg)
            txtHasil.text = viewModel.hasil.toString()
        }


    }

    fun displayResult(){
        txtHasil.text = viewModel.hasil.toString()
    }
}