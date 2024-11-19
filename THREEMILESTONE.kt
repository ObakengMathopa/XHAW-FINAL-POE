package com.example.milestone3

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class THREEMILESTONE : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_threemilestone)

        //Initialize the views
        val imageView12 = findViewById<ImageView>(R.id.imageView12)
        val imageView8 = findViewById<TextView>(R.id.imageView8)
        val imageView13 = findViewById<TextView>(R.id.imageView13)
        val imageButton9 = findViewById<TextView>(R.id.imageButton9)
        val imageView14 = findViewById<TextView>(R.id.imageView14)
        val imageView15 = findViewById<TextView>(R.id.imageView15)
        val imageView17 = findViewById<TextView>(R.id.imageView17)

        val ImageButton9 = findViewById<ImageButton>(R.id.imageButton9)
        imageButton9.setOnClickListener()
        {
        };val Int: Intent = Intent(this, MainActivity::class.java)
        startActivity(intent)

    }
}