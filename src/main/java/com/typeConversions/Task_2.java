package com.typeConversions;

import java.util.Scanner;


public class Task_2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a two-digit natural number (n): ");
        int n = scanner.nextInt();

        int digit1 = n / 10;   // First digit (tens place)
        int digit12 = n % 10;  // Second digit (units place)

        // Calculate the sum of the digits
        int sum = digit1 + digit12;

        // Display the result
        System.out.println("The sum of the digits of " + n + " is: " + sum);

    }
}