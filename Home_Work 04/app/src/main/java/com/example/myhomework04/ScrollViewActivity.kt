package com.example.myhomework04

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ScrollViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scroll_view)

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
