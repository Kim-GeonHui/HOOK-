package com.example.tahm_.hook;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import static com.example.tahm_.hook.MainActivity.mp;

public class Aquarium extends AppCompatActivity {

    @Override
    public void onBackPressed() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aquarium);
        mp.pause();
        mp = MediaPlayer.create(this, R.raw.aquarium);
        mp.setLooping(true);
        mp.start();
    }

    public void onClick_exit(View v) {
        Intent exit = new Intent(getApplicationContext(), Menu.class);
        startActivity(exit);
        mp.pause();
        mp = MediaPlayer.create(this, R.raw.normal);
        mp.setLooping(true);
        mp.start();
    }

}
