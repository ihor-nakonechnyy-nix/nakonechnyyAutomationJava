package ua.nix.auto.ControlConstructs;


import java.util.Scanner;

//Enter three numbers from the keyboard and display them in descending order.
public class ConditionalOperatorsTask_3 {

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);


        int num1, num2, num3;
        System.out.print("enter first num: ");
        num1 = scann.nextInt();

        System.out.print("enter second num: ");
        num2 = scann.nextInt();

        System.out.print("enter third num: ");
        num3 = scann.nextInt();
        int temp;
        if (num1 < num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num1 < num3) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }


    }
}
