package com.example.clase5equipodefutbol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: Adapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerViewClub)
        recyclerView.layoutManager = LinearLayoutManager(this)

        adapter = Adapter(applicationContext)
        recyclerView.adapter = adapter

        adapter.submitList(listadoEquipos())
        adapter.onItemClickListener = { equipo ->

        }
    }

    private fun listadoEquipos(): MutableList<Equipo>? {

        return mutableListOf(
            Equipo(
                1,
                "River",
                4,
                "https://upload.wikimedia.org/wikipedia/commons/3/3f/Logo_River_Plate.png"
            )
        )
    }
}