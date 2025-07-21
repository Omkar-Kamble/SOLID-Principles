package com.example.Lesson3_AbstractClasses_And_Interfaces.AbstractClass;

public class Macbook extends Product{
    @Override
    public double calculateDiscount() {
        return 0;
    }

    @Override
    public void termsAndCondition() {
        System.out.println("Terms of macbook");
    }
}
