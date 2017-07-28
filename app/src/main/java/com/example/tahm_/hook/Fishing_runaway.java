package com.example.tahm_.hook;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import Fish.Fish_information;
import Player.Player_base;

import static com.example.tahm_.hook.Start.mp;

public class Fishing_runaway extends AppCompatActivity {

    private int before_map_code;
    private int fish_code;
    private int money;
    private int rod_level;
    private int check_bait;
    private int count_bait_normal;
    private int count_bait_hidden;
    private int plus_percent;

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

    Player_base player = new Player_base(money, rod_level, check_bait, count_bait_normal, count_bait_hidden, plus_percent);

    @Override
    public void onBackPressed() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fishing_runaway);

        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(1000);

        Intent next = getIntent();
        fish_code = next.getIntExtra("fish_code", 0);
        money = next.getIntExtra("money", 0);
        rod_level = next.getIntExtra("rod_level", 0);
        check_bait = next.getIntExtra("check_bait", 0);
        count_bait_normal = next.getIntExtra("count_bait_normal", count_bait_normal);
        count_bait_hidden = next.getIntExtra("count_bait_hidden", count_bait_hidden);
        plus_percent = next.getIntExtra("plus_percent", plus_percent);
        before_map_code = next.getIntExtra("code_map", before_map_code);
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

        view_fish();
    }
    public void view_fish() {

        Fish_information fish = new Fish_information();

        if (before_map_code == 1) {
            if (fish_code==100) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.s_100_0);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==101) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.s_101_0);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==102) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.s_102_0);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==103) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.s_103_0);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==104) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.s_104_0);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==105) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.s_105_0);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==106) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.s_106_0);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==190) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.s_190_0);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.fishing_rod);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
        }
        else if (before_map_code==2) {
            if (fish_code == 200) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_200_0);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 201) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_201_0);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 202) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_202_0);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 203) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_203_0);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 204) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_204_0);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 205) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_205_0);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 206) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_206_0);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 207) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_207_0);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 208) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_208_0);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 209) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_209_0);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 210) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_210_0);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 211) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_211_0);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 212) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_212_0);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 213) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_213_0);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 214) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_214_0);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 215) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_215_0);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 216) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_216_0);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 217) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_217_0);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 218) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_218_0);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 290) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_290_0);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.fishing_rod);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
        }
        else if (before_map_code==3) {
            if(fish_code==300) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.b_300_0);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==301) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.b_301_0);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==302) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.b_302_0);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==303) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.b_303_0);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==304) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.b_304_0);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==305) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.b_305_0);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==307) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.b_307_0);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==308) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.b_308_0);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==309) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.b_309_0);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==390) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.b_390_0);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else  {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.fishing_rod);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
        }
        else {
            Drawable fish_image_2 = getResources().getDrawable(R.drawable.fishing_rod);
            ImageView image = (ImageView) findViewById(R.id.image_fish);
            image.setImageDrawable(fish_image_2);
        }
    }

    public void onClick_exit(View v) {
        if (before_map_code == 1) {
            Intent next = new Intent(getApplicationContext(), Swamp.class);
            next.putExtra("code_map", before_map_code);
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
            mp = MediaPlayer.create(this, R.raw.swamp);
            mp.setLooping(true);
            mp.start();
        }
        else if (before_map_code == 2) {
            Intent next = new Intent(getApplicationContext(), Tropical_beach.class);
            next.putExtra("code_map", before_map_code);
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
            mp = MediaPlayer.create(this, R.raw.tropical_beach);
            mp.setLooping(true);
            mp.start();
        }
        else if (before_map_code == 3) {
            Intent next = new Intent(getApplicationContext(), Bermuda_triangle.class);
            next.putExtra("code_map", before_map_code);
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
            mp = MediaPlayer.create(this, R.raw.bermuda_triangle);
            mp.setLooping(true);
            mp.start();
        }
        else {
            Intent next = new Intent(getApplicationContext(), Move.class);
            next.putExtra("code_map", before_map_code);
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
        }
        before_map_code = 0;
    }

}
