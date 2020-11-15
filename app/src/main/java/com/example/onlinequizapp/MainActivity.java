package com.example.onlinequizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button submitquiz,start;
    private int correct;
    int i=0;
    RadioGroup grp1,grp2,grp3,grp4,grp5,grp6,grp7,grp8,grp9,grp10,grp11,grp12,grp13,grp14,grp15;
    RadioButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitquiz=(Button)findViewById(R.id.submitbtn);
        final ArrayList<String> arrayList=new ArrayList<String>();
        final ArrayList<String> arrayListAnswer=new ArrayList<String>();
        grp1=(RadioGroup) findViewById(R.id.radigrp1);
        grp2=(RadioGroup)findViewById(R.id.radigrp2);
        grp3=(RadioGroup)findViewById(R.id.radigrp3);
        grp4=(RadioGroup) findViewById(R.id.radigrp4);
        grp5=(RadioGroup) findViewById(R.id.radigrp5);
        grp6=(RadioGroup) findViewById(R.id.radigrp6);
        grp7=(RadioGroup)findViewById(R.id.radigrp7);
        grp8=(RadioGroup)findViewById(R.id.radigrp8);
        grp9=(RadioGroup)findViewById(R.id.radigrp9);
        grp10=(RadioGroup)findViewById(R.id.radigrp10);
        grp11=(RadioGroup)findViewById(R.id.radigrp11);
        grp12=(RadioGroup)findViewById(R.id.radigrp12);
        grp13=(RadioGroup)findViewById(R.id.radigrp13);
        grp14=(RadioGroup)findViewById(R.id.radigrp14);
        grp15=(RadioGroup)findViewById(R.id.radigrp15);
        submitquiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,q11,q12,q13,q14,q15;
                q1=grp1.getCheckedRadioButtonId();
                q2=grp2.getCheckedRadioButtonId();
                q3=grp3.getCheckedRadioButtonId();
                q4=grp4.getCheckedRadioButtonId();
                q5=grp5.getCheckedRadioButtonId();
                q6=grp6.getCheckedRadioButtonId();
                q7=grp7.getCheckedRadioButtonId();
                q8=grp8.getCheckedRadioButtonId();
                q9=grp9.getCheckedRadioButtonId();
                q10=grp10.getCheckedRadioButtonId();
                q11=grp11.getCheckedRadioButtonId();
                q12=grp12.getCheckedRadioButtonId();
                q13=grp13.getCheckedRadioButtonId();
                q14=grp14.getCheckedRadioButtonId();
                q15=grp15.getCheckedRadioButtonId();
                btn1=findViewById(q1);
                btn2=findViewById(q2);
                btn3=findViewById(q3);
                btn4=findViewById(q4);
                btn5=findViewById(q5);
                btn6=findViewById(q6);
                btn7=findViewById(q7);
                btn8=findViewById(q8);
                btn9=findViewById(q9);
                btn10=findViewById(q10);
                btn11=findViewById(q11);
                btn12=findViewById(q12);
                btn13=findViewById(q13);
                btn14=findViewById(q14);
                btn15=findViewById(q15);
                arrayList.add(btn1.getText().toString());
                arrayList.add(btn2.getText().toString());
                arrayList.add(btn3.getText().toString());
                arrayList.add(btn4.getText().toString());
                arrayList.add(btn5.getText().toString());
                arrayList.add(btn6.getText().toString());
                arrayList.add(btn7.getText().toString());
                arrayList.add(btn8.getText().toString());
                arrayList.add(btn9.getText().toString());
                arrayList.add(btn10.getText().toString());
                arrayList.add(btn11.getText().toString());
                arrayList.add(btn12.getText().toString());
                arrayList.add(btn13.getText().toString());
                arrayList.add(btn14.getText().toString());
                arrayList.add(btn15.getText().toString());
                arrayListAnswer.add("Mt. McKinley");
                arrayListAnswer.add("skin");
                arrayListAnswer.add("United States");
                arrayListAnswer.add("blood");
                arrayListAnswer.add("hydrogen and helium");
                arrayListAnswer.add("HTML");
                arrayListAnswer.add("Gypsum");
                arrayListAnswer.add("learning");
                arrayListAnswer.add("walked");
                arrayListAnswer.add("Homonym");
                arrayListAnswer.add("websites");
                arrayListAnswer.add("HTTP");
                arrayListAnswer.add("machine learning");
                arrayListAnswer.add("glass");
                arrayListAnswer.add("hyperlinks");

                for(String s : arrayList) {
                    if (s.equals(arrayListAnswer.get(i))) {
                        correct++;
                    }
                    i++;
                }
                Toast.makeText(MainActivity.this, "Correct Answer:"+correct, Toast.LENGTH_SHORT).show();

                Intent resultIntent=new Intent(MainActivity.this,ResultActivity.class);
                resultIntent.putExtra("correct",Integer.toString(correct));
                startActivity(resultIntent);
                arrayList.clear();
                arrayListAnswer.clear();
                correct=0;

            }
        });

//        start.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(MainActivity.this,StartQuiz.class);
//                startActivity(intent);
//            }
//        });
    }
}