package com.simple.planet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.simple.planet.R

class LevelAdapter(private val levelList:ArrayList<Level>) :RecyclerView.Adapter<LevelAdapter.LevelViewHolder>() {

    var onItemClick : ((Level) -> Unit)? = null

    class LevelViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val textView : TextView = itemView.findViewById(R.id.level_tv)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LevelViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.level_view, parent, false)

        return LevelViewHolder(view)
    }

    override fun onBindViewHolder(holder: LevelViewHolder, position: Int) {
        val level = levelList[position]
        holder.textView.text = level.text

        holder.textView.setOnClickListener{
            onItemClick?.invoke(level)
        }
    }

    override fun getItemCount(): Int {
        return levelList.size
    }

}