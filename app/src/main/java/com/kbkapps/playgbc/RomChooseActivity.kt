package com.kbkapps.playgbc

import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.AppCompatActivity

class RomChooseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.requestWindowFeature(Window.FEATURE_NO_TITLE)
//        window.setFlags(
//            WindowManager.LayoutParams.FLAG_FULLSCREEN,
//            WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_rom_choose)
    }
}