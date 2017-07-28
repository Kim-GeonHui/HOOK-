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

import static com.example.tahm_.hook.Start.mp;

public class Bermuda_triangle extends AppCompatActivity {

    private int money;
    private int rod_level;
    private int check_bait;
    private int count_bait_normal;
    private int count_bait_hidden;
    private int plus_percent;
    private int map_num;

    private int check_100;
    private int check_101;
    private int check_102;
    private int check_103;
    private int check_104;
    private int check_105;
    private int check_106;
    private int check_190;
    private int check_200;
    private int check_201;
    private int check_202;
    private int check_203;
    private int check_204;
    private int check_205;
    private int check_206;
    private int check_207;
    private int check_208;
    private int check_209;
    private int check_210;
    private int check_211;
    private int check_212;
    private int check_213;
    private int check_214;
    private int check_215;
    private int check_216;
    private int check_217;
    private int check_218;
    private int check_290;
    private int check_300;
    private int check_301;
    private int check_302;
    private int check_303;
    private int check_304;
    private int check_305;
    private int check_306;
    private int check_307;
    private int check_308;
    private int check_309;
    private int check_390;

    @Override
    public void onBackPressed() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bermuda_triangle);
        mp.pause();
        mp = MediaPlayer.create(this, R.raw.bermuda_triangle);
        mp.setLooping(true);
        mp.start();
        Intent next = getIntent();
        money = next.getIntExtra("money", 0);
        rod_level = next.getIntExtra("rod_level", 0);
        check_bait = next.getIntExtra("check_bait", 0);
        count_bait_normal = next.getIntExtra("count_bait_normal", count_bait_normal);
        count_bait_hidden = next.getIntExtra("count_bait_hidden", count_bait_hidden);
        plus_percent = next.getIntExtra("plus_percent", plus_percent);
        check_100 = next.getIntExtra("check_100", 32);
        check_101 = next.getIntExtra("check_101", 32);
        check_102 = next.getIntExtra("check_102", 32);
        check_103 = next.getIntExtra("check_103", 32);
        check_104 = next.getIntExtra("check_104", 32);
        check_105 = next.getIntExtra("check_105", 32);
        check_106 = next.getIntExtra("check_106", 32);
        check_190 = next.getIntExtra("check_190", 32);
        check_200 = next.getIntExtra("check_200", 32);
        check_201 = next.getIntExtra("check_201", 32);
        check_202 = next.getIntExtra("check_202", 32);
        check_203 = next.getIntExtra("check_203", 32);
        check_204 = next.getIntExtra("check_204", 32);
        check_205 = next.getIntExtra("check_205", 32);
        check_206 = next.getIntExtra("check_206", 32);
        check_207 = next.getIntExtra("check_207", 32);
        check_208 = next.getIntExtra("check_208", 32);
        check_209 = next.getIntExtra("check_209", 32);
        check_210 = next.getIntExtra("check_210", 32);
        check_211 = next.getIntExtra("check_211", 32);
        check_212 = next.getIntExtra("check_212", 32);
        check_213 = next.getIntExtra("check_213", 32);
        check_214 = next.getIntExtra("check_214", 32);
        check_215 = next.getIntExtra("check_215", 32);
        check_216 = next.getIntExtra("check_216", 32);
        check_217 = next.getIntExtra("check_217", 32);
        check_218 = next.getIntExtra("check_218", 32);
        check_290 = next.getIntExtra("check_290", 32);
        check_300 = next.getIntExtra("check_300", 32);
        check_301 = next.getIntExtra("check_301", 32);
        check_302 = next.getIntExtra("check_302", 32);
        check_303 = next.getIntExtra("check_303", 32);
        check_304 = next.getIntExtra("check_304", 32);
        check_305 = next.getIntExtra("check_305", 32);
        check_306 = next.getIntExtra("check_306", 32);
        check_307 = next.getIntExtra("check_307", 32);
        check_308 = next.getIntExtra("check_308", 32);
        check_309 = next.getIntExtra("check_309", 32);
        check_390 = next.getIntExtra("check_390", 32);
        map_num=3;
        check();
    }

    Player_base player = new Player_base(money, rod_level, check_bait, count_bait_normal, count_bait_hidden, plus_percent);

    public void onClick_inventory(View v) {
        check();
        Intent next = new Intent(getApplicationContext(), Inventory.class);
        next.putExtra("code_map", map_num);
        next.putExtra("money", money);
        next.putExtra("rod_level", rod_level);
        next.putExtra("check_bait", check_bait);
        next.putExtra("count_bait_normal", count_bait_normal);
        next.putExtra("count_bait_hidden", count_bait_hidden);
        next.putExtra("plus_percent", plus_percent);
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
        map_num=0;
    }

    public void onClick_move(View v) {
        check();
        Intent next = new Intent(getApplicationContext(), Move.class);
        next.putExtra("money", money);
        next.putExtra("rod_level", rod_level);
        next.putExtra("check_bait", check_bait);
        next.putExtra("count_bait_normal", count_bait_normal);
        next.putExtra("count_bait_hidden", count_bait_hidden);
        next.putExtra("plus_percent", plus_percent);
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
        mp.pause();
        mp = MediaPlayer.create(this, R.raw.normal);
        mp.setLooping(true);
        mp.start();
        map_num=0;
    }

    public void onClick_aquarium(View v) {
        Toast.makeText(getApplicationContext(),"낚시 전용 맵에서는 아쿠아리움 이동이 불가능합니다!", Toast.LENGTH_LONG).show();
    }

    public void onClick_exit(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(Bermuda_triangle.this);
        builder.setTitle("정말로 게임을 종료하시겠습니까?");
        builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"너무해! 너무해!", Toast.LENGTH_LONG).show();
                mp.pause();
                finish();
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

    public void onClick_shop(View v) {
        Toast.makeText(getApplicationContext(),"낚시 전용 맵에서는 상점 이용이 불가능합니다!", Toast.LENGTH_LONG).show();
    }

    public void onClick_start(View v) {
        all_check();
    }

    public void all_check() {
        if (rod_level>=1) {
            if (check_bait == 3) {
                check();
                AlertDialog.Builder builder = new AlertDialog.Builder(Bermuda_triangle.this);
                builder.setTitle("사용하실 미끼를 선택하여주세요.");
                builder.setNegativeButton("일반 미끼", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        count_bait_normal-=1;
                        plus_percent=3;
                        check();
                        Intent next = new Intent(getApplicationContext(), Fishing_0.class);
                        next.putExtra("code_map", map_num);
                        next.putExtra("money", money);
                        next.putExtra("rod_level", rod_level);
                        next.putExtra("check_bait", check_bait);
                        next.putExtra("count_bait_normal", count_bait_normal);
                        next.putExtra("count_bait_hidden", count_bait_hidden);
                        next.putExtra("plus_percent", plus_percent);
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
                        map_num=0;
                    }
                });
                builder.setPositiveButton("고급 미끼", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        count_bait_hidden-=1;
                        plus_percent=5;
                        check();
                        Intent next = new Intent(getApplicationContext(), Fishing_0.class);
                        next.putExtra("code_map", map_num);
                        next.putExtra("money", money);
                        next.putExtra("rod_level", rod_level);
                        next.putExtra("check_bait", check_bait);
                        next.putExtra("count_bait_normal", count_bait_normal);
                        next.putExtra("count_bait_hidden", count_bait_hidden);
                        next.putExtra("plus_percent", plus_percent);
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
                        map_num=0;
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
            else if (check_bait == 2) {
                count_bait_hidden-=1;
                plus_percent = 5;
                check();
                Intent next = new Intent(getApplicationContext(), Fishing_0.class);
                next.putExtra("code_map", map_num);
                next.putExtra("money", money);
                next.putExtra("rod_level", rod_level);
                next.putExtra("check_bait", check_bait);
                next.putExtra("count_bait_normal", count_bait_normal);
                next.putExtra("count_bait_hidden", count_bait_hidden);
                next.putExtra("plus_percent", plus_percent);
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
                map_num=0;
            }
            else if (check_bait==1) {
                count_bait_normal-=1;
                plus_percent = 3;
                check();
                Intent next = new Intent(getApplicationContext(), Fishing_0.class);
                next.putExtra("code_map", map_num);
                next.putExtra("money", money);
                next.putExtra("rod_level", rod_level);
                next.putExtra("check_bait", check_bait);
                next.putExtra("count_bait_normal", count_bait_normal);
                next.putExtra("count_bait_hidden", count_bait_hidden);
                next.putExtra("plus_percent", plus_percent);
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
                map_num=0;
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
