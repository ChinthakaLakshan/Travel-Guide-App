package com.ayesha.travelbuddy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterViewFlipper;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class interface2 extends AppCompatActivity {
    AdapterViewFlipper flipper;
    ArrayList<AdapterFlipperModel> flipper_data;
    AdapterFlipper_BaseAdapter flipper_baseadapter;

    CardView galle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface2);



        flipper = findViewById(R.id.adapter_flipper_home); //main flipper of the home which would be shown in application

        flipper_data = new ArrayList<>();

        //Adding items to flipper_data arraylist.
        flipper_data.add(new AdapterFlipperModel("Tooth Relic Temple", "Kandy", R.drawable.toothrelic)); //setting values to the items which were in the constructor of model adpater java class
        flipper_data.add(new AdapterFlipperModel("Galle Fort", "Galle", R.drawable.gallefort));

        //Setting the adapter
        flipper_baseadapter = new AdapterFlipper_BaseAdapter(this, flipper_data);
        flipper.setAdapter(flipper_baseadapter);

        //Few settings for controlling the flipper
        flipper.setAutoStart(true); //start when the application starts without the user click.
        flipper.setFlipInterval(3000); //3000 milliseconds = 3 seconds.

        galle = findViewById(R.id.amritsar_home);
        galle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(interface2.this, City_Information.class));
            }
        });

    }
}