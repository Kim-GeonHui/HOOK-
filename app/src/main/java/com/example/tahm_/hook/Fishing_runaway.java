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

import static com.example.tahm_.hook.MainActivity.mp;

public class Fishing_runaway extends AppCompatActivity {

    private int before_map_code;
    private int fish_code;
    private int money;
    private int rod_level;
    private int check_bait;
    private int count_bait_normal;
    private int count_bait_hidden;
    private int plus_percent;

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
        before_map_code = next.getIntExtra("code_map", 0);
        fish_code=next.getIntExtra("fish_code",0);
        money = next.getIntExtra("money", 0);
        rod_level = next.getIntExtra("rod_level", 0);
        check_bait = next.getIntExtra("check_bait", 0);
        count_bait_normal = next.getIntExtra("count_bait_normal", count_bait_normal);
        count_bait_hidden = next.getIntExtra("count_bait_hidden", count_bait_hidden);
        plus_percent = next.getIntExtra("plus_percent", plus_percent);

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
            Intent exit = new Intent(getApplicationContext(), Swamp.class);
            exit.putExtra("money", money);
            exit.putExtra("rod_level",rod_level);
            exit.putExtra("check_bait", check_bait);
            exit.putExtra("count_bait_normal", count_bait_normal);
            exit.putExtra("count_bait_hidden", count_bait_hidden);
            exit.putExtra("plus_percent",plus_percent);
            startActivity(exit);
            mp.pause();
            mp = MediaPlayer.create(this, R.raw.swamp);
            mp.setLooping(true);
            mp.start();
        }
        else if (before_map_code == 2) {
            Intent exit = new Intent(getApplicationContext(), Tropical_beach.class);
            exit.putExtra("money", money);
            exit.putExtra("rod_level",rod_level);
            exit.putExtra("check_bait", check_bait);
            exit.putExtra("count_bait_normal", count_bait_normal);
            exit.putExtra("count_bait_hidden", count_bait_hidden);
            exit.putExtra("plus_percent",plus_percent);
            startActivity(exit);
            mp.pause();
            mp = MediaPlayer.create(this, R.raw.tropical_beach);
            mp.setLooping(true);
            mp.start();
        }
        else if (before_map_code == 3) {
            Intent exit = new Intent(getApplicationContext(), Bermuda_triangle.class);
            exit.putExtra("money", money);
            exit.putExtra("rod_level",rod_level);
            exit.putExtra("check_bait", check_bait);
            exit.putExtra("count_bait_normal", count_bait_normal);
            exit.putExtra("count_bait_hidden", count_bait_hidden);
            exit.putExtra("plus_percent",plus_percent);
            startActivity(exit);
            mp.pause();
            mp = MediaPlayer.create(this, R.raw.bermuda_triangle);
            mp.setLooping(true);
            mp.start();
        }
        else {
            Intent exit = new Intent(getApplicationContext(), Move.class);
            exit.putExtra("money", money);
            exit.putExtra("rod_level",rod_level);
            exit.putExtra("check_bait", check_bait);
            exit.putExtra("count_bait_normal", count_bait_normal);
            exit.putExtra("count_bait_hidden", count_bait_hidden);
            exit.putExtra("plus_percent",plus_percent);
            startActivity(exit);
            mp.pause();
            mp = MediaPlayer.create(this, R.raw.normal);
            mp.setLooping(true);
            mp.start();
        }
    }

}
