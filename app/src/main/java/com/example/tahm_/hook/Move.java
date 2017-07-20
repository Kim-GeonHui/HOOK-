package com.example.tahm_.hook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import Player.Player_base;

public class Move extends AppCompatActivity {

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
        setContentView(R.layout.activity_move);
        Intent move = getIntent();
        money = move.getIntExtra("money", 0);
        rod_level = move.getIntExtra("rod_level", 0);
        check_bait = move.getIntExtra("check_bait", 0);
        count_bait_normal = move.getIntExtra("count_bait_normal", count_bait_normal);
        count_bait_hidden = move.getIntExtra("count_bait_hidden", count_bait_hidden);
        plus_percent = move.getIntExtra("plus_percent", plus_percent);
        check();
    }

    Player_base player = new Player_base(money, rod_level, check_bait, count_bait_normal, count_bait_hidden, plus_percent);

        public void onClick_go_t(View v) {
            check();
            Intent go_t = new Intent(getApplicationContext(), Tropical_beach.class);
            go_t.putExtra("money", money);
            go_t.putExtra("rod_level",rod_level);
            go_t.putExtra("check_bait", check_bait);
            go_t.putExtra("count_bait_normal", count_bait_normal);
            go_t.putExtra("count_bait_hidden", count_bait_hidden);
            go_t.putExtra("plus_percent",plus_percent);
            startActivity(go_t);
    }

    public void onClick_go_r(View v) {
        check();
        Intent next = new Intent(getApplicationContext(), Menu.class);
        next.putExtra("money", money);
        next.putExtra("rod_level",rod_level);
        next.putExtra("check_bait", check_bait);
        next.putExtra("count_bait_normal", count_bait_normal);
        next.putExtra("count_bait_hidden", count_bait_hidden);
        next.putExtra("plus_percent",plus_percent);
        startActivity(next);
    }

    public void onClick_go_b(View v) {
        check();
        Intent go_b = new Intent(getApplicationContext(), Bermuda_triangle.class);
        go_b.putExtra("money", money);
        go_b.putExtra("rod_level",rod_level);
        go_b.putExtra("check_bait", check_bait);
        go_b.putExtra("count_bait_normal", count_bait_normal);
        go_b.putExtra("count_bait_hidden", count_bait_hidden);
        go_b.putExtra("plus_percent",plus_percent);
        startActivity(go_b);
    }

    public void onClick_go_s(View v) {
        check();
        Intent go_s = new Intent(getApplicationContext(), Swamp.class);
        go_s.putExtra("money", money);
        go_s.putExtra("rod_level",rod_level);
        go_s.putExtra("check_bait", check_bait);
        go_s.putExtra("count_bait_normal", count_bait_normal);
        go_s.putExtra("count_bait_hidden", count_bait_hidden);
        go_s.putExtra("plus_percent",plus_percent);
        startActivity(go_s);
    }

    public void check() {
        if (count_bait_hidden>0) {
            if (count_bait_normal>0) {
                check_bait=3;
            }
            else {
                check_bait=2;
            }
        }
        else {
            if (count_bait_normal>0) {
                check_bait=1;
            }
            else {
                check_bait=0;
            }
        }
    }

}