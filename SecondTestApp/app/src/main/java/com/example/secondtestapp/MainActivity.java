package com.example.secondtestapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//    public void handleClick(View view){
//        Toast.makeText(MainActivity.this, "Hello World!", Toast.LENGTH_SHORT).show();
//    }
    public void handleClick(View view) {
        Log.i("clicks","You Clicked Landing Page");
        Intent i = new Intent(MainActivity.this, SecondaryActivity.class);
        startActivity(i);
    }


}
