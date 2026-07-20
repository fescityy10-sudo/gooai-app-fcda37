package com.gooai.generated

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val playBtn = findViewById<Button>(R.id.btnPlay)
        val statusText = findViewById<TextView>(R.id.tvStatus)
        
        playBtn.setOnClickListener {
            statusText.text = getString(R.string.playing)
            Toast.makeText(this, "بدء التشغيل...", Toast.LENGTH_SHORT).show()
        }
    }
}