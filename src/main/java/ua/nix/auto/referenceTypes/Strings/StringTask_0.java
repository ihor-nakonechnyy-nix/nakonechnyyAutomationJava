package ua.nix.auto.referenceTypes.Strings;
import java.util.Scanner;

public class StringTask_0 {
    public static void main(String[] args) {



// Зовнішній цикл
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i); // Виконується 2 рази

// Внутрішній цикл
            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner: " + j); // Виконується 6 разів (2 * 3)
            }
        }

    }
}



