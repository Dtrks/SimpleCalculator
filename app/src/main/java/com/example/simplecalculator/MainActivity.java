package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
    private Button  button1, button2, button3, button4, button5, button6, button7, buttonComma,
            button8, button9, button0, buttonEqual, buttonSum, buttonSubtract, buttonMultiply, buttonDivide;
    private String operation= "";
    private String screetText;
    private boolean firstButton = true;
    private TextView mScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declaration of all the widgets.
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

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = operation + "0";
                mScreen.setText(operation);
                firstButton = false;
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = operation + "1";
                mScreen.setText(operation);
                firstButton = false;
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = operation + "2";
                mScreen.setText(operation);
                firstButton = false;
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = operation + "3";
                mScreen.setText(operation);
                firstButton = false;
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = operation + "4";
                mScreen.setText(operation);
                firstButton = false;
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = operation + "5";
                mScreen.setText(operation);
                firstButton = false;
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = operation + "6";
                mScreen.setText(operation);
                firstButton = false;
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = operation + "7";
                mScreen.setText(operation);
                firstButton = false;
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = operation + "8";
                mScreen.setText(operation);
                firstButton = false;
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = operation + "9";
                mScreen.setText(operation);
                firstButton = false;
            }
        });

        buttonComma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(firstButton){
                Toast.makeText(getApplicationContext(), "Invalid operation", Toast.LENGTH_SHORT).show();
            }
            }
        });

        buttonSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstButton){
                    Toast.makeText(getApplicationContext(), "Invalid operation", Toast.LENGTH_SHORT).show();
                }else{
                    operation = operation + "+";
                    mScreen.setText(operation);
                }

            }
        });
        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstButton){
                    Toast.makeText(getApplicationContext(), "Invalid operation", Toast.LENGTH_SHORT).show();
                }

            }
        });
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstButton){
                    Toast.makeText(getApplicationContext(), "Invalid operation", Toast.LENGTH_SHORT).show();
                }

            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstButton){
                    Toast.makeText(getApplicationContext(), "Invalid operation", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    public double calculateResult(String text){
        // Example imput: text = "12+56+8/78*2-7
        // numbers matrix = [12, 56, 8, 78, 2, 7]
        // operations array = [+, +, /, * ,-]
        Operation myOperation = new Operation (text);
        return myOperation.calculateResult();
    }
}
