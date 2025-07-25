package com.example.Lesson6_DependencyInversionPrinciple.ProblematicCode;

public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.placeOrder();
    }
}
