package ua.nix.auto.typeConversions;
import java.util.Scanner;

/*Task 2
The variable n stores a natural two-digit number.
Create a program that calculates and displays the sum of digits of n.*/
public class Auto2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a two-digit natural number (n): ");
        int n = scanner.nextInt();

        int digit1 = n / 10;
        int digit2 = n % 10;


        int sum = digit1 + digit2;


        System.out.println("The sum of the digits of " + n + " is: " + sum);

    }
}