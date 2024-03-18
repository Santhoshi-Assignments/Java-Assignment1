package org.example;

public class SimpleInterest {

    public static double calculate(double principal, double rate, int time)
    {
        return(principal * time * rate)/100;
    }
}
