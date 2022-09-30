package com.example.material_you

import android.app.Application
import android.os.Build
import android.util.Log
import android.widget.Toast
import com.google.android.material.color.DynamicColors
import com.google.android.material.color.DynamicColorsOptions

class DynamicColorApp : Application() {

    override fun onCreate() {
        super.onCreate()
        if(DynamicColors.isDynamicColorAvailable()){
            DynamicColors.applyToActivitiesIfAvailable(this)
        }else{
            Toast.makeText(this,"Dynamic color is Not Supported",Toast.LENGTH_SHORT).show()
        }
    }
}