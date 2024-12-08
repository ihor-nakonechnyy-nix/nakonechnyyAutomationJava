package ua.nix.auto.ControlConstructs.conditionalOperators;

//Enter two names from the keyboard, and if the names are the same, display the message "The names are identical".
// If the names are different but their lengths are equal, display the message "The lengths of the names are equal".

import java.util.Scanner;

public class ConditionalOperatorsTask_4 {

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);


        String name1, name2;
        System.out.print("enter first name: ");
        name1 = scann.nextLine();

        System.out.print("enter second name: ");
        name2 = scann.nextLine();

        if (name1.equals(name2)) {
            System.out.println("The names are identical");
        } else if (name1.length() == name2.length()) {
            System.out.println("The lengths of the names are equal");
        } else {
            System.out.println("The lengths of the names are not equal");


        }
    }
}


