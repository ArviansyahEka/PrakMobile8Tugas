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
        heroes.add(Hero("Ki Hajar Dewantara", R.drawable.kihajardewantara))
        heroes.add(Hero("I.R. Soekarno", R.drawable.irsoekarno))
        heroes.add(Hero("Soeharto", R.drawable.soeharto))
        heroes.add(Hero("Kapitan Pattimura", R.drawable.kapitanpattimura))
        heroes.add(Hero("Franz Kaisiepo", R.drawable.franzkaisiepo))

        // Setting up the adapter
        adapter = HeroAdapter(heroes)
        recyclerView.adapter = adapter
    }
}
