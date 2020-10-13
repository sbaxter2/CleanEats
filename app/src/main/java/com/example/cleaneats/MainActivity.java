package com.example.cleaneats;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.SearchView;
import android.view.*;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{

    private RecyclerView recyclerView;
    private RestaurantAdapter adapter;
    private SearchView search;

    String keyword = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Restaurants");

        Intent intent = getIntent();
        if (intent != null) keyword = intent.getStringExtra("keyword");

        recyclerView = findViewById(R.id.rv_mainActivity);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RestaurantAdapter(this);
        recyclerView.setAdapter(adapter);

        //List<Restaurant> names = new ArrayList<>();   //the list we use for the search function

        final List<Restaurant> restaurants = new ArrayList<>();   //the list of restaurants to go in the recyclerview
        restaurants.add(new Restaurant("Moe's Southwest Grill",
                "2491 Winchester Rd. Memphis, TN 38116", 98));
        restaurants.add(new Restaurant("Starbucks",
                "2421 Patterson Rd. Memphis, TN 38116", 88));
        restaurants.add(new Restaurant("Ranchito Taqueria",
                "3916 Macon Rd. Memphis, TN 38122", 93));
        restaurants.add(new Restaurant("Lucy J's Bakery",
                "1350 Concourse Rd. Memphis, TN 38104", 98));
        restaurants.add(new Restaurant("McDonald's",
                "1206 N. Houston Levee Cordova, TN 38108", 98));
        restaurants.add(new Restaurant("Sonic",
                "1111 Poplar Ave. Memphis, TN 38104", 77));
        restaurants.add(new Restaurant("Moe's Southwest Grill",
                "2491 Winchester Rd. Memphis, TN 38116", 98));

        adapter.setNumbers(restaurants);

        search = findViewById(R.id.search);
        //Insert search here


}
}