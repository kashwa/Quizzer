package com.example.android.quizzer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText first_answer = (EditText) findViewById(R.id.ans1);
        final EditText second_answer = (EditText) findViewById(R.id.ans2);
        final EditText third_answer = (EditText) findViewById(R.id.ans3);

        Button submit = (Button) findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // start intent on pressing submit
                // move data between activities.

                Intent intent = new Intent(MainActivity.this, Main2Activity.class
                );
                intent.putExtra("answer1", first_answer.getText().toString());
                intent.putExtra("answer2", second_answer.getText().toString());
                intent.putExtra("answer3", third_answer.getText().toString());
                //  start activity for result, INTENT, REQUESTCODE.
                startActivityForResult(intent, 7);
            }
        });

    }
}
