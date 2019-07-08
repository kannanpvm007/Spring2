package com.kgisl.ar2arlist;

import java.util.stream.Stream;


class  College {
    String name,college,dept;
    int rollno,year,java,php,c,mark;
    
    College (String name,String college,String dept,
int rollno,int year,int java,int php,int c)
    {
        this.name=name;
        this.college=college;
        this.dept=dept;
        this.rollno=rollno;
        this.year=year;
        this.java=java;
        this.php=php;
        this.c=c;
        //this.mark= mark;

    }
    public String getName()
    {
        return name;

    }

    public String getCollege()
    {
        return college;

    }
    public String getDept()
    {
        return dept;

    }
    public int getrollNo()
    {
        return rollno;

    }
    public int getYear()
    {
        return year;

    }
    public int getJava()
    {
        return java;

    }
    public int getPhp()
    {
        return php;

    }
    public int getC()
    {
        return c;

    }
    public int getMrak()
    {
        return java+php+c;

    }
   
    
    public int getAvg()
    {
        return (java+php+c)/3;

    }

    

    public String toString(){
        return "name:  "+name+"  clg:  "+college+"  dep:  "+
        dept+"  rollno:  "+rollno+"  YEAR:  "
        +year+"  java  :"+java+"  php:  "+php+"  c:  "+c;

    }
	// public static Stream<College> stream() {
	// 	return null;
	// }
}
