package com.example.javaoop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    Cat myCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myCat = new Cat();
        myCat.initFields(4,"Puma");
        myCat.talk();

        Cat murzik =new Cat(2,"Murza");
        murzik.talk();
        murzik.breathe();

        Cat glasha = new Cat();
        glasha.age = 1;
        glasha.name = "Glasha";
        glasha.numberOfLegs = 4;
        Log.i("numberOfLegs", String.valueOf(glasha.numberOfLegs));
        glasha.talk();


        //11:49
        Puma puma = new Puma();
        puma.breathe();
        puma.talk();
        puma.isAlive = true;
        puma.name = "Leo";
        Log.i("isAlive", String.valueOf(puma.isAlive));
        Log.i("breathe()","My name is " + puma.name +
                " and " + String.valueOf(puma.breathe()));

    }
}