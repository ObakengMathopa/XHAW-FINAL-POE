package com.example.milestone3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class MILESTONETHREE : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_milestonethree)

        //Initialize the views
        val imageView5 = findViewById<ImageView>(R.id.imageView5)
        val textView6 = findViewById<TextView>(R.id.textView6)
        val textView11 = findViewById<TextView>(R.id.textView11)
        val textView12 = findViewById<TextView>(R.id.textView12)
        val textView13 = findViewById<TextView>(R.id.textView13)
        val imageButton3 = findViewById<ImageButton>(R.id.imageButton3)
        val imageButton4 = findViewById<ImageButton>(R.id.imageButton4)
        val imageButton5 = findViewById<ImageButton>(R.id.imageButton5)

        val ImageButton3 = findViewById<ImageButton>(R.id.imageButton3)
        imageButton3.setOnClickListener()
        {
        };val Int: Intent = Intent(this, MILESTONE33::class.java)
        startActivity(intent)

        val ImageButton4 = findViewById<ImageButton>(R.id.imageButton4)
        imageButton4.setOnClickListener()
        {
        } ;val Intent: Intent = Intent(this, MILESTONE33::class.java)
        startActivity(intent)

        val ImageButton5 = findViewById<ImageButton>(R.id.imageButton5)
        imageButton5.setOnClickListener()
        {
        } ;val intent: Intent = Intent(this, MILESTONE33::class.java)
        startActivity(intent)

        val ImageButton10 = findViewById<ImageButton>(R.id.imageButton10)
        ImageButton10.setOnClickListener()
        {
        };val Intntent: Intent = Intent(this, MILESTONE3::class.java)
        startActivity(intent)

    }
}