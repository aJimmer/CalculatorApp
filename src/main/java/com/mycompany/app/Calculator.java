package com.mycompany.app;

public class Calculator
{
    private final String message = "Welcome to my Calculator App";

    public Calculator() {}

    public static void main(String[] args) {
        System.out.println(new Calculator().getMessage());
    }

    public boolean add(int firstNumber, int secondNumber) {
        return false;
    }
    private final String getMessage() {
        return message;
    }

}
