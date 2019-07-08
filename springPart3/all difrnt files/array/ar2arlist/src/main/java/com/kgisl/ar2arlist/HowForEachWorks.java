package com.kgisl.ar2arlist;
import java.util.*;
import java.util.Arrays;
import java.util.function.Consumer;
class HowForEachWorks1 {
    
 /*   public static void main(String[] args) {
    ArrayList list1=new ArrayList();
    List<Integer> numberList = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    for (Integer i : numberList) {
        if ((i & 1)==0) {
            System.out.println(i);
        }

    }
}

}  */

  public static void main(String[] args) {
       List<String> disneyCharacters = Arrays.asList("Micky", "Donald", "Minnie", "Aurora", "Winnie", "Pluto");

    //    Consumer<String> con = new Consumer<String>() {
    //        public void accept(String s) {
    //            System.out.println(s);
    //        }
    //    };   

       Consumer<String> con = s -> System.out.println(s);
        disneyCharacters.forEach(con);
    //    disneyCharacters.forEach(s->System.out.println(s));


       // call by method
      // disneyCharacters.forEach(System.out::println);

   }
}