package org.example.Traccia_1;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }
}
