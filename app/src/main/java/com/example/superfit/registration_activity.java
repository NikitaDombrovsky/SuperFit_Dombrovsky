package com.example.superfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class registration_activity extends AppCompatActivity {


    EditText etName, etEmail, etCode, etRepeatCode;
    Based based;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration_screen);

        etName = (EditText) findViewById(R.id.username);
        etEmail = (EditText) findViewById(R.id.email);
        etCode = (EditText) findViewById(R.id.code);
        etRepeatCode = (EditText) findViewById(R.id.repeatcode);

        based = new Based(this);



    }
    public void Sign_up_reg(View view){
        String name = etName.getText().toString();
        String email = etEmail.getText().toString();
        String code = etCode.getText().toString();
        String Repeatcode = etRepeatCode.getText().toString();

        SQLiteDatabase database = based.getWritableDatabase();

        ContentValues contentValues = new ContentValues();


        Intent intent = new Intent(registration_activity.this, main_activity.class);
        startActivity(intent);
    }
    public void Sign_in_reg(View view){
        Intent intent = new Intent(registration_activity.this, autorization_activity.class);
        startActivity(intent);
    }
}