package com.example.onlinequizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class StartQuiz extends AppCompatActivity {

    TextView textView;
    RadioGroup radioGroup;
    RadioButton btn1,btn2,btn3,btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_quiz);
        textView=(TextView) findViewById(R.id.question1_textview);
        radioGroup=(RadioGroup) findViewById(R.id.radigrp1);
        btn1=(RadioButton) findViewById(R.id.rdbtn1);
        btn2=(RadioButton) findViewById(R.id.rdbtn2);
        btn3=(RadioButton) findViewById(R.id.rdbtn3);
        btn4=(RadioButton) findViewById(R.id.rdbtn4);

        String [] data=getResources().getStringArray(R.array.quiz);
        final ArrayList<String> arrayListQuestion=new ArrayList<String>(asList(data));


            }

    }
