package com.example.quizz111;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Tah extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tah);

        TextView answer = (TextView) findViewById(R.id.textView2);
        Intent intent = getIntent();
        boolean answer1 = intent.getBooleanExtra("answer", true);

        if (answer1 == true) {

            answer.append(" да");
        } else {

            answer.append("нет");

        }
    }
}