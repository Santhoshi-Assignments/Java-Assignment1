package org.example.assignment2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the principal amount:");
            double principal = sc.nextDouble();
            if (principal <= 0) {
                throw new IllegalArgumentException("Principal amount must be greater than zero.");
            }

            System.out.println("Enter interest rate:");
            double rate = sc.nextDouble();
            if (rate <= 0) {
                throw new IllegalArgumentException("Interest rate must be greater than zero.");
            }

            System.out.println("Enter the time period in years: ");
            int time = sc.nextInt();
            if (time <= 0) {
                throw new IllegalArgumentException("Time period must be greater than zero.");
            }

            System.out.println("Choose interest type (1 for SimpleInterest, 2 for CompoundInterest):");
            int choice = sc.nextInt();

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
        } catch (InputMismatchException e) {
            System.out.println("Input mismatch. Please enter a valid input.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}

