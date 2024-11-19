package com.example.milestone3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class MILESTONE333 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_milestone333)

        //Initialize the views
        val imageView3 = findViewById<ImageView>(R.id.imageView3)
        val textView7 = findViewById<TextView>(R.id.textView7)
        val textView9 = findViewById<TextView>(R.id.textView9)
        val textView8 = findViewById<TextView>(R.id.textView8)
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