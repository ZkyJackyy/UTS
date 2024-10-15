package com.zack.uts

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class welcomeScreen : AppCompatActivity() {

    private lateinit var btnlog : Button
    private lateinit var btnsign : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome_screen)

        btnlog = findViewById(R.id.btn_login)
        btnsign = findViewById(R.id.btn_signup)

        btnlog.setOnClickListener(){
            val intent = Intent(this,loginScreen::class.java)
            startActivity(intent)
        }
        btnsign.setOnClickListener(){
            val intent = Intent(this,SignUpScreen::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}