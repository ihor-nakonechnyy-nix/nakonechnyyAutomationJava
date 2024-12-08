package ua.nix.auto.ControlConstructs;


import java.util.Scanner;

//Input four numbers from the keyboard, and display the maximum of them.
public class ConditionalOperatorsTask_2_2 {

    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);

        System.out.print("enter first digit: ");
        int num1 = scann.nextInt();

        System.out.print("enter second digit: ");
        int num2 = scann.nextInt();

        System.out.print("enter third digit: ");
        int num3 = scann.nextInt();

        System.out.print("enter forth digit: ");
        int num4 = scann.nextInt();



        int max = num1;

        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }
        if (num4 > max) {
            max = num4;
        }
        System.out.println(max);

        scann.close();


    }
}
