package com.example.dheer.funmath;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScoreDisplay extends AppCompatActivity {

    Button main;
    TextView score;
    String point;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_display);
        main = findViewById(R.id.exit);
        point = getIntent().getStringExtra("points");

        score = findViewById(R.id.sc);

        score.setText("Score = "+getIntent().getStringExtra("pointy"));



        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent2 = new Intent(ScoreDisplay.this,MainMenu.class);
                startActivity(intent2);
            }
        });
    }
}

