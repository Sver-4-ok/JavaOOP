package com.example.javaoop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;


//git hub token - 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
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cat cat = new Lion();
        cat.talk();


    }

}