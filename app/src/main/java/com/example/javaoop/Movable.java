package com.example.javaoop;

import android.util.Log;

public interface Movable {

    int speedOfMoving = 100;

    default void move(){
        Log.i("print()", "Move puma");

        //по моему тут должно быть что-то такое:
        //Log.i("print()", "Move object");
    }

    static void someMethod(){
        Log.i("someMethod()", "someMethod puma");
    }
}
