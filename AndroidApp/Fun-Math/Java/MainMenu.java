package com.example.dheer.funmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {
    Button about,learn,practice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        about = findViewById(R.id.about);
        practice = findViewById(R.id.practice);
        learn = findViewById(R.id.learn);



        practice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(MainMenu.this,MainActivity.class);
                startActivity(intent4);
            }
        });



        learn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(MainMenu.this,LearnTables.class);
                startActivity(intent5);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent9 = new Intent(MainMenu.this,About.class);
                startActivity(intent9);
            }
        });





    }
}
