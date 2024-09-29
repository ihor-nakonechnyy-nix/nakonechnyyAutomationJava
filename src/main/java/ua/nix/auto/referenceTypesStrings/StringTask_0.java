package ua.nix.auto.referenceTypesStrings;
import java.util.Scanner;

public class StringTask_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("input an expression =>10: ");
        String String1 = scanner.nextLine();
        int length =String1.length();
        System.out.println(length);
        int IndexQuantity = length / 2;
        System.out.println(IndexQuantity);


        System.out.println("First character: "+ String1.charAt(0));
        System.out.println("Middle character: "+ String1.charAt(8));
        System.out.println("Last character: "+ String1.charAt(10));




    }
}



