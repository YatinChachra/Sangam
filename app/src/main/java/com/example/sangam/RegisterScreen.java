package com.example.sangam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegisterScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_screen);
    }


    public void insertAddress(View view)
    {
        Intent intent=new Intent(RegisterScreen.this,AddressScreen.class);
        startActivity(intent);
    }
}
