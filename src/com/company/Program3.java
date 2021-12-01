package com.company;

//Program for equal operator and not equal operator

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: " );
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        boolean checkEqualOperator = (firstNumber==secondNumber);
        System.out.println("Two numbers are equal: " + checkEqualOperator);

        boolean checkNotEqualOperator = (firstNumber!=secondNumber);
        System.out.println("Two numbers are not equal: " + checkNotEqualOperator);
    }
}
