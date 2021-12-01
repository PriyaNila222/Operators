package com.company;

//Write a function for arithmetic operator

public class Program1 {
    public static void main(String[] args) {
        int firstNumber = 50;
        int secondNumber = 10;

        int additionValue = add(firstNumber,secondNumber);
        System.out.println("Addition of two numbers = " + additionValue);

        int subtractionValue = sub(firstNumber,secondNumber);
        System.out.println("Subtraction of two numbers = " + subtractionValue);

        int multiplicationValue = mul(firstNumber,secondNumber);
        System.out.println("Multiplication of two numbers = " + multiplicationValue);

        int divisionValue = div(firstNumber,secondNumber);
        System.out.println("Division of two numbers = " + divisionValue);
    }

    public static int add(int firstNumber, int secondNumber) {
        int addition = firstNumber+secondNumber;
        return addition;
    }

    public  static int sub(int firstNumber, int secondNumber) {
        int subtraction = firstNumber-secondNumber;
        return subtraction;
    }

    public  static int mul(int firstNumber, int secondNumber) {
        int multiplication = firstNumber*secondNumber;
        return multiplication;
    }

    public  static int div(int firstNumber, int secondNumber) {
        int division = firstNumber/secondNumber;
        return division;
    }
}
