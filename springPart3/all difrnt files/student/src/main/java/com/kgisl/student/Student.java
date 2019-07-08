package com.kgisl.student;

/**
 * Hello world!
 *
 */
public class Student {
    private int roll;
    private String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String toString() {
        return "name" + name + "roll number" + roll;
    }
}
