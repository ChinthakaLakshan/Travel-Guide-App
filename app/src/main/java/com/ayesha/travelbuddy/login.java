package com.ayesha.travelbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView email = (TextView) findViewById(R.id.email_input);
        TextView pass = (TextView) findViewById(R.id.password_input);
        Button Log = (Button) findViewById(R.id.login_button);

        Log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (email.getText().toString().equals("chinthaka")&& pass.getText().toString().equals("123")){
                    Toast.makeText(login.this,"LOGIN SUCCESS",Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(login.this,MainActivity.class);
                }else {
                    Toast.makeText(login.this,"LOGIN FAILED",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }



}