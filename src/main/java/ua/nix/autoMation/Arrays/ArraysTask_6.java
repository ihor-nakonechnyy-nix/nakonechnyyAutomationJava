package ua.nix.autoMation.Arrays;

import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

//Task 5

//One large array and two small arrays
//
//1. Create an array for 20 numbers.
//2. Enter values into it from the keyboard.
//3. Create two arrays of 10 numbers each.
//4. Copy the large array into two small arrays: half of the numbers into the first small array,
//the other half into the second small array.
//5. Display the second small array on the screen, each value on a new line.

public class ArraysTask_6 {
    public static void main(String[] args) throws IOException {

//        Reader r = new InputStreamReader(System.in);
//        BufferedReader reader = new BufferedReader(r);
        Scanner scanner = new Scanner(System.in);


        int[] Array = new int[20];
        System.out.println("Enter 20 numbers: ");
        for (int i = 0; i < Array.length; i++) {
            Array[i] = scanner.nextInt();

            int halfSize = Array.length / 2;

            int[] Array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int[] Array2 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};


            Array = Arrays.copyOf(Array2, 20);


            System.out.println("Larger array: " + Arrays.toString(Array));

        }

    }


}

