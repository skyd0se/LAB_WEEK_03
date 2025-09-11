package com.example.lab_week_03

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.annotation.OptIn
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.media3.common.util.Log
import androidx.media3.common.util.UnstableApi

class MainActivity : AppCompatActivity() {
    @OptIn(UnstableApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main_fragment)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right,
                systemBars.bottom)
            insets
        }
        Log.d(TAG, "onCreate")
    }

    @OptIn(UnstableApi::class)
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    @OptIn(UnstableApi::class)
    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    @OptIn(UnstableApi::class)
    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    @OptIn(UnstableApi::class)
    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    @OptIn(UnstableApi::class)
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }
    companion object {
        private const val TAG = "MainActivity"
    }
}