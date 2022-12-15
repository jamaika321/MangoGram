package com.example.mangogram.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.api.models.ChatModel
import com.example.mangogram.R

class ChatsAdapter: ListAdapter<ChatModel, RecyclerView.ViewHolder>(BestSellersDiffCallback()) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.chat_item, parent, false)
        return BestSellersItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val itemViewHolder = holder as BestSellersItemViewHolder
        itemViewHolder.bind(getItem(position))
    }

    inner class BestSellersItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bind(bestSellerItem: ChatModel) {
            with(itemView) {

            }
        }
    }

    class BestSellersDiffCallback : DiffUtil.ItemCallback<ChatModel>() {

        override fun areItemsTheSame(oldItem: ChatModel, newItem: ChatModel): Boolean =
            oldItem.name == newItem.name

        override fun areContentsTheSame(oldItem: ChatModel, newItem: ChatModel): Boolean =
            oldItem == newItem
    }
}