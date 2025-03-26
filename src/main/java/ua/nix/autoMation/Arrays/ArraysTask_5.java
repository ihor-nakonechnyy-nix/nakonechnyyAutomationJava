package ua.nix.autoMation.Arrays;

import java.util.Scanner;

public class ArraysTask_5 {
    public static void main(String[] args) {
        // Крок 1: Створення масиву на 20 чисел
        int[] largeArray = new int[20];

        // Крок 2: Введення значень з клавіатури
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 20 numbers:");
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = scanner.nextInt();
        }

        // Крок 3: Створення двох масивів по 10 чисел кожен
        int[] firstSmallArray = new int[10];
        int[] secondSmallArray = new int[10];

        // Крок 4: Копіювання великого масиву в два маленьких
        for (int i = 0; i < 10; i++) {
            firstSmallArray[i] = largeArray[i];
        }
        for (int j = 10; j < 20; j++) {
            secondSmallArray[j - 10] = largeArray[j];
        }

        // Крок 5: Виведення другого маленького масиву на екран
        System.out.println("Second small array:");
        for (int i = 0; i < secondSmallArray.length; i++) {
            System.out.println(secondSmallArray[i]);
        }
    }
}
