package com.example.mycar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class register extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
         getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
}
