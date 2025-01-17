package com.mycompany.app;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;

public class CalculatorTest
{

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testCalculatorConstructor() {
        try {
            new Calculator();
        } catch (Exception e) {
            fail("Construction failed.");
        }
    }

    @Test
    public void testAddOperation() {
        Calculator calc = new Calculator();
        double result = calc.makeCalculation(6.0, 2.0, '+');
        assertEquals(8.0, result, 0.0f);
    } 

    @Test
    public void testSubtractOperation() {
        Calculator calc = new Calculator();
        double result = calc.makeCalculation(6.0, 2.0, '-');
        assertEquals(4.0, result, 0.0f);
    }

    @Test
    public void testDivideOperation() {
        Calculator calc = new Calculator();
        double result = calc.makeCalculation(6.0, 2.0, '/');
        assertEquals(3.0, result, 0.0f);
    }

    @Test
    public void testMultiplyOperation() {
        Calculator calc = new Calculator();
        double result = calc.makeCalculation(6.0, 2.0, '*');
        assertEquals(12.0, result, 0.0f);
    }

    @Test
    public void testModuloOperation() {
        Calculator calc = new Calculator();
        double result = calc.makeCalculation(6.0, 2.0, '%');
        assertEquals(0.0, result, 0.0f);
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

}
