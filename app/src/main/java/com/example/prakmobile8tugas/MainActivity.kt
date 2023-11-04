package com.example.prakmobile8tugas

import HeroAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: HeroAdapter
    private lateinit var heroes: ArrayList<Hero>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initializing the RecyclerView
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Populate the list of heroes
        heroes = ArrayList()
        heroes.add(Hero("Ki Hajar Dewantara", R.drawable.kihajardewantara, "2 Mei 1889", "26 April 1959"))
        heroes.add(Hero("I.R. Soekarno", R.drawable.irsoekarno, "6 Juni 1901", "21 Juni 1970"))
        heroes.add(Hero("Soeharto", R.drawable.soeharto, "8 Juni 1921", "27 Januari 2008"))
        heroes.add(Hero("Kapitan Pattimura", R.drawable.kapitanpattimura, "8 Juni 1783", "16 Desember 1817"))
        heroes.add(Hero("Franz Kaisiepo", R.drawable.franzkaisiepo, "10 Oktober 1921", "10 April 1979"))

        // Setting up the adapter
        adapter = HeroAdapter(heroes)
        recyclerView.adapter = adapter
    }
}
