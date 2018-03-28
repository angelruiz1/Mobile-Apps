package com.example.ar2211.playmusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mp = MediaPlayer.create(this, R.raw.shaq);
    }

    public void playSong(View v) {
        mp.start();
    }

    public void pauseSong(View v) {
        mp.pause();
    }

    public void stopSong(View v) {
        mp.stop();
        mp = MediaPlayer.create(this, R.raw.shaq);
    }

    public void Ruiz(View View) {
        String button_text;
        button_text = ((Button) View).getText().toString();
        if (button_text.equals("Play")) {
            Intent ruiz = new Intent(this, Main2Activity.class);
            startActivity(ruiz);
        }
    }

}