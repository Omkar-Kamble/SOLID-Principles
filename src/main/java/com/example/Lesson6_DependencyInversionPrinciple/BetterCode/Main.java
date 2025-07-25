package com.example.Lesson6_DependencyInversionPrinciple.BetterCode;

public class Main {
    public static void main(String[] args) {
        NotificationService whatsApp = new WhatsAppSender();
        OrderService orderService = new OrderService(whatsApp);
        orderService.placeOrder();
    }
}
