package com.example.Lesson2_OpenClosedPrinciple.BetterCode;

import java.util.List;

public class NotificationSender {
    public void sendNotifications(List<Notification> notifications) {
        for (Notification notification : notifications) {
            notification.send();
        }
    }
}
