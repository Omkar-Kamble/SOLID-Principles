package com.example.Lesson3_AbstractClasses_And_Interfaces.AbstractClass;

public class Main {
    public static void main(String[] args) {
        // 01:28:18
        Product p = new Macbook();
        p.termsAndCondition();

        p = new LenovoLaptop();
        p.termsAndCondition();
    }
}
