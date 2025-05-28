package com.example.average_two_numbers

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var etNum1: EditText
    private lateinit var etNum2: EditText
    private lateinit var btnButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        etNum1 = findViewById(R.id.etNum1)
        etNum2 = findViewById(R.id.etNum2)
        btnButton = findViewById(R.id.btnButton)

        btnButton.setOnClickListener {
            handleButton()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun handleButton() {
        val firstNumber = etNum1.text.toString().trim()
        val secondNumber = etNum2.text.toString().trim()

        // toString() converts the Editable object to a String so that you can:
        // 1. Trim it
        // 2. Convert to numbers (.toDouble(), .toInt())
        // 3. Use string functions like isEmpty(), length, etc.

        if (firstNumber.isEmpty() || secondNumber.isEmpty()) {
            Toast.makeText(this, "Please enter both numbers", Toast.LENGTH_SHORT).show()
            return
        }

        try {
            val num1 = firstNumber.toDouble()
            val num2 = secondNumber.toDouble()
            val average = (num1 + num2) / 2

            Toast.makeText(this, "Average is $average", Toast.LENGTH_LONG).show()
        } catch (e: NumberFormatException) {
            Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show()
        }
    }
}
