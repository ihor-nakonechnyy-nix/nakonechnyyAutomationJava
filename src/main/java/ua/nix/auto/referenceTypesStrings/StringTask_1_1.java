package ua.nix.auto.referenceTypesStrings;

public class StringTask_1_1 {

    public static void main(String[] args)

    {
        String isbn = "I want some ice cream";
        String[] isbnParts = isbn.split(" ");
        System.out.println(isbnParts[0]);
        System.out.println(isbnParts[1]);
        System.out.println(isbnParts[2]);
        System.out.println(isbnParts[3]);
        System.out.println(isbnParts[4]);
    }
}
