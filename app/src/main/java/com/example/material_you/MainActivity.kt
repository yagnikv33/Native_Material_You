package com.example.material_you

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.color.DynamicColors

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        supportFragmentManager.beginTransaction()
//            .replace(R.id.main_frame, AFragment())
//            .commitAllowingStateLoss()
    }
}