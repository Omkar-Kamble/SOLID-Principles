package com.example.Lesson6_DependencyInversionPrinciple.BetterCode;

public class EmailSender implements NotificationService{
    @Override
    public void send(String message) {
        System.out.println("Sending email : " + message);
    }
}
