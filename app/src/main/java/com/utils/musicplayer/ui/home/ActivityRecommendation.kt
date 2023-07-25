package com.utils.musicplayer.ui.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.musicapp.R
import com.model.Playlist


class ActivityRecommendation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview2)
        recyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val playlists: MutableList<Playlist> = ArrayList<Playlist>()
        playlists.add(Playlist("Night Vocals", R.mipmap.playlist, 30, " 1 Hours 0 min"))
        playlists.add(Playlist("Night Vocals", R.mipmap.playlist, 30, " 1 Hours 0 min"))
        playlists.add(Playlist("Night Vocals", R.mipmap.playlist, 30, " 1 Hours 0 min"))
        playlists.add(Playlist("Night Vocals", R.mipmap.playlist, 30, " 1 Hours 0 min"))
        playlists.add(Playlist("Night Vocals", R.mipmap.playlist, 30, " 1 Hours 0 min"))
        playlists.add(Playlist("Night Vocals", R.mipmap.playlist, 30, " 1 Hours 0 min"))



        recyclerView.adapter = AdapterPlaylist(applicationContext, playlists)
    }
}
