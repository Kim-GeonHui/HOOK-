package com.example.tahm_.hook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

import Player.Player_base;

public class Fishing_7 extends AppCompatActivity {

    private  int before_map_code;
    private int money;
    private int rod_level;
    private int check_bait;
    private int count_bait_normal;
    private int count_bait_hidden;
    private int plus_percent;

    @Override
    public void onBackPressed() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fishing_7);
        Intent next = getIntent();
        before_map_code = next.getIntExtra("code_map", 0);
        money = next.getIntExtra("money", 0);
        rod_level = next.getIntExtra("rod_level", 0);
        check_bait = next.getIntExtra("check_bait", 0);
        count_bait_normal = next.getIntExtra("count_bait_normal", count_bait_normal);
        count_bait_hidden = next.getIntExtra("count_bait_hidden", count_bait_hidden);
        plus_percent = next.getIntExtra("plus_percent", plus_percent);
        stop();
    }

    Player_base player = new Player_base(money, rod_level, check_bait, count_bait_normal, count_bait_hidden, plus_percent);

    public void stop() {
        new Timer().schedule(new TimerTask() {
            public void run() {
                next();
            }
        }, 150);
    }

    public void next() {
        Intent next = new Intent(getApplicationContext(), Fishing_8.class);
        next.putExtra("code_map", before_map_code);
        next.putExtra("money", money);
        next.putExtra("rod_level", rod_level);
        next.putExtra("check_bait", check_bait);
        next.putExtra("count_bait_normal", count_bait_normal);
        next.putExtra("count_bait_hidden", count_bait_hidden);
        next.putExtra("plus_percent", plus_percent);
        startActivity(next);
        overridePendingTransition(0, 0);
    }

}
