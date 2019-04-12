package com.example.farmsounds;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.*;
import android.widget.*;
import android.view.*;


public class SoundBoard extends AppCompatActivity {
    Button cowSound, pigSound;
    MediaPlayer mpCow, mpPig, mpWarning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound_board);

        cowSound = findViewById(R.id.cowSound);
        cowSound.setOnClickListener(playCow);
        mpCow = MediaPlayer.create(this, R.raw.cow);

        pigSound = findViewById(R.id.pigSound);
        pigSound.setOnClickListener(playPig);
        mpPig = MediaPlayer.create(this, R.raw.pig);

    }
    Button.OnClickListener playCow = new Button.OnClickListener(){
        @Override
        public void onClick(View v){
            mpCow.start();
        }
    };
    Button.OnClickListener playPig = new Button.OnClickListener(){
        @Override
        public void onClick(View v){
            mpPig.start();
        }
    };
    public void warning(View v){
        mpWarning = MediaPlayer.create(this, R.raw.danger);
        mpWarning.start();
    }

}
