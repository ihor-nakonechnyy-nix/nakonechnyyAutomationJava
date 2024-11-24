package ua.nix.auto.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Task 1
//Maximum among an array of 20 numbers
//1. In the initializeArray() method:
//1.1. Create an array of 20 numbers
//1.2. Read 20 numbers from the console and fill the array with them
//2. The max(int[] array) method should find the maximum number from the array elements

public class Task_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] list = new int[20];

        for (int i = 0; i < list.length; i++) {
            String s = reader.readLine();
            list[i] = Integer.parseInt(s);

        }
        int max = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] > max)
                max = list[i];

        }


        System.out.println("Max is " + max);

    }

}

