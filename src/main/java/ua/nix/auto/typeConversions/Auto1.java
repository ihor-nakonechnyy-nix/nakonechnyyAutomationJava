package ua.nix.auto.typeConversions;

import java.util.Scanner;


/*Task 1:
Two natural numbers are stored in the variables q and w.
Create a program that displays the result of dividing q by w with a remainder. Example of the program output
(for the case when q stores 21 and w stores 8): 21 / 8 = 2 and 5 in the remainder/*/

class Auto1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number (q): ");
        int q = scanner.nextInt();

        System.out.print("Enter the first number (w): ");
        int w = scanner.nextInt();

        int quotient = q / w;
        int reminder = q % w;
        System.out.println("Result of dividing: " + quotient);
        System.out.println("Remainder:" + reminder);


    }
}