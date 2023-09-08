package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var countDownTimer: CountDownTimer
    lateinit var questions: ArrayList<Question>
    var points = 0
    var currentPosition = 0


    lateinit var progressBar : ProgressBar
    lateinit var btYes: Button
    lateinit var btNo: Button
    lateinit var tvSentence: TextView
    lateinit var btNext: Button
    lateinit var tvPoints: TextView
    lateinit var tvTimer: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btYes = findViewById(R.id.btYes)
        btNo = findViewById(R.id.btNo)
        tvSentence = findViewById(R.id.tvSentence)
        btNext = findViewById(R.id.btNext)
        tvPoints = findViewById(R.id.tvPoints)
        tvTimer = findViewById(R.id.tvTimer)
        progressBar = findViewById(R.id.progressBar)

        loadQuestions()
        setupViews()
        progressBar.max = questions.size
        countDownTimer = object : CountDownTimer(10000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                val secondsRemaining = millisUntilFinished / 1000
                tvTimer.text = "Tiempo: ${String.format("%02d", secondsRemaining)}"
            }

            override fun onFinish() {
                Toast.makeText(this@MainActivity, "¡Tiempo!", Toast.LENGTH_SHORT).show()
                nextQuestion()
            }
        }
        countDownTimer.start()
    }

    fun loadQuestions() {
        questions = ArrayList()
        questions = QuestionBank.questions.shuffled().take(10) as ArrayList<Question>
    }

    private fun setupViews() {
        showSentence()
        btYes.setOnClickListener {
            if (questions[currentPosition].answer) {
                Toast.makeText(this, "Correcto", Toast.LENGTH_LONG).show()
                points+=3
            } else {
                Toast.makeText(this, "Incorrecto", Toast.LENGTH_LONG).show()
                points-=2
            }
            nextQuestion()
        }

        btNo.setOnClickListener {
            if (!questions[currentPosition].answer) {
                Toast.makeText(this, "Correcto", Toast.LENGTH_LONG).show()
                points+=3
            } else {
                Toast.makeText(this, "Incorrecto", Toast.LENGTH_LONG).show()
                points-=2
            }
            nextQuestion()
        }

        btNext.setOnClickListener {
            nextQuestion()
        }
    }

    private fun showSentence() {

        tvPoints.text = "Puntos: $points"
        tvSentence.text = questions[currentPosition].sentence
    }

    private fun nextQuestion() {

        countDownTimer.start()
        if (currentPosition < questions.size - 1) {
            currentPosition++
            showSentence()
            progressBar.progress = currentPosition + 1
        } else {
            countDownTimer.cancel()
            tvTimer.text = "Tiempo: 00"
            Toast.makeText(this, "Has respondido todas las preguntas", Toast.LENGTH_LONG).show()
        }
    }
}
