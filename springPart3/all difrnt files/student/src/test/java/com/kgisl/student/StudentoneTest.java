

package com.kgisl.student;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.junit.Test;
// @FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudentoneTest {
    public static ArrayList<Student> studentList = new ArrayList<Student>();
    Student newStudent = new Student(502, "name");
    Student updateStudent = new Student(502, "updatename");
    
    private static Studentone studentone;

    @BeforeClass
    public static void before() {
        // studentDemo = new StudentDemo();
        studentone = new Studentone();
    }

    @Test

    public void T1getAllStudentsTest() {
        List<Student> actual = studentone.getAllStudents();
        // System.out.println(actual);
        // assertEquals(fn+sn, actual);

    }

    @Test

    public void T2getStudentTest() {
        Student actual = studentone.getStudent(12);
        System.out.println(actual);
        // assertEquals(fn+sn, actual);

    }

    // newStudent
    @Test

    public void T3newStudentTest() {
        studentone.newStudent(newStudent);
        // assertEquals(fn+sn, actual);

    }

    @Test

    public void T4updateStudentTest() {
        studentone.updateStudent(502, updateStudent);
        // assertEquals(fn+sn, actual);

    }

    @Test

    public void T5removeStudentTest() {
        studentone.removeStudent(101);
        // assertEquals(fn+sn, actual);

    }
}