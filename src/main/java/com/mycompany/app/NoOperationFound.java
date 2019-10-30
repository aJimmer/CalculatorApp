package com.mycompany.app;

import java.util.InputMismatchException;

public class NoOperationFound implements Operation {
    private char sign;
    NoOperationFound(char sign) {
        this.sign = sign;
    }

    public double calculateResult(double left, double right) {
        throw new InputMismatchException("Invalid operator sign: " + sign);
    }
}
