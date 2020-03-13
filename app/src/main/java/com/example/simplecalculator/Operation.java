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
        //TODO: Check if there is a - in the begining.
        //Calculate the number of numbers in the input string.

        int N = 100;
        int indexStartNumber = 0;
        int indexEndNumber = 0;
        int arrayPosition = 0;
        int [] numbers = new int[N];
        String currentNumber = "";

        for (int i = 0; i < N; i++){
              numbers[i] = 0;
        }

        for (int i = 0; i < inputString.length(); i++){
            currentNumber = currentNumber + inputString.charAt(i);
            if(!TextUtils.isDigitsOnly(currentNumber)){
                numbers[arrayPosition] = Integer.parseInt(currentNumber);
            }
            indexEndNumber = i;

        }

      return numbers;
    }

    public double calculateResult(){
        double result = 0;

        return result;
    }

}
