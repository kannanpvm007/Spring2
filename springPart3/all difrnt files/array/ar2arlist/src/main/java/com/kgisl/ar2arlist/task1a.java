package com.kgisl.ar2arlist;

import java.util.*;
import java.util.function.Predicate;
import java.util.jar.Attributes.Name;
import java.util.stream.Collectors;

public class task1a {
  //private static final int ArrayList = 0;

  public static void main(String[] args) {

    College a1 = new College("kannan", "KGISL", "IT ", 101, 2019, 50, 60, 70);
    College a2 = new College("tamilselvi", "KGISL", "CSE", 102, 2019, 56, 69, 80);
    College a3 = new College("kavin", "KGISL", "CSE", 10, 2019, 40, 69, 80);
    College a4 = new College("giri", "psg", "IT ", 211, 2019, 46, 60, 73);
    College a5 = new College("devi", "psg", "CSE", 202, 2019, 40, 50, 60);
    College a6 = new College("tamil", "KCT", "ECE", 311, 2019, 75, 55, 65);
    College a7 = new College("raja", "KCT", "EEE", 312, 2019, 45, 58, 85);
    College a8 = new College("raju", "KCH", "MEC", 401, 2019, 25, 42, 52);
    College a9 = new College("mahi", "KCH", "ECE", 410, 2019, 20, 62, 52);
    College a10 = new College("sasi", "karpagam", "EEE", 511, 2019, 60, 70, 52);
    College a12 = new College("sasi", "karpagam", "CSE", 510, 2019, 10, 77, 52);
    College a13 = new College("bharthi", "kovai  mc", "ECE", 610, 2019, 65, 67, 76);
    College a14 = new College("selvi", "kovai  mc", "IT ", 61, 2019, 69, 67, 76);
    College a15 = new College("mohana", "IRC", "MEC", 11, 2019, 39, 35, 50);
    College a16 = new College("nivi", "IRC", "EEE", 42, 2019, 20, 25, 40);
    College a17 = new College("ramya", "KMC", "EEE", 81, 2019, 65, 78, 91);
    College a18 = new College("nidhya", "aims", "CSE", 810, 2019, 63, 68, 71);
    College a19 = new College("kamali", "perudurai MC", "ECE", 910, 2019, 85, 65, 75);
    College a20 = new College("manju", "perudurai MC", "IT ", 91, 2019, 45, 55, 65);

    List<College> Students = new ArrayList<>();
    Students.add(a1);
    Students.add(a2);
    Students.add(a3);
    Students.add(a4);
    Students.add(a5);
    Students.add(a6);
    Students.add(a7);
    Students.add(a8);
    Students.add(a9);
    Students.add(a10);
    Students.add(a20);
    Students.add(a12);
    Students.add(a13);
    Students.add(a14);
    Students.add(a15);
    Students.add(a16);
    Students.add(a17);
    Students.add(a18);
    Students.add(a19);
    Students.add(a20);
    System.out.println("all Students");
    Students.forEach(System.out::println);

    System.out.println("_______________________________all mark");

    // List<String> TotalMark = Students.stream().map(a -> a.getName()+
    // (a.getJava())).collect(Collectors.toList());
    // TotalMark.forEach(System.out::println);

    // System.out.print("passed students____________________________________");
    // Students.stream().filter(h -> h.getPhp() >=55 && h.getJava() >=55 &&
    // h.getC() >=55).forEach(System.out::println );

    
    Predicate<College> finfpass = m -> m.getPhp() >= 55 && m.getJava() >= 55 && m.getC() >= 55;

    // System.out.println("===avrg==");
    Students.stream().filter(finfpass).map(x -> (x.getJava() + x.getPhp() + x.getC()) + "<===total mark==Name=>"+x.getName())
        .sorted(Comparator.reverseOrder()).forEach(System.out::println);

    // find top 3 clgs
    long s = Students.stream().filter(finfpass).map(x -> (x.getPhp() + x.getJava() + x.getC()) + x.getCollege())
        .sorted(Comparator.reverseOrder()).count(); // for count
            System.out.println("Count:" + s);

            
    List<String> f = Students.stream().filter(finfpass)
        .map(x -> (x.getPhp() + x.getJava() + x.getC()) + "  " + x.getCollege()).sorted(Comparator.reverseOrder())
        .collect(Collectors.toList());
        // System.out.println("all");
        // f.stream().forEach(System.out::println);   
  


    System.out.println("|Top 3");
    f.stream().limit(3).forEach(System.out::println);



    System.out.println("/n | last 3 |");
    f.stream().skip(s-3).forEach(System.out::println);


System.out.println("passed students's avarage");
    Predicate<College> findavg = m -> m.getPhp() >= 55 && m.getJava() >= 55 && m.getC() >= 55;

    Students.stream().filter(findavg).map(x -> ((x.getJava() + x.getPhp() 
    + x.getC())/3) + "<===AVG==Collages=>"+x.getCollege())
    .forEach(System.out::println);

























   // another idea
   //double avg1= Students.stream().mapToDouble(S::findavg).avarage().getAsDouble();


    // double sum4 = persons.stream().mapToDouble(Person::getAge).average().getAsDouble();
    // System.out.println(sum4);










    // .sorted(Comparator.reverseOrder())

    // long s = Students.stream().filter(finfpass)
    // .map(x -> x.getAvg()+" total mark:"+(x.getJava()
    // +x.getPhp()+x.getC())).count();
    // System.out.println(s);
    // Students.stream().limit(3).forEach(System.out::println);

    // System.out.println("top 3 colleges");
    // Students.stream().
    // max(Comparator.comparing(College::getAvg))
    // .ifPresent(p-> System.out.println(p));

    // System.out.println("\n****** Passed Students ******\n");
    // // students.stream().filter(t -> t.getMark1() > 40 && t.getMark2() > 40 &&
    // t.getMark3() > 40)
    // // .forEach(System.out::println);

    // System.out.println("frist 3 college");
    // st1.stream().limit(4).forEach(System.out::println);

    // List< College > l1 = st1.stream().filter(s ->
    // s.getDept().startsWith("ECE")).collect(Collectors.toList());
    // l1.stream().forEach(System.out::println);

    // System.out.println("TOP COLLEGES");
    // List< College > tc = st1.stream().filter(s -> s.getJava() >
    // 70).collect(Collectors.toList());
    // tc.stream().limit(3).map( College ::getCollege).forEach(System.out::println);

    // System.out.println("/n BAD COLLEGES /n");
    // List< College > BC = st1.stream().filter(s -> s.getJava()
    // <30).collect(Collectors.toList());
    // BC.stream().limit(3).map( College ::getCollege).forEach(System.out::println);

    // System.out.println("top");
    // List< College > Bz= st1.stream().filter(s -> s.getJava()
    // <30).collect(Collectors.toList());
    // Bz.stream().limit(3).map( College ::getMrak).forEach(System.out::println);

    // double av= st1.stream().( College ::getAvg).average().getAsDouble();
    // System.out.println(av);

    // List < College > all =st1.map( College
    // ::getMrak).forEach(System.out::println);

    // String b1 = st1.stream().filter(p1 -> p1.getMak1() > 60);
    // System.out.println(b1);

  }

}