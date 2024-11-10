package ua.nix.auto.Arrays;

import java.util.Arrays;

public class Task_4 {

    public static void main(String[] args) {

        int[] arra = {1000, 200, 500, 300, 900, 700, 100, 600, 400, 800};
        Arrays.sort(arra);
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < arra.length; i++) {
            System.out.println(arra[i]);
        }


    }


}
