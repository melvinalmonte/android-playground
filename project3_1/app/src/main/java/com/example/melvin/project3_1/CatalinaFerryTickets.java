package com.example.melvin.project3_1;

import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.os.*;
import android.view.*;
import android.widget.*;

public class CatalinaFerryTickets extends AppCompatActivity{
    String[] ferryRoutes = new String[]{"To Catalina Island", "To Long Beach"};
    private Button renderBtn;
    EditText handleData;
    TextView displayData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//      RENDER SPINNER TO DEVICE

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalina_ferry_tickets);
        final Spinner spin=findViewById(R.id.mySpinner);
        final ArrayAdapter<String> myAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, ferryRoutes);
        spin.setAdapter(myAdapter);

        renderBtn=findViewById(R.id.button);
        displayData=findViewById(R.id.textView);
        displayData.setMovementMethod(new ScrollingMovementMethod());

        renderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleData=findViewById(R.id.editInput);
                int ticketAmount = Integer.parseInt(handleData.getText().toString());
                int total;

                if (spin.getSelectedItem().toString().equals("To Catalina Island")){
                    total = ticketAmount * 34;
                    displayData.setText("One Way Trip " + spin.getSelectedItem().toString() + " - $" + Integer.toString(total));
                }
                else if (spin.getSelectedItem().toString().equals("To Long Beach")){
                    total = ticketAmount * 18;
                    displayData.setText("One Way Trip " + spin.getSelectedItem().toString() + " - $" + Integer.toString(total));
                }

            }
        });

    }

}
