package com.company;

//Program for relational operator

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: " );
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println(firstNumber + ">" + secondNumber + ": " + (firstNumber > secondNumber));
        System.out.println(firstNumber + ">=" + secondNumber + ": " + (firstNumber >= secondNumber));
        System.out.println(firstNumber + "<" + secondNumber + ": " + (firstNumber < secondNumber));
        System.out.println(firstNumber + "<=" + secondNumber + ": " + (firstNumber <= secondNumber));
    }
}
