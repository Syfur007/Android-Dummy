package com.example.androiddummy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mainText = findViewById<TextView>(R.id.sampleText)
        mainText.text = "This is a test application"
        val btnClickMe = findViewById<Button>(R.id.clickmeButton)
        btnClickMe.text = "Click Me"
        val clickCounter = findViewById<TextView>(R.id.clickCount)
        var counter = 0
        btnClickMe.setOnClickListener {
            counter += 1
            clickCounter.text = "This button was clicked $counter times"

            if (counter%2 == 0)
                mainText.text = "This is a test application"
            else
                mainText.text = "Hello World!"

            Toast.makeText(this, "Hey, It's Syfur", Toast.LENGTH_SHORT).show()
        }
    }
}