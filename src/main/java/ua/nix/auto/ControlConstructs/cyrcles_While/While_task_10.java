package ua.nix.auto.ControlConstructs.cyrcles_While;

import java.util.Scanner;

//Display the numbers from 10 to 1 using a while loop.
public class While_task_10 {
    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        System.out.print("Enter string: ");

        String newString = scann.nextLine();
        System.out.print("Enter number: ");
        int newNum = scann.nextInt();

        int i = 0;
        while (i < newNum) {
            System.out.println(newString);
            i++;

        }
        scann.close();


    }


}
