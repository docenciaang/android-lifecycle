package com.example.android_lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("MainActivity","--> onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        Log.i("MainActivity","--> onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.i("MainActivity","--> onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.i("MainActivity","--> onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.i("MainActivity","--> onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.i("MainActivity","--> onDestroy")
        super.onDestroy()
    }
}
