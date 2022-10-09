package com.example.miniproject2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.list)
        recyclerView.adapter = ListOfFriendsAdapter(this)
        recyclerView.layoutManager = LinearLayoutManager(this)

        //adding line decoration
        val decor = DividerItemDecoration(this, RecyclerView.VERTICAL)
        recyclerView.addItemDecoration(decor)
    }
}