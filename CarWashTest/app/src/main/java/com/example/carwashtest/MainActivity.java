package com.example.carwashtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button handleSubmit;
    double total;
    int serviceInput;
    EditText handleChange;
    TextView displayData;
    RadioGroup serviceChoice;
    RadioButton exteriorService;
    RadioButton exteriorVacuumService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.car);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        handleSubmit = findViewById(R.id.myBtn);
        handleChange = findViewById(R.id.serviceInput);
        displayData = findViewById(R.id.output);
        serviceChoice = findViewById(R.id.radioGroup);
        exteriorService = findViewById(R.id.exteriorWash);
        exteriorVacuumService = findViewById(R.id.exteriorWithVacuum);

        handleSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    serviceInput = Integer.parseInt(handleChange.getText().toString());

                    if(exteriorService.isChecked() && serviceInput < 12)  {
                        total = serviceInput * 10.99;
                        displayData.setText("$"+ total + " for " +serviceInput + " Washes.");
                    }
                    else if (exteriorService.isChecked() && serviceInput >= 12){
                        total = serviceInput * 8.99;
                        displayData.setText("$"+ total + " for " +serviceInput + " Washes.");

                    }
                    else if(exteriorVacuumService.isChecked() && serviceInput < 12){
                        total = serviceInput * 15.99;
                        displayData.setText("$"+ total + " for " +serviceInput + " Washes.");
                    }
                    else if (exteriorVacuumService.isChecked() && serviceInput >= 12){
                        total = serviceInput * 12.99;
                        displayData.setText("$"+ total + " for " +serviceInput + " Washes.");
                    }
                    else{
                        displayData.setText("No Weight Conversion Selected. Please Make Your Choice.");
                    }
                }
                catch (NumberFormatException e){
                    displayData.setText("Invalid Operation: Please Enter Number of Washes and Choose a Service.");
                }
            }
        });


    }
}
