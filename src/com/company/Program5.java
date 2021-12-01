package com.company;

//Program on Logical AND, OR operator and Logical NOT operator

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: " );
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Check firstNumber > 5 and secondNumber > 5");

        boolean logicalANDOperator = (firstNumber > 5 && secondNumber > 5);
        System.out.println("Result for Logical AND operator: " + logicalANDOperator);

        boolean logicalOROperator = (firstNumber > 5 || secondNumber > 5);
        System.out.println("Result for Logical OR operator: " + logicalOROperator);

        boolean logicalNOTOperator = !(firstNumber > 5 && secondNumber > 5);
        System.out.println("Result for Logical NOT operator: " + logicalNOTOperator);
    }
}
