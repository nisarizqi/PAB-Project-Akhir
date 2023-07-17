package com.simple.planet

import android.content.Intent
import android.os.Bundle
import android.os.Parcel
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    private var imagesCard: CardView? = null
    private var imagesCard2: CardView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.simple.planet.R.layout.activity_main)

        imagesCard = findViewById<CardView>(R.id.imageCard)
        imagesCard?.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainWikiActivity::class.java)
            startActivity(intent)
        })

        imagesCard2 = findViewById<CardView>(R.id.QuizCard)
        imagesCard2?.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainQuizActivity::class.java)
            startActivity(intent)
        })

//        imagesCard3 = findViewById<CardView>(R.id.QuizCard)
//        imagesCard3?.setOnClickListener(View.OnClickListener {
//            val intent = Intent(this@MainActivity, MainQuizActivity::class.java)
//            startActivity(intent)
//        })


    }
}