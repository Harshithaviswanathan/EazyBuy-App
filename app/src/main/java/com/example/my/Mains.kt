package com.example.my

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Mains : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mains)

        // Apply padding to handle system insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Initialize sign-up button from layout
        val buttonSignIn = findViewById<Button>(R.id.buttonSignIn)

        // Set click listener for sign-up button
        buttonSignIn.setOnClickListener {
            // Start LoginActivity when sign-up button is clicked
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
            // Optional: Finish the Mains activity to prevent going back to it
            finish()
        }
    }
}
