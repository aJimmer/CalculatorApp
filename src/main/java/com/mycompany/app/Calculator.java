package com.mycompany.app;

import java.util.HashMap;
import java.util.Map;

public class Calculator
{
    private final String message = "Welcome to my Calculator App";
    private Map<Character, Operation> operationMap = new HashMap();
    
    public Calculator() {
        operationMap.put('+', new Addition());
        operationMap.put('-', new Subtraction());
        operationMap.put('*', new Multiplication());
        operationMap.put('/', new Division());
        operationMap.put('%', new Modulos());
    }

    public double makeCalculation(double operand1, double operand2, char operation) {
        Operation operationMapValue = operationMap.getOrDefault(operation, new NoOperationFound(operation));
        return operationMapValue.calculateResult(operand1, operand2);
    }
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
        // Create by Angel Jimenez
        System.out.println(new Calculator().getMessage());
        System.out.println(new Calculator().makeCalculation(12.0, 2.0, '+'));
        System.out.println(new Calculator().makeCalculation(12.0, 2.0, '-'));
        System.out.println(new Calculator().makeCalculation(12.0, 2.0, '*'));
        System.out.println(new Calculator().makeCalculation(12.0, 2.0, '/'));
        System.out.println(new Calculator().makeCalculation(12.0, 2.0, '%'));
    }
}
