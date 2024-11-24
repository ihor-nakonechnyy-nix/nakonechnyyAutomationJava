package ua.nix.auto.GL;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        int[] arr = new int[5];
        fillArrFromConsole(arr);
        int findMax = findMax(arr);
        int findMin = findMin(arr);
        int findSum = findSum(arr);

        System.out.println("min value " + findMin);
        System.out.println("max value " + findMax);
        System.out.println("Sum value " + findSum);
        System.out.println("Average value " + findAverage(arr));

        //fillArrByQuare(arr);
        printArr(arr);
    }


    private static int findSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
private static double findAverage (int[] arr) {
        return findSum(arr)/5;
}


private static int findMin(int[] arr) {
    int minValue = arr[0];
    for (int i = 0; i < arr.length; i++) {
        if (minValue > arr[i])
            minValue = arr[i];
    }
    return minValue;
}


private static int findMax(int[] arr) {
    int maxValue = arr[0];
    for (int i = 0; i < arr.length; i++) {
        if (maxValue < arr[i])
            maxValue = arr[i];
    }
    return maxValue;
}

private static void fillArrFromConsole(int[] arr) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < arr.length; i++) {
        System.out.println("arr[" + i + "] = ");
        arr[i] = sc.nextInt();
        System.out.println();
    }
}


private static void fillArrByQuare(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        arr[i] = i * i;
    }
}

private static void printArr(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        System.out.println("arr[" + i + "]= " + arr[i]);
    }
}


}
