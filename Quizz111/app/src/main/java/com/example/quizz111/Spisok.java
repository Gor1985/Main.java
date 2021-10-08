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

    quetations[] quetations = {
            new quetations(R.string.quistation1, true),
            new quetations(R.string.quistation2, true),
            new quetations(R.string.quistation3, false),
            new quetations(R.string.quistation4, true),
            new quetations(R.string.quistation5, false)

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spisok);
        TextView textView = findViewById(R.id.textView3);


     ArrayList gan = (ArrayList) getIntent().getSerializableExtra("Mane");

        // ArrayList van = (ArrayList) getIntent().getSerializableExtra("Vane");

      //textView.setText(gan.toString());

                    Log.d("Maga", gan+ "\n");

                // textView.setText(van + "\n");
            }
        }


//}
  


       // for (Object lane : van) {
          //  textView.append("\n" + van);


