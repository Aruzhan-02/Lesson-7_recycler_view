package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recycleview.adapters.FoodListAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv_Pizza;
    FoodListAdapter foodListAdapter;
    ArrayList<Food> foodList;
    private RecyclerView.LayoutManager linearLayoutManager, gridLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv_Pizza = findViewById(R.id.rv_Pizza);
        foodList = new ArrayList<>();

        foodList.add(new Food(R.drawable.pizza, "Pizza 4 seasons", "pizza", 2000));
        foodList.add(new Food(R.drawable.pizza, "Pizza Mozarella", "pizza", 1500));
        foodList.add(new Food(R.drawable.pizza, "Pizza Pepperoni", "pizza", 2500));

        foodListAdapter = new FoodListAdapter(this,foodList );

        linearLayoutManager = new LinearLayoutManager(this);

        rv_Pizza.setLayoutManager(linearLayoutManager);
        rv_Pizza.setAdapter(foodListAdapter);
    }


}