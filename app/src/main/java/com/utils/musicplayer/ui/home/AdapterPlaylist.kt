package com.utils.musicplayer.ui.home

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.musicapp.R
import com.model.Playlist

class AdapterPlaylist(var context: Context, playlist: List<Playlist>) :
    RecyclerView.Adapter<PlaylistViewHolder>() {

    var playlist: List<Playlist>

    init {
        this.playlist = playlist
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaylistViewHolder {
        return PlaylistViewHolder(
            LayoutInflater.from(context).inflate(R.layout.playlist_view, parent, false)
        )
    }

    override fun onBindViewHolder(holder: PlaylistViewHolder, position: Int) {
        holder.nameView.text = playlist[position].name
        holder.imageView.setImageResource(playlist[position].image)
        holder.trackView.text = playlist[position].amount.toString()
        holder.durationView.text = playlist[position].duration
    }
    override fun getItemCount(): Int {
        return playlist.size
    }
}
