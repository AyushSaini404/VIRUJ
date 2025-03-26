package com.example.viruj

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class brief2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_brief2)

        val button : Button = findViewById(R.id.buttonbrief2)
        button.setOnClickListener {
            val intent  = Intent(this,brief3::class.java)
            startActivity(intent)
        }

    }
}