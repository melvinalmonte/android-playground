package com.example.farmsounds;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.*;
import android.content.*;


public class LandingPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landing_page);

        TimerTask landingScreen = new TimerTask() {
            @Override
            public void run() {
                finish();
                startActivity(new Intent(LandingPage.this, SoundBoard.class));
            }
        };
        Timer setTimer = new Timer();
        setTimer.schedule(landingScreen, 6000);
    }
}
