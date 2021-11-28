package com.example.kotakfood.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.kotakfood.R;
import com.example.kotakfood.model.drinkBase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button drinksButton = (Button)findViewById(R.id.Drinksbtn);
        Button snacksButton = (Button)findViewById(R.id.Snacksbtn);
        Button foodsButton = (Button)findViewById(R.id.Foodbtn);
        Button topupButton = (Button)findViewById(R.id.TopUpbtn);

        drinksButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Drinks_Activity.class);
                startActivity(intent);
            }
        });

        snacksButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Snack_Activity.class);
                startActivity(intent);
            }
        });


        foodsButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Food_Activity.class);
                startActivity(intent);
            }
        });
    }
}