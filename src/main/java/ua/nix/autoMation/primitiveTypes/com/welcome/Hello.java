package ua.nix.autoMation.primitiveTypes.com.welcome;

import java.util.Scanner;

public class Hello {
    public static void setupName(String name) {
        Scanner scann = new Scanner(System.in);
        System.out.println("Enter your name");
        String yourName = scann.nextLine();


    }
}
