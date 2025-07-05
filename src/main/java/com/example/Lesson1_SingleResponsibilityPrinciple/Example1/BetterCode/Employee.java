package com.example.Lesson1_SingleResponsibilityPrinciple.Example1.BetterCode;

public class Employee {
    private final int id;

    public Employee(int id) {
        this.id = id;
    }

    public int getId(){
        return this.id;
    }
}
