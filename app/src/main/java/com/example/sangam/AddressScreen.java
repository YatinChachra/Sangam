package com.example.sangam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AddressScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address_screen);
    }

    public void saveDetails(View view)
    {
        Intent intent=new Intent(AddressScreen.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
