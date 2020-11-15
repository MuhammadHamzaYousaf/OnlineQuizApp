package com.example.onlinequizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    Button Exit,Again;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView textViewResult=findViewById(R.id.edittextresult);
        Exit=(Button)findViewById(R.id.exitquiz);
        Again=(Button)findViewById(R.id.btnaginquiz);
        textViewResult.setText("Your Score is :"+getIntent().getStringExtra("correct"));

        Again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent againquiz=new Intent(ResultActivity.this,MainActivity.class);
                startActivity(againquiz);
            }
        });

        Exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}