package com.example.tahm_.hook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import static com.example.tahm_.hook.Start.mp;

public class Finish extends AppCompatActivity {

    private int money;
    private int rod_level;
    private int check_bait;
    private int count_bait_normal;
    private int count_bait_hidden;
    private int plus_percent;
    private int before_map_code;

    @Override
    public void onBackPressed() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);
        Intent exit = getIntent();
        money = exit.getIntExtra("money", 0);
        rod_level = exit.getIntExtra("rod_level", 0);
        check_bait = exit.getIntExtra("check_bait", 0);
        count_bait_normal = exit.getIntExtra("count_bait_normal", count_bait_normal);
        count_bait_hidden = exit.getIntExtra("count_bait_hidden", count_bait_hidden);
        plus_percent = exit.getIntExtra("plus_percent", plus_percent);
        before_map_code = exit.getIntExtra("code_map", before_map_code);
    }

    public void onClick_yes(View v) {
        mp.pause();
        if (before_map_code == 1) {

        }
        Toast.makeText(getApplicationContext(),"너무해! 너무해!", Toast.LENGTH_LONG).show();
    }

    public void onClick_no(View v) {
        Toast.makeText(getApplicationContext(),"잘 생각했5!", Toast.LENGTH_LONG).show();
        finish();
    }
}
