






package com.kgisl.student;

import java.util.ArrayList;
import java.util.List;

public class Studentone {
   public static ArrayList<Student> studentList = new ArrayList<Student>();
   static Student newStudent=new Student(502, "name");
   static Student updateStudent=new Student(502, "updatename");
   public static void main(String[] args) {
       Studentone s=new Studentone();
       s.loadStudents();
       s.getAllStudents();
       s.getStudent(12);
       s.newStudent(newStudent);
       s.updateStudent(502,updateStudent);
       s.removeStudent(101);
   }

   Studentone(){
       loadStudents();
   }

   public void loadStudents() {
       studentList.add(new Student(101, "ramu"));
       studentList.add(new Student(12, "Divya"));
       studentList.add(new Student(11, "Janani"));
   }

   public List<Student> getAllStudents() {
       System.out.println(studentList);
       return studentList;
   }

   public Student getStudent(int rollno) {
       for (Student student : studentList) {
           if (student.getRoll() == rollno) {
               System.out.println(String.valueOf(student.getRoll())+student.getName());
               return student;
           }
       }

       return getStudent(0);

   }

   public void newStudent(Student student) {
       studentList.add(newStudent);
       getAllStudents();
       System.out.println(studentList);
   }

   public void updateStudent(int rollno, Student updateStudent) {
       for (Student student : studentList) {
           if (student.getRoll() == rollno) {
               System.out.println(studentList.indexOf(student));
               studentList.set(studentList.indexOf(student),updateStudent);
           }
       }
       getAllStudents();
       System.out.println(studentList);
   }

   public void removeStudent(int rollno) {
       for (Student student : studentList) {
           if (student.getRoll() == rollno) {
               System.out.println(studentList.indexOf(student));
               studentList.remove(studentList.indexOf(student));
           }
           break;
       }
       getAllStudents();
       System.out.println(studentList);
   }

}