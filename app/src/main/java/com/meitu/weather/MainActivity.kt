package com.meitu.weather

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 使用Kotlin-extensions插件实现从XML中注入所有的View到Activity中
        message.text = "Hello Kotlin"// 等同于：message.setText("Hello Kotlin")

        toast("Hi World")
        toast("Hi World","MyTag")
    }

    /*
         使用"fun"关键字定义函数，没有指定返回值时默认返回"Unit"（类似Java的"void"，但是"Unit"是一个对象）
     */
    fun add(x: Int, y: Int): Int {
        return x + y;
    }

    /*
         若函数体只有一个表达式且直接返回结果，可以直接使用等号替代。（上一个方法的简写）
     */
    fun add(x: Int, y: Int, z: Int): Int = x + y + z

    /*
        参数默认值：为参数指定默认值，避免了不必要的重载。
        标识符"$"：
            使用标识符"$"插入表达式，即模板表达式，实现在静态值和变量的基础上编写复杂的String。
            若表达式较为复杂，可以使用大括号包裹，例如： ${user.name}
        "localClassName"：为Kolin在Activity定义的常量，为当前类名
     */
    fun toast(message: String, tag:String = localClassName,length: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, "[$tag]$message", length).show()
    }
}
