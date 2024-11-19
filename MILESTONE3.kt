package com.example.milestone3

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class MILESTONE3 : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_milestone3)

        //Initialize the views
        val imageView2 = findViewById<ImageView>(R.id.imageView2)
        val textView = findViewById<TextView>(R.id.textView)
        val textView2 = findViewById<TextView>(R.id.imageView2)
        val textView4 = findViewById<TextView>(R.id.textView4)
        val textView5 = findViewById<TextView>(R.id.textView5)
        val imageButton = findViewById<ImageButton>(R.id.imageButton)
        val imageButton2 = findViewById<ImageButton>(R.id.imageButton2)

        val ImageButton = findViewById<ImageButton>(R.id.imageButton)
        imageButton.setOnClickListener()
        {
        };val intent: Intent = Intent(this, MILESTONETHREE::class.java)
        startActivity(intent)

        val ImageButton2 = findViewById<ImageButton>(R.id.imageButton2)
        imageButton.setOnClickListener()
        {
        } ;val Intent: Intent = Intent(this, MILESTONE333::class.java)
        startActivity(intent)

    }
}