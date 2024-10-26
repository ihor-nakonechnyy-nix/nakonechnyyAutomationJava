package ua.nix.auto.referenceTypes.Strings;

/*A string is given. Output the first, last and middle (if any) characters.
Write a program that outputs the part of the string up to and including
the first point encountered.
Also provide for outputting the number of spaces.*/

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scann.nextLine();


        //Output full length of the string
        int length = text.length();
        System.out.println(length);

        //Output half string's length
        int halfOfText = length / 2;
        System.out.println(halfOfText);

        //Output first character
        System.out.println("First character: " + text.charAt(0));
        //Output middle character
        System.out.println("Middle character: " + text.charAt(halfOfText));
        //Output last character
        System.out.println("Last character: " + text.charAt(length - 1));
        // Tells that string contains spaces, true or false
        System.out.println(text.contains(" "));

        int findPeriod = text.indexOf('.');
        //if (findPeriod != -1)
            System.out.println(text.substring(0, findPeriod + 1));


        //outputting the number of spaces
        int spaceCount = 0;
        int exclamationSignCount = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            } else if (text.charAt(i) == '!') {
                exclamationSignCount++;

            }
            //System.out.println("character " + text.charAt(i));


        }
        System.out.println("spaces " + spaceCount);
        System.out.println("exclamation " + exclamationSignCount);


    }
}



