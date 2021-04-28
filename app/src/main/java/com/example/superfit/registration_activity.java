package com.example.superfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class registration_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration_screen);
    }
    public void Sign_up_reg(View view){
        Intent intent = new Intent(registration_activity.this, main_activity.class);
        startActivity(intent);
    }
    public void Sign_in_reg(View view){
        Intent intent = new Intent(registration_activity.this, autorization_activity.class);
        startActivity(intent);
    }
}