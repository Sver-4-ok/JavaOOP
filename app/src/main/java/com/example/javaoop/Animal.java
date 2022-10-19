package com.example.javaoop;

import android.util.Log;

public class Animal {
    protected int numberOfLegs = 4;
    boolean isAlive = true;

    public String breathe(){
        //Log.i("breathe", "I can breathe");
        return "I can breathe";
    }
}
