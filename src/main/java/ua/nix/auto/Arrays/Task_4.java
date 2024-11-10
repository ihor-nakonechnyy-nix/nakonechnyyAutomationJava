package ua.nix.auto.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task_4 {

    public static void main(String[] args) {

        int[] arra;
        arra = new int[10];
        Scanner scann = new Scanner(System.in);
        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < arra.length; i++) {
            arra[i] = scann.nextInt();

        }
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < arra.length; i++) {
            System.out.println(arra[i]);
            Arrays.sort(arra);
        }


    }


}
