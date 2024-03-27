package org.example.assignment3;

import java.util.Scanner;

interface Operation {
    double calculate(double x, double y);
}

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Arithmetic Calculator!");
        System.out.println("==========================================");
        while (true) {
            System.out.print("Enter operator (+, -, *, /) or 'q' to quit: ");
            char operator = scanner.next().charAt(0);

            if (operator == 'q' || operator == 'Q') {
                System.out.println("Exiting the calculator. Goodbye!!");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            Operation operation;
            switch (operator) {
                case '+':
                    operation = (x, y) -> x + y;
                    System.out.println("===========================");
                    break;
                case '-':
                    operation = (x, y) -> x - y;
                    break;
                case '*':
                    operation = (x, y) -> x * y;
                    break;
                case '/':
                    operation = (x, y) -> {
                        if (y != 0)
                            return x / y;
                        else {
                            System.out.println("Cannot divide by zero!");
                            return Double.NaN;
                        }
                    };
                    break;
                default:
                    System.out.println("Invalid operator!");
                    continue;
            }

            double result = operation.calculate(num1, num2);
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}

