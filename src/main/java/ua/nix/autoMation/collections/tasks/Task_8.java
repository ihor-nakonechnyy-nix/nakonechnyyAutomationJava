package ua.nix.autoMation.collections.tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter five strings from the keyboard: ");

        list.add(scanner.nextLine());
        list.add(scanner.nextLine());
        list.add(scanner.nextLine());
        list.add(scanner.nextLine());
        list.add(scanner.nextLine());

        int maxLength = 0;

        for (String listElement : list) {
            if (listElement.length() > maxLength)
                maxLength = listElement.length();
        }

        for (String listed : list) {
            if (listed.length() == maxLength)

                System.out.println("the longest string in the list is: " + listed + " containes: " + maxLength);
        }


    }


}
