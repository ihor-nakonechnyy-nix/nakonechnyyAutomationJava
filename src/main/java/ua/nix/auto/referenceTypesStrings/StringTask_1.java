package ua.nix.auto.referenceTypesStrings;
import java.util.Scanner;



/*A string is given. Output the first, last and middle (if any) characters.

Also provide for outputting the number of spaces.*/

public class StringTask_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("input an expression: ");
        String exampleString = scanner.nextLine();
        int length =exampleString.length();
        System.out.println(length);
        int middleIndex = length / 2;
        System.out.println(middleIndex);


        System.out.println("First character: "+ exampleString.charAt(0));
        System.out.println("Middle character: "+ exampleString.charAt(8));
        System.out.println("Last character: "+ exampleString.charAt(10));


        int index = exampleString.indexOf(exampleString);
        System.out.println("Index of ' '");


    }
}



