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
        int j=6;
        String [] data=getResources().getStringArray(R.array.quiz);
        final ArrayList<String> arrayListQuestion=new ArrayList<String>(asList(data));
            for(int i=0;i<arrayListQuestion.size();i++){
                if(i==0||i==5||i==10||i==15||i==20||i==25||i==30||i==35||i==40||i==45||i==50||i==55||i==60||i==65||i==70){
                    textView.setText(arrayListQuestion.get(i));
                }
                else if(i==1||i==6||i==11||i==16||i==21||i==26||i==31||i==36||i==41||i==46||i==51||i==56||i==61||i==66||i==71){
                    btn1.setText(arrayListQuestion.get(i));
                }
                else if(i==2||i==7||i==12||i==17||i==22||i==27||i==32||i==37||i==42||i==47||i==52||i==57||i==62||i==67||i==72){
                    btn2.setText(arrayListQuestion.get(i));
                }
                else if(i==3||i==8||i==13||i==18||i==23||i==28||i==33||i==38||i==43||i==48||i==53||i==58||i==63||i==68||i==73){
                    btn3.setText(arrayListQuestion.get(i));
                }
                else {
                    btn3.setText(arrayListQuestion.get(i));
                }

            }

    }
}