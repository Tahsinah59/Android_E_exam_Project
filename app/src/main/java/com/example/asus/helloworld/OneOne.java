package com.example.asus.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OneOne extends AppCompatActivity {

    private Button CSE,EEE,MATH,HUM,CHEM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_one);

        CSE = (Button) findViewById(R.id.btn_CSE);
        EEE = (Button) findViewById(R.id.btn_EEE);
        MATH = (Button) findViewById(R.id.btn_MATH);
        HUM = (Button) findViewById(R.id.btn_HUM);
        CHEM = (Button) findViewById(R.id.btn_CHEM);

        CSE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OneOne.this, CSE1101.class));
            }
        });

        EEE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OneOne.this, EEE1151.class));
            }
        });
        MATH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OneOne.this, MATH1113.class));
            }
        });
        HUM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OneOne.this, HUM1113.class));
            }
        });
    }
}
