package com.simple.planet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.simple.planet.Constants
import com.simple.planet.MainQuizActivity
import com.simple.planet.R
import org.w3c.dom.Text

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val score = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)
        val total = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)

        val scoreTv: TextView = findViewById(R.id.score_tv)
        scoreTv.text = "Your score is $score out of $total"

        val btnFinish: Button = findViewById(R.id.btn_finish)

        btnFinish.setOnClickListener(){
            startActivity(Intent(this, MainQuizActivity::class.java))
        }
    }
}