package com.example.kotakfood.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.kotakfood.R;
import com.example.kotakfood.model.drink.drinkOrderBase;
import com.example.kotakfood.model.drink.drinkOrderConnection;

public class MyDrinkOrder_Activity extends AppCompatActivity {

    drinkOrderBase dob;

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_drink_order);

        dob = drinkOrderConnection.get();

        recyclerView = findViewById(R.id.mydrinkorderrecyclerview);

    }
}