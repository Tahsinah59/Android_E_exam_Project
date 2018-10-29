package com.example.asus.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MATH1113 extends AppCompatActivity {

    Button question,send;
    EditText input;
    Storage myStorage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math1113);

        question = (Button) findViewById(R.id.question);
        send = (Button) findViewById(R.id.send);
        input = (EditText) findViewById(R.id.ans);
        myStorage = new Storage(getApplicationContext());

        question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MATH1113.this, QuestionMATH1113.class));
            }
        });


        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input.getText().toString().equals("")) {

                }
                else
                {
                    myStorage.insert(input.getText().toString());
                    startActivity(new Intent(getApplicationContext(), OneOne.class));
                }
            }
        });
    }
}
