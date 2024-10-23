package ua.nix.auto.referenceTypes.Strings;

/*A string is given. Output the first, last and middle (if any) characters.
Write a program that outputs the part of the string up to and including
the first point encountered.
Also provide for outputting the number of spaces.*/


public class Task_1 {

    public static void main(String[] args) {

        String text = "I want some ice cream.!!!";
        //Output full length of the string
        int length = text.length();
        System.out.println(length);

        //Output half string's length
        int halfOfText = length / 2;
        System.out.println(halfOfText);

        //Output first character
        System.out.println("First character: " + text.charAt(0));
        //Output middle character
        System.out.println("Middle character: " + text.charAt(halfOfText));
        //Output last character
        System.out.println("Last character: " + text.charAt(length - 1));

        //outputs the part of the string up to and including the first point encountered.
        String partOfTheString = text.substring(0, text.length() - 3);
        System.out.println("Up the point point " + partOfTheString);

        // Tells that string contains spaces, true or false
        System.out.println(text.contains(" "));

        int spaceCount = 0;
        int exclamationSignCount = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ')
            {
                spaceCount++;
            } else if (text.charAt(i) == '!') {
                exclamationSignCount++;

            }

            System.out.println("character " + text.charAt(i));


        }
        System.out.println("spaces " + spaceCount);
        System.out.println("exclamation " + exclamationSignCount);

//        int letterCount = 0;
//        for (int i = 0; i < text.length(); i++) {
//            if (text.charAt(i) == 'm') {
//                letterCount++;
//            }

            //System.out.println("shows letter only: " + letterCount);


//        int spacesQuantity = text.charAt(' ');
//        System.out.println(spacesQuantity);

            // split string
//        String[] textSplit = text.split(" ");
//        System.out.println("part 1: " + textSplit[0]);
//        System.out.println("part 2: " + textSplit[1]);
//        System.out.println("part 3: " + textSplit[2]);
//        System.out.println("part 4: " + textSplit[3]);
//        System.out.println("part 5: " + textSplit[4]);
//
//        //textSplit quantity
//        System.out.println(text.split(" ").length);


            //System.out.println("quantity of spaces: " + text.length());


//        outputting the number of spaces


//        char space = text.charAt(6);
//        System.out.println(space);

//        int countWords = text.split("\\s").length;
//        System.out.println("words quantity: " + countWords);
//        System.out.println();
//
//        {
//            String text2 = "I want some ice cream. Please.";
//            String regex = "[,\\s]";
//            String[] myArray = text2.split(regex);
//            for (String s : myArray) {
//                System.out.println(s);
//
//            }
//        }
        }


    }

