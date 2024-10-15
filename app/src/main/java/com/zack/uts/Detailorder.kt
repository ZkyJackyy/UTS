package com.zack.uts

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Detailorder : AppCompatActivity() {

    private lateinit var btncancel : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailorder)

        val nama = intent.getStringExtra("namaMakanan")
        val img = intent.getIntExtra("imageMakanan",0)


        val txtnama = findViewById<TextView>(R.id.txtNama)
        val imgphoto = findViewById<ImageView>(R.id.imgPhoto)

        txtnama.text =nama
        imgphoto.setImageResource(img)


        btncancel = findViewById(R.id.btncancel)

        btncancel.setOnClickListener(){
            finish()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}