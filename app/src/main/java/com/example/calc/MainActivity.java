package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView FirstNumber;
    TextView SecondNumber;
    TextView Result;

    Button zero;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button plus;
    Button minus;
    Button multiply;
    Button divide;
    Button clear;
    Button equals;

    String act;
    boolean fnum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirstNumber = findViewById(R.id.FirstNumber);
        SecondNumber = findViewById(R.id.SecondNumber);
        Result = findViewById(R.id.Result);

        zero = findViewById(R.id.zero);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        clear = findViewById(R.id.clear);
        equals = findViewById(R.id.equals);

        zero.setOnClickListener(this);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        multiply.setOnClickListener(this);
        divide.setOnClickListener(this);
        clear.setOnClickListener(this);
        equals.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.zero:
            case R.id.one:
            case R.id.two:
            case R.id.three:
            case R.id.four:
            case R.id.five:
            case R.id.six:
            case R.id.seven:
            case R.id.eight:
            case R.id.nine:
                Button button = (Button) view;
                String numText;
                if(fnum)
                {
                    numText = FirstNumber.getText().toString();
                    numText+=button.getText().toString();
                    FirstNumber.setText(numText);
                }
                else {
                    numText = SecondNumber.getText().toString();
                    numText+=button.getText().toString();
                    SecondNumber.setText(numText);
                }
                break;
            case R.id.plus:

            case R.id.minus:

            case R.id.multiply:

            case R.id.divide:
                Button button1=(Button) view;
                if(act==button1.getText().toString())
                {
                    act=button1.getText().toString();
                    if(fnum)
                    {
                        fnum=!fnum;
                    }
                }
                else{
                    fnum=!fnum;
                }
                break;
            case R.id.clear:
                break;
            case R.id.equals:
                float num1 = Float.valueOf(FirstNumber.getText().toString());
                float num2 = Float.valueOf(SecondNumber.getText().toString());
                float res=num1+num2;
                Result.setText(String.valueOf(res));
                break;
        }
    }
}