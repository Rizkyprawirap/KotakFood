package com.example.kotakfood.adapter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kotakfood.model.drink.drinkBase;
import com.example.kotakfood.R;

public class DrinkAdapter extends RecyclerView.Adapter<DrinkAdapter.MyViewHolder>{

    drinkBase dt;
    Context context;
    ConstraintLayout ItemList;

    public DrinkAdapter(Context context, drinkBase db) {
        this.context = context;
        this.dt = db;

        Log.i("DrinkAdapter","ini nih" + db.get(0).getDrinkPrice());
    }

    @NonNull
    @Override
    public DrinkAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =  LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.drink_row,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DrinkAdapter.MyViewHolder holder, int position) {
        holder.text1.setText(dt.get(position).getDrinkName());
        holder.text2.setText(dt.get(position).getDrinkPrice().toString());
        holder.drinkImage.setImageResource(dt.get(position).getDrinkImage());
    }


    @Override
    public int getItemCount() {
        return this.dt.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView text1,text2;
        ImageView drinkImage;

        public MyViewHolder(@NonNull View itemView){
            super(itemView);

            drinkImage = itemView.findViewById(R.id.productImage);
            text1 = itemView.findViewById(R.id.productName);
            text2 = itemView.findViewById(R.id.productPrice);
            ItemList =  itemView.findViewById(R.id.item_list);

            ItemList.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent intent =  new Intent();
                    switch (getAdapterPosition()){
                        case 0 :
                            intent =  new Intent(context, Drink_AirMineral_Activity.class);
                            break;

                        case 1 :
                            intent =  new Intent(context,Drink_AirMineral_Activity.class);
                            break;

                        case 2 :
                            intent =  new Intent(context,Drink_AirMineral_Activity.class);
                            break;

                        case 3 :
                            intent =  new Intent(context,Drink_AirMineral_Activity.class);
                            break;
                    }

                    context.startActivity(intent);

                }
            });


        }

    }

}
