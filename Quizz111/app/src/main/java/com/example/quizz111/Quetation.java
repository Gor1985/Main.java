package com.example.quizz111;

public class Quetation {
    private int QuetationText;
    private boolean answer;


    public Quetation(int quetationText, boolean answer) {
        QuetationText = quetationText;
        this.answer = answer;
    }
    public int getQuetationText() {
        return QuetationText;
    }

    public boolean isAnswer() {
        return answer;
    }



    }


