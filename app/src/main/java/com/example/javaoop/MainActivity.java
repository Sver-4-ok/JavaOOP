package com.example.javaoop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;


//git hub token - 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

//я специально не реализовал Printable в MainActivity
//тк это слишком бессмысленно
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cat cat = new Lion();
        cat.talk();

        Printable printable = new Puma();
        printable.print();
        ((Puma) printable).move();

        printAnyObject(new Lion());

        Movable.someMethod();

        Puma puma = new Puma();

        //Таким образом понятно что откуда идет
        //а сократил я так из-за ограничения количества символов в теге
        Log.i("s.o.m puma","" + puma.speedOfMoving);
        Log.i("s.o.m (Puma) printable","" + ((Puma) printable).speedOfMoving);
        Log.i("s.o.m Movable","" + Movable.speedOfMoving);

    }

    void printAnyObject(Printable printable){
        printable.print();
    }

}