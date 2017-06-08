package com.meitu.weather

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 使用Kotlin-extensions插件实现从XML中注入所有的View到Activity中
        message.text ="Hello Kotlin"// 等同于：message.setText("Hello Kotlin")
    }
}
