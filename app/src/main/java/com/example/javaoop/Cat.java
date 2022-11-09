package com.example.javaoop;

import android.util.Log;

public class Cat extends Animal{
    private int age;
    protected String name;
    private String breed;
    private String color;
    final static int numberOfLegs = 4;
    static int count;

    String helloText = "Not id";
    CatMood catMood;

    static class CountResetter{

        CountResetter(){
            if(Cat.count > 5){
                resetCounter();
            }
        }

        void resetCounter(){
            Cat.count = 0;
        }
    }

    private class CatMood{
        int levelOfMood;

        CatMood(){
            if(Cat.this.age < 2){
                levelOfMood = 100;
            }else if(Cat.this.age >= 2 && Cat.this.age < 7){
                levelOfMood = 50;
            }else if(Cat.this.age >= 7){
                levelOfMood = 20;
            }

            //я бы сделал вот так (за место 9-ти - средний максимальный возраст):
            //levelOfMood = 100 * (9 / Cat.this.age);

        }
    }

    public Cat(){
        age = 1;
        name = "Vaska";

        catMood = new CatMood();

        switch (catMood.levelOfMood){
            case 100:
                helloText = "Meow! I'm happy cat ^_^. My name is "
                        + this.name + ", and I'm " + this.age + " years old.";
                break;
            case 50:
                helloText = "Meow! I'm cat -_-. My name is "
                        + this.name + ", and I'm " + this.age + " years old.";
                break;
            case 20:
                helloText = "Meow! I'm old and sick cat =^=. My name is "
                        + this.name + ", and I'm " + this.age + " years old.";
                break;
        }
        Cat.count++;
    }

    public Cat(int age, String name){
        this.age = age;
        this.name = name;

        catMood = new CatMood();

        switch (catMood.levelOfMood){
            case 100:
                helloText = "Meow! I'm happy cat ^_^. My name is "
                        + this.name + ", and I'm " + this.age + " years old.";
                break;
            case 50:
                helloText = "Meow! I'm cat -_-. My name is "
                        + this.name + ", and I'm " + this.age + " years old.";
                break;
            case 20:
                helloText = "Meow! I'm old and sick cat =^=. My name is "
                        + this.name + ", and I'm " + this.age + " years old.";
                break;
        }

        Cat.count++;
    }

    public Cat(int age, String name, String breed, String color){
        this.age = age;
        this.name = name;
        this.breed = breed;
        this.color = color;

        Cat.count++;
    }



    public final void talk(){
        Log.i("talk()",helloText);
    }

    public void talk(int age){
        Log.i("talk()", "Meow! I'm " + age + " years old.");
    }

    public void talk(String hello){
        Log.i("talk()", "Meow! " + hello);
    }

    public static final String whatCatsLike(){
        return " I like playing, jumping and sometimes scratching";
    }

    public void initFields(int a, String n){
        this.age = a;
        this.name = n;
    }
}
