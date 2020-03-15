package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //TODO:
    //*****************************
    // - Implement comma function
    // - Parenthesis
    // - Clean the damn code!
    // - Improve ans operation
    // - Fix huge numbers bug


    private Button  button1, button2, button3, button4, button5, button6, button7, buttonComma,
            button8, button9, button0, buttonEqual, buttonSum, buttonSubtract, buttonMultiply, buttonDivide,
            buttonSqrt, buttonReset, buttonElevate;
    private String operation= "";
    private String previusOperation = "";
    private boolean firstButton = true;
    private TextView mScreen, mSreenHistoric;
    private double result, ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize everything
        initializeEverything();

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeScreen('0', true);
                Log.d("Calculator", "0 pressed.");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeScreen('1', true);
                Log.d("Calculator", "1 pressed.");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
                      @Override
                      public void onClick(View v) {
                          writeScreen('2', true);
                          Log.d("Calculator", "2 pressed.");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeScreen('3', true);
                Log.d("Calculator", "3 pressed.");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeScreen('4', true);
                Log.d("Calculator", "4 pressed.");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeScreen('5', true);
                Log.d("Calculator", "5 pressed.");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeScreen('6', true);
                Log.d("Calculator", "6 pressed.");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeScreen('7', true);
                Log.d("Calculator", "7 pressed.");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeScreen('8', true);
                Log.d("Calculator", "8 pressed.");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeScreen('9', true);
                Log.d("Calculator", "9 pressed.");
            }
        });

        buttonComma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeScreen('.', false);
                Log.d("Calculator", "Comma pressed.");
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(firstButton){
                Toast.makeText(getApplicationContext(), "Invalid operation", Toast.LENGTH_SHORT).show();
            }else{
                result = calculateResult(operation);
                ans = result;
                mScreen.setText(String.valueOf(result));
                setPreviusOperation(operation);
                prepareNextOperation();
            }
            }
        });

        buttonSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeScreen('+', false);
                Log.d("Calculator", "+ pressed.");
            }


        });
        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeScreen('-', false);
                Log.d("Calculator", "- pressed.");
            }
        });
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeScreen('/',false);
                Log.d("Calculator", "/ pressed.");
                }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeScreen('*', false);
                Log.d("Calculator", "* pressed.");
            }
        });

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                Log.d("Calculator", "Screen cleared. ");
            }
        });

        buttonElevate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeScreen('^', false);
                Log.d("Calculator", "^ pressed");
                }
        });

    }

    private void writeScreen(char c, boolean itsNumber){
        //itsNumber: t = numeric, f = operation

        if (itsNumber = false) {
            if (firstButton & c != '-') {
                Toast.makeText(getApplicationContext(), "Invalid operation", Toast.LENGTH_SHORT).show();
            }else{
                operation = operation + c;
                mScreen.setText(operation);
            }
        }else{
            if (firstButton){
                firstButton = false;
            }
            operation = operation + c;
            mScreen.setText(operation);
        }
    }

    private void setPreviusOperation(String operation){
        mSreenHistoric.setText(operation + "=");
    }

    private void clearScreen(){
        operation = "";
        firstButton = true;
        mScreen.setText(R.string.defaultScreen);
    }

    private void prepareNextOperation() {
        //Clears screen and initializes indicators.
        operation = String.valueOf(ans);
        //firstButton = true;
    }

    public double calculateResult(String text){
        //Calls a function which converts the string into an arithmetic expression.
        Log.d("Calculator", "calculateResult() called...");
        double result = 0;

        ArithmeticEvaluator eval = new ArithmeticEvaluator(text);
        result = eval.evaluate();

        Log.d("Calculator", "Input string: " + text);
        Log.d("Calculator", "Result: " + result);


        return result;
    }

    public void initializeEverything(){
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonComma = findViewById(R.id.buttonComma);
        buttonEqual = findViewById(R.id.buttonEqual);
        buttonSum = findViewById(R.id.buttonSum);
        buttonSubtract = findViewById(R.id.buttonSubtract);
        buttonMultiply = findViewById(R.id.buttonMulti);
        buttonDivide = findViewById(R.id.buttonDivide);
        mScreen = findViewById(R.id.mScreen);
        buttonElevate = findViewById(R.id.buttonElevate);
        buttonSqrt = findViewById(R.id.buttonSqrt);
        buttonReset = findViewById(R.id.buttonReset);
        mSreenHistoric = findViewById(R.id.mScreenHistoric);
    }
}
