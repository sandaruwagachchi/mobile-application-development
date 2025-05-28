package com.example.myhomework04

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class RelativeLayoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative_layout)

        // Initialize UI components
        val txtTitle = findViewById<TextView>(R.id.txtTitle)
        val editText = findViewById<EditText>(R.id.editText)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)

        // Set up button click listener
        btnSubmit.setOnClickListener {
            val inputText = editText.text.toString()
            txtTitle.text = "You entered: $inputText"
        }
    }
}
