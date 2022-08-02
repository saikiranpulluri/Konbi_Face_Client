package com.example.konbifaceclient

import android.content.ComponentName
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickMe = findViewById<AppCompatButton>(R.id.click_me)
        clickMe.setOnClickListener {
            val intent = Intent()
            intent.component =
                ComponentName("com.example.konbiface", "com.example.konbiface.MainActivity")
            startActivity(intent)
        }

    }
}