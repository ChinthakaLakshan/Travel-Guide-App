package com.ayesha.travelbuddy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class City_Information extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager manager;
    ArrayList<RecyclerViewModel> list = new ArrayList<>();
    RecyclerViewItemDecoration decoration;

    Button locbtn,resbtn,hotbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_information);

        locbtn = findViewById(R.id.button);
        resbtn = findViewById(R.id.button3);
        hotbtn = findViewById(R.id.button2);

        //String location = "https://www.google.co.in/maps/place/Amritsar,+Punjab/@31.633525,74.8000794,12z/data=!3m1!4b1!4m5!3m4!1s0x391964aa569e7355:0xeea2605bee84ef7d!8m2!3d31.6339793!4d74.8722642";
        ///// RECYCLER VIEW :
        String location = "https://www.google.com/maps/place/Galle/@6.0558916,80.2119971,14z/data=!3m1!4b1!4m6!3m5!1s0x3ae173bb6932fce3:0x4a35b903f9c64c03!8m2!3d6.0328948!4d80.2167912!16zL20vMDI3M21r";
        String restaurant = "https://www.tripadvisor.com/Restaurants-g297896-Galle_Galle_District_Southern_Province.html";
        String hotel = "https://www.tripadvisor.com/SmartDeals-g297896-Galle_Galle_District_Southern_Province-Hotel-Deals.html";

        list.add(new RecyclerViewModel("Galle Fort", "2 km", R.drawable.gallefort1, 4.5f));
        list.add(new RecyclerViewModel("Hikkaduwa", "28 km", R.drawable.hikkaduwa, 4f));
        list.add(new RecyclerViewModel("Maritime Museum", "2 km", R.drawable.maritine, 4.5f));
        list.add(new RecyclerViewModel("Jungle Beach", "3 km", R.drawable.junglebeach, 3f));

        recyclerView = findViewById(R.id.recyclerView);

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, list);
        manager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        decoration = new RecyclerViewItemDecoration(16);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(manager);
        recyclerView.addItemDecoration(decoration);

        locbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(location)));
            }
        });

        resbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(restaurant)));
            }
        });

        hotbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(hotel)));
            }
        });

    }


}