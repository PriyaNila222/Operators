package com.company;

//Print the smaller and larger number

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: " );
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        if(firstNumber < secondNumber) {
            System.out.println("Smaller number is: " + firstNumber);
            System.out.println("Larger number is: " + secondNumber);
        } else {
            System.out.println("Smaller number is: " + secondNumber);
            System.out.println("Larger number is: " + firstNumber);
        }
    }
}
