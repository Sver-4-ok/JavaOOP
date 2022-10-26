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

        myCat = new Cat();
        myCat.initFields(4,"Puma");
        //myCat.talk(); //Надо делать отдельный конструктор

        Cat murzik = new Cat(4,"Murza","turkish van","grey");
        murzik.talk();
        murzik.breathe();

        Cat glasha = new Cat(1,"Glasha","Siamese","white",4);

        Log.i("numberOfLegs", String.valueOf(glasha.numberOfLegs));
        glasha.talk();


        //11:49
        /*
        Puma puma = new Puma();
        puma.breathe();
        puma.talk();
        puma.isAlive = true;
        puma.name = "Leo";
        Log.i("isAlive", String.valueOf(puma.isAlive));
        Log.i("breathe()","My name is " + puma.name +
                " and " + String.valueOf(puma.breathe()));
        */
    }

}