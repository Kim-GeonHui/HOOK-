package com.example.tahm_.hook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import Fish.Fish_base;
import Fish.Fish_information;
import Player.Player_base;

public class Fishing_8 extends AppCompatActivity {

    private int fish_code;
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
        setContentView(R.layout.activity_fishing_8);
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
                random_fish();
            }
        }, 150);
    }

    public void next_catch() {
        Intent next = new Intent(getApplicationContext(), Fishing_catch.class);
        next.putExtra("code_map", before_map_code);
        next.putExtra("fish_code", fish_code);
        next.putExtra("money", money);
        next.putExtra("rod_level", rod_level);
        next.putExtra("check_bait", check_bait);
        next.putExtra("count_bait_normal", count_bait_normal);
        next.putExtra("count_bait_hidden", count_bait_hidden);
        next.putExtra("plus_percent", plus_percent);
        startActivity(next);
        overridePendingTransition(0, 0);
    }

    public void next_runaway() {
        Intent next = new Intent(getApplicationContext(), Fishing_runaway.class);
        next.putExtra("code_map", before_map_code);
        next.putExtra("fish_code", fish_code);
        next.putExtra("money", money);
        next.putExtra("rod_level", rod_level);
        next.putExtra("check_bait", check_bait);
        next.putExtra("count_bait_normal", count_bait_normal);
        next.putExtra("count_bait_hidden", count_bait_hidden);
        next.putExtra("plus_percent", plus_percent);
        startActivity(next);
        overridePendingTransition(0, 0);
    }

    public void random_fish() {
        Random number = new Random();
        int ran_num = number.nextInt(100);
        int ran_num2 = number.nextInt(100);

        Fish_information fish = new Fish_information();

        if (before_map_code == 1) {
            if(0 <= ran_num && ran_num <= 14) {
                if (ran_num2<s_100.get_catch_percent(s_100)+plus_percent) {
                    fish_code=100;
                    next_catch();
                }
                else {
                    fish_code=100;
                    next_runaway();
                }
            }
            else if (15 <= ran_num && ran_num <= 29) {
                if (ran_num2<s_101.get_catch_percent(s_101)+plus_percent) {
                    fish_code=101;
                    next_catch();
                }
                else {
                    fish_code=101;
                    next_runaway();
                }
            }
            else if (30 <= ran_num && ran_num <= 44) {
                if (ran_num2<s_102.get_catch_percent(s_102)+plus_percent) {
                    fish_code=102;
                    next_catch();
                }
                else {
                    fish_code=102;
                    next_runaway();
                }
            }
            else if (45 <= ran_num && ran_num <= 59) {
                if (ran_num2<s_103.get_catch_percent(s_103)+plus_percent) {
                    fish_code=103;
                    next_catch();
                }
                else {
                    fish_code=103;
                    next_runaway();
                }
            }
            else if (60 <= ran_num && ran_num <= 74) {
                if (ran_num2<s_104.get_catch_percent(s_104)+plus_percent) {
                    fish_code=104;
                    next_catch();
                }
                else {
                    fish_code=104;
                    next_runaway();
                }
            }
            else if (75 <= ran_num && ran_num <= 84) {
                if (ran_num2<s_105.get_catch_percent(s_105)+plus_percent) {
                    fish_code=105;
                    next_catch();
                }
                else {
                    fish_code=105;
                    next_runaway();
                }
            }
            else if (85 <= ran_num && ran_num <= 94) {
                if (ran_num2<s_106.get_catch_percent(s_106)+plus_percent) {
                    fish_code=106;
                    next_catch();
                }
                else {
                    fish_code=106;
                    next_runaway();
                }
            }
            else if (95 <= ran_num && ran_num <= 99) {
                if (ran_num2<s_190.get_catch_percent(s_190)+plus_percent) {
                    fish_code=190;
                    next_catch();
                }
                else {
                    fish_code=190;
                    next_runaway();
                }
            }
            else {
                Toast.makeText(getApplicationContext(),"ERROR", Toast.LENGTH_LONG).show();
            }
        }
        else if (before_map_code==2) {
            if(0 <= ran_num && ran_num <= 9) {
                if (ran_num2<t_200.get_catch_percent(t_200)+plus_percent) {
                    fish_code=200;
                    next_catch();
                }
                else {
                    fish_code=200;
                    next_runaway();
                }
            }
            else if (10 <= ran_num && ran_num <= 14) {
                if (ran_num2<t_201.get_catch_percent(t_201)+plus_percent) {
                    fish_code=201;
                    next_catch();
                }
                else {
                    fish_code=201;
                    next_runaway();
                }
            }
            else if (15 <= ran_num && ran_num <= 19) {
                if (ran_num2<t_202.get_catch_percent(t_202)+plus_percent) {
                    fish_code=202;
                    next_catch();
                }
                else {
                    fish_code=202;
                    next_runaway();
                }
            }
            else if (20 <= ran_num && ran_num <= 24) {
                if (ran_num2<t_203.get_catch_percent(t_203)+plus_percent) {
                    fish_code=203;
                    next_catch();
                }
                else {
                    fish_code=203;
                    next_runaway();
                }
            }
            else if (25 <= ran_num && ran_num <= 29) {
                if (ran_num2<t_204.get_catch_percent(t_204)+plus_percent) {
                    fish_code=204;
                    next_catch();
                }
                else {
                    fish_code=204;
                    next_runaway();
                }
            }
            else if (30 <= ran_num && ran_num <= 39) {
                if (ran_num2<t_205.get_catch_percent(t_205)+plus_percent) {
                    fish_code=205;
                    next_catch();
                }
                else {
                    fish_code=205;
                    next_runaway();
                }
            }
            else if (40 <= ran_num && ran_num <= 44) {
                if (ran_num2<t_206.get_catch_percent(t_206)+plus_percent) {
                    fish_code=206;
                    next_catch();
                }
                else {
                    fish_code=206;
                    next_runaway();
                }
            }
            else if (45 <= ran_num && ran_num <= 49) {
                if (ran_num2<t_207.get_catch_percent(t_207)+plus_percent) {
                    fish_code=207;
                    next_catch();
                }
                else {
                    fish_code=207;
                    next_runaway();
                }
            }
            else if (50 <= ran_num && ran_num <= 54) {
                if (ran_num2<t_208.get_catch_percent(t_208)+plus_percent) {
                    fish_code=208;
                    next_catch();
                }
                else {
                    fish_code=208;
                    next_runaway();
                }
            }
            else if (55 <= ran_num && ran_num <= 59) {
                if (ran_num2<t_209.get_catch_percent(t_209)+plus_percent) {
                    fish_code=209;
                    next_catch();
                }
                else {
                    fish_code=209;
                    next_runaway();
                }
            }
            else if (60 <= ran_num && ran_num <= 64) {
                if (ran_num2<t_210.get_catch_percent(t_210)+plus_percent) {
                    fish_code=210;
                    next_catch();
                }
                else {
                    fish_code=210;
                    next_runaway();
                }
            }
            else if (65 <= ran_num && ran_num <= 69) {
                if (ran_num2<t_211.get_catch_percent(t_211)+plus_percent) {
                    fish_code=211;
                    next_catch();
                }
                else {
                    fish_code=211;
                    next_runaway();
                }
            }
            else if (70 <= ran_num && ran_num <= 74) {
                if (ran_num2<t_212.get_catch_percent(t_212)+plus_percent) {
                    fish_code=212;
                    next_catch();
                }
                else {
                    fish_code=212;
                    next_runaway();
                }
            }
            else if (75 <= ran_num && ran_num <= 77) {
                if (ran_num2<t_213.get_catch_percent(t_213)+plus_percent) {
                    fish_code=213;
                    next_catch();
                }
                else {
                    fish_code=213;
                    next_runaway();
                }
            }
            else if (78 <= ran_num && ran_num <= 82) {
                if (ran_num2<t_214.get_catch_percent(t_214)+plus_percent) {
                    fish_code=214;
                    next_catch();
                }
                else {
                    fish_code=214;
                    next_runaway();
                }
            }
            else if (83 <= ran_num && ran_num <= 87) {
                if (ran_num2<t_215.get_catch_percent(t_215)+plus_percent) {
                    fish_code=215;
                    next_catch();
                }
                else {
                    fish_code=215;
                    next_runaway();
                }
            }
            else if (88 <= ran_num && ran_num <= 90) {
                if (ran_num2<t_216.get_catch_percent(t_216)+plus_percent) {
                    fish_code=216;
                    next_catch();
                }
                else {
                    fish_code=216;
                    next_runaway();
                }
            }
            else if (91 <= ran_num && ran_num <= 95) {
                if (ran_num2<t_217.get_catch_percent(t_217)+plus_percent) {
                    fish_code=217;
                    next_catch();
                }
                else {
                    fish_code=217;
                    next_runaway();
                }
            }
            else if (96 <= ran_num && ran_num <= 98) {
                if (ran_num2<t_218.get_catch_percent(t_218)+plus_percent) {
                    fish_code=218;
                    next_catch();
                }
                else {
                    fish_code=218;
                    next_runaway();
                }
            }
            else if (99 == ran_num) {
                if (ran_num2<t_290.get_catch_percent(t_290)+plus_percent) {
                    fish_code=290;
                    next_catch();
                }
                else {
                    fish_code=290;
                    next_runaway();
                }
            }
            else {
                Toast.makeText(getApplicationContext(),"ERROR", Toast.LENGTH_LONG).show();
            }
        }
        else if (before_map_code==3) {
            if(0 <= ran_num && ran_num <= 14) {
                if (ran_num2<b_300.get_catch_percent(b_300)+plus_percent) {
                    fish_code=300;
                    next_catch();
                }
                else {
                    fish_code=300;
                    next_runaway();
                }
            }
            else if (15 <= ran_num && ran_num <= 24) {
                if (ran_num2<b_301.get_catch_percent(b_301)+plus_percent) {
                    fish_code=301;
                    next_catch();
                }
                else {
                    fish_code=301;
                    next_runaway();
                }
            }
            else if (25 <= ran_num && ran_num <= 39) {
                if (ran_num2<b_302.get_catch_percent(b_302)+plus_percent) {
                    fish_code=302;
                    next_catch();
                }
                else {
                    fish_code=302;
                    next_runaway();
                }
            }
            else if (40 <= ran_num && ran_num <= 49) {
                if (ran_num2<b_303.get_catch_percent(b_303)+plus_percent) {
                    fish_code=303;
                    next_catch();
                }
                else {
                    fish_code=303;
                    next_runaway();
                }
            }
            else if (50 <= ran_num && ran_num <= 64) {
                if (ran_num2<b_304.get_catch_percent(b_304)+plus_percent) {
                    fish_code=304;
                    next_catch();
                }
                else {
                    fish_code=304;
                    next_runaway();
                }
            }
            else if (65 <= ran_num && ran_num <= 74) {
                if (ran_num2<b_305.get_catch_percent(b_305)+plus_percent) {
                    fish_code=305;
                    next_catch();
                }
                else {
                    fish_code=305;
                    next_runaway();
                }
            }
            else if (75 <= ran_num && ran_num <= 89) {
                if (ran_num2<b_307.get_catch_percent(b_307)+plus_percent) {
                    fish_code=307;
                    next_catch();
                }
                else {
                    fish_code=307;
                    next_runaway();
                }
            }
            else if (90 <= ran_num && ran_num <= 94) {
                if (ran_num2<b_308.get_catch_percent(b_308)+plus_percent) {
                    fish_code=308;
                    next_catch();
                }
                else {
                    fish_code=308;
                    next_runaway();
                }
            }
            else if (95 <= ran_num && ran_num <= 98) {
                if (ran_num2<b_309.get_catch_percent(b_309)+plus_percent) {
                    fish_code=309;
                    next_catch();
                }
                else {
                    fish_code=309;
                    next_runaway();
                }
            }
            else if (ran_num == 99) {
                if (ran_num2<b_390.get_catch_percent(b_390)+plus_percent) {
                    fish_code=390;
                    next_catch();
                }
                else {
                    fish_code=390;
                    next_runaway();
                }
            }
            else {
                Toast.makeText(getApplicationContext(),"ERROR", Toast.LENGTH_LONG).show();
            }
        }
        else {
            Toast.makeText(getApplicationContext(),"ERROR", Toast.LENGTH_LONG).show();
        }
    }

    Fish_base s_100 = new Fish_base("개구리", 100, 1, 15, 75, 1000, 0);
    Fish_base s_101 = new Fish_base("두꺼비", 101, 1, 15, 65, 1000, 0);
    Fish_base s_102 = new Fish_base("붉은 독 개구리", 102, 1, 15, 55, 1000, 0);
    Fish_base s_103 = new Fish_base("푸른 독 개구리", 103, 1, 15, 55, 1000, 0);
    Fish_base s_104 = new Fish_base("두꺼비 수하", 104, 1, 15, 50, 1000, 0);
    Fish_base s_105 = new Fish_base("리게이터", 105, 1, 10, 45, 1000, 0);
    Fish_base s_106 = new Fish_base("크로코", 106, 1, 10, 40, 1000, 0);
    Fish_base s_190 = new Fish_base("갓파", 190, 1, 5, 25, 1000, 1);

    Fish_base t_200 = new Fish_base("불가사리", 200, 2, 10, 75, 1000, 0);
    Fish_base t_201 = new Fish_base("화난 불가사리", 201, 2, 5, 70, 1000, 0);
    Fish_base t_202 = new Fish_base("주니어 씰", 202, 2, 5, 50, 1000, 0);
    Fish_base t_203 = new Fish_base("주니어 페페", 203, 2, 5, 50, 1000, 0);
    Fish_base t_204 = new Fish_base("엄티", 204, 2, 5, 60, 1000, 0);
    Fish_base t_205 = new Fish_base("젤리피쉬", 205, 2, 10, 75, 1000, 0);
    Fish_base t_206 = new Fish_base("쿨 젤리피쉬", 206, 2, 5, 70, 1000, 0);
    Fish_base t_207 = new Fish_base("씨코", 207, 2, 5, 75, 1000, 0);
    Fish_base t_208 = new Fish_base("씨클", 208, 2, 5, 70, 1000, 0);
    Fish_base t_209 = new Fish_base("버블피쉬", 209, 2, 5, 65, 1000, 0);
    Fish_base t_210 = new Fish_base("스쿠버 페페", 210, 2, 5, 60, 1000, 0);
    Fish_base t_211 = new Fish_base("크립", 211, 2, 5, 60, 1000, 0);
    Fish_base t_212 = new Fish_base("로랑", 212, 2, 5, 45, 1000, 0);
    Fish_base t_213 = new Fish_base("클랑", 213, 2, 3, 40, 1000, 0);
    Fish_base t_214 = new Fish_base("핀붐", 214, 2, 5, 50, 1000, 0);
    Fish_base t_215 = new Fish_base("마스크 피쉬", 215, 2, 5, 45, 1000, 0);
    Fish_base t_216 = new Fish_base("플라워 피쉬", 216, 2, 3, 40, 1000, 0);
    Fish_base t_217 = new Fish_base("푸퍼", 217, 2, 5, 45, 1000, 0);
    Fish_base t_218 = new Fish_base("포이즌 푸퍼", 218, 2, 3, 40, 1000, 0);
    Fish_base t_290 = new Fish_base("세르프", 290, 2, 1, 25, 1000, 1);

    Fish_base b_300 = new Fish_base("페페", 300, 3, 15, 50, 1000, 0);
    Fish_base b_301 = new Fish_base("다크 페페", 301, 3, 10, 40, 1000, 0);
    Fish_base b_302 = new Fish_base("프리져", 302, 3, 15, 50, 1000, 0);
    Fish_base b_303 = new Fish_base("스파커", 303, 3, 10, 40, 1000, 0);
    Fish_base b_304 = new Fish_base("스퀴드", 304, 3, 15, 50, 1000, 0);
    Fish_base b_305 = new Fish_base("리셀 스퀴드", 305, 3, 10, 40, 1000, 0);
    Fish_base b_306 = new Fish_base("폭렬 망둥이집", 306, 3, 15, 40, 1000, 0);
    Fish_base b_307 = new Fish_base("망둥이", 307, 3, 15, 40, 1000, 0);
    Fish_base b_308 = new Fish_base("샤크", 308, 3, 5, 30, 1000, 0);
    Fish_base b_309 = new Fish_base("콜드 샤크", 309, 3, 3, 25, 1000, 0);
    Fish_base b_390 = new Fish_base("킹크랑", 390, 3, 1, 15, 1000, 1);

}
