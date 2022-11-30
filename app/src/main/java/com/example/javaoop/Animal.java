package com.example.javaoop;

import android.util.Log;

public abstract class Animal {
    protected int numberOfLegs = 4;
    boolean isAlive = true;

    abstract public void draw();

    public String breathe(){
        return "I can breathe";
    }
}
