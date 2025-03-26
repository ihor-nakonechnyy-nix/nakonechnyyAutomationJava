package ua.nix.autoMation.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTask_4 {

    public static void main(String[] args) {

        int[] arra = new int[10];
        Scanner scann = new Scanner(System.in);
        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < arra.length; i++) {
            arra[i] = scann.nextInt();


        }
        Arrays.sort(arra);

        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < arra.length; i++) {

            System.out.println(arra[i]);



        }

       /* System.out.println();
        System.out.println();
        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.println(arra[i]);
        }*/


    }


}
