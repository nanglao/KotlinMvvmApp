package com.dev.kotlinmvvmapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dev.kotlinmvvmapp.model.UserData

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("DEBUG: ${UserData.userData}")
    }
}