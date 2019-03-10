package com.example.triathlonregistration;

import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.os.*;
import android.util.Log;
import android.view.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    String[] bikeRoutes = new String[]{"Lake Placid","Big Island Hawaii","Miami" };
    private Button handleSubmit;
    EditText handleInput;
    TextView displayData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Spinner dropDown = findViewById(R.id.dropDown);
        final ArrayAdapter<String> myAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, bikeRoutes);
        dropDown.setAdapter(myAdapter);

        handleSubmit = findViewById(R.id.computeCost);
        displayData = findViewById(R.id.output);
        displayData.setMovementMethod(new ScrollingMovementMethod());

        handleSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleInput = findViewById(R.id.groupInput);
                int totalAthletes;

                try {
                    int numAthletes = Integer.parseInt(handleInput.getText().toString());
                    if(dropDown.getSelectedItem().toString().equals("Lake Placid") ||
                            dropDown.getSelectedItem().toString().equals("Big Island Hawaii") ||
                            dropDown.getSelectedItem().toString().equals("Miami") ){
                        totalAthletes = numAthletes * 725;
                        displayData.setText(dropDown.getSelectedItem().toString() + " Race Team Fee is  - $" + Integer.toString(totalAthletes));
                    }
                }catch (NumberFormatException e){
                    displayData.setText("Invalid Operation. Please Enter Number of Athletes in Team and Select a Route.");

                }

            }
        });


    }
}
