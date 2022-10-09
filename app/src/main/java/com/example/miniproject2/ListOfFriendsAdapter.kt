package com.example.miniproject2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListOfFriendsAdapter(val context: Context) : RecyclerView.Adapter<ListOfFriendsAdapter.LFViewHolder>(){
    private val sampleData = SampleData()
    private val listOfFriends = sampleData.LIST_OF_FRIENDS

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LFViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.list_of_friends, parent, false)
        return LFViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: LFViewHolder, position: Int) {
        holder.name.text = listOfFriends[position].name
        holder.status.text = listOfFriends[position].status
    }

    override fun getItemCount(): Int {
        return listOfFriends.size
    }
    class LFViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val name: TextView = itemView.findViewById(R.id.name)
        val status: TextView = itemView.findViewById(R.id.status)
    }
}