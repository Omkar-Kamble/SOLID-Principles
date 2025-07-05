package com.example.Lesson2_OpenClosedPrinciple.BetterCode;

public class WhatsappNotification implements Notification{
    @Override
    public void send() {
        System.out.println("Sending Whatsapp...");
    }
}
