package com.fusheng.adapterdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.fusheng.testlibrary.TestArr

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.btn_test).setOnClickListener {
            startActivity(Intent(this, LeakActivity::class.java))
        }
    }
}