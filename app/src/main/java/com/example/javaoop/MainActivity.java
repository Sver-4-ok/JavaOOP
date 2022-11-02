package com.example.javaoop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;


//git hub token - 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
public class MainActivity extends AppCompatActivity {

    Cat myCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cat cat1 = new Cat();
        Log.i("numberOfLegs", "cat1 umber of legs "+ String.valueOf(cat1.numberOfLegs));
        //Cat.numberOfLegs--;
        Log.i("numberOfLegs", "cat1 umber of legs "+ String.valueOf(cat1.numberOfLegs));

        Cat cat2 = new Cat();
        Log.i("numberOfLegs", "cat1 umber of legs "+ String.valueOf(cat2.numberOfLegs));

        Lion lion = new Lion();
        lion.talk();


    }

}