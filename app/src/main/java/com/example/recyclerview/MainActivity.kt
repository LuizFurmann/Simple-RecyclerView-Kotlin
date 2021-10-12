package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val posts = mutableListOf(
            Post("Alex","Coment for Alex"),
            Post("Maria","Comment for Maria"),
            Post("Luiz","Comment for Luiz")
        )

        val adapter = PostAdapter(posts)
        rv_posts.adapter = adapter
        rv_posts.layoutManager = LinearLayoutManager(this)
    }
}