package com.example.mobileapps1

import android.app.ApplicationExitInfo
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to button

        val exit_button = findViewById<Button>(R.id.exit_button)
        exit_button.setOnClickListener {
            finish()
        }

//        val education_button = findViewById<Button>(R.id.education_btn)
//        education_button.setOnClickListener{
//        }

        education_btn.setOnClickListener{
            Intent(this, education::class.java).also {
            startActivity(it)
            }
        }




    }}

