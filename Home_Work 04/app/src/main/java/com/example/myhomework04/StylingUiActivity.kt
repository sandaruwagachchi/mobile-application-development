package com.example.myhomework04

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class StylingUiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_styling_ui)

        val txtStyled = findViewById<TextView>(R.id.txtStyled)
        val editStyled = findViewById<EditText>(R.id.editStyled)
        val btnStyled = findViewById<Button>(R.id.btnStyled)

        btnStyled.setOnClickListener {
            val inputText = editStyled.text.toString()
            txtStyled.text = "You entered: $inputText"
            Toast.makeText(this, "Input received!", Toast.LENGTH_SHORT).show()
        }
    }
}
