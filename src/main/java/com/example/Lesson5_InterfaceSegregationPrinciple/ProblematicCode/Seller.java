package com.example.Lesson5_InterfaceSegregationPrinciple.ProblematicCode;

public class Seller implements User{
    @Override
    public boolean canBuyProducts() {
        return false;
    }

    @Override
    public boolean canModifyProducts() {
        return false;
    }

    @Override
    public boolean canAddProducts() {
        return false;
    }

    // seller cannot approve to products, but we forced to do that
    @Override
    public boolean canApproveProducts() {
        return false;
    }
}
