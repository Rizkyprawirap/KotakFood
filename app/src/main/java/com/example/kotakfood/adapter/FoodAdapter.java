package com.example.kotakfood.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kotakfood.R;
import com.example.kotakfood.model.drinkBase;
import com.example.kotakfood.model.foodBase;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.MyViewHolder>{

    foodBase fb;
    Context context;
    ConstraintLayout ItemList;

    public FoodAdapter(Context context,foodBase fb) {
        this.context = context;
        this.fb = fb;
    }

    @NonNull
    @Override
    public FoodAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =  LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.food_row,parent,false);

        return new FoodAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodAdapter.MyViewHolder holder, int position) {
        holder.text1.setText(fb.get(position).getFoodName());
        holder.text2.setText(fb.get(position).getFoodPrice().toString());
        holder.foodImage.setImageResource(fb.get(position).getFoodImage());
    }

    @Override
    public int getItemCount() {
        return this.fb.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView text1,text2;
        ImageView foodImage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            foodImage = itemView.findViewById(R.id.productImage);
            text1 = itemView.findViewById(R.id.productName);
            text2 = itemView.findViewById(R.id.productPrice);
            ItemList =  itemView.findViewById(R.id.item_list);


        }
    }

}
