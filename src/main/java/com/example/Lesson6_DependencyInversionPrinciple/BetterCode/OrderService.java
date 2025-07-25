package com.example.Lesson6_DependencyInversionPrinciple.BetterCode;

public class OrderService {
    private NotificationService notificationService;

    public OrderService(NotificationService notificationService){
        this.notificationService = notificationService;
    }

    public void placeOrder() {
        notificationService.send("Order placed successfully!");
    }
}
