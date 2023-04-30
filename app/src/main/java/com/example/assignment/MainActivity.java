package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button firstActivity,secondActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstActivity = findViewById(R.id.button1);
        secondActivity = findViewById(R.id.button2);

        firstActivity.setOnClickListener(v -> Toast.makeText(getApplicationContext(),"First Activity",Toast.LENGTH_SHORT).show());

        secondActivity.setOnClickListener(v -> Toast.makeText(getApplicationContext(),"Second Activity",Toast.LENGTH_SHORT).show());
    }
}