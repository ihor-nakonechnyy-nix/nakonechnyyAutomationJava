package ua.nix.auto.referenceTypesStrings;
import java.util.Scanner;



/*A string is given. Output the first, last and middle (if any) characters.
Write a program that outputs the part of the string up to and including the first point encountered.
Also provide for outputting the number of spaces.*/

public class StringTask_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = "ihorNakonechnyy";


        System.out.println("First character: "+ str1.charAt(0));
        System.out.println("First character: "+ str1.charAt(6));
        System.out.println("First character: "+ str1.charAt(14));

    }
}



