package com.example.milestone3

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class THREEEMILESTONE : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_threeemilestone)

        //Initialize the views
        val imageView10 = findViewById<ImageView>(R.id.imageView10)
        val imageView9 = findViewById<TextView>(R.id.imageView9)
        val imageView11 = findViewById<TextView>(R.id.imageView11)
        val imageButton8 = findViewById<TextView>(R.id.imageButton8)

        val ImageButton8 = findViewById<ImageButton>(R.id.imageButton8)
        imageButton8.setOnClickListener()
        {
        };val Int: Intent = Intent(this, THREEMILESTONE::class.java)
        startActivity(intent)

    }
}