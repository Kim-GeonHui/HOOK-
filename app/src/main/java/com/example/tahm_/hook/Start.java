package com.example.tahm_.hook;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import Fish.Fish_information;
import Player.Player_base;

public class Start extends AppCompatActivity {

    Fish_information fish = new Fish_information();

    @Override
    public void onBackPressed() {
    }

    private int money= 100000;
    private int rod_level = 0;
    private int check_bait= 0;
    private int count_bait_normal = 0;
    private int count_bait_hidden = 0;
    private int plus_percent = 0;

    private int check_100=0;
    private int check_101=0;
    private int check_102=0;
    private int check_103=0;
    private int check_104=0;
    private int check_105=0;
    private int check_106=0;
    private int check_190=0;
    private int check_200=0;
    private int check_201=0;
    private int check_202=0;
    private int check_203=0;
    private int check_204=0;
    private int check_205=0;
    private int check_206=0;
    private int check_207=0;
    private int check_208=0;
    private int check_209=0;
    private int check_210=0;
    private int check_211=0;
    private int check_212=0;
    private int check_213=0;
    private int check_214=0;
    private int check_215=0;
    private int check_216=0;
    private int check_217=0;
    private int check_218=0;
    private int check_290=0;
    private int check_300=0;
    private int check_301=0;
    private int check_302=0;
    private int check_303=0;
    private int check_304=0;
    private int check_305=0;
    private int check_306=0;
    private int check_307=0;
    private int check_308=0;
    private int check_309=0;
    private int check_390=0;

    public Player_base player = new Player_base(money, rod_level, check_bait, count_bait_normal, count_bait_hidden, plus_percent);

    public static MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
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
        next.putExtra("check_100", check_100);
        next.putExtra("check_101", check_101);
        next.putExtra("check_102", check_102);
        next.putExtra("check_103", check_103);
        next.putExtra("check_104", check_104);
        next.putExtra("check_105", check_105);
        next.putExtra("check_106", check_106);
        next.putExtra("check_190", check_190);
        next.putExtra("check_200", check_200);
        next.putExtra("check_201", check_201);
        next.putExtra("check_202", check_202);
        next.putExtra("check_203", check_203);
        next.putExtra("check_204", check_204);
        next.putExtra("check_205", check_205);
        next.putExtra("check_206", check_206);
        next.putExtra("check_207", check_207);
        next.putExtra("check_208", check_208);
        next.putExtra("check_209", check_209);
        next.putExtra("check_210", check_210);
        next.putExtra("check_211", check_211);
        next.putExtra("check_212", check_212);
        next.putExtra("check_213", check_213);
        next.putExtra("check_214", check_214);
        next.putExtra("check_215", check_215);
        next.putExtra("check_216", check_216);
        next.putExtra("check_217", check_217);
        next.putExtra("check_218", check_218);
        next.putExtra("check_290", check_290);
        next.putExtra("check_300", check_300);
        next.putExtra("check_301", check_301);
        next.putExtra("check_302", check_302);
        next.putExtra("check_303", check_303);
        next.putExtra("check_304", check_304);
        next.putExtra("check_305", check_305);
        next.putExtra("check_306", check_306);
        next.putExtra("check_307", check_307);
        next.putExtra("check_308", check_308);
        next.putExtra("check_309", check_309);
        next.putExtra("check_390", check_390);
        finish();
        startActivity(next);
    }

    public void onClick_exit(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(Start.this);
        builder.setTitle("정말로 게임을 종료하시겠습니까?");
        builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                finish();
                mp.pause();
                Toast.makeText(getApplicationContext(),"너무해! 너무해!", Toast.LENGTH_LONG).show();
            }
        });
        builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }


}
