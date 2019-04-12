package com.example.healthyfoodsapp;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class MyFoodList extends AppCompatActivity {
    TextView renderChoice;
    Integer [] myMeals = {
            R.drawable.habichuelas,
            R.drawable.labandera,
            R.drawable.mangu,
            R.drawable.morirsonando,
            R.drawable.picapollo,
            R.drawable.sancocho
    };
    String [] mealSelection = {
            "Habichuelas con Dulce.",
            "Arroz, Habichuela, y Carne (La Bandera).",
            "Mangú.",
            "Morir Soñando.",
            "Pica Pollo.",
            "Sancocho."
    };
    ImageView myMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_food_list);
        GridView grid = findViewById(R.id.gridView);
        renderChoice = findViewById(R.id.renderChoice);

        final ImageView myMenu = findViewById(R.id.detailedView);
        grid.setAdapter(new ImageAdapter(this));
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                renderChoice.setText("You Picked: " + mealSelection[position]);
                myMenu.setImageResource(myMeals[position]);
            }
        });
    }
}
