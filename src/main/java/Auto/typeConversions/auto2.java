package Auto.typeConversions;

/*Task 2
The variable n stores a natural two-digit number.
Create a program that calculates and displays the sum of digits of n.*/

import java.util.Scanner;


public class auto2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a two-digit natural number (n): ");
        int n = scanner.nextInt();

        int digit1 = n / 10;   // First digit (tens place)
        int digit12 = n % 10;  // Second digit (units place)

        // Calculate the sum of the digits
        int sum = digit1 + digit12;

        // Display the result
        System.out.println("The sum of the digits of " + n + " is: " + sum);

    }
}