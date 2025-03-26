package ua.nix.autoMation.ControlConstructs.conditionalOperators;
import java.util.Scanner;


//Enter two numbers from the keyboard and display the minimum of them.

public class ConditionalOperatorsTask_1 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        System.out.print("enter a first digit: ");
        int number1 = scann.nextInt();
        System.out.print("enter a second digit: ");
        int number2 = scann.nextInt();

//        int min = Math.min(number1, number2);
//
//        System.out.println("Мінімальне число: " + min);
//        scann.close();


        //int minNumber;
        if (number1 < number2) System.out.println(number1 + " is min");
        else System.out.println(number2 + " is min");


//        System.out.println();
//        if (number1 < number2)
//
//            System.out.println(number1);
//
//        else
//
//            System.out.println(number2);

    }


}
