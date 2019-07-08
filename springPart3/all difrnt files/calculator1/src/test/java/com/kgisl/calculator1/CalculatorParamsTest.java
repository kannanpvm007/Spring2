package com.kgisl.calculator1;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculatorParamsTest {
    private int fn;
    private int sn;
    Calculator c = new Calculator();

    public CalculatorParamsTest(int fn, int sn) {
        this.fn = fn;
        this.sn = sn;
    }

    @Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][] { { 10, 20 }, { 30, 40 } });
        // ArrayList<Integer> obj = new ArrayList<Integer>();
        // obj.add(30);obj.add(20);obj.add(40);obj.add(10);
        // return ArrayList.asList(obj);
    }
    @Test
     public void addTest(){
         int actual =c.add(fn,sn);
         int expected=fn+sn;
         assertEquals(actual, expected);
         System.out.println("add run");
     }
     @Test
     public void subTest(){
         int actual =c.sub(fn, sn);
         int  expected = fn-sn;
         assertEquals(actual, expected);
         System.out.println("sub run");
     }
     @Test
     public void mulTest(){
         int actual =c.mul(fn, sn);
         int expected =fn*sn;
         assertEquals(actual,expected);
         System.out.println("mul run");
     }
     @Test
     public void divTest(){
         int actual =c.div(fn, sn);
         int expected =fn/sn;
         assertEquals(expected, actual);
         System.out.println("div run");
         System.out.println(sn+"sn values");
     }
     
}