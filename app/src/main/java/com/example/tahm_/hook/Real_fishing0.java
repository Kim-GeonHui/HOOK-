package com.example.tahm_.hook;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import Fish.Fish_base;
import Fish.Fish_information;
import Player.Player_base;

public class Real_fishing0 extends AppCompatActivity {

    private int hidden_whole_hp = 300;
    private int normal_whole_hp = 100;
    private int hidden_hp = 150;
    private  int normal_hp = 50;
    private int fish_code;
    private  int before_map_code;
    private int money;
    private int rod_level;
    private int check_bait;
    private int count_bait_normal;
    private int count_bait_hidden;
    private int plus_percent;
    private  int check;

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
        setContentView(R.layout.activity_real_fishing);
        Intent next = getIntent();
        money = next.getIntExtra("money", 0);
        fish_code = next.getIntExtra("fish_code", 0);
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

        TextView textview = (TextView) findViewById(R.id.check);
        if (fish_code == 190 || fish_code == 290 || fish_code == 390) {
            textview.setText("HIDDEN");
        } else {
            textview.setText("NORMAL");
        }

        final Timer timer = new Timer();
        TimerTask repeat = new TimerTask() {
            public void run() {
                hp();
            }
        };
        timer.schedule(repeat, 0, 1200);

        move();

