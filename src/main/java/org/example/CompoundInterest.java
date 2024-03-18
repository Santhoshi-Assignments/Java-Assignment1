package org.example;

public class CompoundInterest {

    public static double calculate(double principal, double rate, int time)
    {
        double amount = principal * Math.pow(1 + (rate / 100),time);
        return amount-principal;
    }
}
