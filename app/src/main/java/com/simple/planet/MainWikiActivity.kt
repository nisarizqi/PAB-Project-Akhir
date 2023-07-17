package com.simple.planet

import android.content.Intent
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ismaeldivita.chipnavigation.ChipNavigationBar
import com.simple.planet.databinding.ActivityMainBinding
import com.simple.planet.databinding.ActivityWikimainBinding


class MainWikiActivity() : AppCompatActivity() {
    // ...

    // Implementasi metode Parcelable di sini

    private lateinit var binding: ActivityWikimainBinding
    private lateinit var bottomNavBar: ChipNavigationBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityWikimainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.decorView.apply {
            systemUiVisibility =
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN
        }

        binding.myRecycler.adapter = Adapter(setData.SetPlanet())
        binding.myRecycler.layoutManager = LinearLayoutManager(this)

        bottomNavBar = findViewById(R.id.bottom_nav_bar)

        // Set the default selected item (fragment) when the activity starts
        bottomNavBar.setItemSelected(R.id.NavBar1)

        bottomNavBar.setOnItemSelectedListener { itemId ->
            when (itemId) {
                R.id.NavBar1 -> {
                    val intent = Intent(this, MainWikiActivity::class.java)
                    startActivity(intent)
                }
                R.id.NavBar2 -> {
                    val intent = Intent(this, MainQuizActivity::class.java)
                    startActivity(intent)
                }
                R.id.NavBar3 -> {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }
                // Add more cases for additional items if needed
            }
        }
    }


}