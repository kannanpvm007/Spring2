package com.kgisl.calculator1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
    Calculator cc = new Calculator();

    @Test
    public void addTest() {
        int actual = cc.add(10, 20);
        int expected = 30;
        assertEquals(expected, actual);
        System.out.println("Add TestRun");
   }

    @Test
    public void subTest() {
        int actual = cc.sub(10, 20);
        int expected = -10;
        assertEquals(expected, actual);
        System.out.println("    subTestRun");
    }

    @Test
    public void mulTest() {
        int actual = cc.mul(10, 20);
        int expected = 200;
        assertEquals(expected, actual);
        System.out.println("      mul TestRun");
    }

    @Test
    public void divTest() {
        int actual = cc.div(100, 20);
        int expected = 5;
        assertEquals(expected, actual);
        System.out.println("            Div TestRun");
    }

}