package com.Ganpat.Challenge81;

import java.util.Objects;

public class Person {
    private String Name;
    private int Age;


    //Here i make a constructor because i have to make a object with thier attributes in test class
    public Person(String name, int age) {
        Name = name;
        Age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Age == person.Age && Objects.equals(Name, person.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Age);
    }
}
