package com.meitu.weather

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.meitu.weather.adapter.ForecastListAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    /*
        使用"listof"函数，通过接受一个任何类型的"vararg"(可变长的参数)，并自动推断出结果类型，来创建List集合。
        类似的有：setof(),arrayListOf(),hashSetOf()
     */
    private val items = listOf(
            "Mon 6/23 - Sunny - 31/17",
            "Tue 6/24 - Foggy - 21/8",
            "Wed 6/25 - Cloudy - 22/17",
            "Thurs 6/26 - Rainy - 18/11",
            "Fri 6/27 - Foggy - 21/10",
            "Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18",
            "Sun 6/29 - Sunny - 20/7"
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 使用"as"关键字进行强转
        val forecastList = findViewById(R.id.forecast_list) as RecyclerView
        // 指定RecyclerView布局管理器
        // 对象实例化与Java不同，省略了"new"。此时构造函数仍然会被调用。
        forecastList.layoutManager = LinearLayoutManager(this)
        // 设置Adapter
        forecastList.adapter = ForecastListAdapter(items)
    }
}
