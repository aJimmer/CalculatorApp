package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalclulatorTest
{
    @Test
    public void testCalculatorConstructor() {
        try {
            new Calculator();
        } catch (Exception e) {
            fail("Construction failed.");
        }
    }
}