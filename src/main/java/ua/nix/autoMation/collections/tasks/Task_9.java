package ua.nix.autoMation.collections.tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter five strings from the keyboard: ");

        list.add(scanner.nextLine());
        list.add(scanner.nextLine());
        list.add(scanner.nextLine());
        list.add(scanner.nextLine());
        list.add(scanner.nextLine());

        int minLength = list.get(0).length();

        for (String listed : list) {
            if (listed.length() <    minLength)
                minLength = listed.length();
        }

        for (String listed : list) {
            if (listed.length() == minLength)

                System.out.println("the shortest string in the list is: " + listed + " containes: " + minLength);
        }


    }


}



