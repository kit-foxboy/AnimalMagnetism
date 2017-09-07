package com.vulpineinteractive.animalmagnetism;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.ArrayList;

import data.QuizAnimal;

public class QuizActivity extends AppCompatActivity
{
    //class methods
    ArrayList mQuestions = new ArrayList();

    //override class methods
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //call parent
        super.onCreate(savedInstanceState);

        //assign content
        setContentView(R.layout.activity_quiz);

        //setup questions
        this.setupQuestions();
    }


    //class methods
    private void setupQuestions()
    {
        String[] questions = {
                "I value my friends and family above all else.",
                "Road trips are the best!"
        };

        QuizAnimal dog = new QuizAnimal(
            "canine",
            "Loyal, trustworthy and above all: Everyone's best friend.",
            "doggo",
            false,
            questions
        );

        boolean test = mQuestions.add(dog);
        Log.i("test", Boolean.toString(test));
    }
}
