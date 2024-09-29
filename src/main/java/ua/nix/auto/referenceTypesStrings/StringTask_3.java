package ua.nix.auto.referenceTypesStrings;

public class StringTask_3 {
    public static void main(String[] Args) {

        String str = "I want some ice cream. Please";

        String regex = "[,\\s]";
        String[] myArray = str.split(regex);
        for (String s : myArray) {
            System.out.println(s);


        }
    }
}