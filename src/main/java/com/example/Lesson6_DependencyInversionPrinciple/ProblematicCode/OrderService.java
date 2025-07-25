package com.example.Lesson6_DependencyInversionPrinciple.ProblematicCode;

public class OrderService {
    private EmailSender emailSender;

    // OrderService is tightly coupled to EmailSender, We can’t easily switch to another notification method (e.g., SMS, push).
    public OrderService(){
        this.emailSender = new EmailSender();
    }

    public void placeOrder() {

        System.out.println("Placing order...");

        emailSender.sendEmail("Order placed successfully!");
    }
}
