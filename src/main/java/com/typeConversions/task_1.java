package com.typeConversions;

import java.util.Scanner;


class task_1 {

    public static void main (String[] args ) {
        printHelloName();
    }

    public static void printHelloName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number (q): ");
        int q = scanner.nextInt();

        System.out.print("Enter the first number (w): ");
        int w = scanner.nextInt();

        int quotient  = q / w;
        int reminder = q % w;
        System.out.println("Result of dividing: " + quotient );
        System.out.println("Remainder:" + reminder);


   }
}