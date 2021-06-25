package com.irfanshukri203.intentservicetutorial

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStartService.setOnClickListener {
            Intent(this, MyIntentService::class.java).also {
                startService(it)

                tvServiceInfo.text = "Service running"
            }
        }

        btnStopService.setOnClickListener {
            MyIntentService.stopService()

            tvServiceInfo.text = "Service stop"
        }
    }
}