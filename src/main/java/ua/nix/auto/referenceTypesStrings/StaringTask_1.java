package ua.nix.auto.referenceTypesStrings;


/*A string is given. Output the first, last and middle (if any) characters.
Write a program that outputs the part of the string up to and including the first point encountered.
Also provide for outputting the number of spaces.*/


public class StaringTask_1 {

    public static void main(String[] args) {



        String str1 = "I want some ice cream.";
        int length = str1.length();
        System.out.println(length);
        int IndexQuantity = length / 2;
        System.out.println(IndexQuantity);


        System.out.println("First character: " + str1.charAt(0));
        System.out.println("Middle character: " + str1.charAt(10));
        System.out.println("Last character: " + str1.charAt(21));

        int countWords = str1.split("\\s").length;
        System.out.println("words quantity: " + countWords);

                     {
                String myStr = "I want some ice cream. Please.";
                String regex = "[,\\s]";
                String[] myArray = myStr.split(regex);
                for (String s : myArray) {
                    System.out.println(s);

                                    }
            }
        }


    }