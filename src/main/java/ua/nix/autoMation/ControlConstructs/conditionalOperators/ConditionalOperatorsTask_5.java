package ua.nix.autoMation.ControlConstructs.conditionalOperators;

//Enter the name and age from the keyboard.
//If the age is less than 18, display the message "Grow up more"

import java.util.Scanner;

public class ConditionalOperatorsTask_5 {
    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);

        System.out.println("Enter name and age from the keyboard: ");
        String name = scann.nextLine();

        int age = scann.nextInt();

        if (age < 18) {
            System.out.println("Grow up more");
        } else {
            System.out.println("you are grown up");

        }
    }

}


