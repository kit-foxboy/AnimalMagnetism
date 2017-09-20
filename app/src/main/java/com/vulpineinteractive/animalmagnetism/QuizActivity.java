package com.vulpineinteractive.animalmagnetism;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Collections;

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
        Collections.shuffle(mQuestions);

        //TODO: present questions sequentially
        //TODO: take user input and move to next question
        //TODO: take all input and transition to the results activity
    }


    //class methods
    private void setupQuestions()
    {
        //create questions
        String[] dogQuestions = {
                getString(R.string.canine1),
                getString(R.string.canine2),
                getString(R.string.canine3),
                getString(R.string.canine4),
                getString(R.string.canine5)
        };

        String[] catQuestions = {
                getString(R.string.cat1),
                getString(R.string.cat2),
                getString(R.string.cat3),
                getString(R.string.cat4),
                getString(R.string.cat5)
        };

        String[] dolphinQuestions = {
                getString(R.string.dolphin1),
                getString(R.string.dolphin2),
                getString(R.string.dolphin3),
                getString(R.string.dolphin4),
                getString(R.string.dophin5)
        };

        String[] birdQuestions = {
                getString(R.string.bird1),
                getString(R.string.bird2),
                getString(R.string.bird3),
                getString(R.string.bird4),
                getString(R.string.bird5)
        };

        String[] reptileQuestions = {
                getString(R.string.reptile1),
                getString(R.string.reptile2),
                getString(R.string.reptile3),
                getString(R.string.reptile4),
                getString(R.string.reptile5)
        };

        //build objects
        QuizAnimal dog = new QuizAnimal(
            getString(R.string.dogName),
            getString(R.string.dogDesc),
            "doggo",
            dogQuestions
        );

        QuizAnimal cat = new QuizAnimal(
                getString(R.string.catName),
                getString(R.string.catDesc),
                "kitty",
                catQuestions
        );

        QuizAnimal dolphin = new QuizAnimal(
                getString(R.string.dolphinName),
                getString(R.string.dolphinDesc),
                "dolphin",
                dolphinQuestions
        );

        QuizAnimal bird = new QuizAnimal(
                getString(R.string.birdName),
                getString(R.string.birdDesc),
                "birb",
                birdQuestions
        );

        QuizAnimal reptile = new QuizAnimal(
                getString(R.string.reptileName),
                getString(R.string.reptileDesc),
                "reptile",
                dogQuestions
        );

        //init spinner
        Spinner answer = (Spinner) findViewById(R.id.answerSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.answersArray, android.R.layout.select_dialog_item);
        answer.setAdapter(adapter);
    }
}
