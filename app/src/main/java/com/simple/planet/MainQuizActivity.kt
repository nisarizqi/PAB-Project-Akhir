package com.simple.planet

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ismaeldivita.chipnavigation.ChipNavigationBar
import com.simple.planet.Level
import com.simple.planet.LevelAdapter
import com.simple.planet.QuizActivity

class MainQuizActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var levelList: ArrayList<Level>
    private lateinit var levelAdapter: LevelAdapter
    private lateinit var bottomNavBar: ChipNavigationBar

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainquiz)

        recyclerView = findViewById(R.id.level_rv)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        levelList = ArrayList()

        levelList.add(Level(1, "Easy"))
        levelList.add(Level(2, "Medium"))
        levelList.add(Level(3, "Hard"))

        levelAdapter = LevelAdapter(levelList)
        recyclerView.adapter = levelAdapter

        levelAdapter.onItemClick = {
            val intent = Intent(this, QuizActivity::class.java)
            intent.putExtra("level", it)

            startActivity(intent)
            finish()
        }

        bottomNavBar = findViewById(R.id.bottom_nav_bar)

        // Set the default selected item (fragment) when the activity starts
        bottomNavBar.setItemSelected(R.id.NavBar2)


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