package com.example.android.quizzer;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView result = (TextView) findViewById(R.id.result);
        TextView answer1 = (TextView) findViewById(R.id.act_ans1);
        TextView answer2 = (TextView) findViewById(R.id.act_ans2);
        TextView answer3 = (TextView) findViewById(R.id.act_ans3);

        Intent intent2 = getIntent();
        // Now, get the answers from the first intent,
        // save each answer into a string variable.
        String first = intent2.getStringExtra("answer1");
        String second = intent2.getStringExtra("answer2");
        String third = intent2.getStringExtra("answer3");
        // Now, set for each Question its answer.
        // We need some logic for making colors and etcetera.
        if (first.equals("answer1")){
            // if answer is right
            answer1.setText(first);
            answer1.setTextColor(Color.GREEN);
        } else {
            // if answer is wrong
            answer1.setText(first);
            answer1.setTextColor(Color.RED);
        }

        if (second.equals("answer2")){
            answer2.setText(second);
            answer2.setTextColor(Color.GREEN);
        } else {
            answer2.setText(second);
            answer2.setTextColor(Color.RED);
        }

        if (third.equals("answer3")){
            answer3.setText(third);
            answer3.setTextColor(Color.GREEN);
        }else {
            answer3.setText(third);
            answer3.setTextColor(Color.RED);
        }

        /**
         * Set the Result of the user.
         */
        int quiz = 0;
        String res1 = answer1.getText().toString();
        String res2 = answer2.getText().toString();
        String res3 = answer3.getText().toString();

        if (res1.equals("answer1"))
            quiz+=1;
        if (res2.equals("answer2"))
            quiz+=1;
        if (res3.equals("answer3"))
            quiz+=1;

        String mark = String.valueOf(quiz);
        result.setText(mark+"/3");
    }
}
