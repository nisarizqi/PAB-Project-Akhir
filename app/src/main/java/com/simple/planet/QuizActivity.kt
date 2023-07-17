package com.simple.planet

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import com.simple.planet.Level
import com.simple.planet.Question
import com.simple.planet.ResultActivity
import com.simple.planet.Constants

class QuizActivity : AppCompatActivity(), View.OnClickListener {
    @RequiresApi(Build.VERSION_CODES.TIRAMISU)

    private var mCurrentPosition:Int = 1
    private var mQuestionsList:ArrayList<Question>? = null
    private var mSelectedPosition: Int = 0
    private var mCorrectAnswer: Int = 0

    private lateinit var option1: TextView
    private lateinit var option2: TextView
    private lateinit var option3: TextView
    private lateinit var option4: TextView
    private lateinit var btnSubmit: Button

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        option1 = findViewById(R.id.option1_tv)
        option2 = findViewById(R.id.option2_tv)
        option3 = findViewById(R.id.option3_tv)
        option4 = findViewById(R.id.option4_tv)
        btnSubmit = findViewById(R.id.btn_submit)

        val level = intent.getParcelableExtra<Level>("level", Level::class.java)

        if(level != null){

            if(level.id == 1){

                mQuestionsList = Constants.getLevel1()

                setQuestion()

                option1.setOnClickListener(this)
                option2.setOnClickListener(this)
                option3.setOnClickListener(this)
                option4.setOnClickListener(this)
                btnSubmit.setOnClickListener(this)

            }
            if(level.id == 2){

                mQuestionsList = Constants.getLevel2()

                setQuestion()

                option1.setOnClickListener(this)
                option2.setOnClickListener(this)
                option3.setOnClickListener(this)
                option4.setOnClickListener(this)
                btnSubmit.setOnClickListener(this)

            }
            if(level.id == 3){

                mQuestionsList = Constants.getLevel3()

                setQuestion()

                option1.setOnClickListener(this)
                option2.setOnClickListener(this)
                option3.setOnClickListener(this)
                option4.setOnClickListener(this)
                btnSubmit.setOnClickListener(this)

            }
        }
    }

    @SuppressLint("SetTextI18n")
    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    private fun setQuestion(){

        val question: Question = mQuestionsList!![mCurrentPosition - 1]

        defaultOptionsView()

        if(mCurrentPosition == mQuestionsList!!.size){
            btnSubmit.text = "FINISH"
        }else{
            btnSubmit.text = "SUBMIT"
        }

        val progressBar:ProgressBar = findViewById(R.id.progressBar)
        val progressTv:TextView = findViewById(R.id.progress_tv)
        val questionTv: TextView = findViewById(R.id.question_tv)

        progressBar.progress = mCurrentPosition
        progressTv.text = "$mCurrentPosition" + "/" + progressBar.max

        questionTv.text = question.question
        option1.text = question.option1
        option2.text = question.option2
        option3.text = question.option3
        option4.text = question.option4
    }

    private fun defaultOptionsView(){
        val options = ArrayList<TextView>()

        options.add(0, option1)
        options.add(1, option2)
        options.add(2, option3)
        options.add(3, option4)

        for(option in options){
            option.setTextColor(Color.parseColor("#E6E6E6"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this,R.drawable.default_bg_opt)
        }
    }

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onClick(v: View?) {
        when(v?.id){
            R.id.option1_tv ->{
                selectedOptionView(option1,1)
            }
            R.id.option2_tv ->{
                selectedOptionView(option2,2)
            }
            R.id.option3_tv ->{
                selectedOptionView(option3,3)
            }
            R.id.option4_tv ->{
                selectedOptionView(option4,4)
            }
            R.id.btn_submit ->{
                if(mSelectedPosition == 0){
                    mCurrentPosition++

                    when{
                        mCurrentPosition <= mQuestionsList!!.size ->{
                            setQuestion()
                        }
                        else ->{
                            val intent = Intent(this, ResultActivity::class.java)
                            intent.putExtra(Constants.CORRECT_ANSWERS, mCorrectAnswer)
                            intent.putExtra(Constants.TOTAL_QUESTIONS, mQuestionsList!!.size)
                            startActivity(intent)
                        }
                    }
                }else{
                    val question = mQuestionsList?.get(mCurrentPosition - 1)
                    if(question!!.correctOption != mSelectedPosition){
                        answerView(mSelectedPosition, R.drawable.wrong_bg_opt)
                    }else{
                        mCorrectAnswer++
                    }
                    answerView(question.correctOption, R.drawable.correct_bg_opt)

                    if(mCurrentPosition == mQuestionsList!!.size){
                        btnSubmit.text = "FINISH"
                    }else{
                        btnSubmit.text = "GO TO THE NEXT QUESTION"
                    }
                    mSelectedPosition = 0
                }
            }
        }
    }

    private fun answerView(answer:Int, drawableView:Int){
        when(answer){
            1 -> {
                option1.background = ContextCompat.getDrawable(this, drawableView)
            }
            2 -> {
                option2.background = ContextCompat.getDrawable(this, drawableView)
            }
            3 -> {
                option3.background = ContextCompat.getDrawable(this, drawableView)
            }
            4 -> {
                option4.background = ContextCompat.getDrawable(this, drawableView)
            }
        }
    }

    private fun selectedOptionView(tv: TextView, selectedOpt: Int){

        defaultOptionsView()
        mSelectedPosition = selectedOpt

        tv.setTextColor(Color.parseColor("#FFFFFF"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this,R.drawable.selected_bg_opt)
    }
}