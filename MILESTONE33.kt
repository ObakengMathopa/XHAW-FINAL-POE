package com.example.milestone3

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class MILESTONE33 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_milestone33)

        //Initialize the views
        val imageView6 = findViewById<ImageView>(R.id.imageView6)
        val textView7 = findViewById<TextView>(R.id.textView7)
        val textView9 = findViewById<TextView>(R.id.textView9)
        val textView8 = findViewById<TextView>(R.id.textView8)
        val textView10 = findViewById<TextView>(R.id.textView10)
        val imageButton6 = findViewById<ImageButton>(R.id.imageButton6)
        val imageButton7 = findViewById<ImageButton>(R.id.imageButton7)
        val imageButton = findViewById<ImageButton>(R.id.imageButton7)
        val textView19 = findViewById<TextView>(R.id.textView19)
        val textView18 = findViewById<TextView>(R.id.textView18)
        val textView20 = findViewById<TextView>(R.id.textView14)

        val ImageButton6 = findViewById<ImageButton>(R.id.imageButton6)
        imageButton6.setOnClickListener()
        {
        };val Int: Intent = Intent(this, MILESTONE33::class.java)
        startActivity(intent)

        val ImageButton7 = findViewById<ImageButton>(R.id.imageButton7)
        imageButton7.setOnClickListener()
        {
        } ;val Intent: Intent = Intent(this, MILESTONE33::class.java)
        startActivity(intent)

        val ImageButton = findViewById<ImageButton>(R.id.imageButton7)
        imageButton7.setOnClickListener()
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