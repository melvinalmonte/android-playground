package com.example.weightcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button handleSubmit;
    double poundsToKiloConversion = 2.2;
    double kiloToPoundsConversion = 0.45;
    double totalWeight;
    double weightInput;
    EditText handleChange;
    TextView displayData;
    RadioGroup weightConversions;
    RadioButton poundsToKilos;
    RadioButton kilosToPounds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        handleSubmit = findViewById(R.id.myBtn);
        handleChange = findViewById(R.id.weightInput);
        displayData = findViewById(R.id.weightOutput);
        weightConversions = findViewById(R.id.radioSelection);
        poundsToKilos = findViewById(R.id.poundsToKilo);
        kilosToPounds = findViewById(R.id.kilosToPounds);

        handleSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weightInput = Double.parseDouble(handleChange.getText().toString());
                if(poundsToKilos.isChecked()) {
                    totalWeight = weightInput / poundsToKiloConversion;
                    displayData.setText(weightInput +" Pounds is: " + String.format("%.2f", totalWeight) + " Kilograms");
                }
                else if(kilosToPounds.isChecked()){
                    totalWeight = weightInput / kiloToPoundsConversion;
                    displayData.setText(weightInput +" Kilograms is: " +String.format("%.1f", totalWeight) + " Pounds");
                }
                else{
                    displayData.setText("No Weight Conversion Selected. Please Make Your Choice.");
                }
            }
        });

    }
}
