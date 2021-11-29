package com.example.kotakfood.views;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kotakfood.R;
import com.example.kotakfood.model.drink.drinkOrderBase;
import com.example.kotakfood.model.drink.drinkOrderConnection;
import com.example.kotakfood.model.drink.drinkType;

public class Drink_Detail_Activity extends AppCompatActivity {

    drinkOrderBase dob;
    drinkType dt;

    TextView drinkName,drinkPrice;
    ImageView drinkImage;
    int quantity=0;
//    Button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_detail);

        dob = drinkOrderConnection.get();
        dt = getIntent().getParcelableExtra("drinkdata");

        drinkName = findViewById(R.id.drinkname);
        drinkPrice = findViewById(R.id.drinkPrice);
        drinkImage = findViewById(R.id.drinksImage);

        drinkImage.setImageResource(dt.getDrinkImage());

    }

    public void increment(View view){//perintah tombol tambah
        if(quantity==100){
            Toast.makeText(this,"pesanan maximal 100",Toast.LENGTH_SHORT).show();
            return;
        }
        quantity = quantity+1 ;
        display(quantity);
    }
    public void decrement(View view){//perintah tombol tambah
        if (quantity==1){
            Toast.makeText(this,"pesanan minimal 1",Toast.LENGTH_SHORT).show();
            return;
        }
        quantity = quantity -1;
        display(quantity);
    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_textview);
        quantityTextView.setText("" + number);
    }


}