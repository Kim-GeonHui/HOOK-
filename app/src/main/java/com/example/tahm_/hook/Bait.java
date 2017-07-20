package com.example.tahm_.hook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

public class Bait extends AppCompatActivity {

    @Override
    public void onBackPressed() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bait);
        this.setFinishOnTouchOutside(false);
    }

    public void onClick_normal(View v) {
        int number = 1;
        Intent next = new Intent();
        next.putExtra("put", number);
        new Timer().schedule(new TimerTask() {
            public void run() {
                finish();
            }
        }, 5000);
    }

    public void onClick_hidden(View v) {
        int number = 2;
        Intent next = new Intent();
        next.putExtra("put", number);
        new Timer().schedule(new TimerTask() {
            public void run() {
                finish();
            }
        }, 5000);
    }

}
