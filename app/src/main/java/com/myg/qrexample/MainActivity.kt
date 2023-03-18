package com.myg.qrexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnCreate : Button
    private lateinit var btnScan : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCreate = findViewById(R.id.btnCreate)
        btnScan = findViewById(R.id.btnScan)

        btnCreate.setOnClickListener {
            val intent = Intent( this, CreateQRActivity::class.java )
            startActivity(intent)
        }

        btnScan.setOnClickListener {
            val intent = Intent( this, ScanQRActivity::class.java )
            startActivity(intent)
        }
    }
}