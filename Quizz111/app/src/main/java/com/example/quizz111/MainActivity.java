package com.example.quizz111;

import static com.example.quizz111.R.string.quistation1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashSet;

public class MainActivity<quetationsIndex> extends AppCompatActivity {
    Button yesbtn;
    Button nobtn;
    Button anwer;
    TextView textView;
   ArrayList man = new ArrayList();





    Quetation[] quetations = {
            new Quetation(quistation1, true),
            new Quetation(R.string.quistation2, true),
            new Quetation(R.string.quistation3, false),
            new Quetation(R.string.quistation4, true),
            new Quetation(R.string.quistation5, false)

    };
    int quetationsIndex = 0;
      int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null)
            quetationsIndex = savedInstanceState.getInt("questionIndex");

        yesbtn = findViewById(R.id.yesBtn);
        nobtn = findViewById(R.id.Nobtn);
        textView = findViewById(R.id.textView);
        anwer = findViewById(R.id.answer);
        textView.setText(quetations[quetationsIndex].getQuetationText());
        String question = getString(quetations[quetationsIndex].getQuetationText());
        yesbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer(true);

                Int();
            }
        });
        nobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer(false);

                Int();
            }
        });
        anwer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Tah.class);

                intent.putExtra("answer", quetations[quetationsIndex].isAnswer());

                startActivity(intent);
            }
        });
    }

    public void checkAnswer(boolean btn) {
        if (quetations[quetationsIndex].isAnswer() && btn || (!quetations[quetationsIndex].isAnswer() && !btn)) {
            Toast.makeText(MainActivity.this, R.string.correct, Toast.LENGTH_SHORT).show();
            i++;
            String question = getString(quetations[quetationsIndex].getQuetationText());
            man.add("Вопрос: " + question + " Ваш ответ правильный "+"\n");


            Log.d("HHH1", String.valueOf(i));

        } else{
            Toast.makeText(MainActivity.this, R.string.inCorrect, Toast.LENGTH_SHORT).show();
            String question = getString(quetations[quetationsIndex].getQuetationText());
        man.add("Вопрос: " + question + " Ваш ответ неправильный "+"\n");
        Log.d("HHH", question);
    }
        quetationsIndex = (quetationsIndex + 1) % quetations.length;
            textView.setText(quetations[quetationsIndex].getQuetationText());
        }




        public void Int () {
            if (quetationsIndex >= quetations.length - 1) {


                Log.d("Maybe", String.valueOf(man));
                Intent intent = new Intent(MainActivity.this, Spisok.class);
                intent.putExtra("Mane", man);
                intent.putExtra("Vane", i);
             Log.d("fffff", String.valueOf(i));
                startActivity(intent);


            }

        }
        @Override
        protected void onSaveInstanceState (@NonNull Bundle savedInstanceState){
            super.onSaveInstanceState(savedInstanceState);
            savedInstanceState.putInt("CurrentIndex", quetationsIndex);
        }


    }




