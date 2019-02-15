package com.example.secondtestapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class SecondaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
    }
//    public void handleClick(View view){
//        Toast.makeText(SecondaryActivity.this, "Hello World!", Toast.LENGTH_SHORT).show();
//    }
    public void handleClick(View view) {
        Log.i("clicks","You Clicked Secondary Activity");
        Intent i = new Intent(SecondaryActivity.this, MainActivity.class);
        startActivity(i);
    }
}
