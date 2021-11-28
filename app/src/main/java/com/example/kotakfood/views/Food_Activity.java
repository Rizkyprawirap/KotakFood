package com.example.kotakfood.views;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kotakfood.R;
import com.example.kotakfood.adapter.FoodAdapter;
import com.example.kotakfood.model.drinkType;
import com.example.kotakfood.model.foodBase;
import com.example.kotakfood.model.foodLogic;
import com.example.kotakfood.model.foodType;

public class Food_Activity extends AppCompatActivity {

    foodBase fb;

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        fb = foodLogic.get();

        fb.add(new foodType("Caviar", 500000,R.drawable.caviar));
        fb.add(new foodType("Sushi", 150000,R.drawable.sushi));
        fb.add(new foodType("Soup", 50000,R.drawable.soup));
        fb.add(new foodType("Pizza", 250000,R.drawable.pizza));

        recyclerView = findViewById(R.id.foodListRecyclerView);
        recyclerView.setHasFixedSize(true);

        FoodAdapter foodAdapter =  new FoodAdapter(this,fb);
        recyclerView.setAdapter(foodAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

    }
}