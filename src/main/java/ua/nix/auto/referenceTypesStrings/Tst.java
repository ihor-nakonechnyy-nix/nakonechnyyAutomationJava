package ua.nix.auto.referenceTypesStrings;

public class Tst {


    // Method to get the first, last, and middle characters of a string
    public static void firstLastMiddle(String input) {
        int length = input.length();
        if (length == 0) {
            System.out.println("The string is empty.");
            return;
        }

        // First character
        char firstChar = input.charAt(0);
        // Last character
        char lastChar = input.charAt(length - 1);
        // Middle character(s)
        String middleChar;
        if (length % 2 == 0) {
            middleChar = input.substring((length / 2) - 1, (length / 2) + 1);
        } else {
            middleChar = String.valueOf(input.charAt(length / 2));
        }

        System.out.println("First character: " + firstChar);
        System.out.println("Last character: " + lastChar);
        System.out.println("Middle character(s): " + middleChar);
    }

    // Method to get part of the string up to and including the first period
    public static void partUpToPeriod(String input) {
        int index = input.indexOf('.');
        if (index != -1) {
            String part = input.substring(0, index + 1);
            System.out.println("String up to first period: " + part);
        } else {
            System.out.println("No period found in the string.");
        }
    }

    // Method to count the number of spaces in the string
    public static int countSpaces(String input) {
        int spaceCount = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        return spaceCount;
    }

    public static void main(String[] args) {
        String input = "This is a test string. Here is another sentence.";

        // Output the first, last, and middle character(s)
        firstLastMiddle(input);

        // Output the part of the string up to and including the first period
        partUpToPeriod(input);

        // Output the number of spaces
        int numberOfSpaces = countSpaces(input);
        System.out.println("Number of spaces: " + numberOfSpaces);
    }
}

