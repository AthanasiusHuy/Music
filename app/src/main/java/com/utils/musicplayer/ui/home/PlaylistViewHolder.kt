package com.utils.musicplayer.ui.home

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.musicapp.R

class PlaylistViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var imageView: ImageView
    var nameView: TextView
    var trackView: TextView
    var durationView: TextView


    init {
        imageView = itemView.findViewById(R.id.imageview)
        nameView = itemView.findViewById(R.id.name)
        trackView = itemView.findViewById(R.id.amount)
        durationView = itemView.findViewById(R.id.duration)
    }
}