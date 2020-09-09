package com.spencermaecroft;

public class Person {

    private String name;
    private int age;
    SEX gender;

    public Person(String name, int age, SEX sex){
        this.name = name;
        this.gender = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public SEX getGender() {
        return gender;
    }
}
