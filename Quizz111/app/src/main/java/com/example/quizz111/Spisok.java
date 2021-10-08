package com.example.quizz111;

import static com.example.quizz111.R.string.quistation1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashSet;

public class Spisok extends AppCompatActivity {






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spisok);
        TextView textView = findViewById(R.id.textView3);
          TextView textView1=findViewById(R.id.textView4);

     ArrayList gan = (ArrayList) getIntent().getSerializableExtra("Mane");

     String man= String.valueOf(getIntent().getIntExtra("Vane",0));

      textView.setText(gan.toString()+"\n");
      textView1.setText("Количество правильных ответов: "+man);

                    Log.d("Maga", man+"");

                // textView.setText(van + "\n");
            }
        }


//}
  


       // for (Object lane : van) {
          //  textView.append("\n" + van);


