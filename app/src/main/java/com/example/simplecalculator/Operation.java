package com.example.simplecalculator;

import android.text.TextUtils;

public class Operation {
    private String operationString;
    private int [] numbers;
    private String [] operators;
    //private TextUtils checkNumeric;

    public Operation (String operationString){

        this.operationString = operationString;
        numbers = obtainNumbers(this.operationString);
    }


    private int [] obtainNumbers(String inputString){
        //TODO: Check if there is a - in the beginig.
        //Calculate the number of numbers in the input string.
        int N = 100;
        boolean isFirstDigit = true;
        int [] numbers = new int[N];
        String currentNumber = "";

        //Array initialization
        for (int i = 0; i < N; i++){
              numbers[i] = 0;
        }

        for (int i = 0; i < inputString.length(); i++){
            currentNumber = currentNumber + inputString.charAt(i);
            if(!TextUtils.isDigitsOnly(currentNumber)){

            }

        }

      return numbers;
    }

    public double calculateResult(){
        double result = 0;

        return result;
    }

}
