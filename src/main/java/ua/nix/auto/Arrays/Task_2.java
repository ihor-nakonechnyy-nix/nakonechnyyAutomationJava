package ua.nix.auto.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task_2 {
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
