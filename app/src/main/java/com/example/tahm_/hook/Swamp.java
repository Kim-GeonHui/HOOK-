package com.example.tahm_.hook;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import Player.Player_base;

import static com.example.tahm_.hook.MainActivity.mp;

public class Swamp extends AppCompatActivity {

    private int choice;
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
        setContentView(R.layout.activity_swamp);
        Intent go_s = getIntent();
        money = go_s.getIntExtra("money", 0);
        rod_level = go_s.getIntExtra("rod_level", 0);
        check_bait = go_s.getIntExtra("check_bait", 0);
        count_bait_normal = go_s.getIntExtra("count_bait_normal", count_bait_normal);
        count_bait_hidden = go_s.getIntExtra("count_bait_hidden", count_bait_hidden);
        plus_percent = go_s.getIntExtra("plus_percent", plus_percent);
        check();
        mp.pause();
        mp = MediaPlayer.create(this, R.raw.swamp);
        mp.setLooping(true);
        mp.start();
    }

    Player_base player = new Player_base(money, rod_level, check_bait, count_bait_normal, count_bait_hidden, plus_percent);

    private int map_num=1;

    public void onClick_inventory(View v) {
        check();
        Intent inventory = new Intent(getApplicationContext(), Inventory.class);
        inventory.putExtra("code_map", map_num);
        inventory.putExtra("money", money);
        inventory.putExtra("rod_level",rod_level);
        inventory.putExtra("check_bait", check_bait);
        inventory.putExtra("count_bait_normal", count_bait_normal);
        inventory.putExtra("count_bait_hidden", count_bait_hidden);
        inventory.putExtra("plus_percent",plus_percent);
        startActivity(inventory);
    }

    public void onClick_move(View v) {
        check();
        Intent move = new Intent(getApplicationContext(), Move.class);
        move.putExtra("code_map", map_num);
        move.putExtra("money", money);
        move.putExtra("rod_level", rod_level);
        move.putExtra("check_bait", check_bait);
        move.putExtra("count_bait_normal", count_bait_normal);
        move.putExtra("count_bait_hidden", count_bait_hidden);
        move.putExtra("plus_percent", plus_percent);
        startActivity(move);
        mp.pause();
        mp = MediaPlayer.create(this, R.raw.normal);
        mp.setLooping(true);
        mp.start();
    }

    public void onClick_aquarium(View v) {
        Toast.makeText(getApplicationContext(),"낚시 전용 맵에서는 아쿠아리움 이동이 불가능합니다!", Toast.LENGTH_LONG).show();
    }

    public void onClick_exit(View v) {
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

    public void onClick_shop(View v) {
        Toast.makeText(getApplicationContext(),"낚시 전용 맵에서는 상점 이용이 불가능합니다!", Toast.LENGTH_LONG).show();
    }

    public void onClick_start(View v) {
        all_check();
    }

    public void all_check() {
        if (rod_level>=1) {
            if (check_bait == 3) {
                plus_percent = 5 * (rod_level) + 5;
                check();
                AlertDialog.Builder builder = new AlertDialog.Builder(Swamp.this);
                builder.setTitle("사용하실 미끼를 선택하여주세요.");
                builder.setNegativeButton("일반 미끼", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        count_bait_normal-=1;
                        plus_percent=5*(rod_level);
                        check();
                        Intent next = new Intent(getApplicationContext(), Fishing_0.class);
                        next.putExtra("code_map", map_num);
                        next.putExtra("money", money);
                        next.putExtra("rod_level", rod_level);
                        next.putExtra("check_bait", check_bait);
                        next.putExtra("count_bait_normal", count_bait_normal);
                        next.putExtra("count_bait_hidden", count_bait_hidden);
                        next.putExtra("plus_percent", plus_percent);
                        startActivity(next);
                        overridePendingTransition(0, 0);
                    }
                });
                builder.setPositiveButton("고급 미끼", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        count_bait_hidden-=1;
                        plus_percent=5*(rod_level)+5;
                        check();
                        Intent next = new Intent(getApplicationContext(), Fishing_0.class);
                        next.putExtra("code_map", map_num);
                        next.putExtra("money", money);
                        next.putExtra("rod_level", rod_level);
                        next.putExtra("check_bait", check_bait);
                        next.putExtra("count_bait_normal", count_bait_normal);
                        next.putExtra("count_bait_hidden", count_bait_hidden);
                        next.putExtra("plus_percent", plus_percent);
                        startActivity(next);
                        overridePendingTransition(0, 0);
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
            else if (check_bait == 2) {
                count_bait_hidden-=1;
                plus_percent=5*(rod_level)+5;
                check();
                Intent next = new Intent(getApplicationContext(), Fishing_0.class);
                next.putExtra("code_map", map_num);
                next.putExtra("money", money);
                next.putExtra("rod_level", rod_level);
                next.putExtra("check_bait", check_bait);
                next.putExtra("count_bait_normal", count_bait_normal);
                next.putExtra("count_bait_hidden", count_bait_hidden);
                next.putExtra("plus_percent", plus_percent);
                startActivity(next);
                overridePendingTransition(0, 0);
            }
            else if (check_bait==1) {
                count_bait_normal-=1;
                plus_percent=5*(rod_level)+0;
                check();
                Intent next = new Intent(getApplicationContext(), Fishing_0.class);
                next.putExtra("code_map", map_num);
                next.putExtra("money", money);
                next.putExtra("rod_level", rod_level);
                next.putExtra("check_bait", check_bait);
                next.putExtra("count_bait_normal", count_bait_normal);
                next.putExtra("count_bait_hidden", count_bait_hidden);
                next.putExtra("plus_percent", plus_percent);
                startActivity(next);
                overridePendingTransition(0, 0);
            }
            else {
                Toast.makeText(getApplicationContext(), "미끼가 하나도 없습니다.", Toast.LENGTH_LONG).show();
            }
        }
        else {
            if (check_bait >= 1) {
                Toast.makeText(getApplicationContext(), "낚싯대가 없습니다.", Toast.LENGTH_LONG).show();
            }
            else {
                Toast.makeText(getApplicationContext(), "낚싯대와 미끼가 없습니다.", Toast.LENGTH_LONG).show();
            }
        }
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

