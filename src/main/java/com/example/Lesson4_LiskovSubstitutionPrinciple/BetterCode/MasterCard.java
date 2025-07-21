package com.example.Lesson4_LiskovSubstitutionPrinciple.BetterCode;

public class MasterCard extends CreditCard implements InternationalPaymentCompatibleCreditCard {
    @Override
    public void tapAndPay() {
        System.out.println("Tap and Pay impl of MasterCard");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("Online Transfer impl of MasterCard");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Swipe and Pay impl of MasterCard");
    }

    @Override
    public void mandatePayments() {
        System.out.println("Mandate Payment impl of MasterCard");
    }

    @Override
    public void internationalPayment() {
        System.out.println("International Payment impl of MasterCard");
    }
}
