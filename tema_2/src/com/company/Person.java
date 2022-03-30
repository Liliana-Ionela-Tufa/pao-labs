package com.company;

public class Person {
    private String name, surname, type;
    private int age;
    private long identity_number;

    public Person() {
    }

    public Person(String name, String surname, String type, int age, long identity_number) {
        this.name = name;
        this.surname = surname;
        this.type = type;
        this.age = age;
        this.identity_number = identity_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getIdentity_number() {
        return identity_number;
    }

    public void setIdentity_number(long identity_number) {
        this.identity_number = identity_number;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Ana", "Maria", "f", 21, 214343);
        Person p2 = new Person("Nina", "Iulia", "f", 23, 343434);

        System.out.println(p1.getName() + " " + p1.getAge());
        System.out.println(p2.getName() + " " + p2.getAge());


    }
}

