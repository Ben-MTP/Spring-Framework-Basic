package com.jindo.core;

/**
 * @author ManhKM on 6/24/2022
 * @project spring-overload-constructor-injection
 */
public class Student {
    private String name;
    private int age;

    public Student(String name){
        this.name = name;
    }

    public Student(int age){
        this.age = age;
    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
