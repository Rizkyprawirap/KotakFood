package com.example.kotakfood.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.kotakfood.R;
import com.example.kotakfood.adapter.DrinkAdapter;
import com.example.kotakfood.model.drink.drinkBase;
import com.example.kotakfood.model.drink.drinkLogic;
import com.example.kotakfood.model.drink.drinkType;

public class Drinks_Activity extends AppCompatActivity {

    drinkBase db;

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);

        db = drinkLogic.get();

        db.add(new drinkType("Air Mineral", 5000,R.drawable.airmineral));
        db.add(new drinkType("Jus Apel", 5000,R.drawable.jusapel));
        db.add(new drinkType("Jus Mangga", 5000,R.drawable.jusmangga));
        db.add(new drinkType("Jus Alpukat", 5000,R.drawable.jusalpukat));

        recyclerView = findViewById(R.id.drinkListRecyclerView);
        recyclerView.setHasFixedSize(true);
        
        DrinkAdapter drinkAdapter =  new DrinkAdapter(this,db);
        
        recyclerView.setAdapter(drinkAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));


    }
}