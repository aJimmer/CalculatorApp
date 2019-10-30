package com.mycompany.app;

public class Calculator
{
    private final String message = "Welcome to my Calculator";

    public Calculator() {}

    public double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public double subtract(double firstNumber, double secondNumber ) {
        return firstNumber - secondNumber;
    }

    public double divide(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    public double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    public double modulo(double firstNumber, double secondNumber) {
        return firstNumber % secondNumber;
    }
    
    private final String getMessage() {
        return message;
    }

    public static void main(String[] args) {
        System.out.println(new Calculator().getMessage());
    }
}
