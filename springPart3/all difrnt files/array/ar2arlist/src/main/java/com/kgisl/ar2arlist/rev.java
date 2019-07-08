// package com.kgisl.ar2arlist;
// import java.util.Scanner;

// class rev{
//   void hi() {

//  for(int i=0;i<3;i++){
//        Scanner s = new Scanner(System.in);
//        System.out.println("enter 1st value");
//        float a1 =s.nextInt();  System.out.println("enter 2nd  value");
//        float b1= s.nextInt(); System.out.println("enter your operations");
//        String o= s.next();
//        switch(o){
//            case "+": System.out.println("add :"+a1+b1);   break;
//            case "-": System.out.println("sub: "+(a1-b1));   break;
//            case "/": System.out.println("div: "+a1/b1);   break;
//            case "*": System.out.println("multi: :"+a1*b1);   break;
             
//             default: {rev r= new rev(); }
//             }
//                break;
//              }
           
//             }
      

           
//            public static void main(String[] args){
//                rev h= new rev();
//                h.hi();

//            }
//        }

    




package com.kgisl.ar2arlist;
import java.util.Scanner;

class rev{
 void hi() {

for(int i=0;i<3;i++){
      Scanner s = new Scanner(System.in);
      System.out.println("enter 1st value");
      float a1 =s.nextInt();  System.out.println("enter 2nd  value");
      float b1= s.nextInt(); System.out.println("enter your operations");
      String o= s.next();
      switch(o){
          case "+": System.out.println("add :"+a1+b1);   break;
          case "-": System.out.println("sub: "+(a1-b1));   break;
          case "/": System.out.println("div: "+a1/b1);   break;
          case "*": System.out.println("multi: :"+a1*b1);   break;

                default: {rev r= new rev(); }
            }
            break;
      }


          }
          public static void main(String[] args){
              rev h= new rev();
              h.hi();

          }
      }