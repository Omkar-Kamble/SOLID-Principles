package com.example.Lesson3_AbstractClasses_And_Interfaces.AbstractClass;

public abstract class Product {

    // An abstract method
    public abstract double calculateDiscount();

    // Concrete method
    public void termsAndCondition() {
        System.out.println("Some terms");
    }
}
