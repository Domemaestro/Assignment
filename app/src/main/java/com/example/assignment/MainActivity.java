package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.example.assignment.Activities.ImageActivity;
import com.example.assignment.Activities.MusicActivity;

public class MainActivity extends AppCompatActivity {
    Button firstActivity,secondActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstActivity = findViewById(R.id.button1);
        secondActivity = findViewById(R.id.button2);
        Intent toMusicActivity = new Intent(getApplicationContext(), MusicActivity.class);
        Intent toImageActivity = new Intent(getApplicationContext(), ImageActivity.class);

        firstActivity.setOnClickListener(v -> {
            startActivity(toMusicActivity);
            Toast.makeText(getApplicationContext(),"First Activity",Toast.LENGTH_SHORT).show();
        });

        secondActivity.setOnClickListener(v -> {
            startActivity(toImageActivity);
            Toast.makeText(getApplicationContext(),"Second Activity",Toast.LENGTH_SHORT).show();
                }
        );
    }
}