package com.example.myhomework04

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.widget.Button


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find Buttons
        val btnLinearLayout = findViewById<Button>(R.id.btnLinearLayout)
        val btnRelativeLayout = findViewById<Button>(R.id.btnRelativeLayout)
        val btnConstraintLayout = findViewById<Button>(R.id.btnConstraintLayout)
        val btnFrameLayout = findViewById<Button>(R.id.btnFrameLayout)
        val btnScrollView = findViewById<Button>(R.id.btnScrollView)
        val btnGridLayout = findViewById<Button>(R.id.btnGridLayout)
        val btnStylingUi = findViewById<Button>(R.id.btnStylingUi)

        // Set onClick listeners for buttons
        btnLinearLayout.setOnClickListener {
            startActivity(Intent(this, LinearLayoutActivity::class.java))
        }

        btnRelativeLayout.setOnClickListener {
            startActivity(Intent(this, RelativeLayoutActivity::class.java))
        }

        btnConstraintLayout.setOnClickListener {
            startActivity(Intent(this, ConstraintLayoutActivity::class.java))
        }

        btnFrameLayout.setOnClickListener {
            startActivity(Intent(this, FrameLayoutActivity::class.java))
        }

        btnScrollView.setOnClickListener {
            startActivity(Intent(this, ScrollViewActivity::class.java))
        }

        btnGridLayout.setOnClickListener {
            startActivity(Intent(this, GridLayoutActivity::class.java))
        }

        btnStylingUi.setOnClickListener {
            startActivity(Intent(this, StylingUiActivity::class.java))
        }
    }
}
