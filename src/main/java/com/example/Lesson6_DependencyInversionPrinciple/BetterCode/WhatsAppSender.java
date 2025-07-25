package com.example.Lesson6_DependencyInversionPrinciple.BetterCode;

public class WhatsAppSender implements NotificationService{
    @Override
    public void send(String message) {
        System.out.println("Sending whatsapp message : " + message);
    }
}
