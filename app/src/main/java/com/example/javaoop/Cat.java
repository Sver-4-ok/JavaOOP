package com.example.javaoop;

import android.util.Log;

public class Cat extends Animal{
    int age;
    String name;

    public Cat(){
        age = 2;
        name = "Vaska";
    }

    public Cat(int a, String n){
        this.age = a;
        this.name = n;
    }

    public void talk(){
        Log.d("talk()", "Meow! My name is "
                + name + ", and I'm " + age + " years old.");
    }

    public void initFields(int a, String n){
        this.age = a;
        this.name = n;
    }
}
