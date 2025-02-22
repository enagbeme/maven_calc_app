package com.enagbem;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void testAddition() {
        assertEquals(5.0, add(2.0, 3.0), 0);
    }

    @Test
    public void testSubtraction() {
        assertEquals(1.0, subtract(3.0, 2.0), 0);
    }

    @Test
    public void testMultiplication() {
        assertEquals(6.0, multiply(2.0, 3.0), 0);
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, divide(6.0, 3.0), 0);
    }

    private double add(double a, double b) {
        return a + b;
    }

    private double subtract(double a, double b) {
        return a - b;
    }

    private double multiply(double a, double b) {
        return a * b;
    }

    private double divide(double a, double b) {
        if (b == 0) throw new IllegalArgumentException("Division by zero");
        return a / b;
    }
}