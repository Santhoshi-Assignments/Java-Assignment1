package org.example.assignment2;

public class CompoundInterest {

    public static double calculate(double principal, double rate, int time) throws IllegalArgumentException {
        if (principal <= 0 || rate <= 0 || time <= 0) {
            throw new IllegalArgumentException("Principal, rate, and time must be greater than zero.");
        }
        double amount = principal * Math.pow(1 + (rate / 100), time);
        return amount - principal;
    }
}