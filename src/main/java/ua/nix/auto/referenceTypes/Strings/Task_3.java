package ua.nix.auto.referenceTypes.Strings;


/*Task 3
A string of words separated by spaces is entered.
Find the longest word and display it on the screen.
The case when there may be several longest words is not handled.*/


import java.util.Scanner;

public class Task_3 {
    public static void main(String[] Args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter sentence that contains one word that longest that others: ");

        String sentence = scan.nextLine();

        String[] sentenceSplit = sentence.split(" ");

        String longestWord = "";

        for (String W : sentenceSplit) {
            if (W.length() > longestWord.length());
            longestWord = W;

        }

        System.out.println("longest word: " + longestWord);


    }
}
