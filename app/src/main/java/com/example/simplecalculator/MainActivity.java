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
    private String operation, screetText;
    private boolean firstButton = true;

    TextView mScreen;
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

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

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
        double result= 0;



        return result;
    }
}
