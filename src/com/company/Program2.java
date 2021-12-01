package com.company;

//Write a method for increment and decrement operator

public class Program2 {
    public static void main(String[] args) {
        int originalValue = 10;
        System.out.println("Original value= " + originalValue);

        increment(originalValue);
        decrement(originalValue);
    }

    public static void increment(int value) {
        int duplicateValue = value;
        System.out.println("Post increment value= " + value++);
        System.out.println("Pre increment value= " + ++duplicateValue);
    }

    public static void decrement(int value) {
        int duplicateValue = value;
        System.out.println("Post decrement value= " + value--);
        System.out.println("Pre decrement value= " + --duplicateValue);
    }
}
