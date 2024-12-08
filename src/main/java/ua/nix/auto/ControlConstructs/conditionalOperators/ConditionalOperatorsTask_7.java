package ua.nix.auto.ControlConstructs.conditionalOperators;

//For seven attempts to guess a number.
// At each attempt you will see a message - "Little" or "Much".
// If you guess within seven attempts, the message "Guessed :)" will be displayed and the program will terminate.
// If after 7 attempts the number is not guessed, the message "Did not guess :(" is displayed and the program terminates.

import java.util.Random;
import java.util.Scanner;

public class ConditionalOperatorsTask_7 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        Random random = new Random();


        int secret = random.nextInt(20 + 1);

        int attempt1, attempt2, attempt3, attempt4, attempt5, attempt6, attempt7;

        System.out.println("you have seven attempts to guess the secret number from one to twenty");

        System.out.print("first attemp: ");
        attempt1 = scann.nextInt();
        if (attempt1 < secret) {
            System.out.println("Little");
        } else if (attempt1 > secret) {
            System.out.println("Much");
        } else {
            System.out.println("Guessed");
            System.exit(0);
        }


        System.out.print("second attemp: ");
        attempt2 = scann.nextInt();
        if (attempt2 < secret) {
            System.out.println("Little");
        } else if (attempt2 > secret) {
            System.out.println("Much");
        } else {
            System.out.println("Guessed");
            System.exit(0);
        }

        System.out.print("third attemp: ");
        attempt3 = scann.nextInt();
        if (attempt3 < secret) {
            System.out.println("Little");
        } else if (attempt3 > secret) {
            System.out.println("Much");
        } else {
            System.out.println("Guessed");
            System.exit(0);
        }

        System.out.print("forth attemp: ");
        attempt4 = scann.nextInt();
        if (attempt4 < secret) {
            System.out.println("Little");
        } else if (attempt4 > secret) {
            System.out.println("Much");
        } else {
            System.out.println("Guessed");
            System.exit(0);
        }

        System.out.print("fifth attemp: ");
        attempt5 = scann.nextInt();
        if (attempt5 < secret) {
            System.out.println("Little");
        } else if (attempt5 > secret) {
            System.out.println("Much");
        } else {
            System.out.println("Guessed");
            System.exit(0);
        }

        System.out.print("six attemp: ");
        attempt6 = scann.nextInt();
        if (attempt6 < secret) {
            System.out.println("Little");
        } else if (attempt6 > secret) {
            System.out.println("Much");
        } else {
            System.out.println("Guessed");
            System.exit(0);
        }

        System.out.print("seven attemp: ");
        attempt7 = scann.nextInt();
        if (attempt7 < secret) {
            System.out.println("Little");
        } else if (attempt7 > secret) {
            System.out.println("Much");
        } else {
            System.out.println("Guessed");
        }

        if (attempt7 != secret) {
            System.out.println("Did not guess");
            System.out.println("the sucret number is  " + secret);

        }
    }
}

