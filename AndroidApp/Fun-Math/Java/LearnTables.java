package com.example.dheer.funmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LearnTables extends AppCompatActivity {


    EditText ee;
    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
    Button gett,breturn,gett2;
    int div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_tables);
        ee = findViewById(R.id.numtab);
        gett = findViewById(R.id.btable);
        gett2 = findViewById(R.id.btable2);
        breturn = findViewById(R.id.breturn);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        t4=findViewById(R.id.t4);
        t5=findViewById(R.id.t5);
        t6=findViewById(R.id.t6);
        t7=findViewById(R.id.t7);
        t8=findViewById(R.id.t8);
        t9=findViewById(R.id.t9);
        t10=findViewById(R.id.t10);
        div = 0;



        gett.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(ee.getText().toString().equals("")){
                    Toast.makeText(LearnTables.this, "Enter a Number", Toast.LENGTH_SHORT).show();
                }else {
                    div = Integer.parseInt(ee.getText().toString());
                    t1.setText(div + " x 1 = " + div * 1);

                    t2.setText(div + " x 2 = " + div * 2);
                    t3.setText(div + " x 3 = " + div * 3);
                    t4.setText(div + " x 4 = " + div * 4);
                    t5.setText(div + " x 5 = " + div * 5);
                    t6.setText(div + " x 6 = " + div * 6);
                    t7.setText(div + " x 7 = " + div * 7);
                    t8.setText(div + " x 8 = " + div * 8);
                    t9.setText(div + " x 9 = " + div * 9);
                    t10.setText(div + " x 10 = " + div * 10);

                }
            }
        });

        gett2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(ee.getText().toString().equals("")){
                    Toast.makeText(LearnTables.this, "Enter a Number", Toast.LENGTH_SHORT).show();
                }else {
                    div = Integer.parseInt(ee.getText().toString());
                    t1.setText(div + " x 11 = " + div * 11);
                    t2.setText(div + " x 12 = " + div * 12);
                    t3.setText(div + " x 13 = " + div * 13);
                    t4.setText(div + " x 14 = " + div * 14);
                    t5.setText(div + " x 15 = " + div * 15);
                    t6.setText(div + " x 16 = " + div * 16);
                    t7.setText(div + " x 17 = " + div * 17);
                    t8.setText(div + " x 18 = " + div * 18);
                    t9.setText(div + " x 19 = " + div * 19);
                    t10.setText(div + " x 20 = " + div * 20);

                }
            }
        });

        breturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6 = new Intent(LearnTables.this,MainMenu.class);
                startActivity(intent6);
            }
        });
    }
}
