package com.example.tahm_.hook;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import Fish.Fish_base;
import Fish.Fish_information;
import Player.Player_base;

import static com.example.tahm_.hook.Start.mp;

public class Fishing_catch extends AppCompatActivity {

    @Override
        public void onBackPressed() {
        }

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

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_fishing_catch);

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

    Player_base player = new Player_base(money, rod_level, check_bait, count_bait_normal, count_bait_hidden, plus_percent);

    public void view_fish() {

        Fish_information fish = new Fish_information();

        if (before_map_code == 1) {
            if (fish_code==100) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.s_100_1);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==101) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.s_101_1);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==102) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.s_102_1);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==103) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.s_103_1);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==104) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.s_104_1);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==105) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.s_105_1);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==106) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.s_106_1);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==190) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.s_190_1);
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
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_200_1);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 201) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_201_1);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 202) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_202_1);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 203) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_203_1);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 204) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_204_1);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 205) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_205_1);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 206) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_206_1);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 207) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_207_1);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 208) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_208_1);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 209) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_209_1);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 210) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_210_1);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 211) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_211_1);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 212) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_212_1);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 213) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_213_1);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 214) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_214_1);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 215) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_215_1);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 216) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_216_1);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 217) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_217_1);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 218) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_218_1);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 290) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_290_1);
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
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.b_300_1);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==301) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.b_301_1);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==302) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.b_302_1);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==303) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.b_303_1);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==304) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.b_304_1);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==305) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.b_305_1);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==307) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.b_307_1);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==308) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.b_308_1);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==309) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.b_309_1);
                ImageView image = (ImageView) findViewById(R.id.image_fish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==390) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.b_390_1);
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
    }

    public void onClick_donation(View v) {
        if (fish_code == 100) {
            String name = s_100.get_name(s_100);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 아쿠아리움에 기증하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    check_100=1;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code==101) {
            String name = s_101.get_name(s_101);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 아쿠아리움에 기증하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    check_101=1;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code==102) {
            String name = s_102.get_name(s_102);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 아쿠아리움에 기증하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    check_102=1;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code==103) {
            String name = s_103.get_name(s_103);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 아쿠아리움에 기증하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    check_103=1;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code==104) {
            String name = s_104.get_name(s_104);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 아쿠아리움에 기증하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    check_104=1;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code==105) {
            String name = s_105.get_name(s_105);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 아쿠아리움에 기증하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    check_105=1;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code==106) {
            String name = s_106.get_name(s_106);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 아쿠아리움에 기증하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    check_106=1;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code==190) {
            String name = s_190.get_name(s_190);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 아쿠아리움에 기증하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    check_190=1;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code==200) {
            String name = t_200.get_name(t_200);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 아쿠아리움에 기증하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    check_200=1;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code==201) {
            String name = t_201.get_name(t_201);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 아쿠아리움에 기증하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    check_201=1;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code==202) {
            String name = t_202.get_name(t_202);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 아쿠아리움에 기증하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    check_202=1;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code==203) {
            String name = t_203.get_name(t_203);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 아쿠아리움에 기증하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    check_203=1;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code==204) {
            String name = t_204.get_name(t_204);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 아쿠아리움에 기증하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    check_204=1;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code==205) {
            String name = t_205.get_name(t_205);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 아쿠아리움에 기증하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    check_205=1;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code==206) {
            String name = t_206.get_name(t_206);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 아쿠아리움에 기증하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    check_206=1;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code==207) {
            String name = t_207.get_name(t_207);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 아쿠아리움에 기증하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    check_207=1;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code==208) {
            String name = t_208.get_name(t_208);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 아쿠아리움에 기증하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    check_208=1;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code==209) {
            String name = t_209.get_name(t_209);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 아쿠아리움에 기증하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    check_209=1;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code==210) {
            String name = t_210.get_name(t_210);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 아쿠아리움에 기증하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    check_210=1;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code==211) {
            String name = t_211.get_name(t_211);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 아쿠아리움에 기증하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    check_211=1;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code==212) {
            String name = t_212.get_name(t_212);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 아쿠아리움에 기증하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    check_212=1;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code==213) {
            String name = t_213.get_name(t_213);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 아쿠아리움에 기증하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    check_213=1;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code==214) {
            String name = t_214.get_name(t_214);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 아쿠아리움에 기증하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    check_214=1;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code==215) {
            String name = t_215.get_name(t_215);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 아쿠아리움에 기증하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    check_215=1;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code==216) {
            String name = t_216.get_name(t_216);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 아쿠아리움에 기증하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    check_216=1;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code==217) {
            String name = t_217.get_name(t_217);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 아쿠아리움에 기증하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    check_217=1;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code==218) {
            String name = t_218.get_name(t_218);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 아쿠아리움에 기증하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    check_218=1;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code==290) {
            String name = t_290.get_name(t_290);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 아쿠아리움에 기증하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    check_290=1;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code==300) {
            String name = b_300.get_name(b_300);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 아쿠아리움에 기증하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    check_300=1;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code==301) {
            String name = b_301.get_name(b_301);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 아쿠아리움에 기증하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    check_301=1;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code==302) {
            String name = b_302.get_name(b_302);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 아쿠아리움에 기증하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    check_302=1;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code==303) {
            String name = b_303.get_name(b_303);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 아쿠아리움에 기증하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    check_303=1;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code==304) {
            String name = b_304.get_name(b_304);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 아쿠아리움에 기증하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    check_304=1;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code==305) {
            String name = b_305.get_name(b_305);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 아쿠아리움에 기증하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    check_305=1;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code==306) {
            String name = b_306.get_name(b_306);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 아쿠아리움에 기증하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    check_306=1;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code==307) {
            String name = b_307.get_name(b_307);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 아쿠아리움에 기증하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    check_307=1;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code==308) {
            String name = b_308.get_name(b_308);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 아쿠아리움에 기증하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    check_308=1;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code==309) {
            String name = b_309.get_name(b_309);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 아쿠아리움에 기증하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    check_309=1;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code==390) {
            String name = b_390.get_name(b_390);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 아쿠아리움에 기증하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    check_390=1;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
    }

    public void onClick_sell(View v) {
        if (fish_code == 100) {
            String name = s_100.get_name(s_100);
            final int f_price = s_100.get_price(s_100);
            String s_price = String.valueOf(f_price);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 "+s_price+"에 판매하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    money+=f_price;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code == 101) {
            String name = s_101.get_name(s_101);
            final int f_price = s_101.get_price(s_101);
            String s_price = String.valueOf(f_price);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 "+s_price+"에 판매하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    money+=f_price;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code == 102) {
            String name = s_102.get_name(s_102);
            final int f_price = s_102.get_price(s_102);
            String s_price = String.valueOf(f_price);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 "+s_price+"에 판매하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    money+=f_price;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code == 103) {
            String name = s_103.get_name(s_103);
            final int f_price = s_103.get_price(s_103);
            String s_price = String.valueOf(f_price);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 "+s_price+"에 판매하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    money+=f_price;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code == 104) {
            String name = s_104.get_name(s_104);
            final int f_price = s_104.get_price(s_104);
            String s_price = String.valueOf(f_price);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 "+s_price+"에 판매하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    money+=f_price;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code == 105) {
            String name = s_105.get_name(s_105);
            final int f_price = s_105.get_price(s_105);
            String s_price = String.valueOf(f_price);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 "+s_price+"에 판매하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    money+=f_price;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code == 106) {
            String name = s_106.get_name(s_106);
            final int f_price = s_106.get_price(s_106);
            String s_price = String.valueOf(f_price);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 "+s_price+"에 판매하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    money+=f_price;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code == 190) {
            String name = s_190.get_name(s_190);
            final int f_price = s_190.get_price(s_190);
            String s_price = String.valueOf(f_price);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 "+s_price+"에 판매하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    money+=f_price;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code == 200) {
            String name = t_200.get_name(t_200);
            final int f_price = t_200.get_price(t_200);
            String s_price = String.valueOf(f_price);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 "+s_price+"에 판매하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    money+=f_price;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code == 201) {
            String name = t_201.get_name(t_201);
            final int f_price = t_201.get_price(t_201);
            String s_price = String.valueOf(f_price);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 "+s_price+"에 판매하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    money+=f_price;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code == 202) {
            String name = t_202.get_name(t_202);
            final int f_price = t_202.get_price(t_202);
            String s_price = String.valueOf(f_price);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 "+s_price+"에 판매하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    money+=f_price;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code == 203) {
            String name = t_203.get_name(t_203);
            final int f_price = t_203.get_price(t_203);
            String s_price = String.valueOf(f_price);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 "+s_price+"에 판매하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    money+=f_price;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code == 204) {
            String name = t_204.get_name(t_204);
            final int f_price = t_204.get_price(t_204);
            String s_price = String.valueOf(f_price);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 "+s_price+"에 판매하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    money+=f_price;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code == 205) {
            String name = t_205.get_name(t_205);
            final int f_price = t_205.get_price(t_205);
            String s_price = String.valueOf(f_price);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 "+s_price+"에 판매하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    money+=f_price;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code == 206) {
            String name = t_206.get_name(t_206);
            final int f_price = t_206.get_price(t_206);
            String s_price = String.valueOf(f_price);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 "+s_price+"에 판매하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    money+=f_price;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code == 207) {
            String name = t_207.get_name(t_207);
            final int f_price = t_207.get_price(t_207);
            String s_price = String.valueOf(f_price);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 "+s_price+"에 판매하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    money+=f_price;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code == 208) {
            String name = t_208.get_name(t_208);
            final int f_price = t_208.get_price(t_208);
            String s_price = String.valueOf(f_price);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 "+s_price+"에 판매하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    money+=f_price;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code == 209) {
            String name = t_209.get_name(t_209);
            final int f_price = t_209.get_price(t_209);
            String s_price = String.valueOf(f_price);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 "+s_price+"에 판매하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    money+=f_price;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code == 210) {
            String name = t_210.get_name(t_210);
            final int f_price = t_210.get_price(t_210);
            String s_price = String.valueOf(f_price);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 "+s_price+"에 판매하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    money+=f_price;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code == 211) {
            String name = t_211.get_name(t_211);
            final int f_price = t_211.get_price(t_211);
            String s_price = String.valueOf(f_price);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 "+s_price+"에 판매하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    money+=f_price;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code == 212) {
            String name = t_212.get_name(t_212);
            final int f_price = t_212.get_price(t_212);
            String s_price = String.valueOf(f_price);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 "+s_price+"에 판매하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    money+=f_price;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code == 213) {
            String name = t_213.get_name(t_213);
            final int f_price = t_213.get_price(t_213);
            String s_price = String.valueOf(f_price);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 "+s_price+"에 판매하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    money+=f_price;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code == 214) {
            String name = t_214.get_name(t_214);
            final int f_price = t_214.get_price(t_214);
            String s_price = String.valueOf(f_price);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 "+s_price+"에 판매하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    money+=f_price;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code == 215) {
            String name = t_215.get_name(t_215);
            final int f_price = t_215.get_price(t_215);
            String s_price = String.valueOf(f_price);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 "+s_price+"에 판매하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    money+=f_price;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code == 216) {
            String name = t_216.get_name(t_216);
            final int f_price = t_216.get_price(t_216);
            String s_price = String.valueOf(f_price);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 "+s_price+"에 판매하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    money+=f_price;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code == 217) {
            String name = t_217.get_name(t_217);
            final int f_price = t_217.get_price(t_217);
            String s_price = String.valueOf(f_price);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 "+s_price+"에 판매하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    money+=f_price;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code == 218) {
            String name = t_218.get_name(t_218);
            final int f_price = t_218.get_price(t_218);
            String s_price = String.valueOf(f_price);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 "+s_price+"에 판매하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    money+=f_price;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code == 290) {
            String name = t_290.get_name(t_290);
            final int f_price = t_290.get_price(t_290);
            String s_price = String.valueOf(f_price);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 "+s_price+"에 판매하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    money+=f_price;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code == 300) {
            String name = b_300.get_name(b_300);
            final int f_price = b_300.get_price(b_300);
            String s_price = String.valueOf(f_price);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 "+s_price+"에 판매하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    money+=f_price;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code == 301) {
            String name = b_301.get_name(b_301);
            final int f_price = b_301.get_price(b_301);
            String s_price = String.valueOf(f_price);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 "+s_price+"에 판매하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    money+=f_price;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code == 302) {
            String name = b_302.get_name(b_302);
            final int f_price = b_302.get_price(b_302);
            String s_price = String.valueOf(f_price);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 "+s_price+"에 판매하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    money+=f_price;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code == 303) {
            String name = b_303.get_name(b_303);
            final int f_price = b_303.get_price(b_303);
            String s_price = String.valueOf(f_price);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 "+s_price+"에 판매하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    money+=f_price;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code == 304) {
            String name = b_304.get_name(b_304);
            final int f_price = b_304.get_price(b_304);
            String s_price = String.valueOf(f_price);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 "+s_price+"에 판매하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    money+=f_price;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code == 305) {
            String name = b_305.get_name(b_305);
            final int f_price = b_305.get_price(b_305);
            String s_price = String.valueOf(f_price);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 "+s_price+"에 판매하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    money+=f_price;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code == 307) {
            String name = b_307.get_name(b_307);
            final int f_price = b_307.get_price(b_307);
            String s_price = String.valueOf(f_price);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 "+s_price+"에 판매하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    money+=f_price;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code == 308) {
            String name = b_308.get_name(b_308);
            final int f_price = b_308.get_price(b_308);
            String s_price = String.valueOf(f_price);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 "+s_price+"에 판매하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    money+=f_price;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code == 309) {
            String name = b_309.get_name(b_309);
            final int f_price = b_309.get_price(b_309);
            String s_price = String.valueOf(f_price);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 "+s_price+"에 판매하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    money+=f_price;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (fish_code == 390) {
            String name = b_390.get_name(b_390);
            final int f_price = b_390.get_price(b_390);
            String s_price = String.valueOf(f_price);
            AlertDialog.Builder builder = new AlertDialog.Builder(Fishing_catch.this);
            builder.setTitle(name+"을 정말로 "+s_price+"에 판매하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    money+=f_price;
                    map_move();
                }
            });
            builder.setPositiveButton("아니오", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else {
            Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_LONG).show();

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

    public void map_move() {
        if (before_map_code == 1) {
            check();
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
            before_map_code = 0;
            overridePendingTransition(0, 0);
        }
        else if (before_map_code==2) {
            check();
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
            overridePendingTransition(0, 0);
        }
        else if (before_map_code==3) {
            check();
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
            overridePendingTransition(0, 0);
        }
        else {
            Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_LONG).show();
        }
    }

    Fish_base s_100 = new Fish_base("개구리", 100, 1, 15, 10, 500, 0);
    Fish_base s_101 = new Fish_base("두꺼비", 101, 1, 15, 10, 500, 0);
    Fish_base s_102 = new Fish_base("붉은 독 개구리", 102, 1, 7, 15, 1000, 0);
    Fish_base s_103 = new Fish_base("푸른 독 개구리", 103, 1, 7, 15, 1000, 0);
    Fish_base s_104 = new Fish_base("두꺼비 수하", 104, 1, 15, 15, 1000, 0);
    Fish_base s_105 = new Fish_base("리게이터", 105, 1, 10, 20, 2500, 0);
    Fish_base s_106 = new Fish_base("크로코", 106, 1, 10, 25, 4000, 0);
    Fish_base s_190 = new Fish_base("갓파", 190, 1, 5, 35, 25000, 1);

    Fish_base t_200 = new Fish_base("불가사리", 200, 2, 10, 10, 500, 0);
    Fish_base t_201 = new Fish_base("화난 불가사리", 201, 2, 5, 15, 1000, 0);
    Fish_base t_202 = new Fish_base("주니어 씰", 202, 2, 5, 15, 1000, 0);
    Fish_base t_203 = new Fish_base("주니어 페페", 203, 2, 5, 15, 1000, 0);
    Fish_base t_204 = new Fish_base("엄티", 204, 2, 5, 15, 1000, 0);
    Fish_base t_205 = new Fish_base("젤리피쉬", 205, 2, 10, 10, 500, 0);
    Fish_base t_206 = new Fish_base("쿨 젤리피쉬", 206, 2, 5, 15, 1000, 0);
    Fish_base t_207 = new Fish_base("씨코", 207, 2, 5, 10, 500, 0);
    Fish_base t_208 = new Fish_base("씨클", 208, 2, 5, 15, 1000, 0);
    Fish_base t_209 = new Fish_base("버블피쉬", 209, 2, 5, 20, 2500, 0);
    Fish_base t_210 = new Fish_base("스쿠버 페페", 210, 2, 5, 20, 2500, 0);
    Fish_base t_211 = new Fish_base("크립", 211, 2, 5, 20, 2500, 0);
    Fish_base t_212 = new Fish_base("로랑", 212, 2, 5, 20, 2500, 0);
    Fish_base t_213 = new Fish_base("클랑", 213, 2, 3, 25, 4000, 0);
    Fish_base t_214 = new Fish_base("핀붐", 214, 2, 5, 25, 4000, 0);
    Fish_base t_215 = new Fish_base("마스크 피쉬", 215, 2, 5, 25, 4000, 0);
    Fish_base t_216 = new Fish_base("플라워 피쉬", 216, 2, 3, 30, 7500, 0);
    Fish_base t_217 = new Fish_base("푸퍼", 217, 2, 5, 25, 4000, 0);
    Fish_base t_218 = new Fish_base("포이즌 푸퍼", 218, 2, 3, 30, 7500, 0);
    Fish_base t_290 = new Fish_base("세르프", 290, 2, 1, 35, 25000, 1);

    Fish_base b_300 = new Fish_base("페페", 300, 3, 15, 20, 2500, 0);
    Fish_base b_301 = new Fish_base("다크 페페", 301, 3, 10, 25, 4000, 0);
    Fish_base b_302 = new Fish_base("프리져", 302, 3, 15, 20, 2500, 0);
    Fish_base b_303 = new Fish_base("스파커", 303, 3, 10, 25, 4000, 0);
    Fish_base b_304 = new Fish_base("스퀴드", 304, 3, 15, 25, 4000, 0);
    Fish_base b_305 = new Fish_base("리셀 스퀴드", 305, 3, 10, 27, 6000, 0);
    Fish_base b_306 = new Fish_base("폭렬 망둥이집", 306, 3, 15, 30, 7500, 0);
    Fish_base b_307 = new Fish_base("망둥이", 307, 3, 15, 25, 4000, 0);
    Fish_base b_308 = new Fish_base("샤크", 308, 3, 5, 27, 6000, 0);
    Fish_base b_309 = new Fish_base("콜드 샤크", 309, 3, 4, 30, 7500, 0);
    Fish_base b_390 = new Fish_base("킹크랑", 390, 3, 1, 35, 25000, 1);


}
