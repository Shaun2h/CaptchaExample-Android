package com.example.user.captchatest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView mathCaptcha;
    ImageView textCaptcha;
    EditText mathAns;
    EditText textAns;
    Button mathSubmit;
    Button textSubmit;
    Text texttest;
    Mathtest mathtest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mathCaptcha = findViewById(R.id.mathimage);
        textCaptcha = findViewById(R.id.textimage);
        mathAns = findViewById(R.id.mathans);
        textAns = findViewById(R.id.textans);
        mathSubmit = findViewById(R.id.mathSubmit);
        textSubmit = findViewById(R.id.textSubmit);
        //identifiers here

        texttest = new Text(600, 150, 4, Text.TextOptions.UPPERCASE_ONLY);
        //WIDTH - obvious
        //Height - obvious
        //WORD LENGTH - obvious
        //OPTIONS: "UPPERCASE_ONLY","LOWERCASE_ONLY","NUMBERS_ONLY","LETTERS_ONLY" ,"NUMBERS_AND_LETTERS"

        mathtest = new Mathtest(600,150,Mathtest.MathOptions.PLUS_MINUS_MULTIPLY);
        //WIDTH - obvious
        //Height - obvious
        //OPTIONS: "PLUS_MINUS_MULTIPLY" or "PLUS_MINUS"

        mathCaptcha.setImageBitmap(mathtest.getImage());
        textCaptcha.setImageBitmap(texttest.getImage());


        textSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!texttest.checkAnswer(textAns.getText().toString().trim())) {
                    textAns.setError("Incorrect answer.");
                } else {
                    //put a boolean flag here to tell us if robot or not i guess.
                    Toast.makeText(getApplicationContext(),"Match found! (TEXT)",Toast.LENGTH_SHORT).show();
                }
            }
        });

        mathSubmit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (!mathtest.checkAnswer(mathAns.getText().toString().trim())) {
                    mathAns.setError("Incorrect answer.");
                } else {
                    //put a boolean flag here to tell us if robot or not i guess.
                    Toast.makeText(getApplicationContext(),"Match found! (MATH)",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
