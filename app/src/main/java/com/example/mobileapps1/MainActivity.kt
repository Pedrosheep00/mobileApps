package com.example.mobileapps1

import android.app.ApplicationExitInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to button

        val exit_button = findViewById<Button>(R.id.exit_button)
        exit_button.setOnClickListener {
            finish()
        }

        val education_button = findViewById<Button>(R.id.education_btn)
        education_button.setOnClickListener{}
    }}

