package com.example.express_eat;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.MyViewHolder> {

    String data1[], data2[];
    int images[];
    Context context;

    public FoodAdapter(Context ct, String foodname[], String foodprice[], int img[])
    {
        context = ct;
        data1 = foodname;
        data2 = foodprice;
        images = img;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.foodholder, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.foodname.setText(data1[position]);
        holder.foodprice.setText(data2[position]);
        holder.image.setImageResource(images[position]);

        holder.mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, FoodDisplay.class);
                intent.putExtra("data1", data1[position]);
                intent.putExtra("data2", data2[position]);
                intent.putExtra("images", images[position]);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView foodname, foodprice;
        ImageView image;
        ConstraintLayout mainLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            foodname = itemView.findViewById(R.id.foodname);
            foodprice = itemView.findViewById(R.id.foodprice);
            image = itemView.findViewById(R.id.foodimage);
            mainLayout = itemView.findViewById(R.id.mainLayout);
        }
    }
}
