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

import com.example.kotakfood.R;
import com.example.kotakfood.model.snack.snackBase;

public class SnackAdapter extends RecyclerView.Adapter<SnackAdapter.MyViewHolder>{

    snackBase sb;
    Context context;
    ConstraintLayout ItemList;

    public SnackAdapter( Context context, snackBase sb) {
        this.sb = sb;
        this.context = context;
    }

    @NonNull
    @Override
    public SnackAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =  LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.snack_row,parent,false);

        return new SnackAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SnackAdapter.MyViewHolder holder, int position) {
        holder.text1.setText(sb.get(position).getSnackName());
        holder.text2.setText(sb.get(position).getSnackPrice().toString());
        holder.drinkImage.setImageResource(sb.get(position).getSnackImage());
    }

    @Override
    public int getItemCount() {return this.sb.size();}

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView text1,text2;
        ImageView drinkImage;

        public MyViewHolder(@NonNull View itemView) {
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
                            intent =  new Intent(context, Snack_Lays_Activity.class);
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
