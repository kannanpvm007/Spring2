package com.kgisl.ar2arlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class Lambda {
   public static void main(String[] args) {

       List<Integer> numberList = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

       Predicate<Integer> odd=new Predicate<Integer>() {
         @Override
         
           public boolean test(Integer t) {
               return t%2!=0;
           }
       };

       // Predicate<Integer> odd=x->x%2!=0;
       // Predicate<Integer> even=x->x%2==0;

       numberList.stream().filter(odd).forEach(System.out::println);
       numberList.stream().filter(odd.negate()).forEach(System.out::println);
   }


}