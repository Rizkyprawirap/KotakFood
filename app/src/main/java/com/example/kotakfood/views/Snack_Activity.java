package com.example.kotakfood.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.kotakfood.R;
import com.example.kotakfood.adapter.SnackAdapter;
import com.example.kotakfood.model.snackBase;
import com.example.kotakfood.model.snackLogic;
import com.example.kotakfood.model.snackType;

public class Snack_Activity extends AppCompatActivity {

    snackBase sb;

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack);

        sb = snackLogic.get();

        sb.add(new snackType("Lays", 10000, R.drawable.layss));
        sb.add(new snackType("Chiki Balls", 12000, R.drawable.chikiball));
        sb.add(new snackType("Pillows", 2000, R.drawable.pillows));
        sb.add(new snackType("Doritos", 50000, R.drawable.doritos));

        recyclerView = findViewById(R.id.snackListRecyclerView);
        recyclerView.setHasFixedSize(true);

        SnackAdapter snackAdapter = new SnackAdapter(this,sb);

        recyclerView.setAdapter(snackAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
    }
}