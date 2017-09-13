package com.vulpineinteractive.animalmagnetism;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class QuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //call parent and init view
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        //init spinner
        Spinner answer = (Spinner) findViewById(R.id.answerSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.answersArray, android.R.layout.select_dialog_item);
        answer.setAdapter(adapter);
    }
}
