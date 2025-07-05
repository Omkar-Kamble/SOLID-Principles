package com.example.Lesson2_OpenClosedPrinciple.BetterCode;

public class PushNotification implements Notification{
    @Override
    public void send() {
        System.out.println("Sending push notification...");
    }
}
