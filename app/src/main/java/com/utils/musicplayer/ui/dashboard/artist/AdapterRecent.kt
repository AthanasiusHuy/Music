package com.utils.musicplayer.ui.dashboard.artist

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.musicapp.R
import com.model.Song


class AdapterRecent(var context: Context, songs: List<Song>) :
    RecyclerView.Adapter<TrackViewHolder>() {

    var songs: List<Song>

    init {
        this.songs = songs
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrackViewHolder {
        return TrackViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view, parent, false))
    }

    override fun onBindViewHolder(holder: TrackViewHolder, position: Int) {
        holder.nameView.setText(songs[position].name)
        holder.imageView.setImageResource(songs[position].image)
        holder.durationView.setText(songs[position].duration)
    }

    override fun getItemCount(): Int {
        return songs.size
    }
}
