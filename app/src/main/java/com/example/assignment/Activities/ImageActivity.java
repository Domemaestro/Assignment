package com.example.assignment.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import com.example.assignment.MainActivity;
import com.example.assignment.R;

public class ImageActivity extends AppCompatActivity {
    Button backBtn, AddImageBtn;
    ImageView selectedImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        backBtn = findViewById(R.id.backBtn);
        AddImageBtn = findViewById(R.id.addImage);
        selectedImage = findViewById(R.id.displayImage);

        Intent toMainActivity = new Intent(getApplicationContext(), MainActivity.class);

        backBtn.setOnClickListener(v -> startActivity(toMainActivity));


    }
}