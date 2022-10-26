package com.example.javaoop;

import android.util.Log;

public class Cat extends Animal{
    private int age;
    private String name;
    private String breed;
    private String color;

    public Cat(){
        age = 2;
        name = "Vaska";
    }

    public Cat(int age, String name, String breed, String color){
        this.age = age;
        this.name = name;
        this.breed = breed;
        this.color = color;
    }
    public Cat(int age, String name, String breed, String color, int legs){
        this.age = age;
        this.name = name;
        this.breed = breed;
        this.color = color;
        numberOfLegs = legs;
    }

    public void talk(){
        Log.i("talk()", "Meow! My name is "
                + this.name + ", and I'm " + this.age + " years old."
                + "My breed is " + this.breed + " and color is " + this.color);
    }

    public void talk(int age){
        Log.i("talk()", "Meow! I'm " + age + " years old.");
    }

    public void talk(String hello){
        Log.i("talk()", "Meow! " + hello);
    }

    public void initFields(int a, String n){
        this.age = a;
        this.name = n;
    }
}
