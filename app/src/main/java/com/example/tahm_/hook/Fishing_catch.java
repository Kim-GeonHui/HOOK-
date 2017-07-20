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

import static com.example.tahm_.hook.MainActivity.mp;

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

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_fishing_catch);

            Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            vibrator.vibrate(1000);

            Intent next = getIntent();
            before_map_code = next.getIntExtra("code_map", 0);
            fish_code = next.getIntExtra("fish_code",0);
            money = next.getIntExtra("money", 0);
            rod_level = next.getIntExtra("rod_level", 0);
            check_bait = next.getIntExtra("check_bait", 0);
            count_bait_normal = next.getIntExtra("count_bait_normal", count_bait_normal);
            count_bait_hidden = next.getIntExtra("count_bait_hidden", count_bait_hidden);
            plus_percent = next.getIntExtra("plus_percent", plus_percent);
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

    public void onClick_donation(View v) {
        Toast.makeText(getApplicationContext(),"준비중입니다.", Toast.LENGTH_LONG).show();
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
            startActivity(next);
            mp.pause();
            mp = MediaPlayer.create(this, R.raw.swamp);
            mp.setLooping(true);
            mp.start();
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
