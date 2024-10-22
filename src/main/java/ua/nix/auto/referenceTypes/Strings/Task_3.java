package ua.nix.auto.referenceTypes.Strings;


/*Task 3
A string of words separated by spaces is entered.
Find the longest word and display it on the screen.
The case when there may be several longest words is not handled.*/


public class Task_3 {
    public static void main(String[] Args) {

        String txt = "Today is the happiest day of my life";
        String[] textSplit = txt.split(" ");
        String longword = " ";

        for (int i = 0; i < txt.length(); i++)
            for (int j = 1 + i; j < textSplit.length; j++)
                if (textSplit[i].length() >= textSplit[j].length())
                    longword = textSplit[i];

        System.out.println(longword + " is the longest word with " + longword.length() +
                " characters.");



//        System.out.println();
//
//        System.out.println("word 1: " + textSplit[0]);
//        System.out.println("word 2: " + textSplit[1]);
//        System.out.println("word 3: " + textSplit[2]);
//        System.out.println("word 4: " + textSplit[3]);
//        System.out.println("word 5: " + textSplit[4]);
//        System.out.println("word 6: " + textSplit[5]);
//        System.out.println("word 7: " + textSplit[6]);
//        System.out.println("word 8: " + textSplit[7]);
//
//
//
//        System.out.println("part 1: " + textSplit[0].length());
//        System.out.println("part 2: " + textSplit[1].length());
//        System.out.println("part 3: " + textSplit[2].length());
//        System.out.println("part 4: " + textSplit[3].length());
//        System.out.println("part 5: " + textSplit[4].length());
//        System.out.println("part 6: " + textSplit[5].length());
//        System.out.println("part 7: " + textSplit[6].length());
//        System.out.println("part 8: " + textSplit[7].length());
//
//
//
//        System.out.println(longword);

    }




        }
