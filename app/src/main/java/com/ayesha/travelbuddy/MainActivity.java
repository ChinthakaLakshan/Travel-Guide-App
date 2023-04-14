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

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView email = (TextView) findViewById(R.id.email_input);
        TextView pass = (TextView) findViewById(R.id.password_input);

        Button log = (Button) findViewById(R.id.login_button);

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (email.getText().toString().equals("chinthaka@gmail.com") && pass.getText().toString().equals("123")) {
                    Toast.makeText(MainActivity.this, "LOGIN SUCCESS", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainActivity.this, interface2.class);
                    startActivity(i);
                } else {
                    Toast.makeText(MainActivity.this, "LOGIN FAILED", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}