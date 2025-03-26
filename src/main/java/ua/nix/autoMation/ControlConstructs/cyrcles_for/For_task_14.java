package ua.nix.autoMation.ControlConstructs.cyrcles_for;

//Enter two numbers m and n from the keyboard.
//Use the for loop to display a rectangle of size m by n made of eights.
//Example: m=2, n=4

import java.util.Scanner;

public class For_task_14 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        System.out.print("Enter number: ");
        int m = scann.nextInt();
        System.out.print("Enter number: ");
        int n = scann.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print('8');
            }

            System.out.println();
        }
        scann.close();

    }
}
