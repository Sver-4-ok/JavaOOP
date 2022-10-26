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

        //Ненужный код:
        /*
        Cat murzik = new Cat(4,"Murza","turkish van","grey");
        murzik.talk();
        murzik.breathe();

        Cat glasha = new Cat(1,"Glasha","Siamese","white",4);

        Log.i("numberOfLegs", String.valueOf(glasha.numberOfLegs));
        glasha.talk();
         */

        Cat vaska = new Cat();
        vaska.talk(3);
        vaska.talk("MeeeeyAAAAow!!!");


    }

}