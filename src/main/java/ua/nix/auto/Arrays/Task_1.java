package ua.nix.auto.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


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
