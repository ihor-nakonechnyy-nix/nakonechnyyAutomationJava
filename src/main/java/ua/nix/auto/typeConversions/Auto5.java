package ua.nix.auto.typeConversions;

import java.util.Scanner;


public class Auto5 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter last Name: ");
        String Name = scanner.nextLine();


        System.out.println("Hello " + Name);

        System.out.print("enter age: ");
        int age = scanner.nextInt();
        System.out.println("My age: " + age);

    }



}



