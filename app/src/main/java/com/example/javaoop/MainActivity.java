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
        cat1.talk();

        Cat cat2 = new Cat(5, "Vaska");
        cat2.talk();

        Cat cat3 = new Cat(8, "Murzik");
        cat3.talk();

        //Теперь нельзя CatMood отдельно вызывать:
        //Cat.CatMood catMood = new Cat().new CatMood();
        //Log.i("levelOfMood", String.valueOf(catMood.levelOfMood));

    }

}