package com.example.asus.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private Button OO, OT, TO, TT, THO, THT, FO, FT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        OO = (Button)findViewById(R.id.btn_OO);
        OT = (Button)findViewById(R.id.btn_OT);
        TO = (Button)findViewById(R.id.btn_TO);
        TT = (Button)findViewById(R.id.btn_TT);
        THO = (Button)findViewById(R.id.btn_THO);
        THT = (Button)findViewById(R.id.btn_THT);
        FO = (Button)findViewById(R.id.btn_FO);
        FT = (Button)findViewById(R.id.btn_FT);

        OO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SecondActivity.this, OneOne.class));

            }
        });
        OT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SecondActivity.this, OneTwo.class));

            }
        });

        TO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SecondActivity.this, TwoOne.class));

            }
        });
        TT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SecondActivity.this, TwoTwo.class));

            }
        });
        THO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SecondActivity.this, ThreeOne.class));

            }
        });
        THT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SecondActivity.this, ThreeTwo.class));

            }
        });
        THT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SecondActivity.this, ThreeTwo.class));

            }
        });
        THT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SecondActivity.this, ThreeTwo.class));

            }
        });


    }
}
