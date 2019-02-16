package com.example.homework2_2gifs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SecondPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
    }

    public void handleClick(View view) {
        Log.i("clicks","You Clicked Secondary Activity");
        Intent i = new Intent(SecondPage.this, MainActivity.class);
        startActivity(i);
    }

}
