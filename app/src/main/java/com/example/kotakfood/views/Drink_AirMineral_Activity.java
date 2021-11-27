package com.example.kotakfood.views;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kotakfood.R;

import java.text.NumberFormat;

public class Drink_AirMineral_Activity extends AppCompatActivity {

    int quantity=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_air_mineral);
    }

    public void increment(View view){//perintah tombol tambah
        if(quantity==100){
            Toast.makeText(this,"pesanan maximal 100", Toast.LENGTH_SHORT).show();
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

    public String createOrderSummary(int price) {
        String pricemessage = "";
        pricemessage+="\n quantity"+quantity;
        pricemessage+="\n Total Rp"+ price;
        pricemessage+="\n Thankyou";

        return pricemessage;
    }

    private int calculateprice(){//jumlah pesanan * harga
        int harga= 4000;

        return quantity * harga;
    }

    public void Submitorder(View view) {

        int price=calculateprice();//memanggil method jumlah harga
        String pricemessage=createOrderSummary(price);

        displayMessage(pricemessage);

//        Button orderMore = (Button)findViewById(R.id.orderMorebtn);
//
//        orderMore.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Drink_AirMineral_Activity.this,Drinks_Activity.class);
//                startActivity(intent);
//            }
//        });
    }


    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_textview);
        priceTextView.setText(message);
    }
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_textview);
        quantityTextView.setText("" + number);
    }
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_textview);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}