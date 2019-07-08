package com.kgisl.ar2arlist;

import java.util.*;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class A2al 
{
    public static void main( String[] args )
    {
    
   String kgislemp[] ={"kanna","kavin","gowtham","banu","uma"};
//  for (String i;i<kgislemp- ;i++) {
//      System.out.println(i);
       
//   }
//=============i type============
// List <String> h= new ArrayList<String>(Arrays.asList(kgislemp));

// h.add("devi");
// h.add("giri");


//==========ii type============

  //List l = Arrays.asList(kgislemp);

  //============= iii type========
  List <String> h= new ArrayList<String>();
     Collections.addAll(h, kgislemp);

  h.add("devi");
  h.add("giri");
  
  System.out.println("array list"+h);


    }
}
