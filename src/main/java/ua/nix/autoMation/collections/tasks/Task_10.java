package ua.nix.autoMation.collections.tasks;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Task_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter five strings from the keyboard: ");

        list.add(0,scanner.nextLine());
        list.add(0,scanner.nextLine());
        list.add(0,scanner.nextLine());
        list.add(0,scanner.nextLine());
        list.add(0,scanner.nextLine());

        System.out.println(list);


        }


    }



