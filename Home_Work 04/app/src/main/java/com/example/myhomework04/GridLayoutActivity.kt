package com.example.myhomework04

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast

class GridLayoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid_layout)

        val textView = findViewById<TextView>(R.id.textView)
        val editText = findViewById<EditText>(R.id.editText)
        val submitButton = findViewById<Button>(R.id.submitButton)

        submitButton.setOnClickListener {
            val name = editText.text.toString()
            if (name.isNotBlank()) {
                Toast.makeText(this, "Hello, $name!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
