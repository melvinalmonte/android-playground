package com.example.homework_2;

import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button handleSubmit;
    RadioGroup weightConversions;
    RadioButton kilosToPounds;
    RadioButton poundsToKilos;
    EditText handleChange;
    TextView handleOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weightConversions = findViewById(R.id.radioSelection);
        handleSubmit = findViewById(R.id.myBtn);
        handleOutput = findViewById(R.id.weightOutput);
        kilosToPounds = findViewById(R.id.KilosToPounds);
        poundsToKilos = findViewById(R.id.poundsToKilo);

        handleSubmit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                handleChange.findViewById(R.id.weightInput);
                float weightInput = Float.parseFloat(handleChange.getText().toString());
                float total;

                if (poundsToKilos.getText().toString().equals("Convert Pounds to Kilograms")){
                    total = weightInput;
                    handleOutput.setText(Float.toString(total));

                }

            }
        });

    }
}
