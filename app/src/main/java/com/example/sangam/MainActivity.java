package com.example.sangam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void registerScreen(View view)
    {
        Intent intent=new Intent(MainActivity.this,RegisterScreen.class);
        startActivity(intent);
    }

    public void loginUser(View view)
    {
        Intent intent=new Intent(MainActivity.this,Home.class);
        startActivity(intent);
    }

    public void forgotPassword(View view)
    {

    }
}

