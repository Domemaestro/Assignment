package com.example.assignment.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;

import com.example.assignment.MainActivity;
import com.example.assignment.R;

public class MusicActivity extends AppCompatActivity {

    Button backBtn, playBtn;
    MediaPlayer musicPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        backBtn = findViewById(R.id.backBtn);
        playBtn = findViewById(R.id.playBtn);
        musicPlayer = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI);


        Intent toMainActivity = new Intent(getApplicationContext(), MainActivity.class);

        backBtn.setOnClickListener(v -> startActivity(toMainActivity));

        playBtn.setOnClickListener(v -> {
           musicPlayer.start();
           musicPlayer.setLooping(true);
        });

    }



}