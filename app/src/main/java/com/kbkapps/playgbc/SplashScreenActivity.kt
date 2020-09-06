package com.kbkapps.playgbc

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this,RomChooseActivity::class.java))
        //setContentView(R.layout.activity_splash)
    }
}