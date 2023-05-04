package com.example.testapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.enter_button).setOnClickListener {
            val greetingDisplay = findViewById<TextView>(R.id.greeting_display)

            val firstName = findViewById<TextInputEditText>(R.id.first_name).text.toString()

            val secondName = findViewById<TextInputEditText>(R.id.last_name).text.toString()

            if (firstName.isNotEmpty() && secondName.isNotEmpty()) {
                greetingDisplay.text = "${getString(R.string.welcome_to_the_app)} $firstName $secondName"
            } else {
                Toast.makeText(this, "Enter a name please", Toast.LENGTH_LONG).show()
            }
        }
    }
}
