package ua.nix.autoMation.Arrays;

import java.util.Scanner;

public class ArraysTask_3 {

    public static void main(String[] args) {
        String[] strgs = new String[10];
        int[] nums = new int[10];


        Scanner scann = new Scanner(System.in);
        System.out.println("Enter ten strings: ");
        for (int i = 0; i < strgs.length; i++) {
            strgs[i] = scann.nextLine();
            nums[i] = strgs[i].length();
            System.out.println(nums[i]);
        }


    }
}








