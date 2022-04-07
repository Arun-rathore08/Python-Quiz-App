package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private String[] questions = {"Python was introduced in 1999?", "Founder of python is Guido Van Rassum?", "Python is a OOP language?",
    "Python doesn't have heap memory?", "Python is not use for Machine Learning?", "Python supports loops?", "Python is interpreted language?",
    "Tuple is mutable?", "Python's 'print' statement print the items on the screen?", "Python is created in India?"};
    private boolean[] answers = {false, true, true, false, false, true, true, false, true, false};
    private int score = 0;
    private int index = 0;
    Button yes;
    Button no;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        yes = findViewById(R.id.button7);
        no = findViewById(R.id.button8);
        textView = findViewById(R.id.textView5);
        textView.setText(questions[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index <= questions.length -1){
                    if (answers[index]==true){
                        score++;
                    }
                    index++;
                    if (index <= questions.length -1){
                        textView.setText(questions[index]);
                    }
                    else {
                        Toast.makeText(MainActivity2.this, "Your score is: "+ score + "/" + questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(MainActivity2.this, "To play again restart the app", Toast.LENGTH_SHORT).show();
                }
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index <= questions.length -1){
                    if (answers[index]==false){
                        score++;
                    }
                    index++;
                    if (index <= questions.length -1){
                        textView.setText(questions[index]);
                    }
                    else {
                        Toast.makeText(MainActivity2.this, "Your score is: "+ score + "/" + questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(MainActivity2.this, "To play again restart the app", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}