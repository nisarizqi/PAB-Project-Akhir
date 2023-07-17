package com.simple.planet

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.simple.planet.databinding.ViewBinding

class Adapter(private val planet: List<PlanetData>) : RecyclerView.Adapter<Adapter.MyViewHolder>() {

    class MyViewHolder(private val binding: ViewBinding) : RecyclerView.ViewHolder(binding.root) {
        val title = binding.title
        val planetImg = binding.planetImg
        val galaxy = binding.galaxy
        val distance = binding.distance
        val gravity = binding.gravity
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = planet[position]
        var dummyImage: Int? = null

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, PlanetDetail::class.java)
            intent.putExtra("planet", currentItem)
            intent.putExtra("planetImage", dummyImage)
            holder.itemView.context.startActivity(intent)
        }

        holder.title.text = currentItem.title
        holder.galaxy.text = currentItem.galaxy
        holder.distance.text = "${currentItem.distance} m km"
        holder.gravity.text = "${currentItem.gravity} m/ss"

        dummyImage = getDummyImage(currentItem.title)
        holder.planetImg.setImageResource(dummyImage!!)
    }

    override fun getItemCount(): Int {
        return planet.size
    }

    private fun getDummyImage(title: String?): Int {
        return when (title?.lowercase()) {
            "mars" -> R.drawable.ic_mars
            "neptune" -> R.drawable.ic_neptune
            "earth" -> R.drawable.ic_earth
            "moon" -> R.drawable.ic_moon
            "venus" -> R.drawable.ic_venus
            "jupiter" -> R.drawable.ic_jupiter
            "saturn" -> R.drawable.ic_saturn
            "uranus" -> R.drawable.ic_uranus
            "mercury" -> R.drawable.ic_mercury
            "sun" -> R.drawable.ic_sun
            else -> R.drawable.ic_earth
        }
    }
}
