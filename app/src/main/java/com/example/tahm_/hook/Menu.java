package com.example.tahm_.hook;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import Player.Player_base;

import static com.example.tahm_.hook.MainActivity.mp;


public class Menu extends AppCompatActivity {

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
        setContentView(R.layout.activity_menu);
        Intent next = getIntent();
        money = next.getIntExtra("money", 0);
        rod_level = next.getIntExtra("rod_level", 0);
        check_bait = next.getIntExtra("check_bait", 0);
        count_bait_normal = next.getIntExtra("count_bait_normal", count_bait_normal);
        count_bait_hidden = next.getIntExtra("count_bait_hidden", count_bait_hidden);
        plus_percent = next.getIntExtra("plus_percent", plus_percent);
    }

    Player_base player = new Player_base(money, rod_level, check_bait, count_bait_normal, count_bait_hidden, plus_percent);

    public void onClick_aquarium(View v) {
        Toast.makeText(getApplicationContext(),"준비중입니다.", Toast.LENGTH_LONG).show();
        /*Intent aquarium = new Intent(getApplicationContext(), Aquarium.class);
        startActivity(aquarium);*/
    }

    public void onClick_exit(View v) {
        check();
        Intent exit = new Intent(getApplicationContext(), Finish.class);
        exit.putExtra("money", money);
        exit.putExtra("rod_level",rod_level);
        exit.putExtra("check_bait", check_bait);
        exit.putExtra("count_bait_normal", count_bait_normal);
        exit.putExtra("count_bait_hidden", count_bait_hidden);
        exit.putExtra("plus_percent",plus_percent);
        startActivity(exit);
        Toast.makeText(getApplicationContext(),"너무해! 너무해!", Toast.LENGTH_LONG).show();
    }

    public void onClick_move(View v) {
        check();
        Intent move = new Intent(getApplicationContext(), Move.class);
        move.putExtra("money", money);
        move.putExtra("rod_level",rod_level);
        move.putExtra("check_bait", check_bait);
        move.putExtra("count_bait_normal", count_bait_normal);
        move.putExtra("count_bait_hidden", count_bait_hidden);
        move.putExtra("plus_percent",plus_percent);
        startActivity(move);
    }

    public void onClick_shop(View v) {
        check();
        Intent shop = new Intent(getApplicationContext(), Shop.class);
        shop.putExtra("money", money);
        shop.putExtra("rod_level",rod_level);
        shop.putExtra("check_bait", check_bait);
        shop.putExtra("count_bait_normal", count_bait_normal);
        shop.putExtra("count_bait_hidden", count_bait_hidden);
        shop.putExtra("plus_percent",plus_percent);
        startActivity(shop);
        mp.pause();
        mp = MediaPlayer.create(this, R.raw.shop);
        mp.setLooping(true);
        mp.start();
    }

    public void onClick_inventory(View v) {
        check();
        Intent inventory = new Intent(getApplicationContext(), Inventory.class);
        inventory.putExtra("money", money);
        inventory.putExtra("rod_level",rod_level);
        inventory.putExtra("check_bait", check_bait);
        inventory.putExtra("count_bait_normal", count_bait_normal);
        inventory.putExtra("count_bait_hidden", count_bait_hidden);
        inventory.putExtra("plus_percent",plus_percent);
        startActivity(inventory);
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
