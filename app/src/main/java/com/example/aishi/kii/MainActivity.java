package com.example.aishi.kii;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.os.Vibrator;

import java.util.Random;

public class MainActivity extends AppCompatActivity {



    Button bt;
    Button reset1;
    Button ggwp;
    Button gg;
    Button op;
    Button op1;
    Button op2;
    Button op3;

    int[] sounds = {R.raw.a, R.raw.b, R.raw.c, R.raw.d, R.raw.e, R.raw.f, R.raw.g, R.raw.h, R.raw.i,
            R.raw.j, R.raw.k, R.raw.l, R.raw.m, R.raw.n, R.raw.o, R.raw.p, R.raw.q, R.raw.r, R.raw.s, R.raw.t, R.raw.u, R.raw.v, R.raw.x, R.raw.y, R.raw.z,
            R.raw.aa, R.raw.bb, R.raw.cc, R.raw.dd, R.raw.ee, R.raw.ff, R.raw.gg, R.raw.ii, R.raw.jj, R.raw.ll, R.raw.mm, R.raw.oo, R.raw.nn, R.raw.pp, R.raw.qq,
            R.raw.rr, R.raw.ss, R.raw.tt, R.raw.uu, R.raw.xx, R.raw.yy, R.raw.zz, R.raw.za, R.raw.zb, R.raw.zc, R.raw.zd, R.raw.hh, R.raw.kk };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Vibrator v = (Vibrator) getSystemService(MainActivity.VIBRATOR_SERVICE);
        // Vibrate for 500 milliseconds
        v.vibrate(500);






        reset1 = findViewById(R.id.reset);
        reset1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity();
            }
        });



        final MediaPlayer mps4 = MediaPlayer.create(this, sounds[getRandom(53)]);
        op2 = this.findViewById(R.id.button5);
        op2.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       mps4.start();
                                       v.vibrate(500);
                                   }
                               }
        );



        final MediaPlayer mps5 = MediaPlayer.create(this, sounds[getRandom(53)]);
        op3 = this.findViewById(R.id.button6);
        op3.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       mps5.start();
                                       v.vibrate(500);
                                   }
                               }
        );










        final MediaPlayer mps3 = MediaPlayer.create(this, sounds[getRandom(53)]);
        op1 = this.findViewById(R.id.button7);
        op1.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       mps3.start();
                                       v.vibrate(500);
                                   }
                               }
        );








        final MediaPlayer mps2 = MediaPlayer.create(this, sounds[getRandom(53)]);
        op = this.findViewById(R.id.button3);
        op.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      mps2.start();
                                      v.vibrate(500);
                                  }
                              }
        );







        final MediaPlayer mpss = MediaPlayer.create(this, sounds[getRandom(53)]);
        ggwp = this.findViewById(R.id.button2);
        ggwp.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        mpss.start();
                                        v.vibrate(500);
                                    }
                                }
        );






        final MediaPlayer mps = MediaPlayer.create(this, sounds[getRandom(53)]);
        gg = this.findViewById(R.id.button);
        gg.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      mps.start();
                                      v.vibrate(500);
                                  }
                              }
        );





        final MediaPlayer mp = MediaPlayer.create(this, sounds[getRandom(53)]);
        bt = this.findViewById(R.id.button1);
        bt.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      mp.start();
                                      v.vibrate(500);
                                  }
                              }
        );
    }

    public static int getRandom(int max) {
        return (int) (Math.random()*max);
    }
    public void openActivity() {
        Intent intent = new Intent(this, MainActivity.class );
        startActivity(intent);
    }
}
