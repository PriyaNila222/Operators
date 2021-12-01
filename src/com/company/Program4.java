package com.company;

//Program to find two numbers are equal or not

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: " );
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        if(firstNumber==secondNumber){
            System.out.println("Given two numbers are equal");
        } else {
            System.out.println("Given two numbers are not equal");
        }
    }
}
