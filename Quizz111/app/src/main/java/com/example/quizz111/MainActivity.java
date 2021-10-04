package com.example.quizz111;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button yesbtn;
    Button nobtn;
    TextView textView;
    Quetation[] quetations = {
            new Quetation(R.string.quistation1, true),
            new Quetation(R.string.quistation2, true),
            new Quetation(R.string.quistation3, false),
            new Quetation(R.string.quistation4, true),
            new Quetation(R.string.quistation5, false)

    };
    int quetationsIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState!=null)
        quetationsIndex=savedInstanceState.getInt("CurrentIndex",0);
        textView = findViewById(R.id.textView);
        textView.setText(quetations[quetationsIndex].getQuetationText());


        yesbtn = findViewById(R.id.yesBtn);

        yesbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (quetations[quetationsIndex].isAnswer())
                Toast.makeText(MainActivity.this, R.string.correct, Toast.LENGTH_SHORT).show();
        else
                    Toast.makeText(MainActivity.this, R.string.inCorrect, Toast.LENGTH_SHORT).show();
                    quetationsIndex = (quetationsIndex + 1) % quetations.length;
                    textView.setText(quetations[quetationsIndex].getQuetationText());

            }
        });

        nobtn = findViewById(R.id.Nobtn);
        nobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!quetations[quetationsIndex].isAnswer() )
                Toast.makeText(MainActivity.this, R.string.correct, Toast.LENGTH_SHORT).show();
        else
                    Toast.makeText(MainActivity.this, R.string.inCorrect, Toast.LENGTH_SHORT).show();
                    quetationsIndex = (quetationsIndex + 1) % quetations.length;
                    textView.setText(quetations[quetationsIndex].getQuetationText());
            }

        });
                                 }





    @Override
   protected void onSaveInstanceState(@NonNull Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("CurrentIndex",quetationsIndex);
    }
}





