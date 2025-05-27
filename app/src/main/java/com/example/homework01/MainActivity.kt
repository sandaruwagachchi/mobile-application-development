package com.example.homework01

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioGroup
import androidx.appcompat.widget.Toolbar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var etName: EditText
    private lateinit var etEmail: EditText
    private lateinit var etNumber: EditText
    private lateinit var etPassword: EditText
    private lateinit var etCPassword: EditText
    private lateinit var rgGender: RadioGroup
    private lateinit var chkAgree: CheckBox
    private lateinit var btnSubmit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        toolbar.setTitleTextColor(resources.getColor(android.R.color.white))

        etName = findViewById(R.id.etName)
        etEmail = findViewById(R.id.etEmail)
        etNumber = findViewById(R.id.etNumber)
        etPassword = findViewById(R.id.etPassword)
        etCPassword = findViewById(R.id.etCPassword)
        rgGender = findViewById(R.id.rgGender)
        chkAgree = findViewById(R.id.chkAgree)
        btnSubmit = findViewById(R.id.btnSubmit)
        }

    }
