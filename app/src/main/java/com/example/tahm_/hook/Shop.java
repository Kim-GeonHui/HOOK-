package com.example.tahm_.hook;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import Player.Player_base;

import static com.example.tahm_.hook.MainActivity.mp;

public class Shop extends AppCompatActivity {

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
        setContentView(R.layout.activity_shop);
        Intent shop = getIntent();
        money = shop.getIntExtra("money", 0);
        rod_level = shop.getIntExtra("rod_level", 0);
        check_bait = shop.getIntExtra("check_bait", 0);
        count_bait_normal = shop.getIntExtra("count_bait_normal", count_bait_normal);
        count_bait_hidden = shop.getIntExtra("count_bait_hidden", count_bait_hidden);
        plus_percent = shop.getIntExtra("plus_percent", plus_percent);

        String s_money = String.valueOf(money);

        TextView textview = (TextView)findViewById(R.id.text_money);
        textview.setText(s_money);
    }

    Player_base player = new Player_base(money, rod_level, check_bait, count_bait_normal, count_bait_hidden, plus_percent);

    public void onClick_exit(View v) {
        check();
        Intent menu = new Intent(getApplicationContext(), Menu.class);
        menu.putExtra("money", money);
        menu.putExtra("rod_level",rod_level);
        menu.putExtra("check_bait", check_bait);
        menu.putExtra("count_bait_normal", count_bait_normal);
        menu.putExtra("count_bait_hidden", count_bait_hidden);
        menu.putExtra("plus_percent",plus_percent);
        startActivity(menu);
        mp.pause();
        mp = MediaPlayer.create(this, R.raw.normal);
        mp.setLooping(true);
        mp.start();
    }

    public void onClick_buy1(View v) {
        if (money>=50000) {
            if (rod_level>=1) {
                Toast.makeText(getApplicationContext(),"이미 낚시대를 가지고 있습니다.", Toast.LENGTH_LONG).show();
            }
            else {
                money-=50000;
                rod_level=1;
                Toast.makeText(getApplicationContext(),"아이템을 구매하였습니다.", Toast.LENGTH_LONG).show();
                check();
                Intent shop = new Intent(getApplicationContext(), Shop.class);
                shop.putExtra("money", money);
                shop.putExtra("rod_level",rod_level);
                shop.putExtra("check_bait", check_bait);
                shop.putExtra("count_bait_normal", count_bait_normal);
                shop.putExtra("count_bait_hidden", count_bait_hidden);
                shop.putExtra("plus_percent",plus_percent);
                startActivity(shop);
            }
        }
        else {
            if (rod_level>=1) {
                Toast.makeText(getApplicationContext(),"이미 낚시대를 가지고 있습니다.", Toast.LENGTH_LONG).show();
            }
            else {
                Toast.makeText(getApplicationContext(),"돈이 부족합니다.", Toast.LENGTH_LONG).show();
            }
        }
    }

    public void onClick_buy2(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(Shop.this);
        builder.setTitle("일반 미끼 10개를 정말로 구매하시겠습니까?");
        builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if (money>=2000) {
                    money-=2000;
                    count_bait_normal+=10;
                    Toast.makeText(getApplicationContext(),"아이템을 구매하였습니다.", Toast.LENGTH_LONG).show();
                    check();
                    Intent shop = new Intent(getApplicationContext(), Shop.class);
                    shop.putExtra("money", money);
                    shop.putExtra("rod_level",rod_level);
                    shop.putExtra("check_bait", check_bait);
                    shop.putExtra("count_bait_normal", count_bait_normal);
                    shop.putExtra("count_bait_hidden", count_bait_hidden);
                    shop.putExtra("plus_percent",plus_percent);
                    startActivity(shop);
                }
                else {
                    Toast.makeText(getApplicationContext(),"돈이 부족합니다.", Toast.LENGTH_LONG).show();
                }
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

    public void onClick_buy3(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(Shop.this);
        builder.setTitle("고급 미끼 10개를 정말로 구매하시겠습니까?");
        builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if (money>=10000) {
                    money-=10000;
                    count_bait_hidden+=10;
                    Toast.makeText(getApplicationContext(),"아이템을 구매하였습니다.", Toast.LENGTH_LONG).show();
                    check();
                    Intent shop = new Intent(getApplicationContext(), Shop.class);
                    shop.putExtra("money", money);
                    shop.putExtra("rod_level",rod_level);
                    shop.putExtra("check_bait", check_bait);
                    shop.putExtra("count_bait_normal", count_bait_normal);
                    shop.putExtra("count_bait_hidden", count_bait_hidden);
                    shop.putExtra("plus_percent",plus_percent);
                    startActivity(shop);
                }
                else {
                    Toast.makeText(getApplicationContext(),"돈이 부족합니다.", Toast.LENGTH_LONG).show();
                }
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

    public void onClick_enforce(View v) {
        if (rod_level==0) {
            Toast.makeText(getApplicationContext(),"낚싯대가 없습니다.", Toast.LENGTH_LONG).show();
        }
        else if (rod_level==1) {
            AlertDialog.Builder builder = new AlertDialog.Builder(Shop.this);
            builder.setTitle("낚싯대를 정말로 10000에 2강으로 강화하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    money-=10000;
                    Random number = new Random();
                    int rand = number.nextInt(100);
                    if (0<=rand && rand<=80) {
                        rod_level+=1;
                        Toast.makeText(getApplicationContext(),"강화에 성공하였습니다.", Toast.LENGTH_LONG).show();
                        check();
                        Intent shop = new Intent(getApplicationContext(), Shop.class);
                        shop.putExtra("money", money);
                        shop.putExtra("rod_level",rod_level);
                        shop.putExtra("check_bait", check_bait);
                        shop.putExtra("count_bait_normal", count_bait_normal);
                        shop.putExtra("count_bait_hidden", count_bait_hidden);
                        shop.putExtra("plus_percent",plus_percent);
                        startActivity(shop);
                    }
                    else {
                        Toast.makeText(getApplicationContext(),"강화에 실패하였습니다.", Toast.LENGTH_LONG).show();
                        check();
                        Intent shop = new Intent(getApplicationContext(), Shop.class);
                        shop.putExtra("money", money);
                        shop.putExtra("rod_level",rod_level);
                        shop.putExtra("check_bait", check_bait);
                        shop.putExtra("count_bait_normal", count_bait_normal);
                        shop.putExtra("count_bait_hidden", count_bait_hidden);
                        shop.putExtra("plus_percent",plus_percent);
                        startActivity(shop);
                    }
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
        else if (rod_level==2) {
            AlertDialog.Builder builder = new AlertDialog.Builder(Shop.this);
            builder.setTitle("낚싯대를 정말로 30000에 3강으로 강화하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    money-=30000;
                    Random number = new Random();
                    int rand = number.nextInt(100);
                    if (0<=rand && rand<=60) {
                        rod_level+=1;
                        Toast.makeText(getApplicationContext(),"강화에 성공하였습니다.", Toast.LENGTH_LONG).show();
                        check();
                        Intent shop = new Intent(getApplicationContext(), Shop.class);
                        shop.putExtra("money", money);
                        shop.putExtra("rod_level",rod_level);
                        shop.putExtra("check_bait", check_bait);
                        shop.putExtra("count_bait_normal", count_bait_normal);
                        shop.putExtra("count_bait_hidden", count_bait_hidden);
                        shop.putExtra("plus_percent",plus_percent);
                        startActivity(shop);
                    }
                    else {
                        Toast.makeText(getApplicationContext(),"강화에 실패하였습니다.", Toast.LENGTH_LONG).show();
                        check();
                        Intent shop = new Intent(getApplicationContext(), Shop.class);
                        shop.putExtra("money", money);
                        shop.putExtra("rod_level",rod_level);
                        shop.putExtra("check_bait", check_bait);
                        shop.putExtra("count_bait_normal", count_bait_normal);
                        shop.putExtra("count_bait_hidden", count_bait_hidden);
                        shop.putExtra("plus_percent",plus_percent);
                        startActivity(shop);
                    }
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
        else if (rod_level==3) {
            AlertDialog.Builder builder = new AlertDialog.Builder(Shop.this);
            builder.setTitle("낚싯대를 정말로 70000에 4강으로 강화하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    money-=70000;
                    Random number = new Random();
                    int rand = number.nextInt(100);
                    if (0<=rand && rand<=40) {
                        rod_level+=1;
                        Toast.makeText(getApplicationContext(),"강화에 성공하였습니다.", Toast.LENGTH_LONG).show();
                        check();
                        Intent shop = new Intent(getApplicationContext(), Shop.class);
                        shop.putExtra("money", money);
                        shop.putExtra("rod_level",rod_level);
                        shop.putExtra("check_bait", check_bait);
                        shop.putExtra("count_bait_normal", count_bait_normal);
                        shop.putExtra("count_bait_hidden", count_bait_hidden);
                        shop.putExtra("plus_percent",plus_percent);
                        startActivity(shop);
                    }
                    else {
                        Toast.makeText(getApplicationContext(),"강화에 실패하였습니다.", Toast.LENGTH_LONG).show();
                        check();
                        Intent shop = new Intent(getApplicationContext(), Shop.class);
                        shop.putExtra("money", money);
                        shop.putExtra("rod_level",rod_level);
                        shop.putExtra("check_bait", check_bait);
                        shop.putExtra("count_bait_normal", count_bait_normal);
                        shop.putExtra("count_bait_hidden", count_bait_hidden);
                        shop.putExtra("plus_percent",plus_percent);
                        startActivity(shop);
                    }
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
        else if (rod_level==4) {
            AlertDialog.Builder builder = new AlertDialog.Builder(Shop.this);
            builder.setTitle("낚싯대를 정말로 100000에 5강으로 강화하시겠습니까?");
            builder.setNegativeButton("예", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    money-=100000;
                    Random number = new Random();
                    int rand = number.nextInt(100);
                    if (0<=rand && rand<=20) {
                        rod_level+=1;
                        Toast.makeText(getApplicationContext(),"강화에 성공하였습니다.", Toast.LENGTH_LONG).show();
                        check();
                        Intent shop = new Intent(getApplicationContext(), Shop.class);
                        shop.putExtra("money", money);
                        shop.putExtra("rod_level",rod_level);
                        shop.putExtra("check_bait", check_bait);
                        shop.putExtra("count_bait_normal", count_bait_normal);
                        shop.putExtra("count_bait_hidden", count_bait_hidden);
                        shop.putExtra("plus_percent",plus_percent);
                        startActivity(shop);
                    }
                    else {
                        Toast.makeText(getApplicationContext(),"강화에 실패하였습니다.", Toast.LENGTH_LONG).show();
                        check();
                        Intent shop = new Intent(getApplicationContext(), Shop.class);
                        shop.putExtra("money", money);
                        shop.putExtra("rod_level",rod_level);
                        shop.putExtra("check_bait", check_bait);
                        shop.putExtra("count_bait_normal", count_bait_normal);
                        shop.putExtra("count_bait_hidden", count_bait_hidden);
                        shop.putExtra("plus_percent",plus_percent);
                        startActivity(shop);
                    }
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
        else if (rod_level>=5) {
            Toast.makeText(getApplicationContext(),"이미 최대 단계입니다.", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(getApplicationContext(),"Error", Toast.LENGTH_LONG).show();
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
