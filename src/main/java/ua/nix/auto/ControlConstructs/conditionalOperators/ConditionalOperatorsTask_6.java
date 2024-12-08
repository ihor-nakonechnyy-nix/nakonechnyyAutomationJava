package ua.nix.auto.ControlConstructs.conditionalOperators;
// Enter name and age from the keyboard.
// If the age is more than 20, display the message "18 is enough".

import java.util.Scanner;

public class ConditionalOperatorsTask_6 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.println("Enter name and age from the keyboard: ");
        String name = scann.nextLine();
        int age = scann.nextInt();
        if (age > 20) {
            System.out.println("18 is enough");
        } else {

        }
    }

}
