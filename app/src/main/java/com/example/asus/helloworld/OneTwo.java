package com.example.asus.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OneTwo extends AppCompatActivity {

    private Button CSE1, CSE2, MATH, HUM, PHY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_two);

        CSE1 = (Button) findViewById(R.id.btn_CSE);
        CSE2 = (Button) findViewById(R.id.btn_EEE);
        MATH = (Button) findViewById(R.id.btn_MATH);
        HUM = (Button) findViewById(R.id.btn_HUM);
        PHY = (Button) findViewById(R.id.btn_PHY);


    }
}
