package com.enagbem;

public class Calculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java Calculator <num1> <operation> <num2>");
            return;
        }

        double num1 = Double.parseDouble(args[0]);
        String operation = args[1];
        double num2 = Double.parseDouble(args[2]);
        double result = 0;

        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation. Use +, -, *, or /.");
                return;
        }

        System.out.printf("Result: %.2f\n", result);
    }
}