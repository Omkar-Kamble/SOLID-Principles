package com.example.Lesson2_OpenClosedPrinciple.BetterCode;

public class EmailNotification implements Notification {
    @Override
    public void send() {
        System.out.println("Sending email...");
    }
}
