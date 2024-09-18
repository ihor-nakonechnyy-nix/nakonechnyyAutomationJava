package com.typeConversions;

import java.util.Scanner;

public class task_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 1001;
        int b = 5565;
        int c = 9865;

        a = b + b;
        b = c - a;
        c = a + b + c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


    }

}







