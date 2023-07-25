package com.utils.musicplayer.ui.dashboard.artist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.musicapp.R
import com.model.Song

class ActivityTrack : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview3)
        recyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val songs: MutableList<Song> = ArrayList<Song>()
        songs.add(Song("Red Bone", R.mipmap.albumcover, " 6:19"))
        songs.add(Song("Red Bone", R.mipmap.albumcover, " 6:19"))
        songs.add(Song("Red Bone", R.mipmap.albumcover, " 6:19"))
        songs.add(Song("Red Bone", R.mipmap.albumcover, " 6:19"))
        songs.add(Song("Red Bone", R.mipmap.albumcover, " 6:19"))
        songs.add(Song("Red Bone", R.mipmap.albumcover, " 6:19"))
        songs.add(Song("Red Bone", R.mipmap.albumcover, " 6:19"))
        songs.add(Song("Red Bone", R.mipmap.albumcover, " 6:19"))
        songs.add(Song("Red Bone", R.mipmap.albumcover, " 6:19"))
        songs.add(Song("Red Bone", R.mipmap.albumcover, " 6:19"))
        recyclerView.adapter = AdapterRecent(applicationContext, songs)
    }
}