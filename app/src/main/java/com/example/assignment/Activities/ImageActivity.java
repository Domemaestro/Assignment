package com.example.assignment.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.widget.Button;
import android.widget.ImageView;

import com.example.assignment.MainActivity;
import com.example.assignment.R;

public class ImageActivity extends AppCompatActivity {
    Button backBtn, AddImageBtn;
    ImageView dispImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        backBtn = findViewById(R.id.backBtn);
        AddImageBtn = findViewById(R.id.addImage);
        dispImage = findViewById(R.id.displayImage);

        Intent toMainActivity = new Intent(getApplicationContext(), MainActivity.class);

        backBtn.setOnClickListener(v -> startActivity(toMainActivity));

        AddImageBtn.setOnClickListener(v -> selectImageFromStorage());
    }

    private void selectImageFromStorage(){
        Intent selectImage = new Intent();
        selectImage.setType("image/*");
        selectImage.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(selectImage,1);
    }

     @Override
     public void onActivityResult(int requestCode, int resultCode, Intent data) {
         super.onActivityResult(requestCode, resultCode, data);

         if (requestCode == 1){
             Uri imageUri = data.getData();
             if (imageUri != null){
                 dispImage.setImageURI(imageUri);
             }
         }
     }


}