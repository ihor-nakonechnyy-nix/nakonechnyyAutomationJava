package ua.nix.auto.referenceTypesStrings;


/*A string is given. Output the first, last and middle (if any) characters.
Write a program that outputs the part of the string up to and including the first point encountered.
Also provide for outputting the number of spaces.*/


public class StaringTask_1 {

    public static void main(String[] args) {

        String str1 = "I want some ice cream. Please";
        int length = str1.length();
        System.out.println(length);
        int IndexQuantity = length / 2;
        System.out.println(IndexQuantity);


        System.out.println("First character: " + str1.charAt(0));
        System.out.println("Middle character: " + str1.charAt(10));
        System.out.println("Last character: " + str1.charAt(20));

        boolean contains = str1.contains(" ");
        System.out.println(true);



            int numberOfSpaces = countSpaces("I want some ice cream. Please");
        System.out.println("Number of spaces: " + numberOfSpaces);




    }
}
