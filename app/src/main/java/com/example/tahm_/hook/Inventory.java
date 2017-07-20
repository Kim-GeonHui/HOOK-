package com.example.tahm_.hook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Inventory extends AppCompatActivity {

    private int before_map_code;
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
        setContentView(R.layout.activity_inventory);

        Intent inventory = getIntent();
        before_map_code = inventory.getIntExtra("code_map", 0);
        money = inventory.getIntExtra("money", 0);
        rod_level = inventory.getIntExtra("rod_level", 0);
        check_bait = inventory.getIntExtra("check_bait", 0);
        count_bait_normal = inventory.getIntExtra("count_bait_normal", count_bait_normal);
        count_bait_hidden = inventory.getIntExtra("count_bait_hidden", count_bait_hidden);
        plus_percent = inventory.getIntExtra("plus_percent", plus_percent);

        String s_money = String.valueOf(money);
        String s_rod = String.valueOf(rod_level);
        String s_normal = String.valueOf(count_bait_normal);
        String s_hidden = String.valueOf(count_bait_hidden);

        TextView textview = (TextView)findViewById(R.id.text_rod);
        textview.setText(s_rod);
        TextView textview1 = (TextView)findViewById(R.id.text_money);
        textview1.setText(s_money);
        TextView textview2 = (TextView)findViewById(R.id.text_normal);
        textview2.setText(s_normal);
        TextView textview3 = (TextView)findViewById(R.id.text_hidden);
        textview3.setText(s_hidden);
    }

    public void onClick_return(View v) {
        if (before_map_code==0) {
            Intent next = new Intent(getApplicationContext(), Menu.class);
            next.putExtra("code_map", before_map_code);
            next.putExtra("money", money);
            next.putExtra("rod_level", rod_level);
            next.putExtra("check_bait", check_bait);
            next.putExtra("count_bait_normal", count_bait_normal);
            next.putExtra("count_bait_hidden", count_bait_hidden);
            next.putExtra("plus_percent", plus_percent);
            startActivity(next);
        }
        else if (before_map_code==1) {
            Intent next = new Intent(getApplicationContext(), Swamp.class);
            next.putExtra("code_map", before_map_code);
            next.putExtra("money", money);
            next.putExtra("rod_level", rod_level);
            next.putExtra("check_bait", check_bait);
            next.putExtra("count_bait_normal", count_bait_normal);
            next.putExtra("count_bait_hidden", count_bait_hidden);
            next.putExtra("plus_percent", plus_percent);
            startActivity(next);
        }
        else if (before_map_code==2){
            Intent next = new Intent(getApplicationContext(), Tropical_beach.class);
            next.putExtra("code_map", before_map_code);
            next.putExtra("money", money);
            next.putExtra("rod_level", rod_level);
            next.putExtra("check_bait", check_bait);
            next.putExtra("count_bait_normal", count_bait_normal);
            next.putExtra("count_bait_hidden", count_bait_hidden);
            next.putExtra("plus_percent", plus_percent);
            startActivity(next);
        }
        else if (before_map_code==3) {
            Intent next = new Intent(getApplicationContext(), Bermuda_triangle.class);
            next.putExtra("code_map", before_map_code);
            next.putExtra("money", money);
            next.putExtra("rod_level", rod_level);
            next.putExtra("check_bait", check_bait);
            next.putExtra("count_bait_normal", count_bait_normal);
            next.putExtra("count_bait_hidden", count_bait_hidden);
            next.putExtra("plus_percent", plus_percent);
            startActivity(next);
        }
        else {
            Toast.makeText(getApplicationContext(),"Error", Toast.LENGTH_LONG).show();
        }
    }

}
