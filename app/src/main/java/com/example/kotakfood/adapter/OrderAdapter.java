package com.example.kotakfood.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kotakfood.R;
import com.example.kotakfood.model.drink.drinkOrder;
import com.example.kotakfood.views.MyDrinkOrder_Activity;

import java.util.ArrayList;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.MyViewHolder>{

    Context context;
    ArrayList<drinkOrder> drinkOrder;

    public OrderAdapter(Context context, ArrayList<drinkOrder> drinkOrder) {
        this.context = context;
        this.drinkOrder = drinkOrder;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =  LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.drink_order_row,parent,false);
        return new OrderAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.drinkName.setText(drinkOrder.get(position).getName());
        holder.drinkPrice.setText("Rp. "+drinkOrder.get(position).getDrinkPrice().toString());
        holder.drinkImage.setImageResource(drinkOrder.get(position).getDrinkImage());
    }


    @Override
    public int getItemCount() {
        return this.drinkOrder.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView drinkName, drinkPrice;
        LinearLayout listItem;
        ImageView drinkImage;

        public MyViewHolder(@NonNull View itemView){
            super(itemView);

            drinkName = itemView.findViewById(R.id.drinkname);
            drinkPrice = itemView.findViewById(R.id.drinkPrice);

            drinkImage = itemView.findViewById(R.id.drinksImage);

            listItem = itemView.findViewById(R.id.mydrinkorderrecyclerview);

            listItem.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, MyDrinkOrder_Activity.class);
                    drinkOrder.remove(getAdapterPosition());
                    context.startActivity(intent);
                    return;
                }
            });

        }

    }




}
