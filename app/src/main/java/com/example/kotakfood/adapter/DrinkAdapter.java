package com.example.kotakfood.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kotakfood.views.Drink_AirMineral_Activity;
import com.example.kotakfood.R;

public class DrinkAdapter extends RecyclerView.Adapter<DrinkAdapter.MyViewHolder>{

    String[] name,price;
    int images[];
    Context context;
    private ConstraintLayout ItemList;

    public DrinkAdapter( Context ctx, String[] name, String[] price, int[] images) {
        this.name = name;
        this.price = price;
        this.images = images;
        this.context = ctx;
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
        holder.text1.setText(name[position]);
        holder.text2.setText(price[position]);
        holder.myimage.setImageResource(images[position]);
    }


    @Override
    public int getItemCount() {
        return name.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView text1,text2;
        ImageView myimage;

        public MyViewHolder(@NonNull View itemView){
            super(itemView);

            myimage = itemView.findViewById(R.id.productImage);
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
