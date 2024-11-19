package com.example.milestone3

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Initialize the views
        val imageViewOne = findViewById<ImageView>(R.id.imageViewOne)
        val textViewThree = findViewById<TextView>(R.id.textViewThree)
        val textView3 = findViewById<TextView>(R.id.textView3)
        val buttonEnroll = findViewById<ImageButton>(R.id.buttonEnroll)
        val imageBackground = findViewById<ImageView>(R.id.imageBackground)

        val ImageButton = findViewById<ImageButton>(R.id.buttonEnroll)
        buttonEnroll.setOnClickListener()
        {
        };val intent = Intent(this, MILESTONE3::class.java)
            startActivity(intent)


        }




}