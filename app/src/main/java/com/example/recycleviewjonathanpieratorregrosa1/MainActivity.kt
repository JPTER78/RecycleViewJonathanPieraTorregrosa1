package com.example.recycleviewjonathanpieratorregrosa1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Lista de comidas con URLs de Wikipedia
        val foodList = listOf(
            Food("Pizza", "Italia", R.drawable.pizza, "https://es.wikipedia.org/wiki/Pizza"),
            Food("Paella", "España", R.drawable.paella, "https://es.wikipedia.org/wiki/Paella"),
            Food("Kebab", "Turquía", R.drawable.kebab, "https://es.wikipedia.org/wiki/Kebab"),
            Food("Hamburguesa", "Estados Unidos", R.drawable.hamburguesa, "https://es.wikipedia.org/wiki/Hamburguesa"),
            Food("Pasta", "Italia", R.drawable.pasta, "https://es.wikipedia.org/wiki/Pasta")
        )

        val adapter = FoodAdapter(foodList)
        recyclerView.adapter = adapter
    }
}
