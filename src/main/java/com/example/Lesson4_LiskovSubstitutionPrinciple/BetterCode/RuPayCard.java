package com.example.Lesson4_LiskovSubstitutionPrinciple.BetterCode;

public class RuPayCard extends CreditCard implements UpiCompatibleCreditCard {
    @Override
    public void tapAndPay() {
        System.out.println("Tap and Pay impl of RuPay");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("Online Transfer impl of RuPay");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Swipe and Pay impl of RuPay");
    }

    @Override
    public void mandatePayments() {
        System.out.println("Mandate Payment impl of RuPay");
    }

    @Override
    public void upiPayment() {
        System.out.println("UPI Payment impl of RuPay");
    }
}
