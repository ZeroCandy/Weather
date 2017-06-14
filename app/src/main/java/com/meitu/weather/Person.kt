package com.meitu.weather


/*
    当只有单个构造器时，需要在从父类继承下来的构造器中指定需要的参数，用来替换Java中的super。
 */
class Person(name: String, surname:String):Animal(name)