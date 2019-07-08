
package com.kgisl.kannan;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class OneTest{
   public static void main(String[] args){

   }
    @Test
    public  void test(){
        System.out.println("@Test");

    } 

    @Before
    public  void calculator(){
        System.out.println("@Before");

    } @After
    public  void after(){
        System.out.println("After");

    } 
    @BeforeClass
    public static void beforeClass(){
        System.out.println("@BeforeClass");

    } 
    @AfterClass
    public static void afterClass(){
        System.out.println("@AfterClass");

    }}