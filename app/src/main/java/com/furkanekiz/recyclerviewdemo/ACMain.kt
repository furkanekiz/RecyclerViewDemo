package com.furkanekiz.recyclerviewdemo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ACMain : AppCompatActivity() {

    private val fruitsList = listOf(
        Fruit("Mango", "Joe"),
        Fruit("Apple", "Frank"),
        Fruit("Banana", "Tom"),
        Fruit("Guava", "Joe"),
        Fruit("Lemon", "Alex"),
        Fruit("Pear", "Joe"),
        Fruit("Orange", "Alex")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ac_main)

        val recyclerView = findViewById<RecyclerView>(R.id.myRecyclerView)
        recyclerView.setBackgroundColor(Color.MAGENTA)

        recyclerView.layoutManager = LinearLayoutManager(this)

        recyclerView.adapter = AdapterRecyclerView(
            fruitsList,
        ) { selectedItem: Fruit ->
            listItemClicked(selectedItem)
        }

    }

    private fun listItemClicked(fruit: Fruit) {
        Toast.makeText(this, "Supplier is : ${fruit.name}", Toast.LENGTH_SHORT)
            .show()
    }
}