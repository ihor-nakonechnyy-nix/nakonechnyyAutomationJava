package ua.nix.auto.ControlConstructs;


import java.util.Scanner;

//Input four numbers from the keyboard, and display the maximum of them.
public class ConditionalOperatorsTask_2_1 {

    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);

        System.out.print("enter first digit: ");
        int firstDigit = scann.nextInt();

        System.out.print("enter second digit: ");
        int secondDigit = scann.nextInt();

        System.out.print("enter third digit: ");
        int thirdDigit = scann.nextInt();

        System.out.print("enter forth digit: ");
        int forthDigit = scann.nextInt();


        if (firstDigit > secondDigit && firstDigit > thirdDigit && firstDigit > forthDigit)
            System.out.print(firstDigit + " is max");
        else if
        (secondDigit > firstDigit && secondDigit > thirdDigit && secondDigit > forthDigit)
            System.out.print(secondDigit + " is max");
        else if
        (thirdDigit > firstDigit && thirdDigit > secondDigit && thirdDigit > forthDigit)
            System.out.print(thirdDigit + " is max");
        else if
        (forthDigit > firstDigit && forthDigit > secondDigit && forthDigit > thirdDigit)
            System.out.print(forthDigit + " is max");


    }
}
