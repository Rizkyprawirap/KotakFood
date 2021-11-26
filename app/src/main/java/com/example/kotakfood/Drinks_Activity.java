package com.example.kotakfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Drinks_Activity extends AppCompatActivity {

    String drinkName[],drinkPrice[];
    int image[] = {
      R.drawable.airmineral, R.drawable.jusapel,
      R.drawable.jusmangga, R.drawable.jusalpukat
    };

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);

        recyclerView = findViewById(R.id.drinkListRecyclerView);
        recyclerView.setHasFixedSize(true);

        drinkName = getResources().getStringArray(R.array.drink_name);
        drinkPrice = getResources().getStringArray(R.array.drink_price);
        
        DrinkAdapter drinkAdapter =  new DrinkAdapter(this,drinkName,drinkPrice,image);
        
        recyclerView.setAdapter(drinkAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));


    }
}