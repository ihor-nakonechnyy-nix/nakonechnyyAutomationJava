package ua.nix.auto.referenceTypes.Strings;

public class CharacterCounter {


    public static long countCharacter(String input, char target) {
        return input.chars()
                .filter(ch -> ch == target)
                .count();
    }

    public static void main(String[] args) {
        // Test the countCharacter method
        String testString = "This is a test string with multiple 't' characters.";
        char targetChar = 't';
        long numberOfTargetChar = countCharacter(testString, targetChar);
        System.out.println("The number of '" + targetChar + "' characters in the string is: " + numberOfTargetChar);
    }
}
