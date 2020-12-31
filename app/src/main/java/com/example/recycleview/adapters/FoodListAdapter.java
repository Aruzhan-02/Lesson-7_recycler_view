package com.example.recycleview.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleview.Food;
import com.example.recycleview.R;

import java.util.List;

public class FoodListAdapter extends RecyclerView.Adapter<FoodListAdapter.MyTViewHolder> {
    private Context context;
    private List<Food> foodList;

    public class MyTViewHolder extends RecyclerView.ViewHolder{
        public ImageView photo;
        public TextView title, desc, price;

        public MyTViewHolder(View view){
            super(view);
            photo = view.findViewById(R.id.photo);
            title = view.findViewById(R.id.title);
            desc = view.findViewById(R.id.desc);
            price = view.findViewById(R.id.price);

        }
    }

    public FoodListAdapter(Context context, List<Food> foodList){
        this.context = context;
        this.foodList = foodList;
    }

    @Override
    public MyTViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View itemView;
        itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_food, parent, false);

        return new MyTViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyTViewHolder sborka, int position){
        Food item = foodList.get(position);

        sborka.photo.setImageResource(item.getPhoto());
        sborka.title.setText(item.getTitle());
        sborka.desc.setText(item.getDesc());
        sborka.price.setText(""+item.getPrice());
    }

    @Override
    public int getItemCount(){return foodList.size();}


}
