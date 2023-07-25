package com.utils.musicplayer.ui.genre

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.musicapp.R
import com.model.Genre
import jp.wasabeef.recyclerview.animators.SlideInLeftAnimator


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerView.itemAnimator = SlideInLeftAnimator()
        val genres: MutableList<Genre> = ArrayList<Genre>()
        genres.add(Genre("Rap", R.mipmap.rap))
        genres.add(Genre("Rock", R.mipmap.rock))
        genres.add(Genre("Dance", R.mipmap.dance))
        genres.add(Genre("Blues", R.mipmap.blues))
        genres.add(Genre("Jazz", R.mipmap.jazz))
        genres.add(Genre("Country", R.mipmap.jazz))
        genres.add(Genre("Rap", R.mipmap.rap))
        genres.add(Genre("Rock", R.mipmap.rock))
        genres.add(Genre("Dance", R.mipmap.dance))
        genres.add(Genre("Blues", R.mipmap.blues))
        genres.add(Genre("Jazz", R.mipmap.jazz))
        genres.add(Genre("Country", R.mipmap.jazz))
        genres.add(Genre("Rap", R.mipmap.rap))
        genres.add(Genre("Rock", R.mipmap.rock))
        genres.add(Genre("Dance", R.mipmap.dance))
        genres.add(Genre("Blues", R.mipmap.blues))
        genres.add(Genre("Jazz", R.mipmap.jazz))
        genres.add(Genre("Country", R.mipmap.jazz))
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MyAdapter(applicationContext, genres)
    }
}