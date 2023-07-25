package com.utils.musicplayer.ui.genre

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.musicapp.R
import com.model.Genre


class MyAdapter(var context: Context, genres: List<Genre>) :
    RecyclerView.Adapter<MyViewHolder>() {
    var genres: List<Genre>

    init {
        this.genres = genres
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view, parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.nameView.setText(genres[position].name)
        holder.imageView.setImageResource(genres[position].image)
    }

    override fun getItemCount(): Int {
        return genres.size
    }
}