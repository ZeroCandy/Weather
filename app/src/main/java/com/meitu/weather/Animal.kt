package com.meitu.weather

/*
    定义类：
    class 类名+类头{
        类体
    }

    主构造函数，即"类名(参数)"的形式。（类体中没有任何内容时可以省略花括号。）
    主构造函数中声明的变量即为成员变量。

    Kotlin中，所有的类默认都是不可继承的(即默认声明final)。
    open和abstract修饰的类才能被继承。
 */
open class Animal(name:String) {// 主构造函数

    // 主构造函数函数体
    init {
        // 构造函数逻辑内容
    }
}