        if (before_map_code == 1) {
            Drawable fish_image_1 = getResources().getDrawable(R.drawable.background_realfishing1);
            ImageView image = (ImageView) findViewById(R.id.background_real);
            image.setImageDrawable(fish_image_1);
        }
        else if (before_map_code == 2) {
            Drawable fish_image_1 = getResources().getDrawable(R.drawable.background_realfishing2);
            ImageView image = (ImageView) findViewById(R.id.background_real);
            image.setImageDrawable(fish_image_1);
        }
        else if (before_map_code == 3) {
            Drawable fish_image_1 = getResources().getDrawable(R.drawable.background_realfishing3);
            ImageView image = (ImageView) findViewById(R.id.background_real);
            image.setImageDrawable(fish_image_1);
        }
        else {
            Drawable image = getResources().getDrawable(R.drawable.t_pu0);
            ImageView imagee = (ImageView) findViewById(R.id.background_real);
            imagee.setImageDrawable(image);
        }

    }


    Player_base player = new Player_base(money, rod_level, check_bait, count_bait_normal, count_bait_hidden, plus_percent);

    public void hp() {
        if (check == 1) {
            if (fish_code == 190 || fish_code == 290 || fish_code == 390) {
                if (hidden_hp >= hidden_whole_hp) {
                    check=0;
                    next_runaway();
                }
                else if (hidden_hp > 0){
                    plus_hp();
                }
                else {
                    check = 0;
                }
            }
            else {
                if (normal_hp >= normal_whole_hp) {
                    check=0;
                    next_runaway();
                }
                else if (normal_hp > 0) {
                    plus_hp();
                }
                else {
                    check=0;
                }
            }
        }
    }

    public void next_catch() {
        check=0;
        Intent next = new Intent(getApplicationContext(), Fishing_catch.class);
        next.putExtra("fish_code", fish_code);
        next.putExtra("code_map", before_map_code);
        next.putExtra("fish_code", fish_code);
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
        overridePendingTransition(0, 0);
        before_map_code = 0;
    }

    public void next_runaway() {
        check=0;
        Intent next = new Intent(getApplicationContext(), Fishing_runaway.class);
        next.putExtra("fish_code", fish_code);
        next.putExtra("code_map", before_map_code);
        next.putExtra("fish_code", fish_code);
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
        overridePendingTransition(0, 0);
        before_map_code = 0;

        if (before_map_code == 1) {
            Drawable fish_image_1 = getResources().getDrawable(R.drawable.background_realfishing1);
            ImageView image = (ImageView) findViewById(R.id.background_real);
            image.setImageDrawable(fish_image_1);
        }
        else if (before_map_code == 2) {
            Drawable fish_image_1 = getResources().getDrawable(R.drawable.background_realfishing2);
            ImageView image = (ImageView) findViewById(R.id.background_real);
            image.setImageDrawable(fish_image_1);
        }
        else if (before_map_code == 3) {
            Drawable fish_image_1 = getResources().getDrawable(R.drawable.background_realfishing3);
            ImageView image = (ImageView) findViewById(R.id.background_real);
            image.setImageDrawable(fish_image_1);
        }

    }

    public void move() {


        final ImageView unknown_fish = (ImageView) findViewById(R.id.unknownfish);

        unknown_fish.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View unknown_fish, MotionEvent event) {
                Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(1000);

                Random rand = new Random();
                int ran_num1 = rand.nextInt(496)-248;
                int ran_num2 = rand.nextInt(960)-480;

                int action = event.getAction();

                float X = unknown_fish.getX();
                float Y = unknown_fish.getY();

                if (action == event. ACTION_DOWN) {
                    check = 1;
                }
                else if (action == event.ACTION_MOVE) {
                }
                else if (action == event.ACTION_UP) {
                    if(X+ran_num1<=744 && X+ran_num1 >=0){
                        unknown_fish.setX(X+ran_num1);
                        if (Y+ran_num2<=1280 && Y+ran_num2 >= 0) {
                            unknown_fish.setY(Y+ran_num2);
                            if (fish_code == 190 || fish_code == 290 || fish_code == 390) {
                                if (hidden_hp <= 0) {
                                    next_catch();
                                }
                                else if (0<hidden_hp && hidden_hp < 100) {
                                    hidden_hp -= rod_level*2+plus_percent;
                                    TranslateAnimation anim = new TranslateAnimation
                                            (-ran_num1, 0, -ran_num2, 0);
                                    anim.setDuration(100);
                                    unknown_fish.startAnimation(anim);
                                }
                            }
                            else {
                                if (normal_hp <= 0) {
                                    next_catch();
                                }
                                else if (0<normal_hp && normal_hp < 100) {
                                    normal_hp-=rod_level*2+plus_percent;
                                    TranslateAnimation anim = new TranslateAnimation
                                            (-ran_num1, 0, -ran_num2, 0);
                                    anim.setDuration(100);
                                    unknown_fish.startAnimation(anim);
                                }
                            }
                        }
                        else {
                            if (fish_code == 190 || fish_code == 290 || fish_code == 390) {
                                if (hidden_hp <= 0) {
                                    next_catch();
                                }
                                else if (hidden_hp >0 && hidden_hp <100) {
                                    hidden_hp -= rod_level*2+plus_percent;
                                    TranslateAnimation anim = new TranslateAnimation
                                            (-ran_num1, 0, 0, 0);
                                    anim.setDuration(100);
                                    unknown_fish.startAnimation(anim);
                                }
                            }
                            else {
                                if (normal_hp <= 0) {
                                    next_catch();
                                }
                                else if (0<normal_hp && normal_hp <100) {
                                    normal_hp-=rod_level*2+plus_percent;
                                    TranslateAnimation anim = new TranslateAnimation
                                            (-ran_num1, 0, -0, 0);
                                    anim.setDuration(100);
                                    unknown_fish.startAnimation(anim);
                                }
                            }
                        }
                    }
                    else {
                        if (Y+ran_num2<=1280 && Y+ran_num2 >= 0) {
                            unknown_fish.setY(Y+ran_num2);
                            if (fish_code == 190 || fish_code == 290 || fish_code == 390) {
                                if (hidden_hp <= 0) {
                                    next_catch();
                                }
                                else if (0<hidden_hp && hidden_hp < 100) {
                                    hidden_hp -= rod_level*2+plus_percent;
                                    TranslateAnimation anim = new TranslateAnimation
                                            (0, 0, -ran_num2, 0);
                                    anim.setDuration(100);
                                    unknown_fish.startAnimation(anim);
                                }
                            }
                            else {
                                if (normal_hp <= 0) {
                                    next_catch();
                                }
                                else if (0<normal_hp && normal_hp < 100) {
                                    normal_hp-=rod_level*2+plus_percent;
                                    TranslateAnimation anim = new TranslateAnimation
                                            (0, 0, -ran_num2, 0);
                                    anim.setDuration(100);
                                    unknown_fish.startAnimation(anim);
                                }
                            }
                        }
                        else {
                            if (fish_code == 190 || fish_code == 290 || fish_code == 390) {
                                if (hidden_hp <= 0) {
                                    next_catch();
                                }
                                else if (hidden_hp>0 && hidden_hp < 100) {
                                    hidden_hp -= rod_level*2+plus_percent;
                                    TranslateAnimation anim = new TranslateAnimation
                                            (0, 0, 0, 0);
                                    anim.setDuration(100);
                                    unknown_fish.startAnimation(anim);
                                }
                            }
                            else {
                                if (normal_hp <= 0) {
                                    next_catch();
                                }
                                else if (0<normal_hp && normal_hp<100) {
                                    normal_hp-=rod_level*2+plus_percent;
                                    TranslateAnimation anim = new TranslateAnimation
                                            (0, 0, -0, 0);
                                    anim.setDuration(100);
                                    unknown_fish.startAnimation(anim);
                                }
                            }
                        }
                    }
                }
                else {

                }

                return true;
            }
        });
    }

    public void plus_hp() {
        if (fish_code == 100) {
            normal_hp += s_100.get_up_hp(s_100);
        }
        else if (fish_code == 101) {
            normal_hp += s_101.get_up_hp(s_101);
        }
        else if (fish_code == 102) {
            normal_hp += s_102.get_up_hp(s_102);
        }
        else if (fish_code == 103) {
            normal_hp += s_103.get_up_hp(s_103);
        }
        else if (fish_code == 104) {
            normal_hp += s_104.get_up_hp(s_104);
        }
        else if (fish_code == 105) {
            normal_hp += s_105.get_up_hp(s_105);
        }
        else if (fish_code == 106) {
            normal_hp += s_106.get_up_hp(s_106);
        }
        else if (fish_code == 190) {
            hidden_hp += s_190.get_up_hp(s_190);
        }
        else if (fish_code == 200) {
            normal_hp += t_200.get_up_hp(t_200);
        }
        else if (fish_code == 201) {
            normal_hp += t_201.get_up_hp(t_201);
        }
        else if (fish_code == 202) {
            normal_hp += t_202.get_up_hp(t_202);
        }
        else if (fish_code == 203) {
            normal_hp += t_203.get_up_hp(t_203);
        }
        else if (fish_code == 204) {
            normal_hp += t_204.get_up_hp(t_204);
        }
        else if (fish_code == 205) {
            normal_hp += t_205.get_up_hp(t_205);
        }
        else if (fish_code == 206) {
            normal_hp += t_206.get_up_hp(t_206);
        }
        else if (fish_code == 207) {
            normal_hp += t_207.get_up_hp(t_207);
        }
        else if (fish_code == 208) {
            normal_hp += t_208.get_up_hp(t_208);
        }
        else if (fish_code == 209) {
            normal_hp += t_209.get_up_hp(t_209);
        }
        else if (fish_code == 210) {
            normal_hp += t_210.get_up_hp(t_210);
        }
        else if (fish_code == 211) {
            normal_hp += t_211.get_up_hp(t_211);
        }
        else if (fish_code == 212) {
            normal_hp += t_212.get_up_hp(t_212);
        }
        else if (fish_code == 213) {
            normal_hp += t_213.get_up_hp(t_213);
        }
        else if (fish_code == 214) {
            normal_hp += t_214.get_up_hp(t_214);
        }
        else if (fish_code == 215) {
            normal_hp += t_215.get_up_hp(t_215);
        }
        else if (fish_code == 216) {
            normal_hp += t_216.get_up_hp(t_216);
        }
        else if (fish_code == 217) {
            normal_hp += t_217.get_up_hp(t_217);
        }
        else if (fish_code == 218) {
            normal_hp += t_218.get_up_hp(t_218);
        }
        else if (fish_code == 290) {
            hidden_hp += t_290.get_up_hp(t_290);
        }
        else if (fish_code == 300) {
            normal_hp += b_300.get_up_hp(b_300);
        }
        else if (fish_code == 301) {
            normal_hp += b_301.get_up_hp(b_301);
        }
        else if (fish_code == 302) {
            normal_hp += b_302.get_up_hp(b_302);
        }
        else if (fish_code == 303) {
            normal_hp += b_303.get_up_hp(b_303);
        }
        else if (fish_code == 304) {
            normal_hp += b_304.get_up_hp(b_304);
        }
        else if (fish_code == 305) {
            normal_hp += b_305.get_up_hp(b_305);
        }
        else if (fish_code == 306) {
            normal_hp += b_306.get_up_hp(b_306);
        }
        else if (fish_code == 307) {
            normal_hp += b_307.get_up_hp(b_307);
        }
        else if (fish_code == 308) {
            normal_hp += b_308.get_up_hp(b_308);
        }
        else if (fish_code == 309) {
            normal_hp += b_309.get_up_hp(b_309);
        }
        else if (fish_code == 390) {
            hidden_hp += b_390.get_up_hp(b_390);
        }
    }

    public void view_fish() {

        Fish_information fish = new Fish_information();

        if (before_map_code == 1) {
            if (fish_code==100) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.s_100_0);
                ImageView image = (ImageView) findViewById(R.id.unknownfish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==101) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.s_101_1);
                ImageView image = (ImageView) findViewById(R.id.unknownfish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==102) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.s_102_0);
                ImageView image = (ImageView) findViewById(R.id.unknownfish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==103) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.s_103_0);
                ImageView image = (ImageView) findViewById(R.id.unknownfish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==104) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.s_104_0);
                ImageView image = (ImageView) findViewById(R.id.unknownfish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==105) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.s_105_0);
                ImageView image = (ImageView) findViewById(R.id.unknownfish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==106) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.s_106_0);
                ImageView image = (ImageView) findViewById(R.id.unknownfish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==190) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.s_190_0);
                ImageView image = (ImageView) findViewById(R.id.unknownfish);
                image.setImageDrawable(fish_image_1);
            }
            else {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.fishing_rod);
                ImageView image = (ImageView) findViewById(R.id.unknownfish);
                image.setImageDrawable(fish_image_1);
            }
        }
        else if (before_map_code==2) {
            if (fish_code == 200) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_200_0);
                ImageView image = (ImageView) findViewById(R.id.unknownfish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 201) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_201_0);
                ImageView image = (ImageView) findViewById(R.id.unknownfish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 202) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_202_0);
                ImageView image = (ImageView) findViewById(R.id.unknownfish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 203) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_203_0);
                ImageView image = (ImageView) findViewById(R.id.unknownfish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 204) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_204_0);
                ImageView image = (ImageView) findViewById(R.id.unknownfish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 205) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_205_0);
                ImageView image = (ImageView) findViewById(R.id.unknownfish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 206) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_206_0);
                ImageView image = (ImageView) findViewById(R.id.unknownfish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 207) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_207_0);
                ImageView image = (ImageView) findViewById(R.id.unknownfish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 208) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_208_0);
                ImageView image = (ImageView) findViewById(R.id.unknownfish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 209) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_209_0);
                ImageView image = (ImageView) findViewById(R.id.unknownfish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 210) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_210_0);
                ImageView image = (ImageView) findViewById(R.id.unknownfish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 211) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_211_0);
                ImageView image = (ImageView) findViewById(R.id.unknownfish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 212) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_212_0);
                ImageView image = (ImageView) findViewById(R.id.unknownfish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 213) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_213_0);
                ImageView image = (ImageView) findViewById(R.id.unknownfish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 214) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_214_0);
                ImageView image = (ImageView) findViewById(R.id.unknownfish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 215) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_215_0);
                ImageView image = (ImageView) findViewById(R.id.unknownfish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 216) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_216_0);
                ImageView image = (ImageView) findViewById(R.id.unknownfish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 217) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_217_0);
                ImageView image = (ImageView) findViewById(R.id.unknownfish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 218) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_218_0);
                ImageView image = (ImageView) findViewById(R.id.unknownfish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code == 290) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.t_290_0);
                ImageView image = (ImageView) findViewById(R.id.unknownfish);
                image.setImageDrawable(fish_image_1);
            }
            else {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.fishing_rod);
                ImageView image = (ImageView) findViewById(R.id.unknownfish);
                image.setImageDrawable(fish_image_1);
            }
        }
        else if (before_map_code==3) {
            if(fish_code==300) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.b_300_0);
                ImageView image = (ImageView) findViewById(R.id.unknownfish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==301) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.b_301_0);
                ImageView image = (ImageView) findViewById(R.id.unknownfish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==302) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.b_302_0);
                ImageView image = (ImageView) findViewById(R.id.unknownfish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==303) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.b_303_0);
                ImageView image = (ImageView) findViewById(R.id.unknownfish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==304) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.b_304_0);
                ImageView image = (ImageView) findViewById(R.id.unknownfish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==305) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.b_305_0);
                ImageView image = (ImageView) findViewById(R.id.unknownfish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==307) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.b_307_0);
                ImageView image = (ImageView) findViewById(R.id.unknownfish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==308) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.b_308_0);
                ImageView image = (ImageView) findViewById(R.id.unknownfish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==309) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.b_309_0);
                ImageView image = (ImageView) findViewById(R.id.unknownfish);
                image.setImageDrawable(fish_image_1);
            }
            else if (fish_code==390) {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.b_390_0);
                ImageView image = (ImageView) findViewById(R.id.unknownfish);
                image.setImageDrawable(fish_image_1);
            }
            else  {
                Drawable fish_image_1 = getResources().getDrawable(R.drawable.fishing_rod);
                ImageView image = (ImageView) findViewById(R.id.unknownfish);
                image.setImageDrawable(fish_image_1);
            }
        }
        else {
            Drawable fish_image_2 = getResources().getDrawable(R.drawable.fishing_rod);
            ImageView image = (ImageView) findViewById(R.id.unknownfish);
            image.setImageDrawable(fish_image_2);
        }
    }

    public void time_check() {
        new Timer().schedule(new TimerTask() {
            public void run() {
                plus_hp();
            }
        }, 1000);
    }

    Fish_base s_100 = new Fish_base("개구리", 100, 1, 15, 10, 1000, 0);
    Fish_base s_101 = new Fish_base("두꺼비", 101, 1, 15, 10, 1000, 0);
    Fish_base s_102 = new Fish_base("붉은 독 개구리", 102, 1, 7, 15, 1000, 0);
    Fish_base s_103 = new Fish_base("푸른 독 개구리", 103, 1, 7, 15, 1000, 0);
    Fish_base s_104 = new Fish_base("두꺼비 수하", 104, 1, 15, 15, 1000, 0);
    Fish_base s_105 = new Fish_base("리게이터", 105, 1, 10, 20, 1000, 0);
    Fish_base s_106 = new Fish_base("크로코", 106, 1, 10, 25, 1000, 0);
    Fish_base s_190 = new Fish_base("갓파", 190, 1, 5, 35, 1000, 1);

    Fish_base t_200 = new Fish_base("불가사리", 200, 2, 10, 10, 1000, 0);
    Fish_base t_201 = new Fish_base("화난 불가사리", 201, 2, 5, 15, 1000, 0);
    Fish_base t_202 = new Fish_base("주니어 씰", 202, 2, 5, 15, 1000, 0);
    Fish_base t_203 = new Fish_base("주니어 페페", 203, 2, 5, 15, 1000, 0);
    Fish_base t_204 = new Fish_base("엄티", 204, 2, 5, 15, 1000, 0);
    Fish_base t_205 = new Fish_base("젤리피쉬", 205, 2, 10, 10, 1000, 0);
    Fish_base t_206 = new Fish_base("쿨 젤리피쉬", 206, 2, 5, 15, 1000, 0);
    Fish_base t_207 = new Fish_base("씨코", 207, 2, 5, 10, 1000, 0);
    Fish_base t_208 = new Fish_base("씨클", 208, 2, 5, 15, 1000, 0);
    Fish_base t_209 = new Fish_base("버블피쉬", 209, 2, 5, 20, 1000, 0);
    Fish_base t_210 = new Fish_base("스쿠버 페페", 210, 2, 5, 20, 1000, 0);
    Fish_base t_211 = new Fish_base("크립", 211, 2, 5, 20, 1000, 0);
    Fish_base t_212 = new Fish_base("로랑", 212, 2, 5, 20, 1000, 0);
    Fish_base t_213 = new Fish_base("클랑", 213, 2, 3, 25, 1000, 0);
    Fish_base t_214 = new Fish_base("핀붐", 214, 2, 5, 25, 1000, 0);
    Fish_base t_215 = new Fish_base("마스크 피쉬", 215, 2, 5, 25, 1000, 0);
    Fish_base t_216 = new Fish_base("플라워 피쉬", 216, 2, 3, 30, 1000, 0);
    Fish_base t_217 = new Fish_base("푸퍼", 217, 2, 5, 25, 1000, 0);
    Fish_base t_218 = new Fish_base("포이즌 푸퍼", 218, 2, 3, 30, 1000, 0);
    Fish_base t_290 = new Fish_base("세르프", 290, 2, 1, 35, 1000, 1);

    Fish_base b_300 = new Fish_base("페페", 300, 3, 15, 20, 1000, 0);
    Fish_base b_301 = new Fish_base("다크 페페", 301, 3, 10, 25, 1000, 0);
    Fish_base b_302 = new Fish_base("프리져", 302, 3, 15, 20, 1000, 0);
    Fish_base b_303 = new Fish_base("스파커", 303, 3, 10, 25, 1000, 0);
    Fish_base b_304 = new Fish_base("스퀴드", 304, 3, 15, 25, 1000, 0);
    Fish_base b_305 = new Fish_base("리셀 스퀴드", 305, 3, 10, 27, 1000, 0);
    Fish_base b_306 = new Fish_base("폭렬 망둥이집", 306, 3, 15, 30, 1000, 0);
    Fish_base b_307 = new Fish_base("망둥이", 307, 3, 15, 25, 1000, 0);
    Fish_base b_308 = new Fish_base("샤크", 308, 3, 5, 27, 1000, 0);
    Fish_base b_309 = new Fish_base("콜드 샤크", 309, 3, 4, 30, 1000, 0);
    Fish_base b_390 = new Fish_base("킹크랑", 390, 3, 1, 35, 1000, 1);

}