package com.example.Lesson6_DependencyInversionPrinciple.ProblematicCode;

public class EmailSender {
    public void sendEmail(String message){
        System.out.println("Sending email : " + message);
    }
}
