package com.example.homework2_2gifs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void handleClick(View view) {
        Log.i("event-click","landing button tapped");
        Intent i = new Intent(MainActivity.this, SecondPage.class);
        startActivity(i);
    }
}
