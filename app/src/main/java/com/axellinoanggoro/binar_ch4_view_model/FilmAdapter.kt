package com.axellinoanggoro.binar_ch4_view_model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class FilmAdapter(var listFilm : ArrayList<DataFilm>): RecyclerView.Adapter<FilmAdapter.ViewHolderFilm>() {
    class ViewHolderFilm(itemView: View) : RecyclerView.ViewHolder(itemView){
        var imgFilm = itemView.findViewById<ImageView>(R.id.filmImg)
        var judul = itemView.findViewById<TextView>(R.id.filmJudul)
        var tanggal = itemView.findViewById<TextView>(R.id.filmTanggal)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmAdapter.ViewHolderFilm {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_film, parent, false)
        return ViewHolderFilm(view)
    }

    override fun onBindViewHolder(holder: FilmAdapter.ViewHolderFilm, position: Int) {
        var data = listFilm[position]
        holder.imgFilm.setImageResource(data.image)
        holder.judul.text = data.judul
        holder.tanggal.text = data.tanggal
    }

    override fun getItemCount(): Int {
        return listFilm.size
    }

    fun setFilmData(listFilm: ArrayList<DataFilm>)
    {
        this.listFilm=listFilm
//        notifyDataSetChanged()
    }

}