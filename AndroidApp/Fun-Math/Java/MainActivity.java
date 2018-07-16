package com.example.dheer.funmath;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    Button Get,Sub,home;

    TextView disp,life;
    int var;
    int n1, n2;
    EditText e2;
    TextView points;
    int Points;
    int x,lives;
    int y;
    int x1;
    int y1;
    int x2;
    int y2;
    int count;
    int ans;
    int realans;
    Random rand = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {






        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Points = 0;
        lives = 3;
        ans = 0;
        life=findViewById(R.id.life);
        home = findViewById(R.id.home);
        points = findViewById(R.id.points);
        Get = findViewById(R.id.bGet);
        Sub= findViewById(R.id.bSub);
        e2 = findViewById(R.id.editText2);
        disp = findViewById(R.id.display);
        var = 0;
        x = rand.nextInt(6)+5;
        y= rand.nextInt(6)+5;
        x1 = rand.nextInt(6)+5;
        y1 = rand.nextInt(6)+5;
        x2 = rand.nextInt(6)+5;
        y2 = rand.nextInt(6)+5;
        count = rand.nextInt(7)+1;

        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mytransition);



        disp.startAnimation(myanim);
        if(count == 1) {
            disp.setText(Integer.toString(x) + " x " + Integer.toString(y) + " = ?");
            realans = x*y;
        }else if (count == 2){
            disp.setText(Integer.toString(x) + " x " + "("+Integer.toString(y)+" - "+Integer.toString(x1)+")" + " = ?");
            realans = x*(y-x1);
        } else if (count == 3) {
            disp.setText("("+Integer.toString(x) + " - " + "("+Integer.toString(y)+" - "+Integer.toString(x1)+")" +")"+" x "+Integer.toString(x2)+ " = ?");
            realans = (x-(y-x1))*x2;
        } else if (count == 4) {
            disp.setText(Integer.toString(x) + " x " + "("+Integer.toString(y)+" + "+Integer.toString(x1)+")" + " = ?");
            realans = x*(y+x1);
        }else if(count == 5){
            disp.setText(Integer.toString(x) + " - " + "("+Integer.toString(y)+" x "+Integer.toString(x1)+")" + " = ?");
            realans = x-(y*x1);
        }else if(count == 6){
            disp.setText(Integer.toString(x) + " + " + "("+Integer.toString(y)+" - "+Integer.toString(x1)+")" + " = ?");
            realans = x+(y-x1);
        }



        Get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                n2 = realans;
                var = n2;
                lives -= 1;
                life.setText("Lives = "+lives);
                if (lives <= 0) {

                    Intent intent3 = new Intent(MainActivity.this,ScoreDisplay.class);
                    intent3.putExtra("pointy", Integer.toString(Points));
                    startActivity(intent3);

                    /*Toast.makeText(MainActivity.this, "You are Out", Toast.LENGTH_SHORT).show();
                    disp.setText("Score = " + Points);*/
                } else {
                    points.setText(Integer.toString(Points));

                    Toast.makeText(MainActivity.this, "The Correct answer was " + realans + ". A life lost", Toast.LENGTH_SHORT).show();
                    x = rand.nextInt(6) + 5;
                    y = rand.nextInt(6) + 5;
                    x1 = rand.nextInt(6) + 5;
                    y1 = rand.nextInt(6) + 5;
                    x2 = rand.nextInt(6) + 5;
                    y2 = rand.nextInt(6) + 5;

                    count = rand.nextInt(7) + 2;

                    if (count == 1) {
                        disp.setText(Integer.toString(x) + " x " + Integer.toString(y) + " = ?");
                        realans = x * y;
                    } else if (count == 2) {
                        disp.setText(Integer.toString(x) + " x " + "(" + Integer.toString(y) + " - " + Integer.toString(x1) + ")" + " = ?");
                        realans = x * (y - x1);
                    } else if (count == 3) {
                        disp.setText("(" + Integer.toString(x) + " - " + "(" + Integer.toString(y) + " - " + Integer.toString(x1) + ")" + ")" + " x " + Integer.toString(x2) + " = ?");
                        realans = (x - (y - x1)) * x2;
                    } else if (count == 4) {
                        disp.setText(Integer.toString(x) + " x " + "(" + Integer.toString(y) + " + " + Integer.toString(x1) + ")" + " = ?");
                        realans = x * (y + x1);
                    } else if (count == 5) {
                        disp.setText(Integer.toString(x) + " - " + "(" + Integer.toString(y) + " * " + Integer.toString(x1) + ")" + " = ?");
                        realans = x - (y * x1);
                    } else if (count == 6) {
                        disp.setText("(" + Integer.toString(x) + " * " + Integer.toString(y) + ")" + " - " + Integer.toString(x1) + " = ?");
                        realans = x * (y - x1);
                    }

                }
            }
        });

        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (e2.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Enter a Valid Answer ", Toast.LENGTH_SHORT).show();

                } else {

                    ans = Integer.parseInt(e2.getText().toString());
                    if (realans == ans) {
                        Points += 5;
                        e2.setText("");
                        if (Points == 10) {
                            Toast.makeText(MainActivity.this, "Keep Going", Toast.LENGTH_SHORT).show();
                        }
                        if (Points == 20) {
                            Toast.makeText(MainActivity.this, "Good", Toast.LENGTH_SHORT).show();
                        }
                        if (Points == 30) {
                            Toast.makeText(MainActivity.this, "Great", Toast.LENGTH_SHORT).show();
                        }
                        if (Points == 40) {
                            Toast.makeText(MainActivity.this, "Awesome", Toast.LENGTH_SHORT).show();
                        }
                        if (Points == 50) {
                            Toast.makeText(MainActivity.this, "Genius", Toast.LENGTH_SHORT).show();
                        }
                        points.setText(Integer.toString(Points));

                        Toast.makeText(MainActivity.this, "Correct Answer. +5 Points", Toast.LENGTH_SHORT).show();
                        x = rand.nextInt(6) + 5;
                        y = rand.nextInt(6) + 5;
                        x1 = rand.nextInt(6) + 5;
                        y1 = rand.nextInt(6) + 5;
                        x2 = rand.nextInt(6) + 5;
                        y2 = rand.nextInt(6) + 5;
                        count = rand.nextInt(7) + 1;

                        if (count == 1) {
                            disp.setText(Integer.toString(x) + " x " + Integer.toString(y) + " = ?");
                            realans = x * y;
                        } else if (count == 2) {
                            disp.setText(Integer.toString(x) + " x " + "(" + Integer.toString(y) + " - " + Integer.toString(x1) + ")" + " = ?");
                            realans = x * (y - x1);
                        } else if (count == 3) {
                            disp.setText("(" + Integer.toString(x) + " - " + "(" + Integer.toString(y) + " - " + Integer.toString(x1) + ")" + ")" + " x " + Integer.toString(x2) + " = ?");
                            realans = (x - (y - x1)) * x2;
                        } else if (count == 4) {
                            disp.setText(Integer.toString(x) + " x " + "(" + Integer.toString(y) + " + " + Integer.toString(x1) + ")" + " = ?");
                            realans = x * (y + x1);
                        } else if (count == 5) {
                            disp.setText(Integer.toString(x) + " - " + "(" + Integer.toString(y) + " x " + Integer.toString(x1) + ")" + " = ?");
                            realans = x - (y * x1);
                        } else if (count == 6) {
                            disp.setText(Integer.toString(x) + " x " + "(" + Integer.toString(y) + " - " + Integer.toString(x1) + ")" + " = ?");
                            realans = x * (y - x1);
                        }
                    } else {
                        lives -= 1;
                        e2.setText("");
                        if(lives<=0){
                            Intent intent8 = new Intent(MainActivity.this,ScoreDisplay.class);
                            intent8.putExtra("pointy", Integer.toString(Points));
                            startActivity(intent8);
                        }
                        life.setText("Lives  = "+Integer.toString(lives));
                        Toast.makeText(MainActivity.this, "Try Again", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent7 = new Intent(MainActivity.this,MainMenu.class);


                startActivity(intent7);
            }
        });



    }
    /*public void onButClick(View v){

        /*ans = Integer.parseInt(e2.getText().toString());
        if(realans == ans){
            Points += 5;
            points.setText(Integer.toString(Points));
            Toast.makeText(MainActivity.this,"Correct Answer. +5 Points",Toast.LENGTH_SHORT).show();
        }else{
            Points -= 2;
            points.setText(Integer.toString(Points));
            Toast.makeText(MainActivity.this,"Try Again",Toast.LENGTH_SHORT).show();
        }



    }*/

}