package com.example.javaoop;

import android.util.Log;

public class Lion extends Cat {

    public Lion(){
        Log.i("constructor","construcor Lion()");
    }

    public static String whatCatsLike(){
        return "I'm lion I like playing, jumping and sometimes scratching";
    }

    @Override
    public void draw() {

    }
}
