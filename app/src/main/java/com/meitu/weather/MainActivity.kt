package com.meitu.weather

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 使用"as"关键字进行强转
        val forecastList = findViewById(R.id.forecast_list) as RecyclerView
        // 指定RecyclerView布局管理器
        // 对象实例化与Java不同，省略了"new"。此时构造函数仍然会被调用。
        forecastList.layoutManager = LinearLayoutManager(this)
    }
}
