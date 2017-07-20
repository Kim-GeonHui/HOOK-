package com.example.tahm_.hook;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import Fish.Fish_information;
import Player.Player_base;

public class MainActivity extends AppCompatActivity {

    Fish_information fish = new Fish_information();

    @Override
    public void onBackPressed() {
    }

    private int money= 1000000;
    private int rod_level = 0;
    private int check_bait= 0;
    private int count_bait_normal = 0;
    private int count_bait_hidden = 0;
    private int plus_percent = 0;

    public Player_base player = new Player_base(money, rod_level, check_bait, count_bait_normal, count_bait_hidden, plus_percent);

    public static MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp = MediaPlayer.create(this, R.raw.normal);
        mp.setLooping(true);
        mp.start();
    }

    public void onClick_start(View v) {
        Intent next = new Intent(getApplicationContext(), Menu.class);
        next.putExtra("money", money);
        next.putExtra("rod_level",rod_level);
        next.putExtra("check_bait", check_bait);
        next.putExtra("count_bait_normal", count_bait_normal);
        next.putExtra("count_bait_hidden", count_bait_hidden);
        next.putExtra("plus_percent",plus_percent);
        startActivity(next);
    }

    public void onClick_exit(View v) {
        Intent exit = new Intent(getApplicationContext(), Finish.class);
        startActivity(exit);
    }
}
