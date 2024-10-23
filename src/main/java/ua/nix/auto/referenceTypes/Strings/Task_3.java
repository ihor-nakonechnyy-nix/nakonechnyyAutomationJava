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

        for (String word : sentenceSplit) {
            if (word.length() > longestWord.length()) {

                longestWord = word;

            }
        }

            System.out.println("longest word: " + longestWord);


        }

//    public static void main2(String[] Args) {
//
//        String txt = "string of words separated by spaces is entered";
//
//        String[] split = txt.split(" ");
//        String longestWord = "";
//
//        for (int i = 0; i < longestWord.length(); i++) {
//            if(split.length > longestWord.length());
//            System.out.println(longestWord);
//
//        }


    }
