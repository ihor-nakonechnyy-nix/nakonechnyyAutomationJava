package ua.nix.autoMation.collections.tasks;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        System.out.println("Enter five strings from the keyboard: ");

        for (int i = 0; i < 5; i++) {
            String enterList = scanner.nextLine();
            list.add(enterList);

        }
        System.out.println("=========================");

        for (int i = 4; i > -1; i--) {
            System.out.println(list.get(i));


        }


    }

}



