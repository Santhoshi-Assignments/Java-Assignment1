package org.example;

import java.util.Scanner;

public class InterestCalculator {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the principal amount:");
        double principal = sc.nextDouble();

        System.out.println("Enter interest rate:");
        double rate = sc.nextDouble();

        System.out.println("Enter the time period in years: ");
        int time = sc.nextInt();

        System.out.println("Choose interest type (1 for SimpleInterest, 2 for CompoundInterest):");
        int choice= sc.nextInt();

        double interest;

        if (choice == 1) {
            interest = SimpleInterest.calculate(principal, rate, time);
        } else if (choice == 2) {
            interest = CompoundInterest.calculate(principal, rate, time);
        } else {
            System.out.println("Invalid choice. Defaulting to Simple Interest.");
            interest = SimpleInterest.calculate(principal, rate, time);
        }

        double totalAmount = principal + interest;

        System.out.println("Interest: " + interest);
        System.out.println("Total Amount: " + totalAmount);

        sc.close();
    }
}
