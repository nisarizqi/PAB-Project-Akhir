package com.simple.planet

import androidx.fragment.app.Fragment

import android.content.Intent
import android.os.Bundle
import android.os.Parcel
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.ismaeldivita.chipnavigation.ChipNavigationBar

class Navbar : AppCompatActivity() {

    private lateinit var bottomNavBar: ChipNavigationBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainquiz)

        bottomNavBar = findViewById(R.id.bottom_nav_bar)

        // Set the default selected item (fragment) when the activity starts


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
