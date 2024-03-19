package org.example.assignment2;

public class SimpleInterest {

    public static double calculate(double principal, double rate, int time) throws IllegalArgumentException {
        if (principal <= 0 || rate <= 0 || time <= 0) {
            throw new IllegalArgumentException("Principal, rate, and time must be greater than zero.");
        }
        return (principal * time * rate) / 100;
    }
}