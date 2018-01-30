package com.example.ar2211.playmusic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mp = MediaPlayer.create(this, R.raw.shaq);
    }

    public void playSong(View v){
        mp.start();
    }

    public void pauseSong(View v) {
        mp.pause();
    }

    public void stopSong(View v) {
        mp.stop();
        mp = MediaPlayer.create(this, R.raw.shaq);
    }
}