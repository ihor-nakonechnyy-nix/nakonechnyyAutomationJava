package ua.nix.auto.Arrays;

import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args) {
        String[] strings = new String[10];
        int[] numbers = new int[10];


        Scanner scann = new Scanner(System.in);
        System.out.println("Enter ten strings: ");
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scann.nextLine();
        }

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = strings[i].length();
        }
        System.out.println("Lengths of the strings:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }

}






