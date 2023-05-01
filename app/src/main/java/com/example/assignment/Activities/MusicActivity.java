package com.example.assignment.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import com.example.assignment.MainActivity;
import com.example.assignment.R;

import java.io.IOException;

public class MusicActivity extends AppCompatActivity {

    Button backBtn, pickBtn;
    MediaPlayer musicPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        backBtn = findViewById(R.id.backBtn);
        pickBtn = findViewById(R.id.pickBtn);
//        musicPlayer = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI);

        Intent toMainActivity = new Intent(getApplicationContext(), MainActivity.class);

        backBtn.setOnClickListener(v -> startActivity(toMainActivity));

        pickBtn.setOnClickListener(v -> {
            Intent pickAudio = new Intent(Intent.ACTION_GET_CONTENT);
            pickAudio.setType("audio/*");
            startActivityForResult(pickAudio,100);
        });

    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 100){
            if (data!=null){
                Uri audioUri = data.getData();
                buildMediaPlayer(audioUri);
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    public void buildMediaPlayer(Uri uri){
        musicPlayer = new MediaPlayer();
        try {
            musicPlayer.setDataSource(getApplicationContext(),uri);
            musicPlayer.prepare();
            musicPlayer.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



}