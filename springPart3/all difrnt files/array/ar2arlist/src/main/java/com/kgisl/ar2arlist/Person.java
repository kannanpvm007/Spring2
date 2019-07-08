package com.kgisl.ar2arlist;

import java.util.stream.Stream;

class Person {
       String name;
       int age;

       Person(String name, int age) {
              this.name=name;
              this.age = age;
       }

       public Person(String string) {
	}

	public String getName() {
              return name;

       }

       public int getAge() {
              return age;

       }
       
       public String toString() {
              return " name: " + name + "\n age " + age;

       }

	public static Stream<Person> stream() {
		return null;
	}
                           
}