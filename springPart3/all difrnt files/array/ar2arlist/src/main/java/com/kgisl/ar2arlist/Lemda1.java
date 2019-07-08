package com.kgisl.ar2arlist;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Lemda1 {
  public static void main(String[] args) {
    List<Person> per = Arrays.asList(
      new Person("kannan", 23),
       new Person("kavin", 45), 
     new Person("kavin", 45), 
    new Person("tamil", 45),
        new Person("raj", 66));
    per.stream().min(Comparator.comparing(Person::getAge)).ifPresent(p -> System.out.println(p));
    System.out.println("\n filter\n_____________________________");
    // filter

   List<Person> f1 =per.stream().filter(s -> s.getName().startsWith("r")).collect(Collectors.toList());
   f1.stream().forEach(System.out::println);  
   //System.out.println(f1);

   System.out.println("count\n________________________");
    long c= per.stream().filter(h-> h.getName().endsWith("n")).count();
    System.out.println(c);

  // skip(2) means take vales without frist 2 values 
    System.out.println("skip\n_____________________________");
    per.stream().skip(2).forEach(System.out::println);


    System.out.println("\n distinct\n_______________________");
    // hear map is one of stream method, not collaction methd
      /* distinct is Ex. kannan 23, kannan 25, raja 33, so kannan is 2 time ,
       select comman one kannan

    */
     List<String> dis =per.stream().map(Person::getName)
     .distinct().collect(Collectors.toList());
     dis.forEach(System.out::println);


     System.out.println("\n limt \n_______________________");
     // limt only print frist 3 elemnts
     per.stream().limit(3).forEach(System.out::println);

     System.out.println("\n ALLmathch\n_______________________");
     // given allvalue r true return true
     boolean b1 = per.stream().allMatch(am -> am.getName().startsWith("k") && am.getAge() <23 );
     System.out.println(b1);

     System.out.println("\n anymathch\n_______________________");
     // given "anyvalue" one  r true return true
     boolean b2 = per.stream().anyMatch(am -> am.getName().startsWith("k") && am.getAge() <=23 );
     System.out.println(b2);
     System.out.println("\n nonemathch\n_______________________");
                   // given anyvalue r false return true
                   // given to contion are most be difrent

     boolean b3 = per.stream().noneMatch(am -> am.getName()
                   .startsWith("z") && am.getAge() <=99 );
                   System.out.println(b3);

                   System.out.println("\n string \n_______________________");
       // string reduce
       // print all values join with hai
       String hi[]={"this","kannan","from","thanjur"};
       String out =Arrays.stream(hi).reduce("hai  ", (a,b)->a+b);
       System.out.print("String reduce      "+out);

       int helo[] ={5,15,25,225};
       // hear add the vales o/p is 275
         int  out1 = Arrays.stream(helo).reduce(5, (a,b) -> a + b);
         System.out.println("number reduce      "+out1);

         System.out.println("\n optional \n_______________________");

         // find any but most of take 1 value;
       Optional <Person> o1= per.stream().filter(emp -> emp.getAge()>30).findAny();
       if(o1.isPresent()) {
            System.out.println(o1.get());
       }
      
       Optional <Person> o2= per.stream().filter(hq -> hq.getAge()>20).findFirst();{
       System.out.println(o2.get());
       }
       System.out.println("\n Sort \n_______________________");
       // print all values in A-Z

       List <Person> sorting1 = per.stream().sorted(Comparator
        .comparing(Person::getName)).collect(Collectors.toList());
        sorting1.forEach(System.out::println);

        System.out.println("\n peek \n_______________________"); // need expin
        List <Integer> l1 = Arrays.asList(5,99,4,3,2);
        l1.stream().peek(i->System.out.println(i*5)).collect(Collectors.toList());     


        System.out.println("\n  map \n_______________________");
        List <String> m1= per.stream().map(Person::getName).collect(Collectors.toList());
        m1.forEach(System.out::println);
        
        System.out.println("\n  map to Double \n_______________________");
        double sum2 = per.stream().mapToDouble(Person::getAge).sum();
        System.out.println(sum2);

        // maptolong
        System.out.println("\n  map to Double \n_______________________");
    long sum3 = per.stream().mapToLong(Person::getAge).sum();
    System.out.println(sum3);


    System.out.println("\n  map to average\n_______________________");
     // average
  double sum4 = per.stream().mapToDouble(Person::getAge).average().getAsDouble();
    System.out.println(sum4);
    System.out.println("\n  map to collect\n_______________________");
     // collect
     List<Person> c2 = per.stream().collect(Collectors.toList());
     System.out.println(c2);













  }

}