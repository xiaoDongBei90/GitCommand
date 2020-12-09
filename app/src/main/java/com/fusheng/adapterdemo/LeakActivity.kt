package com.fusheng.adapterdemo

import android.os.Bundle
import android.os.Handler
import android.os.Message
import androidx.appcompat.app.AppCompatActivity

/**
 * @Author: lixiaowei
 * @CreateDate: 2020/12/8 5:25 PM
 * @Description:
 */
class LeakActivity : AppCompatActivity() {

    val handler = Handler(object : Handler.Callback {
        override fun handleMessage(msg: Message): Boolean {
            return true
        }
    })

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leak)
        handler.sendEmptyMessageDelayed(1, 24 * 60 * 60)
    }
}