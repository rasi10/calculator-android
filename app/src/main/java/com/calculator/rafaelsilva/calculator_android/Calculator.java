package com.calculator.rafaelsilva.calculator_android;

/**
 * Created by Rafael Silva on 2016-04-24.
 */
public class Calculator {

    public double addition(double number1, double number2){
        return number1+number2;
    }

    public double subtraction(double number1, double number2){
        return number1-number2;
    }

    public double multiplication(double number1, double number2){
        return number1*number2;
    }

    public double division(double number1, double number2){
        if (number2==0){
            return -1.57222;
        }

        return number1/number2;
    }
}
