package ua.nix.auto.typeConversions;
import java.util.Scanner;

/*
A real number with a non-zero fractional part is stored in the variable n.
Create a program that rounds the number n to the nearest
integer and displays the result on the screen.
*/
public class Auto3 {

    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a real number with: ");
        double n = scanner.nextDouble();
        long roundedNumber = Math. round(n);
        System.out.println(n);
        System.out.println("The rounded number is: " + roundedNumber);







    }
}
