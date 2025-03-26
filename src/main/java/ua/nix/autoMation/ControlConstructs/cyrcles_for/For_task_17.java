package ua.nix.autoMation.ControlConstructs.cyrcles_for;


//Enter a name from the keyboard and, using the for loop 10 times, output: [*name* loves me.]
//Text example:
//Anna loves me.
//…

import java.util.Scanner;
public class For_task_17 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);


        System.out.print("Enter your name: ");
        String name = scann.nextLine();
        for (int i = 0; i <= 10; i++) {
            System.out.println(name + " loves me");
        }


    }

}



