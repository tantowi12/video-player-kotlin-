package com.example.videoplayer

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<View>(R.id.img1) as ImageButton
        btn1.setOnClickListener { startActivity(Intent(this@MainActivity, filmMisson::class.java)) }

        val btn2 = findViewById<View>(R.id.img2) as ImageButton
        btn2.setOnClickListener { startActivity(Intent(this@MainActivity, filmMib::class.java)) }
    }
}