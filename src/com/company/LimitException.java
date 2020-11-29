package com.company;

public class LimitException extends Exception {
    private double remainingAmount;
    public LimitException(String messega, double remainingAmount){
        super(messega);
        this.remainingAmount=remainingAmount;
    }
    public double getRemainingAmount() {
        return  remainingAmount;
    }
}
