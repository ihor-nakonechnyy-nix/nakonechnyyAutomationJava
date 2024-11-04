package ua.nix.auto.myTasks;

import java.util.Scanner;


public class NameAge {

    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        System.out.print("input your name here: ");
        String text = scan.nextLine();
        System.out.println("my age: " + text);

        System.out.print("input age: ");
        int number = scan.nextInt();
        System.out.println("my age: " + number);
        System.out.println("my age: " + number + ", my name: " + text);


    }

}
