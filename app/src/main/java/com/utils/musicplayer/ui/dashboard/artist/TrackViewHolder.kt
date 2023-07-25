package com.utils.musicplayer.ui.dashboard.artist

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.musicapp.R

class TrackViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    var imageView: ImageView
    var nameView: TextView
    var durationView: TextView


    init {
        imageView = itemView.findViewById(R.id.imageview)
        nameView = itemView.findViewById(R.id.name)
        durationView = itemView.findViewById(R.id.duration)
    }
}