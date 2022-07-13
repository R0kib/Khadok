package com.khadok;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.app.Activity;
import android.os.Bundle;

import com.khadok.Adapters.MainAdapter;
import com.khadok.Models.MainModel;
import com.khadok.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MainModel> list = new ArrayList<>();

        list.add(new MainModel(R.drawable.burger, "Burger", "5", "Chicken Burger with extra petty"));
        list.add(new MainModel(R.drawable.pizza, "Pizza", "10", "Served with chicken, peperoni, black peper, sausage, mushroom"));
        list.add(new MainModel(R.drawable.fries, "Fries", "3", "Potato fries served with tomato sauce"));
        list.add(new MainModel(R.drawable.chicken_biryani, "Chicken Biryani", "8", "Biryani served with chicken"));
        list.add(new MainModel(R.drawable.seafood, "Seafood", "15", "Served with crab, prawn, salmon fish"));

        MainAdapter adapter = new MainAdapter(list, this);
        binding.recyclerview.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerview.setLayoutManager(layoutManager);

    }
}