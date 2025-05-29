package com.example.myapplication06

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity

class SplashActivity  : AppCompatActivity(){
    private val SPLASH_DELAY: Long = 2000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //Make the activity fullscreen to hide status bar and navigation bar

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        //Use a Handle to delay the transition to the next activity
        Handler(Looper.getMainLooper()).postDelayed({

            val intent =Intent(this@SplashActivity, OnBoardingActivity1 ::class.java)
            startActivity(intent)
            finish()


        },SPLASH_DELAY)


    }





}