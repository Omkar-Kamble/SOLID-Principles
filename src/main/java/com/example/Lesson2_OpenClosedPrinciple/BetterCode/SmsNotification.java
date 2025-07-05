package com.example.Lesson2_OpenClosedPrinciple.BetterCode;

public class SmsNotification implements Notification{
    @Override
    public void send() {
        System.out.println("Sending SMS...");
    }
}
