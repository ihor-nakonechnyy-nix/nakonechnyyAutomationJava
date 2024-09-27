package ua.nix.auto.myTasks;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter first digit: ");
        int digit1 = scan.nextInt();

        System.out.print("enter second digit: ");
        int digit2 = scan.nextInt();

        System.out.println("adding: " + (digit1 + digit2));
        System.out.println("subtract: " + (digit1 - digit2));
        System.out.println("multiply: " + (digit1 * digit2));
        System.out.println("device: " + (digit1 / digit2));
        System.out.println("percent: " + (digit1 % digit2));


    }

}


