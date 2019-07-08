package com.memorynotfound.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.imageio.stream.FileCacheImageInputStream;

/**
 * exmple
 */
class exmple {

    int i = 5;

    public void hai(int i) {

        // int i=10;
        // i =34;
        System.out.println(this.i + "i:" + i);
    }

    public static void main(String[] args) {
        exmple ex = new exmple();
        ex.hai(63);
    }
}

interface java1 {
    void string1();
}

class Send implements java1 {
    public void string1() {
        System.out.println("hi");
    }

    public static void main(String Ar[]) {
        java1 jv = new Send();
        jv.string1();
    }

}

// memberinner clss?
class TestMemberOuter1 {
    private int data = 30;

    class Inner {
        void msg() {
            System.out.println("data is " + data);
        }
    }

    public static void main(String args[]) {
        TestMemberOuter1 obj = new TestMemberOuter1();
        TestMemberOuter1.Inner in = obj.new Inner();
        in.msg();
    }
}

// anonmass iner
abstract class Person {
    abstract void eat();
}

class TestAnonymousInner {
    public static void main(String args[]) {
        Person p = new Person() {
            void eat() {
                System.out.println("nice fruits");
            }
        };
        p.eat();
    }
}

// FinalizeExample

class FinalizeExample {
    public void finalize() {
        System.out.println("finalize called");
    }

    public static void main(String[] args) {
        FinalizeExample f1 = new FinalizeExample();
        FinalizeExample f2 = new FinalizeExample();
        f1 = null;
        f2 = null;
        System.gc();
    }
}

// costom exception
class InvalidAgeException extends Exception {
    InvalidAgeException(String s) {
        super(s);
    }
}

/**
 * Innerexmple
 */
class Custom {
    static void check(int age) throws InvalidAgeException {
        if (age < 18)
            throw new InvalidAgeException("not vote");
        else {
            System.out.println("welcome");
        }
    }

}

class Example extends Custom {
    public static void main(String[] args) {

        try {
            check(2);
        } catch (Exception e) {
            System.out.println(e);

        }
    }
}

class A {
    static final int data;// static blank final variable
    static {
        data = 50;
    }

    public static void main(String args[]) {
        System.out.println(A.data);
    }
}

// ection overrideing
class Parent {
    void msg() throws ArithmeticException {
        System.out.println("parent");
    }
}

class TestExceptionChild2 extends Parent {
    // void msg()throws Exception{System.out.println("child");}

    public static void main(String args[]) {
        Parent p = new TestExceptionChild2();
        try {
            p.msg();
        } catch (Exception e) {
        }
    }
}

// fil out put stream

/**
 * Innerexmple
 */
class output {
    public static void main(String args[]) {
        try {

            FileOutputStream fo = new FileOutputStream("C:\\Users\\kannan.r\\Desktop\\hi.text.txt");
            String hi = "vanakkam";
            byte[] by = hi.getBytes();
            fo.write(by);
        } catch (Exception e) {
            System.out.println(e);

        }
    }

}

class Input {
    public static void main(String args[]) {
        try {

            FileInputStream fi = new FileInputStream("C:\\Users\\kannan.r\\Desktop\\hi.text.txt");
int i=0;
          while((i=fi.read())!=-1){
              System.out.print((char)i);

          }

        } catch (Exception e) {
            System.out.println(e);

        }
    }

}
