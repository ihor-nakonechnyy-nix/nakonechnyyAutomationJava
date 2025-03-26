package ua.nix.autoMation.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Task 2
//Array of lines in reverse order
//1. Create an array of 10 lines.
//2. Enter 8 lines from the keyboard and store them in an array.
//3. Display the contents of the entire array (10 elements) on the screen in reverse order.
//Each element - from a new line.

public class ArraysTask_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] list = new String[10];

        System.out.println("enter 8 strings:");
        for (int i = 0; i < 8; i++) {
            list[i] = reader.readLine();
        }


        System.out.println("Content is reverse order:");
        for (int i = 9; i >= 0; i--) {
            System.out.println(list[i]);
        }


    }


}

