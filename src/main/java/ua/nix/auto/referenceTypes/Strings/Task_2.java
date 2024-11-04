package ua.nix.auto.referenceTypes.Strings;

import java.util.Scanner;
//Find a specified substring in a string and replace it with a new substring.
// The user enters the string, its substring to replace and the new substring.


public class Task_2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the main string: ");
            String mainString = scanner.nextLine();

            System.out.println("Enter the substring to be replaced: ");
            String substringToReplace = scanner.nextLine();

            System.out.println("Enter the new substring: ");
            String newSubstring = scanner.nextLine();

            String resultString = mainString.replace(substringToReplace, newSubstring);


            System.out.println("Resulting string: " + resultString);
        }
    }
