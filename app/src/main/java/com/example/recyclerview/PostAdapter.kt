package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.card_layout.view.*

class PostAdapter(
    var list: List<Post>
): RecyclerView.Adapter<PostAdapter.PostViewHolder>() {
    inner class PostViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return PostViewHolder(view)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.itemView.apply {
            user.text = list[position].username
            post.text = list[position].comment
        }
    }
}