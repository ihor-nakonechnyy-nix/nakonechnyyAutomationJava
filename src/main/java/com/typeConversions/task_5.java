package com.typeConversions;

/*
A real number with a non-zero fractional part is stored in the variable n.
Create a program that rounds the number n to the nearest integer and displays the result on the screen.
*/
import java.util.Scanner;

public class task_5 {

    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter last Name: ");
        String Name = scanner.nextLine();


        System.out.println("Hello " + Name);

        System.out.print("enter age: ");
        int age = scanner.nextInt();
        System.out.println("My age: " + age);



        //float n = 12.5f;




    }
}
