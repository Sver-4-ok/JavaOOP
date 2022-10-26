package com.example.javaoop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;


//git hub token - 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
public class MainActivity extends AppCompatActivity {

    Cat myCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cat vaska = new Cat();
        vaska.talk();

        Puma bagira = new Puma();
        bagira.talk();

        Cat puma = new Puma();
        puma.talk();

        Cat murzik = new Lion();
        murzik.talk();


    }

}