package com.example.login

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    private lateinit var textViewUserId: TextView
    private lateinit var textViewName: TextView
    private lateinit var textViewAge: TextView
    private lateinit var textViewMBTI: TextView
    private lateinit var buttonLogout: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        textViewUserId = findViewById(R.id.textViewUserId)
        textViewName = findViewById(R.id.textViewName)
        textViewAge = findViewById(R.id.textViewAge)
        textViewMBTI = findViewById(R.id.textViewMBTI)
        buttonLogout = findViewById(R.id.buttonLogout)

        val intent = intent
        val userId = intent.getStringExtra("userId")
        val userName = intent.getStringExtra("userName") // Receive the name from the intent
        val userAge = intent.getStringExtra("userAge") // Receive the age from the intent
        val userMBTI = intent.getStringExtra("userMBTI") // Receive the MBTI from the intent

        textViewUserId.text = "아이디: $userId"
        textViewName.text = "이름: $userName"
        textViewAge.text = "나이: $userAge"
        textViewMBTI.text = "MBTI: $userMBTI"

        buttonLogout.setOnClickListener {
            finish()
        }
    }
}