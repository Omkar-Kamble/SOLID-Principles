package com.example.Lesson1_SingleResponsibilityPrinciple.Example1.ProblematicCode;

public class Employee {
    private int id;

    public int getId() {
        return this.id;
    }

    public String fetchBioData() {
        return "Some bio data";
    }

    public double calculateSalary() {
        return 0;
    }

    public void printPerformanceData() {
        System.out.println("Some performance related data");
    }

}
