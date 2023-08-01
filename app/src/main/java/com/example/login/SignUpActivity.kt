// lv2. 회원가입 페이지 만들기
package com.example.login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {

    private lateinit var editTextName: EditText
    private lateinit var editTextId: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var buttonSignUp: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        editTextName = findViewById(R.id.editTextName)
        editTextId = findViewById(R.id.editTextId)
        editTextPassword = findViewById(R.id.editTextPassword)
        buttonSignUp = findViewById(R.id.buttonSignUp)

        buttonSignUp.setOnClickListener {
            val name = editTextName.text.toString()
            val id = editTextId.text.toString()
            val password = editTextPassword.text.toString()

            if (name.isEmpty() || id.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "입력되지 않은 정보가 있습니다.", Toast.LENGTH_SHORT).show()
            } else {
                // 회원가입 정보를 홈 페이지로 전달
                val intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("userId", id)
                intent.putExtra("userName", name)
                intent.putExtra("userAge", "Your Age") // Replace "Your Age" with the actual age value
                intent.putExtra("userMBTI", "Your MBTI") // Replace "Your MBTI" with the actual MBTI value
                startActivity(intent)
                finish()
            }
        }
    }
}
