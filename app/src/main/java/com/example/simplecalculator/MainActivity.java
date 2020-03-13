package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
    private Button  button1, button2, button3, button4, button5, button6, button7, buttonComma,
            button8, button9, button0, buttonEqual, buttonSum, buttonSubtract, buttonMultiply, buttonDivide,
            buttonSqrt, buttonReset, buttonElevate;
    private String operation= "";
    //private String screetText;
    private boolean firstButton = true;
    private TextView mScreen;
    private double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize everything
        initializeEverything();

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = operation + "0";
                mScreen.setText(operation);
                firstButton = false;
                Log.d("Calculator", "0 pressed.");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = operation + "1";
                mScreen.setText(operation);
                firstButton = false;
                Log.d("Calculator", "1 pressed.");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = operation + "2";
                mScreen.setText(operation);
                firstButton = false;
                Log.d("Calculator", "2 pressed.");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = operation + "3";
                mScreen.setText(operation);
                firstButton = false;
                Log.d("Calculator", "3 pressed.");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = operation + "4";
                mScreen.setText(operation);
                firstButton = false;
                Log.d("Calculator", "4 pressed.");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = operation + "5";
                mScreen.setText(operation);
                firstButton = false;
                Log.d("Calculator", "5 pressed.");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = operation + "6";
                mScreen.setText(operation);
                firstButton = false;
                Log.d("Calculator", "6 pressed.");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = operation + "7";
                mScreen.setText(operation);
                firstButton = false;
                Log.d("Calculator", "7 pressed.");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = operation + "8";
                mScreen.setText(operation);
                firstButton = false;
                Log.d("Calculator", "8 pressed.");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = operation + "9";
                mScreen.setText(operation);
                firstButton = false;
                Log.d("Calculator", "9 pressed.");
            }
        });

        buttonComma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //TODO...
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(firstButton){
                Toast.makeText(getApplicationContext(), "Invalid operation", Toast.LENGTH_SHORT).show();
            }else{
                result = calculateResult(operation);
                //TODO: Poner resultado en pantalla de forma bonita
                mScreen.setText(String.valueOf(result));
                clearSreen();
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
                    Log.d("Calculator", "+ pressed.");
                }

            }
        });
        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    operation = operation + "-";
                    mScreen.setText(operation);
                    firstButton = false;
                    Log.d("Calculator", "- pressed.");
                    }
        });
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstButton){
                    Toast.makeText(getApplicationContext(), "Invalid operation", Toast.LENGTH_SHORT).show();
                }else{
                    operation = operation + "/";
                    mScreen.setText(operation);
                    firstButton = false;
                    Log.d("Calculator", "/ pressed.");
                }

            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstButton){
                    Toast.makeText(getApplicationContext(), "Invalid operation", Toast.LENGTH_SHORT).show();
                }else{
                    operation = operation + "*";
                    mScreen.setText(operation);
                    firstButton = false;
                    Log.d("Calculator", "* pressed.");
                }
            }
        });
    }

    private void clearSreen() {
        //Clears screen and initializes indicators.
        operation = "";
        firstButton = true;
    }

    public double calculateResult(String text){
        //Calls a function which converts the string into an arithmetic expression.

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
    }

    /*public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }*/
}
