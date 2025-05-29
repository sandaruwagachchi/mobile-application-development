package com.example.myapplication06

import android.os.Bundle
import android.widget.*
import androidx.appcompat.widget.Toolbar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RegisterActivity : AppCompatActivity() {

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
        setContentView(R.layout.activity_register)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        toolbar.setTitleTextColor(resources.getColor(android.R.color.white))

        // Initialize Views
        etName = findViewById(R.id.etName)
        etEmail = findViewById(R.id.etEmail)
        etNumber = findViewById(R.id.etNumber)
        etPassword = findViewById(R.id.etPassword)
        etCPassword = findViewById(R.id.etCPassword)
        rgGender = findViewById(R.id.rgGender)
        chkAgree = findViewById(R.id.chkAgree)
        btnSubmit = findViewById(R.id.btnSubmit)

        btnSubmit.setOnClickListener {
            handleButton()
        }
    }

    private fun handleButton() {
        val fullName = etName.text.toString().trim()
        val email = etEmail.text.toString().trim()
        val phone = etNumber.text.toString().trim()
        val password = etPassword.text.toString()
        val confirmPassword = etCPassword.text.toString()

        val genderId = rgGender.checkedRadioButtonId
        val gender = if (genderId != -1) findViewById<RadioButton>(genderId).text.toString() else ""

        // Validation
        if (fullName.isEmpty() || email.isEmpty() || phone.isEmpty() ||
            password.isEmpty() || confirmPassword.isEmpty() || gender.isEmpty()
        ) {
            Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            return
        }

        if (password != confirmPassword) {
            Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show()
            return
        }

        if (!chkAgree.isChecked) {
            Toast.makeText(this, "Please agree to the terms", Toast.LENGTH_SHORT).show()
            return
        }

        // If all is good
        Toast.makeText(this, "Registration Successful!", Toast.LENGTH_SHORT).show()

        val message = """
            Name: $fullName
            Email: $email
            Phone: $phone
            Gender: $gender
            Password: $password
        """.trimIndent()

        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}
